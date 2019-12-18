package com.company.carservice.entity;

import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

@Table(name = "CARSERVICE_PRODUCT")
@Entity(name = "carservice_Product")
public class Product extends StandardEntity {
    private static final long serialVersionUID = -4882540352909451913L;

    @NotNull
    @Column(name = "PRODUCT_NAME", nullable = false)
    protected String productName;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "VENDOR_NAME", nullable = false)
    Vendor vendor;

    @NotNull
    @Column(name = "VENDOR_PRICE", nullable = false)
    protected BigDecimal vendorPrice;

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setVendorPrice(BigDecimal vendorPrice) {
        this.vendorPrice = vendorPrice;
    }

    public String getProductName() {
        return productName;
    }

    public BigDecimal getVendorPrice() {
        return vendorPrice;
    }
}