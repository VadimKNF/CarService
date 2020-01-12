alter table CARSERVICE_SHOP alter column PRODUCT_ID set null ;
update CARSERVICE_SHOP set PRICE = 0 where PRICE is null ;
alter table CARSERVICE_SHOP alter column PRICE set not null ;
