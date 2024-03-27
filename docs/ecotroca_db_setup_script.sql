CREATE TABLE pessoa (
id SERIAL PRIMARY KEY,
nome VARCHAR(50) NOT NULL,
sobrenome VARCHAR(50) NOT NULL,
email VARCHAR(50) NOT NULL UNIQUE,
data_nascimento DATE NOT NULL,
endereco VARCHAR(110) NOT NULL,
telefone VARCHAR(18) NOT NULL,
cpf VARCHAR(11) NOT NULL UNIQUE
);

INSERT INTO pessoa(nome, sobrenome, email, data_nascimento, endereco, telefone, cpf) VALUES
('Fernando', 'Fukunaga', 'fernando@email.com', '2002-04-25', 'Rua Taquari, 546 - Mooca, São Paulo - SP, 03166-000', '(11) 91111-1111', '11111111111'),
('João', 'da Silva', 'joaosilva@email.com', '1998-01-18', 'Rua Taquari, 546 - Mooca, São Paulo - SP, 03166-000', '(11) 91111-1111', '11111111112'),
('Paulo', 'Ferreira', 'paulo@email.com', '2000-07-09', 'Rua Taquari, 546 - Mooca, São Paulo - SP, 03166-000', '(11) 91111-1111', '11111111113'),
('Ana', 'Pereira', 'anapereira@email.com', '1995-03-09', 'Rua Taquari, 546 - Mooca, São Paulo - SP, 03166-000', '(11) 91111-1111', '11111111114'),
('Rafael', 'Vasconcelos', 'rafael@email.com', '2003-05-20', 'Rua Taquari, 546 - Mooca, São Paulo - SP, 03166-000', '(11) 91111-1111', '11111111115'),
('Jessica', 'Almeida', 'jesica@email.com', '1991-07-12', 'Rua Taquari, 546 - Mooca, São Paulo - SP, 03166-000', '(11) 91111-1111', '11111111116');

CREATE TABLE usuario (
 id SERIAL PRIMARY KEY,
 id_pessoa INT NOT NULL,
 login VARCHAR(11) NOT NULL UNIQUE,
 senha VARCHAR(100) NOT NULL,
 perfil_acesso VARCHAR(11) NOT NULL DEFAULT 'funcionario' CHECK (perfil_acesso IN ('admin', 'funcionario')),
 usuario_ativo BOOLEAN NOT NULL DEFAULT false,
 CONSTRAINT fk_usuario_id_pessoa FOREIGN KEY (id_pessoa) REFERENCES pessoa(id)
);

INSERT INTO usuario(id_pessoa, login, senha, perfil_acesso, usuario_ativo) VALUES
(1, 'fernando123', 'senha', 'admin', true),
(2, 'joao123', 'senha', 'funcionario', true),
(3, 'paulo123', 'senha', 'funcionario', true);

CREATE TABLE cidadao (
 id SERIAL PRIMARY KEY,
 id_pessoa INT NOT NULL,
 saldo_pontuacao DECIMAL(10,2) NOT NULL DEFAULT 0,
 CONSTRAINT fk_cidadao_id_pessoa FOREIGN KEY (id_pessoa) REFERENCES pessoa(id)
);

INSERT INTO cidadao(id_pessoa, saldo_pontuacao) VALUES
(4, 1210),
(5, 760),
(6, 1055);

CREATE TABLE material (
id SERIAL PRIMARY KEY,
tipo_material VARCHAR(25) NOT NULL,
descricao_material VARCHAR(100) NOT NULL,
pontuacao_material_a_cada_cem_gramas DECIMAL(10,2) NOT NULL
);

INSERT INTO material(tipo_material, descricao_material, pontuacao_material_a_cada_cem_gramas) VALUES
('Madeira', 'Tábuas, móveis, palitos, etc.', 20),
('Isopor', 'Caixas, bandejas, etc.', 30),
('Tetrapak', 'Caixas de leite ou suco', 40),
('Papel', 'Qualquer material feito de papel ou papelão (deve estar seco).', 50),
('Vidro', 'Garrafas, potes, cerâmica, louça, etc.', 60),
('Metal', 'Latas, ferramentas, peças, etc.', 70),
('Plástico', 'Qualquer material feito de plástico.', 80),
('Eletrônico', 'Pilhas, celulares, circuitos eletrônicos, etc.', 90),
('Resíduo Hospitalar', 'Medicamentos vencidos, agulhas usadas, luvas, etc.', 95),
('Resíduo Perigoso', 'Produtos químicos, lixo radioativo, óleos poluentes, etc.', 100);

CREATE TABLE descarte (
id SERIAL PRIMARY KEY,
id_cidadao INT NOT NULL,
id_usuario INT NOT NULL,
data_hora_descarte TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
peso_total_descarte DECIMAL(10,3) NOT NULL DEFAULT 0,
total_pontos_gerados DECIMAL(10,2) NOT NULL DEFAULT 0,
CONSTRAINT fk_descarte_id_cidadao FOREIGN KEY (id_cidadao) REFERENCES cidadao(id),
CONSTRAINT fk_descarte_id_usuario FOREIGN KEY (id_usuario) REFERENCES usuario(id)
);

INSERT INTO descarte(id_cidadao, id_usuario, data_hora_descarte, peso_total_descarte, total_pontos_gerados) VALUES
(1, 2, '2023-06-05 08:13:24', 1.700, 1210),
(2, 2, '2023-06-05 10:35:51', 1.700, 760),
(3, 3, '2023-06-05 12:02:04', 1.650, 1055);

CREATE TABLE material_descarte (
id_descarte INT NOT NULL,
id_material INT NOT NULL,
peso_descartado DECIMAL(10,3) NOT NULL,
pontos_gerados DECIMAL(10,2) NOT NULL,
CONSTRAINT fk_material_descarte_id_descarte FOREIGN KEY (id_descarte) REFERENCES descarte(id),
CONSTRAINT fk_material_descarte_id_material FOREIGN KEY (id_material) REFERENCES material(id)
);

INSERT INTO material_descarte(id_descarte, id_material, peso_descartado, pontos_gerados) VALUES
(1, 4, 0.500, 250),
(1, 7, 1.200, 960),
(2, 3, 0.900, 120),
(2, 7, 0.800, 640),
(3, 5, 1, 600),
(3, 6, 0.650, 455);
