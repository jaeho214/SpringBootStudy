package com.example.springbootstudy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootStudyApplication {

    public static void main(String[] args) {
//        SpringApplication app = new SpringApplication(SpringBootStudyApplication.class);
//        app.setWebApplicationType(WebApplicationType.NONE);
//        app.run(args);
        SpringApplication app = new SpringApplication(SpringBootStudyApplication.class);
        //app.addListeners(new SampleListener());
        app.setWebApplicationType(WebApplicationType.NONE);
        app.run(args);

    }

}
