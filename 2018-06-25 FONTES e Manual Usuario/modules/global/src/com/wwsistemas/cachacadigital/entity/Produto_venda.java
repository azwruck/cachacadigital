package com.wwsistemas.cachacadigital.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.UUID;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;
import com.haulmont.cuba.core.entity.BaseIntegerIdEntity;
import com.haulmont.cuba.core.entity.HasUuid;
import com.haulmont.chile.core.annotations.NamePattern;

@NamePattern("%s |idProduto")
@Table(name = "CACHACA_PRODUTO_VENDA")
@Entity(name = "cachaca$Produto_venda")
public class Produto_venda extends BaseIntegerIdEntity implements HasUuid {
    private static final long serialVersionUID = 5661285715040323399L;

    @Column(name = "UUID")
    protected UUID uuid;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_PRODUTO_ID")
    protected Produto idProduto;

    @NotNull
    @Column(name = "QUANTIDADE", nullable = false)
    protected Integer quantidade;

    @NotNull
    @Column(name = "TOTAL", nullable = false)
    protected Double total;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "VENDA_ID")
    protected Venda venda;

    public void setVenda(Venda venda) {
        this.venda = venda;
    }

    public Venda getVenda() {
        return venda;
    }


    public void setIdProduto(Produto idProduto) {
        this.idProduto = idProduto;
    }

    public Produto getIdProduto() {
        return idProduto;
    }



    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    public UUID getUuid() {
        return uuid;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public Double getTotal() {
        return total;
    }


}