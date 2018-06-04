package com.gmail.juma.testbench.elements.ui;

import com.vaadin.flow.component.formlayout.testbench.FormLayoutElement;
import com.vaadin.flow.component.grid.testbench.GridElement;
import com.gmail.juma.testbench.elements.components.ConfirmDialogElement;
import com.gmail.juma.testbench.elements.components.FormButtonsBarElement;
import com.gmail.juma.testbench.elements.core.FlowComponentRendererElement;
import com.vaadin.testbench.ElementQuery;
import com.vaadin.testbench.HasElementQuery;
import com.vaadin.testbench.TestBenchElement;

import java.util.Optional;

public interface HasCrudView extends HasElementQuery {

	<T extends TestBenchElement> Class<T> getFormClass();

	default GridElement getGrid() {
		return $(GridElement.class).first();
	}

	default Optional<ConfirmDialogElement> getConfirmDialog() {
		ElementQuery<ConfirmDialogElement> query = $(ConfirmDialogElement.class).onPage();
		return query.exists() ? Optional.of(query.first()) : Optional.empty();
	}

	default Optional<DialogContentElement> getDialog() {
		ElementQuery<DialogContentElement> query = $(DialogContentElement.class).onPage();
		return query.exists() ? Optional.of(query.first()) : Optional.empty();
	}

	default FormButtonsBarElement getButtonsBar() {
		return getDialog().get().$(FlowComponentRendererElement.class).first()
				.$(getFormClass()).first().$(FormButtonsBarElement.class).first();
	}

	default FormLayoutElement getForm() {
		return getDialog().get().$(FlowComponentRendererElement.class).waitForFirst()
				.$(getFormClass()).first().$(FormLayoutElement.class).waitForFirst();
	}

}
