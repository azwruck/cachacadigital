package com.wwsistemas.cachacadigital.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.UUID;
import javax.persistence.Column;
import javax.validation.constraints.NotNull;
import com.haulmont.cuba.core.entity.BaseIntegerIdEntity;
import com.haulmont.cuba.core.entity.HasUuid;
import com.haulmont.chile.core.annotations.NamePattern;

@NamePattern("%s|sigla")
@Table(name = "CACHACA_ESTADO")
@Entity(name = "cachaca$Estado")
public class Estado extends BaseIntegerIdEntity implements HasUuid {
    private static final long serialVersionUID = 2620607667488563822L;

    @Column(name = "UUID")
    protected UUID uuid;

    @NotNull
    @Column(name = "NOME", nullable = false, length = 64)
    protected String nome;

    @NotNull
    @Column(name = "SIGLA", nullable = false, length = 2)
    protected String sigla;

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

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public String getSigla() {
        return sigla;
    }


}