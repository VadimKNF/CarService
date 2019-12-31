alter table CARSERVICE_PRODUCT alter column VENDOR_ID rename to VENDOR_ID__U66409 ^
alter table CARSERVICE_PRODUCT alter column VENDOR_ID__U66409 set null ;
alter table CARSERVICE_PRODUCT drop constraint FK_CARSERVICE_PRODUCT_ON_VENDOR ;
drop index IDX_CARSERVICE_PRODUCT_ON_VENDOR ;
-- alter table CARSERVICE_PRODUCT add column VENDOR_NAME varchar(36) ^
-- update CARSERVICE_PRODUCT set VENDOR_NAME = <default_value> ;
-- alter table CARSERVICE_PRODUCT alter column VENDOR_NAME set not null ;
alter table CARSERVICE_PRODUCT add column VENDOR_NAME varchar(36) not null ;
