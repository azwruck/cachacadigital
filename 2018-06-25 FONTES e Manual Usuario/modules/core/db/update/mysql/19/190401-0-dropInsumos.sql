rename table cachaca_insumos to cachaca_insumos__UNUSED ;
alter table cachaca_insumo_produto drop foreign key FK_CACHACA_INSUMO_PRODUTO_INSUMO;
alter table cachaca_producao drop foreign key FK_CACHACA_PRODUCAO_INSUMO;
