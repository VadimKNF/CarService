package com.company.carservice.entity;

import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Table(name = "CARSERVICE_SHOP")
@Entity(name = "carservice_Shop")
public class Shop extends StandardEntity {
    private static final long serialVersionUID = 9183294608180701438L;

    @NotNull
    @Column(name = "NUMBER")
    protected String number;

}