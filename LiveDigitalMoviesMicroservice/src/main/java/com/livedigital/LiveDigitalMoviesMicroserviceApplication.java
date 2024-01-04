package com.livedigital;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class LiveDigitalMoviesMicroserviceApplication {

    public static void main(String[] args) {
        SpringApplication.run(LiveDigitalMoviesMicroserviceApplication.class, args);
    }

}
