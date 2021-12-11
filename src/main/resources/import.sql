select * from Drogaria;

insert into Drogaria (id, nome) values (1,'Drogavida');

insert into Estoque (id, quantidade) values (1, 100);

insert into Medicamento (id, bula, nome, quantidade, receitaUsuario, estoque_id) values (1,'https://consultaremedios.com.br/omeprazol/bula', 'Omeprazol', 100, null, 1);

select hibernate_sequence.nextval from dual;
