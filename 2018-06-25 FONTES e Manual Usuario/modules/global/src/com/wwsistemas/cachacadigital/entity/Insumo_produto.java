package com.wwsistemas.cachacadigital.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.BaseIntegerIdEntity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

@NamePattern("%s|id")
@Table(name = "CACHACA_INSUMO_PRODUTO")
@Entity(name = "cachaca$Insumo_produto")
public class Insumo_produto extends BaseIntegerIdEntity {
    private static final long serialVersionUID = -6595449322415777253L;

    @NotNull
    @Column(name = "QUANTIDADE", nullable = false)
    protected java.math.BigDecimal quantidade;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "PRODUTO_ID")
    protected Produto produto;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "INSUMO_ID")
    protected Insumo insumo;

    public void setQuantidade(BigDecimal quantidade) {
        this.quantidade = quantidade;
    }

    public BigDecimal getQuantidade() {
        return quantidade;
    }

    public Insumo getInsumo() {
        return insumo;
    }

    public void setInsumo(Insumo insumo) {
        this.insumo = insumo;
    }


    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public Produto getProduto() {
        return produto;
    }



}