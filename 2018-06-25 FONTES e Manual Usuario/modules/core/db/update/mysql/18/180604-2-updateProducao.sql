alter table CACHACA_PRODUCAO change column QUANTIDADE QUANTIDADE__UNUSED int;
alter table CACHACA_PRODUCAO modify column QUANTIDADE__UNUSED int null ;
alter table CACHACA_PRODUCAO add column QUANT integer ^
update CACHACA_PRODUCAO set QUANT = 0 where QUANT is null ;
alter table CACHACA_PRODUCAO modify column QUANT integer not null ;
