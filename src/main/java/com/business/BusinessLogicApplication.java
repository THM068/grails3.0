package com.business;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"demo","com"})
public class BusinessLogicApplication {

    public static void main(String[] args) {
        SpringApplication.run(BusinessLogicApplication.class, args);
    }
}
