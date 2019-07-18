package com.wwsistemas.cachacadigital.entity;

import com.haulmont.chile.core.annotations.Composition;
import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.BaseIntegerIdEntity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.util.List;

@NamePattern("%s|nome")
@Table(name = "CACHACA_PRODUTO")
@Entity(name = "cachaca$Produto")
public class Produto extends BaseIntegerIdEntity {
    private static final long serialVersionUID = -2385608680144950017L;

    @Composition
    @OneToMany(mappedBy = "produto")
    protected List<Insumo_produto> insumo_produto;

    @NotNull
    @Column(name = "NOME", nullable = false)
    protected String nome;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "CATEGORIA_ID")
    protected Categoria categoria;

    @NotNull
    @Column(name = "PRECO", nullable = false)
    protected java.math.BigDecimal preco;

    @Column(name = "QUANTIDADE")
    protected BigDecimal quantidade;

    public void setQuantidade(BigDecimal quantidade) {
        this.quantidade = quantidade;
    }

    public BigDecimal getQuantidade() {
        return quantidade;
    }

    public void setPreco(BigDecimal preco) {
        this.preco = preco;
    }

    public BigDecimal getPreco() {
        return preco;
    }


    public void setInsumo_produto(List<Insumo_produto> insumo_produto) {
        this.insumo_produto = insumo_produto;
    }

    public List<Insumo_produto> getInsumo_produto() {
        return insumo_produto;
    }


    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public Categoria getCategoria() {
        return categoria;
    }




    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }


}