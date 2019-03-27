package ejemplo04factory;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import com.curso.java.ejemplo03dao.ejemplo03dao.ILibroDAO;
// Patrón fábrica desacoplado!
public class FabricaLibrosDAO {

	public static ILibroDAO getLibroDAOInstance() throws InstantiationException, IllegalAccessException, ClassNotFoundException, IOException {
		String nombreDeInstancia = getNombreDeInstanciaDeFichero();	
		return (ILibroDAO) 
					Class
						.forName(
								nombreDeInstancia)
						.newInstance();
		
	}
	
	private static String getNombreDeInstanciaDeFichero() throws IOException {
		File file = new File("fichero.txt");
		FileReader reader = new FileReader(file);
		BufferedReader br = new BufferedReader(reader);
		String claseACrear = br.readLine();
		br.close();
		return claseACrear;
	}
}
