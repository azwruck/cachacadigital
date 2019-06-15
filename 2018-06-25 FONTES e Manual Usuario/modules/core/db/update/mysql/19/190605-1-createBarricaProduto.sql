create table CACHACA_BARRICA_PRODUTO (
    ID integer,
    --
    PRODUTO_ID integer not null,
    BARRICA_ID integer,
    DATA_ENTRADA date not null,
    --
    primary key (ID)
);