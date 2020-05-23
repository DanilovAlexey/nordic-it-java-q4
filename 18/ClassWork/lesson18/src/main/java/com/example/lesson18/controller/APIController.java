package com.example.lesson18.controller;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.lesson18.model.Cat;
import com.example.lesson18.model.LentaHeadlines;
import com.example.lesson18.model.LentaNews;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

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
	
	@GetMapping(value="/news", produces=MediaType.APPLICATION_JSON_UTF8_VALUE)
	public LentaNews getNews() throws URISyntaxException, IOException, InterruptedException {
		var httpClient = HttpClient.newHttpClient();
		
		var httpRequest = HttpRequest.newBuilder()
				.GET()
				.uri(new URI("https://api.lenta.ru/lists/latest"))
				.build();
		
		var response = httpClient.send(httpRequest, HttpResponse.BodyHandlers.ofString());
		
		var result = new String(response.body().getBytes(StandardCharsets.UTF_8), Charset.defaultCharset());
		
		var objectMapper = new ObjectMapper();
		objectMapper.configure(DeserializationFeature.FAIL_ON_IGNORED_PROPERTIES, true);
		
		var lenta = objectMapper.readValue(result, LentaHeadlines.class);
		
		//System.out.println(lenta);
		System.out.println(lenta.getHeadlines().get(2).getInfo().getTitle());
		
		return lenta.getHeadlines().get(2);
	}
}



