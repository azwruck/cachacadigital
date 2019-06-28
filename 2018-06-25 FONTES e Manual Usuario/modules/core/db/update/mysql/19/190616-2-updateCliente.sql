alter table CACHACA_CLIENTE add column CELULAR varchar(16) ;
update CACHACA_CLIENTE set ESTADO2 = 'AC' where ESTADO2 is null ;
alter table CACHACA_CLIENTE modify column ESTADO2 varchar(50) not null ;
