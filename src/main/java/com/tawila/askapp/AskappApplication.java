package com.tawila.askapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.test.context.TestPropertySource;
import org.springframework.web.context.WebApplicationContext;

@SpringBootApplication
@TestPropertySource(locations="classpath:application-test.properties")
public class AskappApplication {

	@Autowired
    private WebApplicationContext webApplicationContext;
	
	public static void main(String[] args) {
		SpringApplication.run(AskappApplication.class, args);
	}
}
