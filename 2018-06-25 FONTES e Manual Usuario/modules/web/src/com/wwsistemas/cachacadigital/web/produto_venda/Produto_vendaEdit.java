package com.wwsistemas.cachacadigital.web.produto_venda;

import com.haulmont.cuba.gui.components.AbstractEditor;
import com.haulmont.cuba.gui.components.ValidationErrors;
import com.wwsistemas.cachacadigital.entity.Produto_venda;

public class Produto_vendaEdit extends AbstractEditor<Produto_venda> {
	
	Produto_venda pv = getItem();
	
	@Override
	protected void postValidate(ValidationErrors errors) {
	    if (pv.getQuantidade() > pv.getIdProduto().getQuantidade() ) {
	            errors.add("City name can't contain digits");
	        }
	    
	}
}