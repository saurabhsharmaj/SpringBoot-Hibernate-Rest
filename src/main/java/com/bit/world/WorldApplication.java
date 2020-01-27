package com.bit.world;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WorldApplication{
  
    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(WorldApplication.class);
        app.run(args);
    }   
}