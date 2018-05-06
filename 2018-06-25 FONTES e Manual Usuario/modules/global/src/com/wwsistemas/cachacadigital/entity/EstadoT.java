package com.wwsistemas.cachacadigital.entity;

import com.haulmont.chile.core.datatypes.impl.EnumClass;

import javax.annotation.Nullable;


public enum EstadoT implements EnumClass<String> {
    AC("AC"),
    AL("AL"),
    AP("AP"),
    AM("AM"),
    BA("BA"),
    CE("CE"),
    DF("DF"),
    ES("ES"),
    GO("GO"),
    MA("MA"),
    MT("MT"),
    MS("MS"),
    MG("MG"),
    PA("PA"),
    PB("PB"),
    PR("PR"),
    PE("PE"),
    PI("PI"),
    RJ("RJ"),
    RN("RN"),
    RS("RS"),
    RO("RO"),
    RR("RR"),
    SC("SC"),
    SP("SP"),
    SE("SE"),
    TO("TO");

    private String id;

    EstadoT(String value) {
        this.id = value;
    }

    public String getId() {
        return id;
    }

    @Nullable
    public static EstadoT fromId(String id) {
        for (EstadoT at : EstadoT.values()) {
            if (at.getId().equals(id)) {
                return at;
            }
        }
        return null;
    }
}