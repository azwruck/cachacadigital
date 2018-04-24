create table CACHACA_VENDA (
    ID integer,
    UUID varchar(32),
    --
    ID_CLIENTE_ID integer not null,
    DATA_VENDA date not null,
    TOTAL double precision not null,
    --
    primary key (ID)
);
