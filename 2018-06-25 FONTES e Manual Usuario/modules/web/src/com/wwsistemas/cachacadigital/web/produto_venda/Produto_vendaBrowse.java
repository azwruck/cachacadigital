package com.wwsistemas.cachacadigital.web.produto_venda;

import com.haulmont.cuba.gui.screen.*;
import com.wwsistemas.cachacadigital.entity.Produto_venda;

@UiController("cachaca$Produto_venda.browse")
@UiDescriptor("produto_venda-browse.xml")
@LookupComponent("produto_vendasTable")
@LoadDataBeforeShow
public class Produto_vendaBrowse extends StandardLookup<Produto_venda> {
}