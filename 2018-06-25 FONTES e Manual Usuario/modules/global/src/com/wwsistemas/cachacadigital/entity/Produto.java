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
import com.haulmont.chile.core.annotations.Composition;
import java.util.List;
import javax.persistence.OneToMany;

@NamePattern("%s|nome")
@Table(name = "CACHACA_PRODUTO")
@Entity(name = "cachaca$Produto")
public class Produto extends BaseIntegerIdEntity implements HasUuid {
    private static final long serialVersionUID = -2385608680144950017L;

    @Column(name = "UUID")
    protected UUID uuid;

    @Composition
    @OneToMany(mappedBy = "produto")
    protected List<Insumo_produto> insumoProduto;

    @NotNull
    @Column(name = "NOME", nullable = false)
    protected String nome;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ID_CATEGORIA_ID")
    protected Categoria idCategoria;

    @NotNull
    @Column(name = "PRECO", nullable = false)
    protected Double preco;

    @Column(name = "QUANTIDADE")
    protected Integer quantidade;

    public void setInsumoProduto(List<Insumo_produto> insumoProduto) {
        this.insumoProduto = insumoProduto;
    }

    public List<Insumo_produto> getInsumoProduto() {
        return insumoProduto;
    }


    public void setIdCategoria(Categoria idCategoria) {
        this.idCategoria = idCategoria;
    }

    public Categoria getIdCategoria() {
        return idCategoria;
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

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public Double getPreco() {
        return preco;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public Integer getQuantidade() {
        return quantidade;
    }


}