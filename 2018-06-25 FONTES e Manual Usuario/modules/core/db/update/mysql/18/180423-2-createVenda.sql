alter table CACHACA_VENDA add constraint FK_CACHACA_VENDA_ID_CLIENTE foreign key (ID_CLIENTE_ID) references CACHACA_CLIENTE(ID);
create index IDX_CACHACA_VENDA_ID_CLIENTE on CACHACA_VENDA (ID_CLIENTE_ID);