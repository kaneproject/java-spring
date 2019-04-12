package com.curso.java.spring.boot.config;

import java.util.Date;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.curso.java.spring.boot.model.entities.Pelicula;
import com.curso.java.spring.boot.model.entities.PeliculaRepository;

@Configuration
public class Configuracion {

	@Bean
	public CommandLineRunner iniciarBaseDeDatos(PeliculaRepository repo) {
		return args -> {
			repo.save(new Pelicula("AAA-11111-AA","TITULO","DIRECTOR","GENERO",new Date(),3));
			repo.save(new Pelicula("AAA-11111-AB","TITULO","DIRECTOR","GENERO",new Date(),3));
			repo.save(new Pelicula("AAA-11111-AC","TITULO","DIRECTOR","GENERO",new Date(),3));
		};
	}
	
}
