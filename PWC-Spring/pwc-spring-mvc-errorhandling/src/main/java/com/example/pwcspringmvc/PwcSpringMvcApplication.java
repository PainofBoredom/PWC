package com.example.pwcspringmvc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com")
public class PwcSpringMvcApplication {

	public static void main(String[] args) {
		SpringApplication.run(PwcSpringMvcApplication.class, args);
	}

}