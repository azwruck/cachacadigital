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
import com.haulmont.chile.core.annotations.MetaProperty;
import com.haulmont.chile.core.annotations.NamePattern;
import com.wwsistemas.cachacadigital.entity.Produto;
import com.haulmont.cuba.core.entity.annotation.Listeners;

@Listeners({"cachaca_Produto_vendaListener", "cachaca_VendaListener"})
@NamePattern("%s |produto")
@Table(name = "CACHACA_PRODUTO_VENDA")
@Entity(name = "cachaca$Produto_venda")
public class Produto_venda extends BaseIntegerIdEntity {
    private static final long serialVersionUID = 5661285715040323399L;
    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "PRODUTO_ID")
    protected Produto produto;

    @NotNull
    @Column(name = "QUANTIDADE", nullable = false)
    protected Integer quantidade;

    @Column(name = "TOTAL")
    protected Double total;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "VENDA_ID")
    protected Venda venda;
    
    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public Produto getProduto() {
        return produto;
    }


    @MetaProperty(related = {"produto", "quantidade"})
    public Double getCusto() {
    	Double custo = getQuantidade() * produto.getPreco();
    	setTotal(custo);
        return custo;
    }

    public void setTotal(Double total) {
        this.total = total;
    }
    
    public Double getTotal() {
        return total;
    }

    
    public void setVenda(Venda venda) {
        this.venda = venda;
    }

    public Venda getVenda() {
        return venda;
    }




    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public Integer getQuantidade() {
        return quantidade;
    }



}