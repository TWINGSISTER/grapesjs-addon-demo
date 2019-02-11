package com.haulmont.demo.grapesjs.web;

import com.haulmont.addon.grapesjs.web.gui.components.GrapesJsHtmlEditor;
import com.haulmont.cuba.gui.screen.Screen;
import com.haulmont.cuba.gui.screen.Subscribe;
import com.haulmont.cuba.gui.screen.UiController;
import com.haulmont.cuba.gui.screen.UiDescriptor;

import javax.inject.Inject;

@UiController("grapesjsdemo_HtmlScreen")
@UiDescriptor("html-screen.xml")
public class HtmlScreen extends Screen {

    @Inject
    private GrapesJsHtmlEditor templateEditor;

    @Subscribe
    private void onAfterInit(AfterInitEvent event) {
        templateEditor.addValueChangeListener(e -> {
            String newValue = e.getValue();
        });
    }


}