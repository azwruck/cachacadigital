package com.wwsistemas.cachacadigital.listener;

import org.springframework.stereotype.Component;
import com.haulmont.cuba.core.listener.BeforeInsertEntityListener;
import com.haulmont.cuba.core.EntityManager;
import com.wwsistemas.cachacadigital.entity.Produto;
import com.wwsistemas.cachacadigital.entity.Produto_venda;
import com.haulmont.cuba.core.listener.BeforeUpdateEntityListener;

@Component("cachaca_Produto_vendaListener")
public class Produto_vendaListener implements BeforeInsertEntityListener<Produto_venda>, BeforeUpdateEntityListener<Produto_venda> {


    @Override
    public void onBeforeInsert(Produto_venda entity, EntityManager entityManager) {
    	recalculaEstoque(entity, entity.getIdProduto(), entityManager);
    }


    @Override
    public void onBeforeUpdate(Produto_venda entity, EntityManager entityManager) {
    	recalculaEstoque(entity, entity.getIdProduto(), entityManager);
    }

    private void recalculaEstoque(Produto_venda pv, Produto p, EntityManager em){
        if (p == null)
            return;
        if(pv.getQuantidade() > p.getQuantidade()){
        	return;
        }
        
        Integer quantidade = (p.getQuantidade() - pv.getQuantidade());
        
        Produto pro = em.merge(p);
        
        pro.setQuantidade(quantidade);
    }

}