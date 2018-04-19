create table CACHACA_PRODUTO (
    ID integer,
    UUID varchar(32),
    --
    NOME varchar(255) not null,
    CATEGORIA_ID integer not null,
    PRECO double precision not null,
    QUANTIDADE integer,
    --
    primary key (ID)
);
