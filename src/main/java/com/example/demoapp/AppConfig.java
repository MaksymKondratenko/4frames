package com.example.demoapp;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import java.util.ArrayList;
import java.util.List;

@Configuration
@ComponentScan
public class AppConfig {
    @Bean
    public List<String> membersList(){
        return new ArrayList<>();
    }

    @Bean
    public String string() {
        return new String();
    }
}
