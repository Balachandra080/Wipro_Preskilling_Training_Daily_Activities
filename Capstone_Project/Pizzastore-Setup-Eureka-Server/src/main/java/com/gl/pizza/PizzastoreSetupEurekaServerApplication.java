package com.gl.pizza;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class PizzastoreSetupEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(PizzastoreSetupEurekaServerApplication.class, args);
	}

}
