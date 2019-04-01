alter table CACHACA_INSUMO_PRODUTO add constraint FK_CACHACA_INSUMO_PRODUTO_PRODUTO foreign key (PRODUTO_ID) references CACHACA_PRODUTO(ID);
alter table CACHACA_INSUMO_PRODUTO add constraint FK_CACHACA_INSUMO_PRODUTO_INSUMO foreign key (INSUMO_ID) references CACHACA_INSUMOS(ID);
create index IDX_CACHACA_INSUMO_PRODUTO_PRODUTO on CACHACA_INSUMO_PRODUTO (PRODUTO_ID);
create index IDX_CACHACA_INSUMO_PRODUTO_INSUMO on CACHACA_INSUMO_PRODUTO (INSUMO_ID);
