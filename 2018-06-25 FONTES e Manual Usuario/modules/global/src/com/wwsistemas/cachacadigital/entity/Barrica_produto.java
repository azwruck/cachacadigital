package com.wwsistemas.cachacadigital.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.BaseIntegerIdEntity;
import com.haulmont.cuba.core.entity.annotation.Listeners;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Listeners({"cachaca_Barrica_produtoListener","cachaca_Barrica_produtoDeleteListener"})
@NamePattern("%s|id")
@Table(name = "CACHACA_BARRICA_PRODUTO")
@Entity(name = "cachaca_Barrica_produto")
public class Barrica_produto extends BaseIntegerIdEntity {

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "PRODUTO_ID")
    protected Produto produto;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "BARRICA_ID")
    protected Barrica barrica;

    @NotNull
    @Temporal(TemporalType.DATE)
    @Column(name = "DATA_ENTRADA", nullable = false)
    protected Date data_entrada;

    public Barrica getBarrica() {
        return barrica;
    }

    public void setBarrica(Barrica barrica) {
        this.barrica = barrica;
    }

    public Date getData_entrada() {
        return data_entrada;
    }

    public void setData_entrada(Date data_entrada) {
        this.data_entrada = data_entrada;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }
}