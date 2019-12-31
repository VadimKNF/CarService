alter table CARSERVICE_PRODUCT alter column VENDOR_NAME rename to VENDOR_NAME__U03953 ^
alter table CARSERVICE_PRODUCT alter column VENDOR_NAME__U03953 set null ;
alter table CARSERVICE_PRODUCT drop constraint FK_CARSERVICE_PRODUCT_ON_VENDOR_NAME ;
drop index IDX_CARSERVICE_PRODUCT_ON_VENDOR_NAME ;
-- alter table CARSERVICE_PRODUCT add column VENDOR_ID varchar(36) ^
-- update CARSERVICE_PRODUCT set VENDOR_ID = <default_value> ;
-- alter table CARSERVICE_PRODUCT alter column VENDOR_ID set not null ;
alter table CARSERVICE_PRODUCT add column VENDOR_ID varchar(36) not null ;
