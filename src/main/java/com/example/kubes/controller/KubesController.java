package com.example.kubes.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/kubes")
public class KubesController {
	
	@GetMapping(value="/hello")
	public String getKubes() {
		return "Hello Kubernetes";
	}
	
	

}
