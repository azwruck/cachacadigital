create table CACHACA_CLIENTE (
    ID integer,
    UUID varchar(32),
    --
    NOME varchar(128) not null,
    EMAIL varchar(128),
    TELEFONE varchar(16),
    ENDERECO varchar(255) not null,
    CIDADE varchar(128) not null,
    CEP varchar(16) not null,
    ESTADO_ID integer not null,
    --
    primary key (ID)
);
