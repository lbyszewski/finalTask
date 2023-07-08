package com.example.finaltask;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
public class FinalTaskApplication {

    public static void main(String[] args) {
        SpringApplication.run(FinalTaskApplication.class, args);
    }

}
