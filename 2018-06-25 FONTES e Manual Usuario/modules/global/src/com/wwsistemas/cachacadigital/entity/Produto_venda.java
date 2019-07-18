package com.wwsistemas.cachacadigital.entity;

import com.haulmont.chile.core.annotations.MetaProperty;
import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.BaseIntegerIdEntity;
import com.haulmont.cuba.core.entity.annotation.Listeners;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

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
    protected java.math.BigDecimal quantidade;

    @Column(name = "TOTAL")
    protected Double total;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "VENDA_ID")
    protected Venda venda;

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


    @MetaProperty(related = {"produto", "quantidade"})
    public BigDecimal getCusto() {
    	BigDecimal custo = getQuantidade().multiply(produto.getPreco());
    	setTotal(custo.doubleValue());
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


}