package com.app1.web.servlet.config;

import javax.servlet.annotation.WebListener;

import com.app1.web.servlet.App1WebServlet;
import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.servlet.GuiceServletContextListener;
import com.google.inject.servlet.ServletModule;

@WebListener
public class App1ServletContextListener extends GuiceServletContextListener {

    @Override
    protected Injector getInjector() {
	return Guice.createInjector(new App1ServletModule());
    }

    class App1ServletModule extends ServletModule {
	@Override
	protected void configureServlets() {
	    serve("/app1WebServlet").with(App1WebServlet.class);
	}
    }
}
