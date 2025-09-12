package com.gl.security;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients(basePackages = "com.gl.security.feign")
public class PizzaStoreEurekaClientOrderApplication {

	public static void main(String[] args) {
		SpringApplication.run(PizzaStoreEurekaClientOrderApplication.class, args);
	}

}
