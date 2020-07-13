package com.example.security.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.security.model.UserDB;
import com.example.security.service.UserDBService;

@RestController
public class UserController {

	@Autowired
	private UserDBService userDBService;
	
	@GetMapping("/users")
	private List<UserDB> getAllUsers() {
		return userDBService.getAllUsers();
	}
}
