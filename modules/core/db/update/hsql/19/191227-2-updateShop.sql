alter table CARSERVICE_SHOP alter column NAME rename to NAME__U11032 ^
alter table CARSERVICE_SHOP alter column NAME__U11032 set null ;
alter table CARSERVICE_SHOP drop constraint FK_CARSERVICE_SHOP_ON_NAME ;
drop index IDX_CARSERVICE_SHOP_ON_NAME ;
