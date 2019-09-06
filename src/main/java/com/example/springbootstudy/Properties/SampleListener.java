package com.example.springbootstudy.Properties;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

//@Component
public class SampleListener{
    public SampleListener(ApplicationArguments arguments) {
        System.out.println("foo: " + arguments.containsOption("foo"));
        System.out.println("bar: " + arguments.containsOption("bar"));
    }
    //implements ApplicationListener<ApplicationStartedEvent> {
//    @Override
//    public void onApplicationEvent(ApplicationStartedEvent applicationStartedEvent) {
//        System.out.println("========================");
//        System.out.println("Application is started");
//        System.out.println("========================");
//
//    }

//    @Override
//    public void onApplicationEvent(ApplicationStartingEvent applicationStartingEvent) {
//        System.out.println("========================");
//        System.out.println("Application is starting");
//        System.out.println("========================");
//    }


}
