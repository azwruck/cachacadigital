-- begin CACHACA_CATEGORIA
create table CACHACA_CATEGORIA (
    ID integer,
    UUID varchar(32),
    --
    NOME varchar(64) not null,
    --
    primary key (ID)
)^
-- end CACHACA_CATEGORIA
-- begin CACHACA_PRODUTO
create table CACHACA_PRODUTO (
    ID integer,
    UUID varchar(32),
    --
    NOME varchar(255) not null,
    ID_CATEGORIA_ID integer not null,
    PRECO double precision not null,
    QUANTIDADE integer,
    --
    primary key (ID)
)^
-- end CACHACA_PRODUTO
-- begin CACHACA_ESTADO
create table CACHACA_ESTADO (
    ID integer,
    UUID varchar(32),
    --
    NOME varchar(64) not null,
    SIGLA varchar(2) not null,
    --
    primary key (ID)
)^
-- end CACHACA_ESTADO
-- begin CACHACA_CLIENTE
create table CACHACA_CLIENTE (
    ID integer,
    UUID varchar(32),
    --
    ESTADO2 varchar(50),
    NOME varchar(128) not null,
    EMAIL varchar(128),
    TELEFONE varchar(16),
    ENDERECO varchar(255) not null,
    CIDADE varchar(128) not null,
    CEP varchar(16) not null,
    ID_ESTADO_ID integer,
    --
    primary key (ID)
)^
-- end CACHACA_CLIENTE
-- begin CACHACA_VENDA
create table CACHACA_VENDA (
    ID integer,
    UUID varchar(32),
    --
    ID_CLIENTE_ID integer not null,
    DATA_VENDA date not null,
    TOTAL double precision,
    --
    primary key (ID)
)^
-- end CACHACA_VENDA
-- begin CACHACA_PRODUTO_VENDA
create table CACHACA_PRODUTO_VENDA (
    ID integer,
    UUID varchar(32),
    --
    ID_PRODUTO_ID integer not null,
    QUANTIDADE integer not null,
    TOTAL double precision,
    VENDA_ID integer not null,
    --
    primary key (ID)
)^
-- end CACHACA_PRODUTO_VENDA
-- begin CACHACA_PRODUCAO
create table CACHACA_PRODUCAO (
    ID integer,
    UUID varchar(32),
    --
    LOTE integer not null,
    PRODUTO_ID integer not null,
    QUANT integer not null,
    DATA_PRODUCAO date not null,
    --
    primary key (ID)
)^
-- end CACHACA_PRODUCAO

-- begin CACHACA_INSUMO_PRODUTO
create table CACHACA_INSUMO_PRODUTO (
    ID integer,
    UUID varchar(32),
    --
    QUANTIDADE integer not null,
    PRODUTO_ID integer,
    INSUMO_ID integer not null,
    --
    primary key (ID)
)^
-- end CACHACA_INSUMO_PRODUTO
-- begin CACHACA_INSUMO
create table CACHACA_INSUMO (
    ID integer,
    UUID varchar(32),
    --
    QUANTIDADE integer not null,
    QUANT_PRODUCAO integer,
    NOME varchar(64) not null,
    --
    primary key (ID)
)^
-- end CACHACA_INSUMO
