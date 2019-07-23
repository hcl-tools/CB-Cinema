package com.cinema.times;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class TimesApplication {

    public static void main(String[] args) {
        SpringApplication.run(TimesApplication.class, args);
    }

}
