-- update CARSERVICE_COMMERCIAL_NETWORK set NETWORK_NAME = <default_value> where NETWORK_NAME is null ;
alter table CARSERVICE_COMMERCIAL_NETWORK alter column NETWORK_NAME set not null ;
