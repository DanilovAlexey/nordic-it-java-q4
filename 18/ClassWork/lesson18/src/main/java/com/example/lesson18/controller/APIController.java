package com.example.lesson18.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.lesson18.model.Cat;

@RestController
public class APIController {

	@GetMapping("/home")
	public String home() {
		return "Hello World";
	}
	
	@GetMapping("/hello")
	public String hello(
			@RequestParam(name="name", required=false, defaultValue="anonym") String name,
			@RequestParam(name="age", required=false) Integer age
			) {
		return "Hello " + name + "(" + age + ")" ;
	}
	
	@GetMapping("/news/{id}")
	public String news(@PathVariable(name="id") String id ) {
		return "News [" + id + "]";
	}
	
	@GetMapping("/cat")
	public Cat newCat() {
		return new Cat("Мурзик", 3, "Рыжий");
	}
	
	@PostMapping("/treat")
	public String treat(@RequestBody Cat cat) {
		return "Cat [" + cat.getName() + "] treat" ;
	}
}
