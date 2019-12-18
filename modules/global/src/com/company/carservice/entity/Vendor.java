package com.company.carservice.entity;

import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Table(name = "CARSERVICE_VENDOR")
@Entity(name = "carservice_Vendor")
public class Vendor extends StandardEntity {
    private static final long serialVersionUID = 6892697852956337180L;

    @NotNull
    @Column(name = "VENDOR_NAME", nullable = false)
    protected String vendorName;

    @Column(name = "VENDOR_FULL_NAME")
    protected String vendorFullName;

    public void setVendorName(String vendorName){
        this.vendorName = vendorName;
    }

    public String getVendorName(){
        return vendorName;
    }

    public void setVendorFullName(String vendorFullName){
        this.vendorFullName = vendorFullName;
    }

    public String getVendorFullName(){
        return vendorFullName;
    }
}