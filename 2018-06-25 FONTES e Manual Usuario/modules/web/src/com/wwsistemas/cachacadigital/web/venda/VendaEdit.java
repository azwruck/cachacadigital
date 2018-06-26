package com.wwsistemas.cachacadigital.web.venda;

import com.haulmont.cuba.gui.components.AbstractEditor;
import com.haulmont.cuba.gui.components.ValidationErrors;
import com.wwsistemas.cachacadigital.entity.Venda;

public class VendaEdit extends AbstractEditor<Venda> {
	
	Venda v = getItem();
	

	@Override
	protected void postValidate(ValidationErrors errors) {
	    if (v.getIdProdutoVenda().getQuantidade() > pv.getIdProduto().getQuantidade() ) {
	            errors.add("City name can't contain digits");
	        }
	    
	}
}