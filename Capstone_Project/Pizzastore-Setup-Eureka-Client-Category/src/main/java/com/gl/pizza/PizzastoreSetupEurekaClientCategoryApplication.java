package com.gl.pizza;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class PizzastoreSetupEurekaClientCategoryApplication {

	public static void main(String[] args) {
		SpringApplication.run(PizzastoreSetupEurekaClientCategoryApplication.class, args);
	}

}
