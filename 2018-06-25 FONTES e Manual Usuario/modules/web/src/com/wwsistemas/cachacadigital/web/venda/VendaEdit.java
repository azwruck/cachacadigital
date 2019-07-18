package com.wwsistemas.cachacadigital.web.venda;

import com.haulmont.cuba.gui.model.CollectionChangeType;
import com.haulmont.cuba.gui.model.CollectionContainer;
import com.haulmont.cuba.gui.model.CollectionPropertyContainer;
import com.haulmont.cuba.gui.screen.*;
import com.wwsistemas.cachacadigital.entity.Produto_venda;
import com.wwsistemas.cachacadigital.entity.Venda;

import javax.inject.Inject;
import java.math.BigDecimal;

@UiController("cachaca$Venda.edit")
@UiDescriptor("venda-edit.xml")
@EditedEntityContainer("vendaDc")
@LoadDataBeforeShow
public class VendaEdit extends StandardEditor<Venda> {
    @Inject
    private CollectionPropertyContainer<Produto_venda> produto_vendaDC;

    @Subscribe(id = "produto_vendaDC", target = Target.DATA_CONTAINER)
    private void onProduto_vendaDCCollectionChange(CollectionContainer.CollectionChangeEvent<Produto_venda> event) {
        if(event.getChangeType() != CollectionChangeType.REFRESH){
            calculaTotal();
        }
    }

    protected void calculaTotal(){
        BigDecimal total = BigDecimal.ZERO;
        for(Produto_venda pv: produto_vendaDC.getItems()){
            total = total.add(pv.getCusto());
        }
        getEditedEntity().setTotal(total);
    }
    
}