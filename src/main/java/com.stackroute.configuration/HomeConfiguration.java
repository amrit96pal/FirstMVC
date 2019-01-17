package com.stackroute.configuration;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "com.stackroute")
public class HomeConfiguration {
    @Bean
    public ViewResolver viewResolver(){
        InternalResourceViewResolver view=new InternalResourceViewResolver();
        view.setPrefix("/WEB-INF/views/");
        view.setSuffix(".jsp");
        return view;
    }
}
