package com.curso.java.ejemplo03dao.ejemplo03dao;

import java.util.Collection;
import java.util.List;

import com.curso.java.ejemplo03dao.ejemplo03modelo.Libro;

public class LibroMemoryDao implements ILibroDAO {

	private List<Libro> biblioteca;
	public void createLibro(Libro libro) {
		biblioteca.add(libro);
		System.out.println("Libro " + libro + " agregado");

	}

	public Collection<Libro> getLibros() {
		// TODO Auto-generated method stub
		return null;
	}

	public void updateLibro(Libro libro) {
		// TODO Auto-generated method stub

	}

	public void deleteLibro(String isbn) {
		// TODO Auto-generated method stub

	}

	public Libro getLibro(String isbn) {
		// TODO Auto-generated method stub
		return null;
	}

}
