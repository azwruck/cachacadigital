package com.wwsistemas.cachacadigital.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;
import java.util.UUID;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import com.haulmont.cuba.core.entity.BaseIntegerIdEntity;
import com.haulmont.cuba.core.entity.HasUuid;
import com.haulmont.chile.core.annotations.NamePattern;

@NamePattern("%s %s|idProduto,lote")
@Table(name = "CACHACA_PRODUCAO")
@Entity(name = "cachaca$Producao")
public class Producao extends BaseIntegerIdEntity implements HasUuid {
    private static final long serialVersionUID = -8770381696851348428L;

    @Column(name = "UUID")
    protected UUID uuid;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ID_PRODUTO_ID")
    protected Produto idProduto;

    @NotNull
    @Column(name = "LOTE", nullable = false)
    protected Integer lote;

    @NotNull
    @Column(name = "QUANTIDADE", nullable = false)
    protected Integer quantidade;

    @Temporal(TemporalType.DATE)
    @NotNull
    @Column(name = "DATA_PRODUCAO", nullable = false)
    protected Date data_producao;

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    public UUID getUuid() {
        return uuid;
    }

    public void setIdProduto(Produto idProduto) {
        this.idProduto = idProduto;
    }

    public Produto getIdProduto() {
        return idProduto;
    }

    public void setLote(Integer lote) {
        this.lote = lote;
    }

    public Integer getLote() {
        return lote;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setData_producao(Date data_producao) {
        this.data_producao = data_producao;
    }

    public Date getData_producao() {
        return data_producao;
    }


}