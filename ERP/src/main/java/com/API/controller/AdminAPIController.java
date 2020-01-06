package com.API.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdminAPIController {

	@PostMapping("/test")
	public String abc() {
		return "cc nhes!";
	}
	
}
