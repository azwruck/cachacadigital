package com.wwsistemas.cachacadigital.listener;

import com.haulmont.cuba.core.EntityManager;
import com.haulmont.cuba.core.listener.BeforeDeleteEntityListener;
import com.haulmont.cuba.core.listener.BeforeInsertEntityListener;
import com.haulmont.cuba.core.listener.BeforeUpdateEntityListener;
import com.wwsistemas.cachacadigital.entity.Barrica;
import com.wwsistemas.cachacadigital.entity.Barrica_produto;
import org.springframework.stereotype.Component;

@Component(Barrica_produtoDeleteListener.NAME)
public class Barrica_produtoDeleteListener implements
        BeforeDeleteEntityListener<Barrica_produto>{

    public static final String NAME = "cachaca_Barrica_produtoDeleteListener";

    @Override
    public void onBeforeDelete(Barrica_produto entity, EntityManager entityManager) {
        atualizaStatus(entity, entity.getBarrica(), entityManager);
    }

    private void atualizaStatus(Barrica_produto bp, Barrica barrica, EntityManager entity){

        Barrica bar = entity.merge(barrica);
        bar.setStatus("Disponível");


    }
}