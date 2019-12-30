alter table CARSERVICE_COMMERCIAL_NETWORK alter column NETWORK_NAME rename to NETWORK_NAME__U24966 ^
alter table CARSERVICE_COMMERCIAL_NETWORK alter column NETWORK_NAME__U24966 set null ;
-- alter table CARSERVICE_COMMERCIAL_NETWORK add column NAME varchar(255) ^
-- update CARSERVICE_COMMERCIAL_NETWORK set NAME = <default_value> ;
-- alter table CARSERVICE_COMMERCIAL_NETWORK alter column NAME set not null ;
alter table CARSERVICE_COMMERCIAL_NETWORK add column NAME varchar(255) ;
