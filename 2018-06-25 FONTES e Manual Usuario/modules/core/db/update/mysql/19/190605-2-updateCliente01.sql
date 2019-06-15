update CACHACA_CLIENTE set CEP = '' where CEP is null ;
alter table CACHACA_CLIENTE modify column CEP varchar(255) not null ;
