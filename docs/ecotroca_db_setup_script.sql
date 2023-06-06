create database ecotroca;

use ecotroca;

create table pessoa(
id int primary key auto_increment,
nome varchar(50) not null,
sobrenome varchar(50) not null,
email varchar(50) not null unique,
data_nascimento date not null,
endereco varchar(110) not null,
telefone varchar(18) not null,
cpf varchar(11) not null unique
);

insert into pessoa(nome,sobrenome,email,data_nascimento,endereco,telefone,cpf) values
('Fernando','Fukunaga','fernando@email.com','2002-04-25','Rua Taquari, 546 - Mooca, São Paulo - SP, 03166-000','(11) 91111-1111','11111111111'),
('João','da Silva','joaosilva@email.com','1998-01-18','Rua Taquari, 546 - Mooca, São Paulo - SP, 03166-000','(11) 91111-1111','11111111112'),
('Paulo','Ferreira','paulo@email.com','2000-07-09','Rua Taquari, 546 - Mooca, São Paulo - SP, 03166-000','(11) 91111-1111','11111111113'),
('Ana','Pereira','anapereira@email.com','1995-03-09','Rua Taquari, 546 - Mooca, São Paulo - SP, 03166-000','(11) 91111-1111','11111111114'),
('Rafael','Vasconcelos','rafael@email.com','2003-05-20','Rua Taquari, 546 - Mooca, São Paulo - SP, 03166-000','(11) 91111-1111','11111111115'),
('Jessica','Almeida','jesica@email.com','1991-07-12','Rua Taquari, 546 - Mooca, São Paulo - SP, 03166-000','(11) 91111-1111','11111111116');

create table usuario(
id int primary key auto_increment,
id_pessoa int not null,
login varchar(11) not null unique,
senha varchar(100) not null,
perfil_acesso enum('admin', 'funcionario') not null default 'funcionario',
usuario_ativo boolean not null default false,
constraint fk_usuario_id_pessoa foreign key (id_pessoa) references pessoa(id)
);

insert into usuario(id_pessoa,login,senha,perfil_acesso,usuario_ativo) values
(1,'fernando123','senha','admin',true),
(2,'joao123','senha','funcionario',true),
(3,'paulo123','senha','funcionario',true);

create table cidadao(
id int primary key auto_increment,
id_pessoa int not null,
saldo_pontuacao decimal(10,2) not null default 0,
constraint fk_cidadao_id_pessoa foreign key (id_pessoa) references pessoa(id)
);

insert into cidadao(id_pessoa,saldo_pontuacao) values
(4,1210),
(5,760),
(6,1055);

create table material(
id int primary key auto_increment,
tipo_material varchar(25) not null,
descricao_material varchar(100) not null,
pontuacao_material_a_cada_cem_gramas decimal(10,2) not null
);

insert into material(tipo_material,descricao_material,pontuacao_material_a_cada_cem_gramas) values
('Madeira','Tábuas, móveis, palitos, etc.',20),
('Isopor','Caixas, bandejas, etc.',30),
('Tetrapak','Caixas de leite ou suco',40),
('Papel','Qualquer material feito de papel ou papelão (deve estar seco).',50),
('Vidro','Garrafas, potes, cerâmica, louça, etc.',60),
('Metal','Latas, ferramentas, peças, etc.',70),
('Plástico','Qualquer material feito de plástico.',80),
('Eletrônico','Pilhas, celulares, circuitos eletrônicos, etc.',90),
('Resíduo Hospitalar','Medicamentos vencidos, agulhas usadas, luvas, etc.',95),
('Resíduo Perigoso','Produtos químicos, lixo radioativo, óleos poluentes, etc.',100);

create table descarte(
id int primary key auto_increment,
id_cidadao int not null,
id_usuario int not null,
data_hora_descarte datetime not null default current_timestamp,
peso_total_descarte decimal(10,3) not null default 0,
total_pontos_gerados decimal(10,2) not null default 0,
constraint fk_descarte_id_cidadao foreign key (id_cidadao) references cidadao(id),
constraint fk_descarte_id_usuario foreign key (id_usuario) references usuario(id)
);

insert into descarte(id_cidadao,id_usuario,data_hora_descarte,peso_total_descarte,total_pontos_gerados) values
(1,2,'2023-06-05 08:13:24',1.700,1210),
(2,2,'2023-06-05 10:35:51',1.700,760),
(3,3,'2023-06-05 12:02:04',1.650,1055);

create table material_descarte(
id_descarte int not null,
id_material int not null,
peso_descartado decimal(10,3) not null,
pontos_gerados decimal(10,2) not null,
constraint fk_material_descarte_id_descarte foreign key (id_descarte) references descarte(id),
constraint fk_material_descarte_id_material foreign key (id_material) references material(id)
);

insert into material_descarte(id_descarte,id_material,peso_descartado,pontos_gerados) values
(1,4,0.500,250),
(1,7,1.200,960),
(2,3,0.900,120),
(2,7,0.800,640),
(3,5,1,600),
(3,6,0.650,455);