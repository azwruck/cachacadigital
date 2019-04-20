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
public class Insumo extends BaseIntegerIdEntity {
    private static final long serialVersionUID = 3451459289325836937L;

    @Composition
    @OneToMany(mappedBy = "insumo")
    protected List<Insumo_produto> insumo_produto;

    @NotNull
    @Column(name = "ESTOQUE", nullable = false)
    protected Integer estoque;

    @Column(name = "QUANTIDADE")
    protected Integer quantidade;

    @NotNull
    @Column(name = "NOME", nullable = false, length = 64)
    protected String nome;

    public void setInsumo_produto(List<Insumo_produto> insumo_produto) {
        this.insumo_produto = insumo_produto;
    }

    public List<Insumo_produto> getInsumo_produto() {
        return insumo_produto;
    }


    public void setEstoque(Integer estoque) {
        this.estoque = estoque;
    }

    public Integer getEstoque() {
        return estoque;
    }




    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public Integer getQuantidade() {
        return quantidade;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }


}