package com.company.carservice.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.cuba.security.entity.User;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@NamePattern("%s|name")
@Table(name = "CARSERVICE_VENDOR")
@Entity(name = "carservice_Vendor")
public class Vendor extends StandardEntity {
    private static final long serialVersionUID = 6892697852956337180L;

    @NotNull
    @Column(name = "VENDOR_NAME", nullable = false, unique = true)
    protected String name;

    @Column(name = "VENDOR_FULL_NAME")
    protected String fullName;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "USER")
    User user;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getFullName() {
        return fullName;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public User getUser() {
        return user;
    }
}