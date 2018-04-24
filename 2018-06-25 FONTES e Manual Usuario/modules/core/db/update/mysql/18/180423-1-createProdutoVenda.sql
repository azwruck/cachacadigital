create table CACHACA_PRODUTO_VENDA (
    ID integer,
    UUID varchar(32),
    --
    ID_VENDA_ID integer not null,
    ID_PRODUTO_ID integer,
    QUANTIDADE integer not null,
    TOTAL double precision not null,
    --
    primary key (ID)
);
