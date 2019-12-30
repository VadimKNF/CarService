alter table CARSERVICE_COMMERCIAL_NETWORK alter column NAME rename to NAME__U86190 ^
alter table CARSERVICE_COMMERCIAL_NETWORK alter column NAME__U86190 set null ;
-- alter table CARSERVICE_COMMERCIAL_NETWORK add column NETWORK_NAME varchar(255) ^
-- update CARSERVICE_COMMERCIAL_NETWORK set NETWORK_NAME = <default_value> ;
-- alter table CARSERVICE_COMMERCIAL_NETWORK alter column NETWORK_NAME set not null ;
alter table CARSERVICE_COMMERCIAL_NETWORK add column NETWORK_NAME varchar(255) ;
