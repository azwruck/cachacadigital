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
import java.util.Date;
import com.haulmont.cuba.core.entity.Updatable;

@NamePattern("%s|nome")
@Table(name = "CACHACA_PRODUTO")
@Entity(name = "cachaca$Produto")
public class Produto extends BaseIntegerIdEntity implements Updatable {
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
    protected Double preco;

    @Column(name = "QUANTIDADE")
    protected Integer quantidade;


    @Column(name = "UPDATE_TS")
    protected Date updateTs;

    @Column(name = "UPDATED_BY", length = 50)
    protected String updatedBy;

    @Override
    public void setUpdateTs(Date updateTs) {
        this.updateTs = updateTs;
    }

    @Override
    public Date getUpdateTs() {
        return updateTs;
    }

    @Override
    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    @Override
    public String getUpdatedBy() {
        return updatedBy;
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