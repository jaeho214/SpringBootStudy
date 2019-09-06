package com.example.springbootstudy.profiles;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Profile("prod")
@Component
public class TestConfiguration {
    @Bean
    public String hello(){
        return "hello";
    }
}
