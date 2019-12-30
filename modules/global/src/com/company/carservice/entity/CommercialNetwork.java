package com.company.carservice.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@NamePattern("%s|name")
@Table(name = "CARSERVICE_COMMERCIAL_NETWORK")
@Entity(name = "carservice_CommercialNetwork")
public class CommercialNetwork extends StandardEntity {
    private static final long serialVersionUID = -5078422511726500677L;
    @NotNull
    @Column(name = "NETWORK_NAME", nullable = false, unique = true)
    protected String name;

    @Column(name = "NETWORK_FULL_NAME")
    protected String fullName;

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
}