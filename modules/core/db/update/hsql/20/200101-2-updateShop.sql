-- alter table CARSERVICE_SHOP add column SHOP_ID varchar(36) ^
-- update CARSERVICE_SHOP set SHOP_ID = <default_value> ;
-- alter table CARSERVICE_SHOP alter column SHOP_ID set not null ;
alter table CARSERVICE_SHOP add column SHOP_ID varchar(36) not null ;
