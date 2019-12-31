package com.company.carservice.entity;

import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;


@Table(name = "CARSERVICE_PURCHASE")
@Entity(name = "carservice_Purchase")
public class Purchase extends StandardEntity {
    private static final long serialVersionUID = -279192160302544543L;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "SHOP_ID", nullable = false)
    Shop shop;

    //protected ArrayList<Product> productsList = new ArrayList<Product>();

    //protected int num;

    public Shop getShop() {
        return shop;
    }

    public void setShop(Shop shop) {
        this.shop = shop;
    }

    /*public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public ArrayList<Product> getProductsList() {
        return productsList;
    }

    public void setProductsList(ArrayList<Product> productsList) {
        this.productsList = productsList;
    }*/
}