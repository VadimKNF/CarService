package com.company.carservice.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

@NamePattern("%s|name")
@Table(name = "CARSERVICE_PRODUCT")
@Entity(name = "carservice_Product")
public class Product extends StandardEntity {
    private static final long serialVersionUID = -4882540352909451913L;

    @NotNull
    @Column(name = "PRODUCT_ID", nullable = false, unique = true)
    protected String name;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "VENDOR_ID", nullable = false)
    Vendor vendor;

    @NotNull
    @Column(name = "VENDOR_PRICE", nullable = false)
    protected BigDecimal vendorPrice;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setVendorPrice(BigDecimal vendorPrice) {
        this.vendorPrice = vendorPrice;
    }

    public BigDecimal getVendorPrice() {
        return vendorPrice;
    }

    public void setVendor(Vendor vendor) {
        this.vendor = vendor;
    }

    public Vendor getVendor() {
        return vendor;
    }
}