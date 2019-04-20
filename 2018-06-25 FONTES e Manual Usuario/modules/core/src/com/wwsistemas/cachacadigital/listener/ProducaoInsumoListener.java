package com.wwsistemas.cachacadigital.listener;

import java.util.List;

import org.springframework.stereotype.Component;
import com.haulmont.cuba.core.listener.BeforeInsertEntityListener;
import com.haulmont.cuba.core.EntityManager;
import com.wwsistemas.cachacadigital.entity.Producao;
import com.wwsistemas.cachacadigital.entity.Insumo;
import com.wwsistemas.cachacadigital.entity.Insumo_produto;
import com.haulmont.cuba.core.listener.BeforeUpdateEntityListener;

@Component("cachaca_ProducaoInsumoListener")
public class ProducaoInsumoListener implements BeforeInsertEntityListener<Producao>, BeforeUpdateEntityListener<Producao> {


    @Override
    public void onBeforeInsert(Producao entity, EntityManager entityManager) {
    	calculaInsumo(entity, entity.getProduto().getInsumo_produto(), entityManager);
    }


    @Override
    public void onBeforeUpdate(Producao entity, EntityManager entityManager) {
    	calculaInsumo(entity, entity.getProduto().getInsumo_produto(), entityManager);
    }

    
    private void calculaInsumo(Producao producao, List<Insumo_produto> list, EntityManager entity){
    	
    	for (Insumo_produto ip: list){
    	Integer quantidade = producao.getQuantidade() * ip.getQuantidade();
    	
    	quantidade = ip.getInsumo().getEstoque() - quantidade;
    	
    	Insumo ins = entity.merge(ip.getInsumo());
    	
    	ins.setEstoque(quantidade);
    	}
    }

}