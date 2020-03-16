package controlador;

import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * clase donde se guardan y se obtiene los datos del fichero
 * @author usario
 *
 */
public class ControladorConexion {

	public static ArrayList<String> datos = new ArrayList<String>();

	/**
	 * Metodos get y set generados para guardar datos de las varibales
	 * @return valos de las variables 
	 */
	public ArrayList<String> getLibros() {
		return datos;
	}

	public void setLibros(ArrayList<String> libros) {
		this.datos = datos;
	}

	/**
	 * controlador para inicializar variables
	 */
	public ControladorConexion() {
		super();
		this.datos = datos;
	}

	/**
	 * Metodo para consultar los datos en el fichero
	 */
	public static void consultarDatos() {

		try {

			File fich = new File("C:\\Users\\admin1\\Desktop\\conex.txt");


			Scanner leer = new Scanner(fich);
			while (leer.hasNextLine()) {
				String datoLeido = leer.nextLine();
				datos.add(datoLeido);
			}

		} catch (Exception e) {
			System.out.println("Error.");
		}

	}

	/**
	 * Metodo para obtener la ruta del fichero
	 * @return ruta obtenida
	 */
	public static String obtenerRuta() {
		consultarDatos();
		String ruta = datos.get(0);

		return ruta;
	}

	/**
	 * Metodo para obtener el usuario del fichero 
	 * @return usuario obtenido
	 */
	public static String obtenerUsuario() {
		consultarDatos();
		String usuario = datos.get(1);

		return usuario;
	}

	/**
	 * Metodo para obtener la contrase�a del fichero
	 * @return contrase�a obtenida
	 */
	public static String obtenerContrase�a() {
		consultarDatos();
		String contrase�a = datos.get(2);

		return contrase�a;
	}

}