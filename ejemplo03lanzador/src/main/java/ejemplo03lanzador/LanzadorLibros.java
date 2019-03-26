package ejemplo03lanzador;

import java.util.ArrayList;
import java.util.List;

import com.curso.java.ejemplo03dao.ejemplo03dao.LibroMemoryDao;
import com.curso.java.ejemplo03dao.ejemplo03modelo.Libro;

import ejemplo03negocio.LibrosLN;

public class LanzadorLibros {

	public static void main(String[] args) {
		Libro libro = new Libro();
		Libro libro2 = new Libro();
		LibrosLN negocio = new LibrosLN(new LibroMemoryDao());
		List<Libro> lista = new ArrayList<Libro>();
		lista.add(libro);
		lista.add(libro2);
		negocio.darDeAltaLibros(lista);
	}

}
