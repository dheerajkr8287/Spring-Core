package org.example;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

public class Motor {
    public Motor() {
        System.out.println("Motor cons...");
    }

    @PostConstruct
    public void start(){
        System.out.println("Motor started...");
    }

    public void doWork(){
        System.out.println("Motor pulling water... ");
    }

    @PreDestroy
    public void stop(){
        System.out.println("Motor stop...");
    }

}
