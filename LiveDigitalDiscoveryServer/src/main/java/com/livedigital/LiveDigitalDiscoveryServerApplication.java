package com.livedigital;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class LiveDigitalDiscoveryServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(LiveDigitalDiscoveryServerApplication.class, args);
        System.out.println("Fine.");
    }}
