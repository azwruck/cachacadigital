rename table cachaca_estado to cachaca_estado__UNUSED ;
alter table cachaca_cliente drop foreign key FK_CACHACA_CLIENTE_ESTADO;
alter table cachaca_cliente drop foreign key FK_CACHACA_CLIENTE_ID_ESTADO;
