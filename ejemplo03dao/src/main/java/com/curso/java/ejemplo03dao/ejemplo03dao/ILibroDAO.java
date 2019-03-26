package com.curso.java.ejemplo03dao.ejemplo03dao;

import java.util.Collection;

import com.curso.java.ejemplo03dao.ejemplo03modelo.Libro;

public interface ILibroDAO {
	void createLibro(Libro libro);
	Collection<Libro> getLibros();
	void updateLibro(Libro libro);
	void deleteLibro(String isbn);
	Libro getLibro(String isbn);
}
