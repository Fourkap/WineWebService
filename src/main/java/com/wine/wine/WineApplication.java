package com.wine.wine;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class WineApplication {

    public static void main(String[] args) {
        SpringApplication.run(WineApplication.class, args);
        System.out.println("http://localhost:8889/swagger-ui/");
    }

}
