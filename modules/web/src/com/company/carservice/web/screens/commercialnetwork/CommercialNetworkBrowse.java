package com.company.carservice.web.screens.commercialnetwork;

import com.haulmont.cuba.gui.screen.*;
import com.company.carservice.entity.CommercialNetwork;

@UiController("carservice_CommercialNetwork.browse")
@UiDescriptor("commercial-network-browse.xml")
@LookupComponent("commercialNetworksTable")
@LoadDataBeforeShow
public class CommercialNetworkBrowse extends StandardLookup<CommercialNetwork> {
}