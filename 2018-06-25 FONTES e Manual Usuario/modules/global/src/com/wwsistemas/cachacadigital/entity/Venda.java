package com.wwsistemas.cachacadigital.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;
import java.util.UUID;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;
import javax.validation.constraints.NotNull;
import com.haulmont.cuba.core.entity.BaseIntegerIdEntity;
import com.haulmont.cuba.core.entity.HasUuid;
import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.chile.core.annotations.Composition;
import com.haulmont.chile.core.annotations.MetaProperty;

import java.util.List;
import javax.persistence.OneToMany;
import java.util.Collection;

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
    protected Double total;

    
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
    public Double getTotal2() {

    	total2 = 0.0;

    	if(produto_venda != null){
            for (Produto_venda pv: produto_venda) {
                total2 += pv.getCusto();
            }
            System.out.println("teste incluindo = "+total2);
            setTotal(total2);
            return total2;
    	} else
            setTotal(total2);
        System.out.println("passou com o pv nulo = "+total2);
            return total2;
    }


    public void setData_venda(Date data_venda) {
        this.data_venda = data_venda;
    }

    public Date getData_venda() {
        return data_venda;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public Double getTotal() {
        return total;
    }


}