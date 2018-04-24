create table CACHACA_PRODUCAO (
    ID integer,
    UUID varchar(32),
    --
    ID_PRODUTO_ID integer not null,
    LOTE integer not null,
    QUANTIDADE integer not null,
    DATA_PRODUCAO date not null,
    --
    primary key (ID)
);
