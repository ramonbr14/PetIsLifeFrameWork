drop database petislifeBD;
create database petislifeBD;
use petislifeBD;/*
show databases;
show tables;*
create database ifam;
use ifam;*/
show databases;

show tables;

select * from Pais;
select * from Estado;
select * from Cidade;
select * from Pessoa;
select * from Pet;
select * from Raca;

select Pessoa.nome,Pet.nome,Raca.nome from Pessoa, Pet, Raca 
WHERE Pet.proprietario_documento = Pessoa.documento
AND Pet.raca_id = Raca.id; 