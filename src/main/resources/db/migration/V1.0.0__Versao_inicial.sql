    create table Drogaria (
       id bigint not null,
        nome varchar(255),
        primary key (id)
    )

    create table Estoque (
        id bigint not null,
        quantidade integer,
        primary key (id)
    )

    create table Medicamento (
        id bigint not null,
        bula varchar(255),
        nome varchar(255),
        quantidade integer,
        receitaUsuario tinyint,
        estoque_id bigint,
        primary key (id)
    )

     alter table Medicamento
           add constraint fk_estoque_id
           foreign key (estoque_id)
           references Estoque