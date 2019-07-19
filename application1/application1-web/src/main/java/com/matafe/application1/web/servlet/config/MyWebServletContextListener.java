package com.matafe.application1.web.servlet.config;

import javax.servlet.annotation.WebListener;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.servlet.GuiceServletContextListener;
import com.google.inject.servlet.ServletModule;
import com.matafe.application1.web.servlet.MyWebServlet;

@WebListener
public class MyWebServletContextListener extends GuiceServletContextListener {

    @Override
    protected Injector getInjector() {
	return Guice.createInjector(new App1ServletModule());
    }

    class App1ServletModule extends ServletModule {
	@Override
	protected void configureServlets() {
	    serve("/myWebServlet").with(MyWebServlet.class);
	}
    }
}
