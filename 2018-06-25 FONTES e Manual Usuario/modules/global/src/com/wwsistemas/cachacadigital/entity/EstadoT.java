package com.wwsistemas.cachacadigital.entity;

import com.haulmont.chile.core.datatypes.impl.EnumClass;

import javax.annotation.Nullable;


public enum EstadoT implements EnumClass<Integer> {

    AC(10),
    AL(20),
    AP(30);

    private Integer id;

    EstadoT(Integer value) {
        this.id = value;
    }

    public Integer getId() {
        return id;
    }

    @Nullable
    public static EstadoT fromId(Integer id) {
        for (EstadoT at : EstadoT.values()) {
            if (at.getId().equals(id)) {
                return at;
            }
        }
        return null;
    }
}