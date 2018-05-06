-- update CACHACA_PRODUCAO set PRODUTO_ID = <default_value> where PRODUTO_ID is null ;
alter table CACHACA_PRODUCAO modify column PRODUTO_ID integer not null ;
