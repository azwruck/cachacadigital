package com.wwsistemas.cachacadigital.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.BaseIntegerIdEntity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.util.Date;

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

    @Column(name = "MADEIRA")
    protected String madeira;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "PRODUTO_ID")
    protected Produto produto;


    @Temporal(TemporalType.DATE)
    @Column(name = "DATA_ENTRADA")
    protected Date data_entrada;

    @Column(name = "TEMPO_ARMAZENADO")
    protected String tempo_armazenado;

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
//
        if (data_entrada == null) {
            data_entrada = Date.from(data_armazenada.atStartOfDay(ZoneId.systemDefault()).toInstant());
            entrada = LocalDate.of(data_entrada.getYear() + 1900, data_entrada.getMonth() + 1, data_entrada.getDate());
        } else {
//            LocalDate l = data_entrada.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
//            data_armazenada = LocalDate.of(l.getYear(), l.getMonth(), l.getDayOfMonth());
            entrada = LocalDate.of(data_entrada.getYear() + 1900, data_entrada.getMonth() + 1, data_entrada.getDate());
        }

        Period periodo = Period.between(entrada, hoje);

        tempo_armazenado = periodo.getYears() + " anos, " + periodo.getMonths() + " meses, " + periodo.getDays() + "dias";

        return tempo_armazenado;
    	
//        LocalDate hoje = LocalDate.now();
//
//        LocalDate l = data_entrada.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
//
//        LocalDate data_armazenada = LocalDate.now();
//
//        if(data_entrada == null){
//        	data_armazenada = LocalDate.now();
//        } else{
//        	data_armazenada = LocalDate.of(l.getYear(), l.getMonth(), l.getDayOfMonth());
//        }
//
//        Period periodo = Period.between(data_armazenada, hoje);
//
//
//        tempo_armazenado = periodo.getYears() + " anos,"+ periodo.getMonths()+ " meses, "+ periodo.getDays()+"dias";
//        return tempo_armazenado;
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