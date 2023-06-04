cidadaocidadaousuariocreate database ecotroca;

use ecotroca;

create table pessoa(
id int primary key auto_increment,
nome varchar(50) not null,
sobrenome varchar(50) not null,
email varchar(50) not null unique,
data_nascimento date not null,
endereco varchar(110) not null,
telefone varchar(18) not null,
cpf varchar(14) not null unique
);

insert into pessoa(nome,sobrenome,email,data_nascimento,endereco,telefone,cpf) values(
'Fernando',
'Fukunaga',
'fernandosantanna.2457@aluno.saojudas.br',
'2002-04-25',
'Rua Taquari, 546 - Mooca, São Paulo - SP, 03166-000',
'(11) 91111-1111',
'111.111.111-11');

create table usuario(
id int primary key auto_increment,
id_pessoa int not null,
login varchar(11) not null unique,
senha varchar(100) not null,
perfil_acesso enum('admin', 'funcionario') not null,
constraint fk_usuario_id_pessoa foreign key (id_pessoa) references pessoa(id)
);

insert into usuario(id_pessoa,login,senha,perfil_acesso) values(
1,
'fukunaga123',
'senhasecreta',
'admin'
);

create table cidadao(
id int primary key auto_increment,
id_pessoa int not null,
saldo_pontuacao decimal(10,2) not null default 0,
constraint fk_cidadao_id_pessoa foreign key (id_pessoa) references pessoa(id)
);

create table material(
id int primary key auto_increment,
tipo_material varchar(15) not null,
pontuacao_material_por_kg decimal(10,2) not null
);

create table descarte(
id int primary key auto_increment,
id_cidadao int not null,
id_usuario int not null,
data_hora_descarte datetime not null default current_timestamp,
peso_total_descarte decimal(10,3) not null,
total_pontos_gerados decimal(10,2) not null,
constraint fk_descarte_id_cidadao foreign key (id_cidadao) references cidadao(id),
constraint fk_descarte_id_usuario foreign key (id_usuario) references usuario(id)
);

create table material_descarte(
id_descarte int not null,
id_material int not null,
peso_descartado decimal(10,3) not null,
pontos_gerados decimal(10,2) not null,
constraint fk_material_descarte_id_descarte foreign key (id_descarte) references descarte(id),
constraint fk_material_descarte_id_material foreign key (id_material) references material(id)
);
