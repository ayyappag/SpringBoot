package com.basic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootBasicAppApplication {

	public static void main(String[] args) {
		System.out.println("Spring Boot Application Execution ");
		SpringApplication.run(SpringBootBasicAppApplication.class, args);
	}

}