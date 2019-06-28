-- begin CACHACA_CATEGORIA
create table CACHACA_CATEGORIA (
    ID integer,
    --
    NOME varchar(64) not null,
    --
    primary key (ID)
)^
-- end CACHACA_CATEGORIA
-- begin CACHACA_BARRICA
create table CACHACA_BARRICA (
    ID integer,
    --
    CAPACIDADE double precision not null,
    STATUS varchar(255),
    MADEIRA varchar(255) not null,
    PRODUTO_ID integer,
    DATA_ENTRADA date,
    TEMPO_ARMAZENADO varchar(255),
    --
    primary key (ID)
)^
-- end CACHACA_BARRICA
-- begin CACHACA_CLIENTE
create table CACHACA_CLIENTE (
    ID integer,
    --
    ESTADO2 varchar(50) not null,
    NOME varchar(128) not null,
    EMAIL varchar(128),
    TELEFONE varchar(16),
    CELULAR varchar(16),
    ENDERECO varchar(255) not null,
    CIDADE varchar(128) not null,
    CEP varchar(255) not null,
    --
    primary key (ID)
)^
-- end CACHACA_CLIENTE
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
-- begin CACHACA_PRODUTO
create table CACHACA_PRODUTO (
    ID integer,
    --
    NOME varchar(255) not null,
    CATEGORIA_ID integer not null,
    PRECO double precision not null,
    QUANTIDADE integer,
    --
    primary key (ID)
)^
-- end CACHACA_PRODUTO
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
-- begin CACHACA_CAPACIDADE_BARRICA
create table CACHACA_CAPACIDADE_BARRICA (
    ID integer,
    --
    CAPACIDADE double precision,
    QUANTIDADE_USADA double precision,
    --
    primary key (ID)
)^
-- end CACHACA_CAPACIDADE_BARRICA
-- begin CACHACA_BARRICA_PRODUTO
create table CACHACA_BARRICA_PRODUTO (
    ID integer,
    --
    PRODUTO_ID integer not null,
    BARRICA_ID integer,
    DATA_ENTRADA date not null,
    --
    primary key (ID)
)^
-- end CACHACA_BARRICA_PRODUTO
