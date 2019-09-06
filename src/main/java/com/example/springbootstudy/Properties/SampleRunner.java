package com.example.springbootstudy.Properties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class SampleRunner implements ApplicationRunner {

    @Autowired
    JaehoProperties jaehoProperties;

    @Autowired
    String hello;


    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("===========================");
        System.out.println(hello);
        System.out.println(jaehoProperties.getAge());
        System.out.println(jaehoProperties.getName());
        System.out.println("===========================");
    }
}
