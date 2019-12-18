package com.company.carservice.entity;

import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Table(name = "CARSERVICE_SHOP")
@Entity(name = "carservice_Shop")
public class Shop extends StandardEntity {
    private static final long serialVersionUID = 9183294608180701438L;

    @NotNull
    @Column(name = "NUMBER", nullable = false)
    protected String number;

    @NotNull
    @Column(name = "SHOP_NAME", nullable = false)
    protected String shopName;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "NAME", nullable = false)
    CommercialNetwork network;

    public void setNumber(String number){
        this.number = number;
    }

    public String getNumber(){
        return number;
    }

    public void setShopName(String shopName){
        this.shopName = shopName;
    }

    public String getShopName(){
        return shopName;
    }



}