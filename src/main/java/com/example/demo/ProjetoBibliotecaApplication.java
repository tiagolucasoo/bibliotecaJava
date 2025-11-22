package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(exclude = {org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration.class})
public class ProjetoBibliotecaApplication {

	public static void main(String[] args) {

		SpringApplication.run(ProjetoBibliotecaApplication.class, args);

		System.out.println("\nInit");
	}


}
