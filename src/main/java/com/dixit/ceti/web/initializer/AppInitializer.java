package com.dixit.ceti.web.initializer;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

/**
 * AppInitializer is a class that implements WebApplicationInitializer interface.
 * We hook up to onStartup() method, to add DispatcherServlet to ServletContext.
 */

/**
 * Several things happen here:
 * 1. AnnotationConfigWebApplicationContext is created.
 *      It's WebApplicationContext implementation that looks for Spring configuration in classes annotated with @Configuration annotation.
 *      setConfigLocation() method gets hint in which package(s) to look for them.
 * 2. ContextLoaderListener is added to ServletContext – the purpose of this is to 'glue' WebApplicationContext to the lifecycle of ServletContext.
 * 3. DispatcherServlet is created and initialized with WebApplicationContext we have created, and it's mapped to "/*" URLs
 *          and set to eagerly load on application startup.
 */


public class AppInitializer implements WebApplicationInitializer {

    private static final String CONFIG_LOCATION = "com.dixit.ceti.web.config";
    private static final String MAPPING_URL = "/";

    @Override
    public void onStartup(ServletContext servletContext) throws ServletException {
        WebApplicationContext context = getContext();
        servletContext.addListener(new ContextLoaderListener(context));
        ServletRegistration.Dynamic dispatcher = servletContext.addServlet("DispatcherServlet", new DispatcherServlet(context));
        dispatcher.setLoadOnStartup(1);
        dispatcher.addMapping(MAPPING_URL);
    }

    private AnnotationConfigWebApplicationContext getContext() {
        AnnotationConfigWebApplicationContext context = new AnnotationConfigWebApplicationContext();
        context.setConfigLocation(CONFIG_LOCATION);
        return context;
    }

}