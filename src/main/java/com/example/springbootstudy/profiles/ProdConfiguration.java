package com.example.springbootstudy.profiles;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Profile("test")
@Component
public class ProdConfiguration {
    @Bean
    public String hello(){
        return "hello test";
    }
}
