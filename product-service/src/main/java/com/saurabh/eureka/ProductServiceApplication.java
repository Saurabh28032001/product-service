package com.saurabh.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient
@RestController
public class ProductServiceApplication {
	
	@GetMapping("/")
	public String home() {
		return "Hi, home page";
	}

	public static void main(String[] args) {
		SpringApplication.run(ProductServiceApplication.class, args);
	}

}
