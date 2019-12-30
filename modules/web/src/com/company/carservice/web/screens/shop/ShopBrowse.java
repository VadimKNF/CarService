package com.company.carservice.web.screens.shop;

import com.haulmont.cuba.gui.screen.*;
import com.company.carservice.entity.Shop;

@UiController("carservice_Shop.browse")
@UiDescriptor("shop-browse.xml")
@LookupComponent("shopsTable")
@LoadDataBeforeShow
public class ShopBrowse extends StandardLookup<Shop> {
}