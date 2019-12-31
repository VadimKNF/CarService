package com.company.carservice.entity;

import com.haulmont.chile.core.datatypes.impl.EnumClass;

import javax.annotation.Nullable;


public enum ShopType implements EnumClass<String> {

    SMALL("near home"),
    MEDIUM("supermarket"),
    BIG("Hypermarket");

    private String id;

    ShopType(String value) {
        this.id = value;
    }

    public String getId() {
        return id;
    }

    @Nullable
    public static ShopType fromId(String id) {
        for (ShopType at : ShopType.values()) {
            if (at.getId().equals(id)) {
                return at;
            }
        }
        return null;
    }
}