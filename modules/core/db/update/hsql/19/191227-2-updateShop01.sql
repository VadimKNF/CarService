-- alter table CARSERVICE_SHOP add column NETWORK_ID varchar(36) ^
-- update CARSERVICE_SHOP set NETWORK_ID = <default_value> ;
-- alter table CARSERVICE_SHOP alter column NETWORK_ID set not null ;
alter table CARSERVICE_SHOP add column NETWORK_ID varchar(36) not null ;
