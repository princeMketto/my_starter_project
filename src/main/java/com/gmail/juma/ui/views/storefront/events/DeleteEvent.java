package com.gmail.juma.ui.views.storefront.events;

import com.vaadin.flow.component.ComponentEvent;
import com.gmail.juma.ui.views.orderedit.OrderItemEditor;

public class DeleteEvent extends ComponentEvent<OrderItemEditor> {
	public DeleteEvent(OrderItemEditor component) {
		super(component, false);
	}
}