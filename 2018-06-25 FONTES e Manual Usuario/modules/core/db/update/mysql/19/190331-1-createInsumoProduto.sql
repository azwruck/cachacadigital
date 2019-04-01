create table CACHACA_INSUMO_PRODUTO (
    ID integer,
    UUID varchar(32),
    --
    QUANTIDADE integer not null,
    PRODUTO_ID integer not null,
    INSUMO_ID integer not null,
    --
    primary key (ID)
);
