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

@NamePattern("%s %s|idCliente,data_venda")
@Table(name = "CACHACA_VENDA")
@Entity(name = "cachaca$Venda")
public class Venda extends BaseIntegerIdEntity implements HasUuid {
    private static final long serialVersionUID = -3576490073138102830L;

    @Column(name = "UUID")
    protected UUID uuid;

    @Composition
    @OneToMany(mappedBy = "venda")
    protected List<Produto_venda> idProdutoVenda;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ID_CLIENTE_ID")
    protected Cliente idCliente;

    @Temporal(TemporalType.DATE)
    @NotNull
    @Column(name = "DATA_VENDA", nullable = false)
    protected Date data_venda;

    @Column(name = "TOTAL")
    protected Double total;
    


    public List<Produto_venda> getIdProdutoVenda() {
        return idProdutoVenda;
    }

    public void setIdProdutoVenda(List<Produto_venda> idProdutoVenda) {
        this.idProdutoVenda = idProdutoVenda;
    }



    @Transient
    @MetaProperty(related = "idProdutoVenda")
    protected Double total2;
    
    public Double getTotal2() {
    	
    	total2 = 0.0;
    	
    	if(idProdutoVenda == null){
    		return total2;
    	} else 
        for (Produto_venda pv: idProdutoVenda) {
        	total2 += pv.getCusto();
        }
    	

        return total2;
    }

    public void setIdCliente(Cliente idCliente) {
        this.idCliente = idCliente;
    }

    public Cliente getIdCliente() {
        return idCliente;
    }


    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    public UUID getUuid() {
        return uuid;
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