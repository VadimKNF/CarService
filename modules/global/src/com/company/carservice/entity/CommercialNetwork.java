package com.company.carservice.entity;

import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Table(name = "CARSERVICE_COMMERCIAL_NETWORK")
@Entity(name = "carservice_CommercialNetwork")
public class CommercialNetwork extends StandardEntity {
    private static final long serialVersionUID = -5078422511726500677L;
    @NotNull
    @Column(name = "NETWORK_NAME")
    protected String networkName;


    @Column(name = "NETWORK_FULL_NAME")
    protected String networkFullName;

    public void setNetworkName(String networkName){
        this.networkName = networkName;
    }
    public void setNetworkFullName(String networkFullName){
        this.networkFullName= networkFullName;
    }

    public String getNetworkName(){
        return networkName;
    }
    public String getnetworkFullName(){
        return networkFullName;
    }
}