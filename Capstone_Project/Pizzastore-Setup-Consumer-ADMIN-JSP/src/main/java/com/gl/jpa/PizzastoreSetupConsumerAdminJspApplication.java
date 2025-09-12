package com.gl.jpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;

import org.springframework.boot.web.client.RestTemplateBuilder;

@SpringBootApplication
@EnableDiscoveryClient
public class PizzastoreSetupConsumerAdminJspApplication {

    public static void main(String[] args) {
        SpringApplication.run(PizzastoreSetupConsumerAdminJspApplication.class, args);
    }

    // LoadBalanced RestTemplate for calling other microservices via Eureka
    @Bean
    @LoadBalanced   // 🔑 important so it can resolve "http://AUTH-SERVICE" via Eureka
    public RestTemplate restTemplate(RestTemplateBuilder builder) {
        return builder.build();
    }
}
