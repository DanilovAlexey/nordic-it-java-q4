package com.example.security.controllers;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FileController {

	@Value("${cloud.folder.root}")
	private String cloudRoot;
	
	@GetMapping("files")
	private List<String> getFiles() throws IOException {
		
		return Files.walk(Paths.get(cloudRoot))
				.filter(file -> file.toFile().isFile())
				.map(path -> path.toFile().getName())
				.collect(Collectors.toList());
	}
}




