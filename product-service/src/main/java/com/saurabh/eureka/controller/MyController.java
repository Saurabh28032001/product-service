package com.saurabh.eureka.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.discovery.EurekaClient;
import com.netflix.discovery.shared.Applications;

@RestController
public class MyController {
	
	@Autowired
	EurekaClient eurekaClient;
	
	@GetMapping("/applications")
	public Applications getApplications() {
		return eurekaClient.getApplications();
	}
}
