package com.cashalot.web.config;

import org.springframework.security.web.context.AbstractSecurityWebApplicationInitializer;
import org.springframework.web.filter.CharacterEncodingFilter;

import javax.servlet.DispatcherType;
import javax.servlet.FilterRegistration;
import javax.servlet.ServletContext;
import java.util.EnumSet;

public class WebSecurityInitializer extends AbstractSecurityWebApplicationInitializer {

    @Override
    protected void beforeSpringSecurityFilterChain(ServletContext servletContext) {
        EnumSet<DispatcherType> dispatcherTypes = EnumSet.of(DispatcherType.REQUEST, DispatcherType.FORWARD);

        FilterRegistration.Dynamic characterEncodingFilter = servletContext.addFilter("encodingFilter", new CharacterEncodingFilter());
        characterEncodingFilter.setInitParameter("encoding", "UTF-8");
        characterEncodingFilter.setInitParameter("forceEncoding", "true");
        characterEncodingFilter.addMappingForUrlPatterns(dispatcherTypes, false, "/*");
    }

}
