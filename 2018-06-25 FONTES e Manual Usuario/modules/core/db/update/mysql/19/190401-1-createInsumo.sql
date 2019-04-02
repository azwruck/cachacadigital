create table CACHACA_INSUMO (
    ID integer,
    UUID varchar(32),
    --
    QUANTIDADE integer not null,
    QUANT_PRODUCAO integer,
    NOME varchar(64) not null,
    --
    primary key (ID)
);
