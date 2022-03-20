package com.spring.in.action.application;

import com.spring.in.action.controller.WebController;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@EnableWebMvc
public class DispatcherConfig {

    @Bean
    public WebController webController(){
        return new WebController();
    }
}
