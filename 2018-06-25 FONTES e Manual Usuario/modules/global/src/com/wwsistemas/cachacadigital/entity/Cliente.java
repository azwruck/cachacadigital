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

@NamePattern("%s|nome")
@Table(name = "CACHACA_CLIENTE")
@Entity(name = "cachaca$Cliente")
public class Cliente extends BaseIntegerIdEntity implements HasUuid {
    private static final long serialVersionUID = 6652258313616578483L;

    @Column(name = "UUID")
    protected UUID uuid;

    @NotNull
    @Column(name = "NOME", nullable = false, length = 128)
    protected String nome;

    @Column(name = "EMAIL", length = 128)
    protected String email;

    @Column(name = "TELEFONE", length = 16)
    protected String telefone;

    @NotNull
    @Column(name = "ENDERECO", nullable = false)
    protected String endereco;

    @NotNull
    @Column(name = "CIDADE", nullable = false, length = 128)
    protected String cidade;

    @NotNull
    @Column(name = "CEP", nullable = false, length = 16)
    protected String cep;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ESTADO_ID")
    protected Estado estado;

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

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getCep() {
        return cep;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public Estado getEstado() {
        return estado;
    }


}