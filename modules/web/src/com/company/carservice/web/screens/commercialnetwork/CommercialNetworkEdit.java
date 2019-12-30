package com.company.carservice.web.screens.commercialnetwork;

import com.haulmont.cuba.gui.screen.*;
import com.company.carservice.entity.CommercialNetwork;

@UiController("carservice_CommercialNetwork.edit")
@UiDescriptor("commercial-network-edit.xml")
@EditedEntityContainer("commercialNetworkDc")
@LoadDataBeforeShow
public class CommercialNetworkEdit extends StandardEditor<CommercialNetwork> {
}