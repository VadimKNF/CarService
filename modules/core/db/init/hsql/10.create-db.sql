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
    PRODUCT_ID varchar(255) not null,
    VENDOR_ID varchar(36) not null,
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
    NETWORK_NAME varchar(255) not null,
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
    PRODUCT_ID varchar(36),
    PRICE decimal(19, 2) not null,
    QUANTITY integer,
    --
    primary key (ID)
)^
-- end CARSERVICE_SHOP
-- begin CARSERVICE_PURCHASE
create table CARSERVICE_PURCHASE (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    SHOP_ID varchar(36) not null,
    --
    primary key (ID)
)^
-- end CARSERVICE_PURCHASE
-- begin CARSERVICE_ADDRESS
create table CARSERVICE_ADDRESS (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    CITY varchar(255),
    STREET varchar(255),
    HOUSE varchar(255),
    --
    primary key (ID)
)^
-- end CARSERVICE_ADDRESS
-- begin CARSERVICE_PRICE_HISTORY
create table CARSERVICE_PRICE_HISTORY (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    PRODUCT_ID varchar(36),
    SHOP_ID varchar(36),
    --
    primary key (ID)
)^
-- end CARSERVICE_PRICE_HISTORY
