package com.wwsistemas.cachacadigital.web.venda;

import java.util.List;

import com.haulmont.cuba.core.entity.Entity;
import com.haulmont.cuba.gui.components.AbstractEditor;
import com.haulmont.cuba.gui.components.Component;
import com.haulmont.cuba.gui.components.ValidationErrors;
import com.haulmont.cuba.gui.components.ValidationException;
import com.haulmont.cuba.gui.data.Datasource;
import com.wwsistemas.cachacadigital.entity.Insumo_produto;
import com.wwsistemas.cachacadigital.entity.Produto_venda;
import com.wwsistemas.cachacadigital.entity.Venda;

//import com.haulmont.cuba.gui.components.WindowDelegate;

public class VendaEdit extends AbstractEditor<Venda> {


//	Venda v = new Venda();
//	
//	@Override
//	protected void postValidate(ValidationErrors errors) {
//		List<Produto_venda> lista;
//		lista = v.getProduto_venda();
//		for (Produto_venda pv: lista){
//	    if (pv == null ) {
//            errors.add("A venda precisa conter produtos!");
//            }
//		}
//		for (Produto_venda pv: lista){
//			if(pv.getQuantidade() > pv.getProduto().getQuantidade()){
//				errors.add("Estoque insuficiente!");
//				break;
//			}
//		}
//
//		showValidationErrors(errors);
//	}
	
//	if (Boolean.TRUE.equals(parameter.getRequired())) {
//	    tokenList.addValidator(new Field.Validator() {
//    public void validate(Venda venda) throws ValidationException {
//    	for(int i = 1; i <= venda.getIdProdutoVenda().size(); i++){
//			if(venda.getIdProdutoVenda().get(i).getQuantidade() > venda.getIdProdutoVenda().get(i).getIdProduto().getQuantidade()){
//            throw new ValidationException(getMessage("Estoque insuficiente!"));
//        }
//    }
//}
//	    });
//	}
//	Venda venda = new Venda();
//	{
//	for(int i = 1; i <= venda.getIdProdutoVenda().size(); i++){
//		if(venda.getIdProdutoVenda().get(i).getQuantidade() > venda.getIdProdutoVenda().get(i).getIdProduto().getQuantidade()){
//        throw new ValidationException(getMessage("Estoque insuficiente!"));
//    }
//}
//	}
	
//	public void onSaveBtnClick() {
//		try {
//            Venda venda = new Venda();
//			validate();
//			commit();
//
//			close(COMMIT_ACTION_ID);
//		} catch (Exception e) {
//			ValidationErrors ve = new ValidationErrors();
//			ve.add("Estoque insuficiente!");
//			showValidationErrors(ve);
//		}
//	}
}
	  
	
