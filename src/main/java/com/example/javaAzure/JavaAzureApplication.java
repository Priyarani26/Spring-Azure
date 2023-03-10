package com.example.javaAzure;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class JavaAzureApplication {

	@GetMapping("/msg")
	public String message(){
		return" Congrats Priyarani";
	}

	public static void main(String[] args) {
		SpringApplication.run(JavaAzureApplication.class, args);
	}

}
