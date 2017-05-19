package com.cashalot.context;

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
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Bean
    public SpringTemplateEngine templateEngine(TemplateResolver templateResolver) {
        SpringTemplateEngine templateEngine = new SpringTemplateEngine();
        templateEngine.setTemplateResolver(templateResolver);
        templateEngine.addDialect(new SpringSecurityDialect());
        return templateEngine;
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.jdbcAuthentication()
                .dataSource(dataSource)
                .usersByUsernameQuery("select email as username, password, enabled" +
                        "from users where email = ?")
                .authoritiesByUsernameQuery("select email as username, role as authority" +
                        "from roles where email = ?")
                .passwordEncoder(passwordEncoder());
    }


    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .formLogin()
//                .loginPage("/login")
//                .loginProcessingUrl("/login")
                .successForwardUrl("/")
                .failureForwardUrl("/login")
                .and()
                .authorizeRequests()
                .antMatchers("/login").anonymous()
                .antMatchers("/reg").anonymous()
                .antMatchers("/**").authenticated()
                .anyRequest().permitAll()
                .and()
                .requiresChannel()
                .antMatchers("/login").requiresSecure()
                .antMatchers("/reg").requiresSecure()
                .and()
                .logout()
                .logoutSuccessUrl("");
    }
}
