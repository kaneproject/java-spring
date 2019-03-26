package ejemplo03negocio;

import java.util.Collection;

import com.curso.java.ejemplo03dao.ejemplo03dao.ILibroDAO;
import com.curso.java.ejemplo03dao.ejemplo03modelo.Libro;

public class LibrosLN {
	private ILibroDAO libroDao;

	public LibrosLN(ILibroDAO libroDao) {
		super();
		this.libroDao = libroDao;
	}

	public void darDeAltaLibros(Collection<Libro> libros) {
		for (Libro libro : libros) {
			libroDao.createLibro(libro);
		}
	}
}
