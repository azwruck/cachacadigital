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
import javax.validation.constraints.NotNull;
import com.haulmont.cuba.core.entity.BaseIntegerIdEntity;
import com.haulmont.cuba.core.entity.HasUuid;
import com.haulmont.chile.core.annotations.NamePattern;

@NamePattern("%s %s|idCliente,data_venda")
@Table(name = "CACHACA_VENDA")
@Entity(name = "cachaca$Venda")
public class Venda extends BaseIntegerIdEntity implements HasUuid {
    private static final long serialVersionUID = -3576490073138102830L;

    @Column(name = "UUID")
    protected UUID uuid;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ID_CLIENTE_ID")
    protected Cliente idCliente;

    @Temporal(TemporalType.DATE)
    @NotNull
    @Column(name = "DATA_VENDA", nullable = false)
    protected Date data_venda;

    @NotNull
    @Column(name = "TOTAL", nullable = false)
    protected Double total;

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