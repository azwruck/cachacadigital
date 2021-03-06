package com.wwsistemas.cachacadigital.entity;

import com.haulmont.chile.core.annotations.Composition;
import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.BaseIntegerIdEntity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.util.Date;
import java.util.List;

@NamePattern("%s|id")
@Table(name = "CACHACA_BARRICA")
@Entity(name = "cachaca$Barrica")
public class Barrica extends BaseIntegerIdEntity {
    private static final long serialVersionUID = -5134373288386287168L;


    @NotNull
    @Column(name = "CAPACIDADE", nullable = false)
    protected Double capacidade;


    @Column(name = "STATUS")
    protected String status;

    @NotNull
    @Column(name = "MADEIRA", nullable = false)
    protected String madeira;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "PRODUTO_ID")
    protected Produto produto;


    @Temporal(TemporalType.DATE)
    @Column(name = "DATA_ENTRADA")
    protected Date data_entrada;

    @Column(name = "TEMPO_ARMAZENADO")
    protected String tempo_armazenado;

    @Composition
    @OneToMany(mappedBy = "barrica")
    protected List<Barrica_produto> barrica_produto;

    public List<Barrica_produto> getBarrica_produto() {
        return barrica_produto;
    }

    public void setBarrica_produto(List<Barrica_produto> barrica_produto) {

        this.barrica_produto = barrica_produto;
        setStatus("Utilizado");
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }


    public void setTempo_armazenado(String tempo_armazenado) {
        this.tempo_armazenado = tempo_armazenado;
    }

    public String getTempo_armazenado() {

        LocalDate hoje = LocalDate.now();

        LocalDate entrada;
        LocalDate data_armazenada = LocalDate.now();

        for (Barrica_produto bp: barrica_produto) {
            if (bp.data_entrada == null) {
                bp.data_entrada = Date.from(data_armazenada.atStartOfDay(ZoneId.systemDefault()).toInstant());
                entrada = LocalDate.of(bp.data_entrada.getYear() + 1900, bp.data_entrada.getMonth() + 1, bp.data_entrada.getDate());
            } else {
                entrada = LocalDate.of(bp.data_entrada.getYear() + 1900, bp.data_entrada.getMonth() + 1, bp.data_entrada.getDate());
            }

            Period periodo = Period.between(entrada, hoje);

            tempo_armazenado = periodo.getYears() + " anos, " + periodo.getMonths() + " meses, " + periodo.getDays() + "dias";

            return tempo_armazenado;
        }

        return tempo_armazenado;
    }


    public void setData_entrada(Date data_entrada) {
        this.data_entrada = data_entrada;
    }

    public Date getData_entrada() {
        return data_entrada;
    }


    public void setMadeira(String madeira) {
        this.madeira = madeira;
    }

    public String getMadeira() {
        return madeira;
    }


    public void setProduto(Produto produto) {

        this.produto = produto;
        setStatus("Utilizado");
    }

    public Produto getProduto() {
        return produto;
    }



    public void setCapacidade(Double capacidade) {

        this.capacidade = capacidade;
        setStatus("Disponível");
    }

    public Double getCapacidade() {
        return capacidade;
    }


}