-- update CARSERVICE_PRODUCT set PRODUCT_ID = <default_value> where PRODUCT_ID is null ;
alter table CARSERVICE_PRODUCT alter column PRODUCT_ID set not null ;
