package com.livedigital;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class LiveDigitalActorMiroserviceApplication {

    public static void main(String[] args) {
        SpringApplication.run(LiveDigitalActorMiroserviceApplication.class, args);
        System.out.println("Done.");
    }

}
