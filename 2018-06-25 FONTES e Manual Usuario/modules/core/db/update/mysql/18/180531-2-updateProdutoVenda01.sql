-- update CACHACA_PRODUTO_VENDA set ID_PRODUTO_ID = <default_value> where ID_PRODUTO_ID is null ;
alter table CACHACA_PRODUTO_VENDA modify column ID_PRODUTO_ID integer not null ;
