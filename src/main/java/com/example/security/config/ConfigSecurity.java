package com.example.security.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
public class ConfigSecurity extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        super.configure(http);
        http.authorizeRequests().antMatchers("/auth/public/**").permitAll()
        .antMatchers("auth/admin/**").hasAnyAuthority("ADMIN")
        .antMatchers("auth/user/**").hasAnyAuthority("ADMIN")
         .anyRequest().authenticated()
        .and()
        .httpBasic();

    }
}

