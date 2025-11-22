package com.example.demo;

import com.example.demo.entities.Usuario;
import com.example.demo.repositories.UsuarioRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(exclude = {org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration.class})
public class ProjetoBibliotecaApplication {

	public static void main(String[] args) {

		SpringApplication.run(ProjetoBibliotecaApplication.class, args);
		Object Usuario;
		Usuario = "Declaração";
		System.out.println(Usuario);
	}


}
