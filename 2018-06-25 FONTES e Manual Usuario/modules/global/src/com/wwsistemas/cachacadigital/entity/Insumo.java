package com.wwsistemas.cachacadigital.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.UUID;
import javax.persistence.Column;
import javax.validation.constraints.NotNull;
import com.haulmont.cuba.core.entity.BaseIntegerIdEntity;
import com.haulmont.cuba.core.entity.HasUuid;
import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.chile.core.annotations.Composition;
import java.util.List;
import javax.persistence.OneToMany;

@NamePattern("%s|nome")
@Table(name = "CACHACA_INSUMO")
@Entity(name = "cachaca$Insumo")
public class Insumo extends BaseIntegerIdEntity implements HasUuid {
    private static final long serialVersionUID = 3451459289325836937L;

    @Column(name = "UUID")
    protected UUID uuid;

    @Composition
    @OneToMany(mappedBy = "insumo")
    protected List<Insumo_produto> insumoProduto;

    @NotNull
    @Column(name = "QUANTIDADE", nullable = false)
    protected Integer quantidade;

    @Column(name = "QUANT_PRODUCAO")
    protected Integer quantProducao;

    @NotNull
    @Column(name = "NOME", nullable = false, length = 64)
    protected String nome;

    public void setInsumoProduto(List<Insumo_produto> insumoProduto) {
        this.insumoProduto = insumoProduto;
    }

    public List<Insumo_produto> getInsumoProduto() {
        return insumoProduto;
    }


    public void setQuantProducao(Integer quantProducao) {
        this.quantProducao = quantProducao;
    }

    public Integer getQuantProducao() {
        return quantProducao;
    }


    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public Integer getQuantidade() {
        return quantidade;
    }


    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    public UUID getUuid() {
        return uuid;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }


}