package com.curso.java.spring.boot.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.curso.java.spring.boot.model.entities.Pelicula;
import com.curso.java.spring.boot.model.entities.PeliculaRepository;

@RestController
@CrossOrigin(origins = "*")
public class ControladorDeClientes {
	
	private final PeliculaRepository repository;
	
	public ControladorDeClientes(PeliculaRepository repository) {
		this.repository = repository;
	}
	
	@GetMapping("/peliculas")
	public List<Pelicula> clientes(){
		return repository.findAll();
	}
	
	@GetMapping("/peliculas/{id}")
	public Pelicula cliente(@PathVariable String id) {
		return repository.findById(id)
				.orElse(null);
	}
	
	@PostMapping("/peliculas")
	public Pelicula nuevoCliente(@RequestBody Pelicula cliente) {
		return repository.save(cliente);
	}
	
	@DeleteMapping("/peliculas/{id}")
	public void borrarCliente(@PathVariable String id) {
		repository.deleteById(id);
	}
	@PutMapping("/peliculas/{id}")
	public Pelicula actualizarCliente(@RequestBody Pelicula cliente,@PathVariable String id) {
		return repository.findById(id)
			.map(c -> {
					c.setCodId(cliente.getCodId());
					c.setTitulo(cliente.getTitulo());
					c.setDirector(cliente.getDirector());
					c.setFecha(cliente.getFecha());
					c.setValoracion(cliente.getValoracion());
					return repository.save(c);
				})
			.orElseGet(()->{
				cliente.setCodId(id);
				return repository.save(cliente);
			});
			
	}
	
	
	
	
	
	
	
	
	
}
