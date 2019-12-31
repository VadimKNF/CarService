package com.company.carservice.entity;

import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Table(name = "CARSERVICE_ADDRESS")
@Entity(name = "carservice_Address")
public class Address extends StandardEntity {
    private static final long serialVersionUID = 8537389761648613634L;

    @Column(name = "CITY")
    protected String city;

    @Column(name = "STREET")
    protected String street;

    @Column(name = "HOUSE")
    protected String house;

    public void setCity(String city) {
        this.city = city;
    }

    public String getCity() {
        return city;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getStreet() {
        return street;
    }

    public void setHouse(String house) {
        this.house = house;
    }

    public String getHouse() {
        return house;
    }
}