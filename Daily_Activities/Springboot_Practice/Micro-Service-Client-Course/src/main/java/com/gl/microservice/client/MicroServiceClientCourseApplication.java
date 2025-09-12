package com.gl.microservice.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class MicroServiceClientCourseApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroServiceClientCourseApplication.class, args);
	}

}
