package com.rs.springframework.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


@SpringBootApplication
@EnableEurekaClient 		// It acts as a eureka client
//@EnableZuulProxy    // Enable Zuul
public class AuthService {

	public static void main(String[] args) {
		SpringApplication.run(AuthService.class, args);
	}
}
