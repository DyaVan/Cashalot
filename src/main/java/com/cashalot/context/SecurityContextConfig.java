package com.cashalot.context;

import com.cashalot.services.AuthorizationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.thymeleaf.extras.springsecurity4.dialect.SpringSecurityDialect;
import org.thymeleaf.spring4.SpringTemplateEngine;
import org.thymeleaf.templateresolver.TemplateResolver;

import javax.sql.DataSource;

@Configuration
@EnableWebSecurity
@Import(RootContextConfig.class)
public class SecurityContextConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    DataSource dataSource;

    @Bean
    public SpringTemplateEngine templateEngine(TemplateResolver templateResolver) {
        SpringTemplateEngine templateEngine = new SpringTemplateEngine();
        templateEngine.setTemplateResolver(templateResolver);
        templateEngine.addDialect(new SpringSecurityDialect());
        return templateEngine;
    }

    @Bean
    public AuthorizationService authorizationService() {
        return new AuthorizationService();
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth
                .userDetailsService(authorizationService())
                .passwordEncoder(passwordEncoder());
    }


    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .authorizeRequests()
                .antMatchers("/login").anonymous()
                .antMatchers("/reg").anonymous()
                .antMatchers("/cashalot/myPage").authenticated()
                .antMatchers("/cashalot/myPage/*").authenticated()
                .anyRequest().permitAll()
                .and()
                .formLogin()
//                .loginPage("/login")
//                .loginProcessingUrl("/login")
//                .successForwardUrl("/")
//                .failureForwardUrl("/login")
//                .and()
//                .requiresChannel()
//                .antMatchers("/login").requiresSecure()
//                .antMatchers("/reg").requiresSecure()
                .and()
                .logout()
                .logoutSuccessUrl("/");
    }
}


//                .loginPage("/login")
//                .loginProcessingUrl("/login")