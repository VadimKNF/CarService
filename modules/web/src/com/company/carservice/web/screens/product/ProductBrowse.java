package com.company.carservice.web.screens.product;

import com.haulmont.cuba.gui.screen.*;
import com.company.carservice.entity.Product;

@UiController("carservice_Product.browse")
@UiDescriptor("product-browse.xml")
@LookupComponent("productsTable")
@LoadDataBeforeShow
public class ProductBrowse extends StandardLookup<Product> {
}