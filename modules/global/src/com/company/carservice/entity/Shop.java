package com.company.carservice.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import java.lang.Integer;
import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.math.BigInteger;

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
    protected CommercialNetwork network;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "PRODUCT_ID")
    protected Product product;

    @Column(name = "PRICE")
    protected BigDecimal price;

    @Column(name = "QUANTITY")
    protected Integer quantity;

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

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