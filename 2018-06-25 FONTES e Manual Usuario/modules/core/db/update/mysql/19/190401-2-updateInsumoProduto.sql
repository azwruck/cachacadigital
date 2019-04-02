alter table CACHACA_INSUMO_PRODUTO change column INSUMO_ID INSUMO_ID__UNUSED int;
alter table CACHACA_INSUMO_PRODUTO modify column INSUMO_ID__UNUSED int null ;
drop index IDX_CACHACA_INSUMO_PRODUTO_INSUMO on CACHACA_INSUMO_PRODUTO ;
-- alter table CACHACA_INSUMO_PRODUTO add column INSUMO_ID integer ^
-- update CACHACA_INSUMO_PRODUTO set INSUMO_ID = <default_value> ;
-- alter table CACHACA_INSUMO_PRODUTO modify column INSUMO_ID integer not null ;
alter table CACHACA_INSUMO_PRODUTO add column INSUMO_ID integer not null ;
