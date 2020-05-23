package com.example.lesson18.controller;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.lesson18.dto.RequestFormPassword;
import com.example.lesson18.model.Cat;
import com.example.lesson18.model.LentaHeadlines;
import com.example.lesson18.model.User;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

@Controller
public class WebController {

	private ConcurrentHashMap<String, User> users = new ConcurrentHashMap<>() {
		{
			put("vasya", new User("vasya", "test123", 20));
			put("katya", new User("katya", "katya", 14));
		}
	};

	@GetMapping("/welcome")
	public String helloPage(Model model, @RequestParam(name = "name", required = false) String name) {
		Cat cat = new Cat("Stifler", 5, "red");

		String[] names = new String[] { "Vasya", "Petr" };

		var cats = new ArrayList<>() {
			{
				add(new Cat("Stifler", 5, "red"));
				add(new Cat("Gav", 4, "blue"));
			}
		};

		model.addAttribute("name", name);
		model.addAttribute("cat", cat);
		model.addAttribute("names", names);
		model.addAttribute("cats", cats);

		return "welcome.html";
	}

	@GetMapping("/login")
	public String loginPage(Model model) {
		model.addAttribute("form", new RequestFormPassword());
		return "login.html";
	}

	@PostMapping("/login")
	public String loginHandlerPage(Model model, @ModelAttribute RequestFormPassword form) {
		// System.out.println(form);

		if (!users.containsKey(form.getLogin())) {
			model.addAttribute("error", true);
			model.addAttribute("form", new RequestFormPassword());
			return "login.html";
		} else if (!users.get(form.getLogin()).getPassword().equals(form.getPassword())) {
			model.addAttribute("error", true);
			model.addAttribute("form", new RequestFormPassword());
			return "login.html";
		} else {
			model.addAttribute("user", users.get(form.getLogin()));
			model.addAttribute("form", new RequestFormPassword());
			return "login.html";
		}

		// return "redirect:/welcome";
	}

	@GetMapping("/news.html")
	public String newsPage(Model model) throws IOException, InterruptedException, URISyntaxException {
		var httpClient = HttpClient.newHttpClient();

		var httpRequest = HttpRequest.newBuilder().GET().uri(new URI("https://api.lenta.ru/lists/latest")).build();

		var response = httpClient.send(httpRequest, HttpResponse.BodyHandlers.ofString());

		var result = new String(response.body().getBytes(StandardCharsets.UTF_8), Charset.defaultCharset());

		var objectMapper = new ObjectMapper();
		objectMapper.configure(DeserializationFeature.FAIL_ON_IGNORED_PROPERTIES, true);

		var lenta = objectMapper.readValue(result, LentaHeadlines.class);

		
		model.addAttribute("news", lenta.getHeadlines());
		return "news";
	}

}
