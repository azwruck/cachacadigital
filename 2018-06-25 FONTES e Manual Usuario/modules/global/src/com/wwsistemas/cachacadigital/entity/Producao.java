package com.wwsistemas.cachacadigital.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.chile.core.annotations.NumberFormat;
import com.haulmont.cuba.core.entity.BaseIntegerIdEntity;
import com.haulmont.cuba.core.entity.annotation.Listeners;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.util.Date;

@Listeners({"cachaca_ProducaoListener", "cachaca_ProducaoInsumoListener"})
@NamePattern(" %s|lote")
@Table(name = "CACHACA_PRODUCAO")
@Entity(name = "cachaca$Producao")
public class Producao extends BaseIntegerIdEntity {
    private static final long serialVersionUID = -8770381696851348428L;

    @NotNull
    @Column(name = "LOTE", nullable = false)
    protected Integer lote;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "PRODUTO_ID")
    protected Produto produto;

    @NotNull
    @Column(name = "QUANTIDADE", nullable = false)
    @NumberFormat(pattern = "#", decimalSeparator = ",", groupingSeparator = ".")
    protected java.math.BigDecimal quantidade;

    @Temporal(TemporalType.DATE)
    @NotNull
    @Column(name = "DATA_PRODUCAO", nullable = false)
    protected Date data_producao;

    public void setQuantidade(BigDecimal quantidade) {
        this.quantidade = quantidade;
    }

    public BigDecimal getQuantidade() {
        return quantidade;
    }


    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public Produto getProduto() {
        return produto;
    }


    public void setLote(Integer lote) {
        this.lote = lote;
    }

    public Integer getLote() {
        return lote;
    }

    public void setData_producao(Date data_producao) {
        this.data_producao = data_producao;
    }

    public Date getData_producao() {
        return data_producao;
    }

}