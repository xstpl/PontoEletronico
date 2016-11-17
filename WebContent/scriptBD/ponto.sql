DROP DATABASE ponto;
CREATE DATABASE ponto;

use ponto;

CREATE TABLE grupo(
id_grupo int AUTO_INCREMENT,
nome varchar(15),
PRIMARY KEY(id_grupo));

CREATE TABLE setor(
id_setor int AUTO_INCREMENT,
nome varchar(15),
PRIMARY KEY(id_setor));




CREATE TABLE PESSOA
(
login varchar(50),
senha varchar(100),
id_grupo int,
id_setor int,
cpf varchar(44) UNIQUE,
rg varchar(44) UNIQUE,
nome varchar(50),
sobrenome varchar(50),
ultimonome varchar(50),
nomePai varchar(50),
sobrenomePai varchar(50),
ultimonomePai varchar(50),
nomeMae varchar(50),
sobrenomeMae varchar(50),
ultimonomeMae varchar(50),
PRIMARY KEY (cpf,nome),
FOREIGN KEY (id_grupo) REFERENCES grupo(id_grupo),
FOREIGN KEY (id_setor) REFERENCES setor(id_setor)
);

CREATE TABLE ponto
(
id_pessoa varchar(44),
Data Date,
Hora_entrada Time,
Hora_saida Time,
PRIMARY KEY (id_pessoa, Data, Hora_entrada, Hora_saida),
FOREIGN KEY (id_pessoa) REFERENCES PESSOA(cpf));








