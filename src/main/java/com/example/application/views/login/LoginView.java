package com.example.application.views.login;

import com.example.application.views.MainLayout;
import com.vaadin.flow.component.HasStyle;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

@PageTitle("Login")
@Route(value = "login", layout = MainLayout.class)
@Tag("login-view")
@JsModule("./views/login/login-view.ts")
public class LoginView extends LitTemplate implements HasStyle {

    public LoginView() {
        addClassNames("flex", "flex-col", "h-full");
    }
}
