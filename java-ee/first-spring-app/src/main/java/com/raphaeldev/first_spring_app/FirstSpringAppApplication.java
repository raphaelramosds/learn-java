package com.raphaeldev.first_spring_app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Profile;

@SpringBootApplication
public class FirstSpringAppApplication {

	public static void main(String[] args) {
		// Spring application starting point
		SpringApplication.run(FirstSpringAppApplication.class, args);
	}

}
