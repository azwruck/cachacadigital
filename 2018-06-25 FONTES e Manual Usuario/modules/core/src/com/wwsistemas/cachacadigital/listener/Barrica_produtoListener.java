package com.wwsistemas.cachacadigital.listener;

import com.haulmont.cuba.core.EntityManager;
import com.haulmont.cuba.core.listener.BeforeInsertEntityListener;
import com.haulmont.cuba.core.listener.BeforeUpdateEntityListener;
import com.wwsistemas.cachacadigital.entity.*;
import com.haulmont.cuba.core.listener.BeforeDeleteEntityListener;
import org.springframework.stereotype.Component;

@Component(Barrica_produtoListener.NAME)
public class Barrica_produtoListener implements
        BeforeDeleteEntityListener<Barrica_produto>,
        BeforeInsertEntityListener<Barrica_produto>,
        BeforeUpdateEntityListener<Barrica_produto>
        {
    public static final String NAME = "cachaca_Barrica_produtoListener";

    @Override
    public void onBeforeDelete(Barrica_produto entity, EntityManager entityManager) {
        atualizaStatus(entity, entity.getBarrica(), entityManager);
    }

    @Override
    public void onBeforeInsert(Barrica_produto entity, EntityManager entityManager) {
        atualizaStatus(entity, entity.getBarrica(), entityManager);
    }

    @Override
    public void onBeforeUpdate(Barrica_produto entity, EntityManager entityManager) {
        atualizaStatus(entity, entity.getBarrica(), entityManager);
    }



    private void atualizaStatus(Barrica_produto bp, Barrica barrica, EntityManager entity){

        if(bp == null) {
            return;
        } else{
            Barrica bar = entity.merge(barrica);
            bar.setStatus("Utilizado");
        }

    }
}

