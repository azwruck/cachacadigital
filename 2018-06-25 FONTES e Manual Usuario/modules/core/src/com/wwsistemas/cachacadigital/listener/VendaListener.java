package com.wwsistemas.cachacadigital.listener;

import java.util.List;
import com.haulmont.cuba.core.EntityManager;
import com.haulmont.cuba.core.listener.BeforeInsertEntityListener;
import com.haulmont.cuba.core.listener.BeforeUpdateEntityListener;
import com.wwsistemas.cachacadigital.entity.Produto_venda;
import com.wwsistemas.cachacadigital.entity.Venda;
import org.springframework.stereotype.Component;
import com.haulmont.cuba.core.listener.AfterInsertEntityListener;
import com.haulmont.cuba.core.listener.AfterUpdateEntityListener;
import com.haulmont.cuba.core.listener.BeforeAttachEntityListener;

@Component(VendaListener.NAME)
public class VendaListener implements
        BeforeInsertEntityListener<Produto_venda>,
        BeforeUpdateEntityListener<Produto_venda>
//        AfterUpdateEntityListener<Venda>,
//        AfterInsertEntityListener<Venda>,
//        BeforeAttachEntityListener<Venda>
{
    public static final String NAME = "cachaca_VendaListener";


    @Override
    public void onBeforeInsert(Produto_venda entity, EntityManager entityManager) {
        calculaTotal(entity, entity.getVenda(), entityManager);
    }

    @Override
    public void onBeforeUpdate(Produto_venda entity, EntityManager entityManager) {
        calculaTotal(entity, entity.getVenda(), entityManager);
    }


    private void calculaTotal(Produto_venda pv, Venda venda, EntityManager entity) {

    }
}