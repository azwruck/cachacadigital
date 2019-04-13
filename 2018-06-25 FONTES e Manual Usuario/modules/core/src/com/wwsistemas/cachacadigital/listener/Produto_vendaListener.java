package com.wwsistemas.cachacadigital.listener;

import org.springframework.stereotype.Component;
import com.haulmont.cuba.core.listener.BeforeInsertEntityListener;
import com.haulmont.cuba.core.EntityManager;
import com.wwsistemas.cachacadigital.entity.Produto;
import com.wwsistemas.cachacadigital.entity.Produto_venda;
import com.haulmont.cuba.core.listener.BeforeUpdateEntityListener;

@Component("cachaca_Produto_vendaListener")
public class Produto_vendaListener
		implements BeforeInsertEntityListener<Produto_venda>, BeforeUpdateEntityListener<Produto_venda> {

	@Override
	public void onBeforeInsert(Produto_venda entity, EntityManager entityManager) {
//		try{
		recalculaEstoque(entity, entity.getIdProduto(), entityManager);
//		} catch(IllegalArgumentException e){
//			System.out.println(e.getMessage());
//		}
	}

	@Override
	public void onBeforeUpdate(Produto_venda entity, EntityManager entityManager) {
//		try{
		recalculaEstoque(entity, entity.getIdProduto(), entityManager);
//		} catch(IllegalArgumentException e){
//			throw new IllegalArgumentException(getMessage("Estoque insuficiente!"));
//		}
	}

	private void recalculaEstoque(Produto_venda produto_venda, Produto produto, EntityManager entity) throws IllegalArgumentException {

			if (produto_venda.getQuantidade() > produto.getQuantidade()) {
				throw new IllegalArgumentException("Saldo insuficiente");
			} else {

			Integer quantidade = (produto.getQuantidade() - produto_venda.getQuantidade());

			Produto pro = entity.merge(produto);

			pro.setQuantidade(quantidade);
			}

	}

}