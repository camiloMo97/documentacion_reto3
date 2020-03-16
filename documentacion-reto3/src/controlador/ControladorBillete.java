package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.ArrayList;

import modelo.Lineas;
import modelo.LineasBD;
import vista.Billete;
import vista.Inicio;
import vista.Trayecto;

public class ControladorBillete implements ActionListener {

	private Billete ventanaBillete;

	/**
	 * Metodo donde se inicializa el controlador de la vista Billete
	 * @param pBillete
	 * @see #inicializarControlador();
	 */
	public ControladorBillete(Billete pBillete) {

		this.ventanaBillete = pBillete;

		inicializarControlador();

	}

	/**
	 * Metodo que da funcionalidad a los botones salir y continuar
	 * @see #rellenarComboLineas(); 
	 */
	public void inicializarControlador() {

		/**
		 * llama la ventana inicio, llama el boton Continuar y el boton Salir
		 * y aplica la funcion al presionar el boton
		 */
		this.ventanaBillete.getBtnContinuar().addActionListener(this);
		this.ventanaBillete.getBtnContinuar().setActionCommand("btnContinuar");
		
		this.ventanaBillete.getBtnSalir().addActionListener(this);
		this.ventanaBillete.getBtnSalir().setActionCommand("btnSalir");

		this.rellenarComboLineas();

	}

	/**
	 * Metodo donde se asigna la funcion ha realizar segun el 
	 * boton seleccionado 
	 */
	public void actionPerformed(ActionEvent e) {

		switch (e.getActionCommand()) {

		case "btnContinuar":

			Trayecto ventanaTrayecto = null;

			try {

				ventanaTrayecto = new Trayecto();

			} catch (SQLException e1) {

				e1.printStackTrace();
			}

			ventanaTrayecto.setVisible(true);

			ControladorTrayecto controladorTrayecto = new ControladorTrayecto(ventanaTrayecto, this.ventanaBillete);

			ventanaBillete.dispose();

			break;

		case "btnSalir":

			Inicio ventanaInicio = new Inicio();
			ventanaInicio.setVisible(true);

			ControladorInicio controladorInicio = new ControladorInicio(ventanaInicio);

			ventanaBillete.dispose();

			break;

		}

	}

	/**
	 * Metodo donde se completa la lista desplegable (comoboBox) de las Lineas de Autobus
	 * 
	 */
	private void rellenarComboLineas() {

		/**
		 * se crea un nuevo ArrayList para almacenar las lineas de Autobus 
		 */
		ArrayList<Lineas> lineas = new ArrayList<Lineas>();

		try {
			lineas = LineasBD.obtenerLineas();

			/**
			 * se recorre el ArrayList mientras se cumpla la condicion
			 */
			for (int i = 0; i < lineas.size(); i++) {

				/**
				 * se rellena la lista despegable (ComboBox) con las lineas encontradas 
				 */
				this.ventanaBillete.getcomboBoxLinea().addItem(lineas.get(i));

			}

		} catch (SQLException e) {
			
			e.printStackTrace();
		}

	}

}
