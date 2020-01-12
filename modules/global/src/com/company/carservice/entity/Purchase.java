package com.company.carservice.entity;


import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;


@Table(name = "CARSERVICE_PURCHASE")
@Entity(name = "carservice_Purchase")
public class Purchase extends StandardEntity {
    private static final long serialVersionUID = -279192160302544543L;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "SHOP_ID", nullable = false)
    protected Shop shop;

    public Shop getShop() {
        return shop;
    }

    public void setShop(Shop shop) {
        this.shop = shop;
    }


}