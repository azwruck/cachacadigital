package com.wwsistemas.cachacadigital.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.validation.constraints.NotNull;
import com.haulmont.cuba.core.entity.BaseIntegerIdEntity;
import com.haulmont.chile.core.annotations.NamePattern;
import java.util.Date;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@NamePattern("%s|id")
@Table(name = "CACHACA_BARRICA")
@Entity(name = "cachaca$Barrica")
public class Barrica extends BaseIntegerIdEntity {
    private static final long serialVersionUID = -5134373288386287168L;

    @NotNull
    @Column(name = "CAPACIDADE", nullable = false)
    protected Double capacidade;


    @Column(name = "MADEIRA")
    protected String madeira;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "PRODUTO_ID")
    protected Produto produto;


    @Temporal(TemporalType.DATE)
    @Column(name = "DATA_ENTRADA")
    protected Date data_entrada;

    public void setData_entrada(Date data_entrada) {
        this.data_entrada = data_entrada;
    }

    public Date getData_entrada() {
        return data_entrada;
    }


    public void setMadeira(String madeira) {
        this.madeira = madeira;
    }

    public String getMadeira() {
        return madeira;
    }


    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public Produto getProduto() {
        return produto;
    }



    public void setCapacidade(Double capacidade) {
        this.capacidade = capacidade;
    }

    public Double getCapacidade() {
        return capacidade;
    }


}