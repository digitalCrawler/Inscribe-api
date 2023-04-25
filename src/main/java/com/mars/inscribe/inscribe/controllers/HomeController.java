package com.mars.inscribe.inscribe.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	@GetMapping("/")
	public String status() {
		return "Hello Papa";
	}
	
	
	
}
