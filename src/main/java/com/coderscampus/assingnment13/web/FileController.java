package com.coderscampus.assingnment13.web;

import com.coderscampus.assingnment13.service.FileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.List;

@RestController
public class FileController {

	 @Autowired
	 private FileService fileService;

	 @Bean
	 @GetMapping("/read-lines")
	 public List<String> readFile() throws IOException {
		  return fileService.readFile("recipes.txt");
	 }
	 @PostMapping("/hello-world")
	 public String helloWorldPost(){
	 	 return "Ok cool, you just posted some data!";
	 }
}
