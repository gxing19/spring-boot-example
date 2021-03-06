package com.springboot.jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class JpaApplication {

    @Autowired
    private RestTemplate restTemplate;


    public static void main(String[] args) {
        SpringApplication.run(JpaApplication.class, args);
    }

}
