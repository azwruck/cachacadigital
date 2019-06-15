update CACHACA_BARRICA set MADEIRA = '' where MADEIRA is null ;
alter table CACHACA_BARRICA modify column MADEIRA varchar(255) not null ;
