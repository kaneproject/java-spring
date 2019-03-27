package ejemplo03lanzador;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.curso.java.ejemplo03dao.ejemplo03modelo.Libro;

import ejemplo03negocio.LibrosLN;
import ejemplo04factory.FabricaLibrosDAO;

public class LanzadorLibros {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException, IOException {
		Libro libro = new Libro();
		Libro libro2 = new Libro();
		LibrosLN negocio = new LibrosLN(FabricaLibrosDAO.getLibroDAOInstance());
		List<Libro> lista = new ArrayList<Libro>();
		lista.add(libro);
		lista.add(libro2);
		negocio.darDeAltaLibros(lista);
	}

}
