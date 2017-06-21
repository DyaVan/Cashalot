package com.cashalot.context;

import com.cashalot.services.AuthorizationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.csrf.CsrfTokenRepository;
import org.springframework.security.web.csrf.HttpSessionCsrfTokenRepository;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.thymeleaf.extras.springsecurity4.dialect.SpringSecurityDialect;
import org.thymeleaf.spring4.SpringTemplateEngine;
import org.thymeleaf.templateresolver.TemplateResolver;

import javax.sql.DataSource;

@Configuration
@EnableWebSecurity
public class SecurityContextConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth
                .authenticationProvider(authenticationProvider());
//                .userDetailsService(authorizationService())
//                .passwordEncoder(passwordEncoder());
    }


    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .authorizeRequests()
                .antMatchers("/login").anonymous()
                .antMatchers("/reg").anonymous()

                .antMatchers("/cashalot/moderator").authenticated()
                .antMatchers("/cashalot/moderator/**").authenticated()
                .antMatchers("/cashalot/moderator").hasAnyAuthority("moderator","admin")
                .antMatchers("/cashalot/moderator/**").hasAnyAuthority("moderator","admin")


                .antMatchers("/cashalot/user").authenticated()
                .antMatchers("/cashalot/user/**").authenticated()
                .antMatchers("/cashalot/user").hasAnyAuthority("user")
                .antMatchers("/cashalot/user/**").hasAnyAuthority("user")

                .antMatchers("/cashalot/advertiser").authenticated()
                .antMatchers("/cashalot/advertiser/**").authenticated()
                .antMatchers("/cashalot/advertiser").hasAnyAuthority("advertiser")
                .antMatchers("/cashalot/advertiser/**").hasAnyAuthority("advertiser")

                .antMatchers("/cashalot/myPage").authenticated()
                .antMatchers("/cashalot/myPage/**").authenticated()
                .anyRequest().permitAll()
                .and()
                .formLogin()
                .and()
                .logout()
                .logoutUrl("/cashalot/logout")
                .logoutSuccessUrl("/cashalot/")
                .logoutRequestMatcher(new AntPathRequestMatcher("/logout"));
//                .csrfTokenRepository(csrfTokenRepository());

    }

    @Bean
    public AuthorizationService authorizationService() {
        return new AuthorizationService();
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Bean
    public DaoAuthenticationProvider authenticationProvider() {
        DaoAuthenticationProvider authenticationProvider = new DaoAuthenticationProvider();
        authenticationProvider.setUserDetailsService(authorizationService());
        authenticationProvider.setPasswordEncoder(passwordEncoder());
        return authenticationProvider;
    }
}


//                .loginPage("/login")
//                .loginProcessingUrl("/login")
//                .loginProcessingUrl("/login")
//                .successForwardUrl("/")
//                .failureForwardUrl("/login")
//                .and()
//                .requiresChannel()
//                .antMatchers("/login").requiresSecure()
//                .antMatchers("/reg").requiresSecure()

//
//
