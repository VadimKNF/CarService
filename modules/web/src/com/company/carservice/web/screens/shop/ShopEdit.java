package com.company.carservice.web.screens.shop;

import com.haulmont.cuba.gui.screen.*;
import com.company.carservice.entity.Shop;

@UiController("carservice_Shop.edit")
@UiDescriptor("shop-edit.xml")
@EditedEntityContainer("shopDc")
@LoadDataBeforeShow
public class ShopEdit extends StandardEditor<Shop> {
}