package com.wwsistemas.cachacadigital.entity;

import com.haulmont.cuba.core.entity.BaseIntegerIdEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Table(name = "CACHACA_CAPACIDADE_BARRICA")
@Entity(name = "cachaca_Capacidade_barrica")
public class Capacidade_barrica extends BaseIntegerIdEntity {

    @Column(name = "CAPACIDADE")
    protected Double capacidade;

    @Column(name = "QUANTIDADE_USADA")
    protected Double quantidade_usada;

    public Double getQuantidade_usada() {
        return quantidade_usada;
    }

    public void setQuantidade_usada(Double quantidade_usada) {
        this.quantidade_usada = quantidade_usada;
    }

    public Double getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(Double capacidade) {
        this.capacidade = capacidade;
    }
}