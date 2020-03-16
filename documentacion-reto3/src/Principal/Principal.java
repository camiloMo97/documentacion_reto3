package Principal;

import vista.Inicio;

public class Principal {

	/**
	 * Metodo donde inicia el programa y hace el llamado a la primera ventana 
	 * @param args
	 */
	public static void main(String[] args) {
		
		try {

			Inicio.mControladorInicio();

		} catch (Exception e) {
		
			e.printStackTrace();
		
		}
	}

}