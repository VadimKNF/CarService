-- begin CARSERVICE_PRODUCT
create table CARSERVICE_PRODUCT (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    PRODUCT_NAME varchar(255) not null,
    VENDOR_NAME varchar(36) not null,
    VENDOR_PRICE decimal(19, 2) not null,
    --
    primary key (ID)
)^
-- end CARSERVICE_PRODUCT
-- begin CARSERVICE_COMMERCIAL_NETWORK
create table CARSERVICE_COMMERCIAL_NETWORK (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NETWORK_NAME varchar(255),
    NETWORK_FULL_NAME varchar(255),
    --
    primary key (ID)
)^
-- end CARSERVICE_COMMERCIAL_NETWORK
-- begin CARSERVICE_VENDOR
create table CARSERVICE_VENDOR (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    VENDOR_NAME varchar(255) not null,
    VENDOR_FULL_NAME varchar(255),
    USER varchar(36),
    --
    primary key (ID)
)^
-- end CARSERVICE_VENDOR
-- begin CARSERVICE_SHOP
create table CARSERVICE_SHOP (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NUMBER varchar(255) not null,
    SHOP_NAME varchar(255) not null,
    NETWORK_ID varchar(36) not null,
    --
    primary key (ID)
)^
-- end CARSERVICE_SHOP
