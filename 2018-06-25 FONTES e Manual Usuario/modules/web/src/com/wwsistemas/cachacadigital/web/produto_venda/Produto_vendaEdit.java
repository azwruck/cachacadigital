package com.wwsistemas.cachacadigital.web.produto_venda;

import com.haulmont.cuba.gui.screen.*;
import com.wwsistemas.cachacadigital.entity.Produto_venda;

@UiController("cachaca$Produto_venda.edit")
@UiDescriptor("produto_venda-edit.xml")
@EditedEntityContainer("produto_vendaDc")
@LoadDataBeforeShow
public class Produto_vendaEdit extends StandardEditor<Produto_venda> {
}