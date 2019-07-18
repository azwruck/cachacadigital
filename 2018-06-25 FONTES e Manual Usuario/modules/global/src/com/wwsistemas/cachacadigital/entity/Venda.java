package com.wwsistemas.cachacadigital.entity;

import com.haulmont.chile.core.annotations.Composition;
import com.haulmont.chile.core.annotations.MetaProperty;
import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.BaseIntegerIdEntity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@NamePattern("%s %s|cliente,data_venda")
@Table(name = "CACHACA_VENDA")
@Entity(name = "cachaca$Venda")
public class Venda extends BaseIntegerIdEntity {
    private static final long serialVersionUID = -3576490073138102830L;

    @Composition
    @OneToMany(mappedBy = "venda")
    protected List<Produto_venda> produto_venda;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "CLIENTE_ID")
    protected Cliente cliente;

    @Temporal(TemporalType.DATE)
    @NotNull
    @Column(name = "DATA_VENDA", nullable = false)
    protected Date data_venda;

    @Column(name = "TOTAL")
    protected java.math.BigDecimal total;


    public void setProduto_venda(List<Produto_venda> produto_venda) {
        this.produto_venda = produto_venda;
    }

    public List<Produto_venda> getProduto_venda() {
        return produto_venda;
    }


    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Cliente getCliente() {
        return cliente;
    }


    @Transient
    @MetaProperty(related = "produto_venda")
    protected Double total2;

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public Double getTotal2() {

        return total2;
    }


    public void setData_venda(Date data_venda) {
        this.data_venda = data_venda;
    }

    public Date getData_venda() {
        return data_venda;
    }


}