package com.example.apiquiz.ws;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = { SecurityAutoConfiguration.class })
public class ApiQuizApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiQuizApplication.class, args);
	}

}
