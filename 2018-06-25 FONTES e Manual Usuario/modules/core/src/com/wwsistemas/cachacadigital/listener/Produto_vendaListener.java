package com.wwsistemas.cachacadigital.listener;

import org.springframework.stereotype.Component;
import com.haulmont.cuba.core.listener.BeforeInsertEntityListener;
import com.haulmont.cuba.core.EntityManager;
import com.wwsistemas.cachacadigital.entity.Produto;
import com.wwsistemas.cachacadigital.entity.Produto_venda;
import com.haulmont.cuba.core.listener.BeforeUpdateEntityListener;

import java.math.BigDecimal;

@Component("cachaca_Produto_vendaListener")
public class Produto_vendaListener
		implements BeforeInsertEntityListener<Produto_venda>, BeforeUpdateEntityListener<Produto_venda> {

	@Override
	public void onBeforeInsert(Produto_venda entity, EntityManager entityManager) {
		recalculaEstoque(entity, entity.getProduto(), entityManager);
	}

	@Override
	public void onBeforeUpdate(Produto_venda entity, EntityManager entityManager) {
		recalculaEstoque(entity, entity.getProduto(), entityManager);
	}

	private void recalculaEstoque(Produto_venda produto_venda, Produto produto, EntityManager entity) throws IllegalArgumentException {

			if (produto_venda.getQuantidade().compareTo(produto.getQuantidade()) > 0) {
				throw new IllegalArgumentException("Estoque insuficiente do produto "+ produto.getNome());
			} else {

			BigDecimal quantidade = (produto.getQuantidade().subtract(produto_venda.getQuantidade()));

			Produto pro = entity.merge(produto);

			pro.setQuantidade(quantidade);
			}

	}

}