package com.company.carservice.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@NamePattern("%s|name")
@Table(name = "CARSERVICE_SHOP")
@Entity(name = "carservice_Shop")
public class Shop extends StandardEntity {
    private static final long serialVersionUID = 9183294608180701438L;

    @NotNull
    @Column(name = "NUMBER", nullable = false, unique = true)
    protected String number;

    @NotNull
    @Column(name = "SHOP_NAME", nullable = false)
    protected String name;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "NETWORK_ID", nullable = false)
    CommercialNetwork network;

    public void setNumber(String number) {
        this.number = number;
    }

    public String getNumber() {
        return number;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setNetwork(CommercialNetwork network) {
        this.network = network;
    }

    public CommercialNetwork getNetwork() {
        return network;
    }
}