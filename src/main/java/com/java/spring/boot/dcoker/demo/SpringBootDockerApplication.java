package com.java.spring.boot.dcoker.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

 

@SpringBootApplication
@RestController
public class SpringBootDockerApplication {
	
	@GetMapping("/message")
	public String getMessage() {
		return "welcome to Dev Spring";
		
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDockerApplication.class, args);
	}

}
