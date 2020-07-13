package com.example.security.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.security.model.User;

@Controller
public class MainController {

	@GetMapping("/login")
	public String loginPage(Model model, @RequestParam(name="error", required=false) Boolean error) {
		model.addAttribute("form", new User());
		if (error != null && error) {
			model.addAttribute("error", error);
		}
		return "login";
	}
}
