package com.company.carservice.web.screens.product;

import com.haulmont.cuba.gui.screen.*;
import com.company.carservice.entity.Product;

@UiController("carservice_Product.edit")
@UiDescriptor("product-edit.xml")
@EditedEntityContainer("productDc")
@LoadDataBeforeShow
public class ProductEdit extends StandardEditor<Product> {
}