package com.test.testapp.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan(basePackages = {"com.test.testapp.rest"})
public class WebApplication {


    public static void main(String[] args) {
        SpringApplication.run(WebApplication.class);
    }
}
