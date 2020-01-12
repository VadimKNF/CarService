package com.company.carservice.entity;

import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.*;
import java.util.Date;

@Table(name = "CARSERVICE_PRICE_HISTORY")
@Entity(name = "carservice_PriceHistory")
public class PriceHistory extends StandardEntity {
    private static final long serialVersionUID = -3228868279723095867L;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "PRODUCT_ID")
    protected Product product;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "SHOP_ID")
    protected Shop shop;



    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Shop getShop(){
        return shop;
    }

    public void setShop(Shop shop) {
        this.shop = shop;
    }
}