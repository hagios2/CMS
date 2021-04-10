package com.example.accessingdatamysql;

import com.example.accessingdatamysql.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

public class SecurityConfigurer extends WebSecurityConfigurerAdapter {

    @Autowired
    private UserService userService;

//    @Override
//    protected void configure(AuthenticationManagerBuilder authenticationManagerBuilder)
//    {
//        authenticationManagerBuilder.userDetailsService(userService);
//    }
}
