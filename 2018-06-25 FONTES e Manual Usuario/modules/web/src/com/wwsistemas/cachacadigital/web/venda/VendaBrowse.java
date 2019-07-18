package com.wwsistemas.cachacadigital.web.venda;

import com.haulmont.cuba.gui.screen.*;
import com.wwsistemas.cachacadigital.entity.Venda;

@UiController("cachaca$Venda.browse")
@UiDescriptor("venda-browse.xml")
@LookupComponent("vendasTable")
@LoadDataBeforeShow
public class VendaBrowse extends StandardLookup<Venda> {
}