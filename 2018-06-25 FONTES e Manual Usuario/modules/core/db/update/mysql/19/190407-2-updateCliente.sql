alter table CACHACA_CLIENTE change column ID_ESTADO_ID ID_ESTADO_ID__UNUSED int;
drop index IDX_CACHACA_CLIENTE_ID_ESTADO on CACHACA_CLIENTE ;