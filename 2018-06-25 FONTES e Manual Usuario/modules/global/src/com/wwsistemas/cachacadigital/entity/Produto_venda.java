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

@NamePattern("%s %s|idProduto,idVenda")
@Table(name = "CACHACA_PRODUTO_VENDA")
@Entity(name = "cachaca$Produto_venda")
public class Produto_venda extends BaseIntegerIdEntity implements HasUuid {
    private static final long serialVersionUID = 5661285715040323399L;

    @Column(name = "UUID")
    protected UUID uuid;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ID_VENDA_ID")
    protected Venda idVenda;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_PRODUTO_ID")
    protected Produto idProduto;

    @NotNull
    @Column(name = "QUANTIDADE", nullable = false)
    protected Integer quantidade;

    @NotNull
    @Column(name = "TOTAL", nullable = false)
    protected Double total;

    public void setIdProduto(Produto idProduto) {
        this.idProduto = idProduto;
    }

    public Produto getIdProduto() {
        return idProduto;
    }


    public void setIdVenda(Venda idVenda) {
        this.idVenda = idVenda;
    }

    public Venda getIdVenda() {
        return idVenda;
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