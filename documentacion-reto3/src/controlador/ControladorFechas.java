package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import vista.Billete;
import vista.Fechas;
import vista.Inicio;
import vista.Pagar;
import vista.Trayecto;

public class ControladorFechas implements ActionListener{
	
	private Fechas ventanFechas;
	
	/**
	 * Metodo donde se inicializa el controlador de la vista Fechas
	 * @param pFechas
	 * @see #inicializarControlador();
	 */
	public ControladorFechas(Fechas pFechas) {
		
		this.ventanFechas=pFechas;
	
		inicializarControlador();
	}
	
	/**
	 * Metodo que da funcionalidad a los botones salir,continuar y regresar 
	 */
	public void inicializarControlador() {
		
		/**
		 * llama la ventana inicio, llama el boton Continuar, el boton Salir
		 * y el boton Regresar y aplica la funcion al presionar el boton
		 */
		this.ventanFechas.getBtnContinuar().addActionListener(this);
		this.ventanFechas.getBtnContinuar().setActionCommand("btnContinuar");
		
		this.ventanFechas.getBtnSalir().addActionListener(this);
		this.ventanFechas.getBtnSalir().setActionCommand("btnSalir");
		
		this.ventanFechas.getBtnRegresar().addActionListener(this);
		this.ventanFechas.getBtnRegresar().setActionCommand("BtnRegresar");
		
	}
	
	/**
	 * Metodo donde se asigna la funcion ha realizar segun el 
	 * boton seleccionado 
	 */
	public void actionPerformed(ActionEvent e) {
		
		switch (e.getActionCommand()) {
		case "btnContinuar":
			
			Pagar ventanaPagar = new Pagar();
			ventanaPagar.setVisible(true);
			
			ventanFechas.dispose();
			
			break;

		case "btnSalir":
			
			Inicio ventanaInicio = new Inicio();
			ventanaInicio.setVisible(true);
			
			ControladorInicio controladorInicio = new ControladorInicio(ventanaInicio);
			
			ventanFechas.dispose();
			
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

			ventanFechas.dispose();

			break;
			
		}
		
	}
	

}