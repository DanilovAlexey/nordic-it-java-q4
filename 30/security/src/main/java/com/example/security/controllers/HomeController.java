package com.example.security.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.access.annotation.Secured;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@Value("${message.hello}")
	private String message;
	
	
	@GetMapping("/home")
	public String home() {
		return "success";
	}
	
	@Secured("ROLE_ADMIN")
	@GetMapping("/admin")
	public String admin(Authentication authentication) {
		return "success [" + authentication.getName() + "]";
	}
}
