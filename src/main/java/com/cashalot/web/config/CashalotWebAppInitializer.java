package com.cashalot.web.config;


//import com.cashalot.context.HttpSessionConfig;
import com.cashalot.context.PersistenceJPAConfig;
import com.cashalot.context.RootContextConfig;
import com.cashalot.context.SecurityContextConfig;
import com.cashalot.web.ordinary.context.WebContextConfig;
import com.cashalot.web.rest.context.RestWebContextConfig;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.*;
import javax.servlet.annotation.MultipartConfig;
import java.util.EnumSet;

public class CashalotWebAppInitializer implements WebApplicationInitializer{

    @Override
    public void onStartup(javax.servlet.ServletContext servletContext) throws ServletException {
        // root context
        AnnotationConfigWebApplicationContext rootContext = new AnnotationConfigWebApplicationContext();
        rootContext.scan("com.cashalot.services","com.cashalot.properties");
        rootContext.register(
                RootContextConfig.class,
                SecurityContextConfig.class,
                PersistenceJPAConfig.class);
        servletContext.addListener(new ContextLoaderListener(rootContext));

        // ordinary dispatcher servlet
        AnnotationConfigWebApplicationContext ordinaryWebContext = new AnnotationConfigWebApplicationContext();
        ordinaryWebContext.setParent(rootContext);
        ordinaryWebContext.register( WebContextConfig.class );
        ServletRegistration.Dynamic ordinaryDispatcher =
                servletContext.addServlet("ordinaryDispatcher", new DispatcherServlet(ordinaryWebContext));
        ordinaryDispatcher.setLoadOnStartup(1);
        ordinaryDispatcher.addMapping("/cashalot/*");



        // rest dispatcher servlet
        AnnotationConfigWebApplicationContext restWebContext = new AnnotationConfigWebApplicationContext();
        restWebContext.setParent(rootContext);
        restWebContext.register( RestWebContextConfig.class );
        ServletRegistration.Dynamic restDispatcher=
                servletContext.addServlet("restDispatcher", new DispatcherServlet(restWebContext));
        restDispatcher.setLoadOnStartup(1);
        restDispatcher.addMapping("/cashalot/rest/*");

        restDispatcher.setMultipartConfig(new MultipartConfigElement("D:\\Ivan_Diachuk\\Cashalot\\media\\tmp"));


    }


}
