package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import vista.Entrar;
import vista.Inicio;
import vista.Registro;

public class ControladorInicio implements ActionListener{
	
	
	private Inicio ventanaInico;
	
	/**
	 * Metodo donde se inicializa el controlador de la vista Inicio
	 * @param pInicio
	 * @see #inicializarControlador();
	 */
	public ControladorInicio(Inicio pInicio ) {
		
		this.ventanaInico = pInicio;
	
		
		inicializarControlador();

	}

	/**
	 * Metodo que da funcionalidad a los botones Entrar y Registro
	 */
	public void inicializarControlador() {
		
		/**
		 * llama la ventana inicio, llama el boton entrar y el boton Registro
		 * y aplica la funcion al presionar el boton
		 */
		this.ventanaInico.getBtnEntrar().addActionListener(this);
		this.ventanaInico.getBtnEntrar().setActionCommand("btnEntrar");
		
		this.ventanaInico.getBtnRegistro().addActionListener(this);
		this.ventanaInico.getBtnRegistro().setActionCommand("btnRegistro");

	}
	
	/**
	 * Metodo donde se asigna la funcion ha realizar segun el 
	 * boton seleccionado 
	 */
	public void actionPerformed(ActionEvent e) {

		switch (e.getActionCommand()) {
		
		
		case "btnEntrar":
			
			
			Entrar ventanaEntrar = new Entrar();
			ventanaEntrar.setVisible(true);
			
			ControladorEntrar controladorEntrar = new ControladorEntrar(ventanaEntrar);
		
			ventanaInico.dispose();
			
			break;
			
		case "btnRegistro":
			
			Registro VentanaRegistro = new Registro();
			VentanaRegistro.setVisible(true);
			
			ControladorRegistro controlRegistro = new ControladorRegistro(VentanaRegistro);
			
			ventanaInico.dispose();
			
			break;
		
		}

	}


}