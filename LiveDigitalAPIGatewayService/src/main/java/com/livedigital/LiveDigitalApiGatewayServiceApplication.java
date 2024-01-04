package com.livedigital;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class LiveDigitalApiGatewayServiceApplication {

    public static void main(String[] args) 
    {
        SpringApplication.run(LiveDigitalApiGatewayServiceApplication.class, args);
        System.out.println("Fine.");
    }}
