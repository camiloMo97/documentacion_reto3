package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.ArrayList;

import modelo.Lineas;
import modelo.LineasBD;
import modelo.Parada;
import modelo.ParadasBD;
import vista.Billete;
import vista.Fechas;
import vista.Inicio;
import vista.Trayecto;


public class ControladorTrayecto implements ActionListener{

	private Trayecto ventanaTrayecto;
	private Billete ventanaBillete;
	
	/**
	 * Metodo donde se inicializa el controlador de la vista Trayecto
	 * @param pTrayecto
	 * @see #inicializarControlador();
	 */
	public ControladorTrayecto(Trayecto pTrayecto) {
		
		this.ventanaTrayecto=pTrayecto;
		
		inicializarControlador();
		
		
		
	}
	
	/**
	 * Metodo donde se inicializa el controlador de la vista Trayecto y la vista Billete
	 * @param pTrayecto
	 * @param pVentanBillete
	 * @see #inicializarControlador();
	 * @see #rellenarComboParadas();
	 */
	public ControladorTrayecto(Trayecto pTrayecto, Billete pVentanBillete) {
		
		this.ventanaTrayecto=pTrayecto;
		this.ventanaBillete = pVentanBillete;
		
		inicializarControlador();
	
		rellenarComboParadas();
		
	}
	
	/**
	 * Metodo que da funcionalidad a los botones Continuar y Salir
	 */
	public void inicializarControlador() {
		
		/**
		 * llama la ventana inicio, llama el boton Continuar,el boton Salir
		 * y el boton Regresa y aplica la funcion al presionar el boton
		 */
		this.ventanaTrayecto.getBtnContinuar().addActionListener(this);
		this.ventanaTrayecto.getBtnContinuar().setActionCommand("btnContinuar");
		
		this.ventanaTrayecto.getBtnSalir().addActionListener(this);
		this.ventanaTrayecto.getBtnSalir().setActionCommand("btnSalir");

		this.ventanaTrayecto.getBtnRegresar().addActionListener(this);
		this.ventanaTrayecto.getBtnRegresar().setActionCommand("BtnRegresar");
		
	}

	/**
	 * Metodo donde se asigna la funcion ha realizar segun el 
	 * boton seleccionado 
	 */
	public void actionPerformed(ActionEvent e) {
		
		switch (e.getActionCommand()) {
			
			case "btnContinuar":
				

				Fechas ventanaFechas = new Fechas();
				ventanaFechas.setVisible(true);
				
				ControladorFechas controladorFechas = new ControladorFechas(ventanaFechas);
				
				ventanaTrayecto.dispose();
				
				break;
				
			case "btnSalir":
				
				Inicio ventanaInicio = new Inicio();
				ventanaInicio.setVisible(true);
				
				ControladorInicio controladorInicio = new ControladorInicio(ventanaInicio);
				
				ventanaTrayecto.dispose();
				
				break;
				
			case "BtnRegresar":
				
			Billete ventanaBillete=null;
			try {
				ventanaBillete = new Billete();
			} catch (SQLException e1) {
				
				e1.printStackTrace();
			}
				ventanaBillete.setVisible(true);
				
				ControladorBillete controladorBillete = new ControladorBillete(ventanaBillete);

				ventanaTrayecto.dispose();

				break;
			
			}
			
		}

	/**
	 * Metodo que llena la lista desplegabele (comboBox) con las paradas de la 
	 * Linea elegida anteriormente
	 */
	private void rellenarComboParadas() {
		
		/**
		 * se crea un nuevo ArrayList para almacenar las paradas del Autobus 
		 */
		ArrayList<Parada> paradas = new ArrayList<Parada>();
		
		/**
		 *Se crea un objeto de la clase líneas para guardar la línea seleccionada anteriormente
		 */
		Lineas miLinea = (Lineas) this.ventanaBillete.getcomboBoxLinea().getSelectedItem();
		 
		try {
			
			/**
			 * se obtienen las paradas de la base de datos
			 */
			paradas = ParadasBD.obtenerParadas(miLinea.getCodlinea());

			/**
			 * se recorre el ArrayList mientras se cumpla la condicion
			 */
			for (int i = 0; i < paradas.size(); i++) {

				/**
				 * se rellena la lista despegable (ComboBox) con las paradas encontradas 
				 */
				this.ventanaTrayecto.getComboBoxDestino().addItem(paradas.get(i));

			}

		} catch (SQLException e) {
			
			e.printStackTrace();
		}

	}
	

}