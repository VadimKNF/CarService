alter table CARSERVICE_SHOP add column PRICE decimal(19, 2) ^
update CARSERVICE_SHOP set PRICE = 0 where PRICE is null ;
alter table CARSERVICE_SHOP alter column PRICE set not null ;
alter table CARSERVICE_SHOP add column QUANTITY decimal(19, 2) ;
