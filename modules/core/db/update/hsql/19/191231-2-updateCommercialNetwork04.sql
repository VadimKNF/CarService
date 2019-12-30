-- update CARSERVICE_COMMERCIAL_NETWORK set NAME = <default_value> where NAME is null ;
alter table CARSERVICE_COMMERCIAL_NETWORK alter column NAME set not null ;
