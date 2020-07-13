package com.example.security.controllers;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class UploadController {

	@Value("${cloud.folder.root}")
	private String cloudFolder;
	
	@GetMapping("/upload")
	public String uploadPage(Model model) {
		return "upload";
	}
	
	@PostMapping("/upload") 
	public String sendFile(@RequestParam(name="uploadFile") MultipartFile file,  Model model) throws IOException {
		
		var extension = FilenameUtils.getExtension(file.getOriginalFilename());
		var directory = new File(cloudFolder);
		
		System.out.println(extension);
		System.out.println(directory);
		
		var transferFile = File.createTempFile("inordic_", "_temp." + extension, directory);
		
		
		file.transferTo(transferFile);
		
		System.out.println(transferFile.length() /1024.f);
		System.out.println(FileUtils.byteCountToDisplaySize(transferFile.length()));
		
		try (
		var fileOut = new FileOutputStream(new File(directory, "test.zip"));
		var zipFile = new ZipOutputStream(fileOut);
				) {
		
		zipFile.putNextEntry(new ZipEntry(file.getOriginalFilename()));
		zipFile.write(Files.readAllBytes(Paths.get(transferFile.getPath())));
		zipFile.closeEntry();
		}
		
		/*
		zipFile.close();
		fileOut.close();
		*/
		
		
		return "redirect:/home";
	}
}
 