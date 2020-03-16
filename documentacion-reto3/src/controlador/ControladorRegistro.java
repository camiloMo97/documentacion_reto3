package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Date;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.swing.JOptionPane;

import modelo.Cliente;
import modelo.ClienteBD;
import vista.Billete;
import vista.Entrar;
import vista.Inicio;
import vista.Registro;

public class ControladorRegistro implements ActionListener {

	private Registro ventanaRegistro;

	/**
	 * Metodo donde se inicializa el controlador de la vista Registro
	 * @param pRegistro
	 * @see #inicializarControlador();
	 */
	public ControladorRegistro(Registro pRegistro) {

		this.ventanaRegistro = pRegistro;

		inicializarControlador();

	}

	/**
	 * Metodo que da funcionalidad a los botones Continuar y Salir
	 */
	public void inicializarControlador() {

		/**
		 * llama la ventana inicio, llama el boton Continuar y el boton Salir
		 * y aplica la funcion al presionar el boton
		 */
		this.ventanaRegistro.getBtnContinuar().addActionListener(this);
		this.ventanaRegistro.getBtnContinuar().setActionCommand("btnContinuar");

		this.ventanaRegistro.getBtnSalir().addActionListener(this);
		this.ventanaRegistro.getBtnSalir().setActionCommand("btnSalir");

	}

	/**
	 * Metodo donde se asigna la funcion ha realizar segun el 
	 * boton seleccionado 
	 */
	public void actionPerformed(ActionEvent e) {

		switch (e.getActionCommand()) {

		case "btnContinuar":

			try {
				
				/**
				 * Se comprueba si el usuario logro registrarse 
				 */
				if (registarUsuario() == true) {

					Billete ventanaBillete = new Billete();
					ventanaBillete.setVisible(true);

					ControladorBillete controladorBillete = new ControladorBillete(ventanaBillete);

					ventanaRegistro.dispose();

				} else if (registarUsuario() == false) {

					JOptionPane.showMessageDialog(null, "Complete los datos");

				}

			} catch (Exception a) {

				JOptionPane.showMessageDialog(null, "error al resgistrar");
				a.printStackTrace();

			}

			break;

		case "btnSalir":

			Inicio ventanaInicio = new Inicio();
			ventanaInicio.setVisible(true);

			ControladorInicio controladorInicio = new ControladorInicio(ventanaInicio);

			ventanaRegistro.dispose();

			break;

		}

	}

	/**
	 * Metodo que verifica que el usuario no existe en la base de datos
	 * @throws SQLException
	 */
	private void validarUsuario() throws SQLException {

		String dni = this.ventanaRegistro.getTextFieDni().getText();
		String contrasena = this.ventanaRegistro.getTextFieContraseña().getText();

		ClienteBD clienteBD = new ClienteBD();

		/**
		 * se hace comprobación si el DNI y la contraseña existen
		 */
		if (clienteBD.mBuscarContacto(dni, contrasena) == true) {

			Billete ventanaBillete = new Billete();
			ventanaBillete.setVisible(true);

			ControladorBillete controladorBillete = new ControladorBillete(ventanaBillete);

			ventanaRegistro.dispose();
		} else

			JOptionPane.showMessageDialog(null, "no se puede registrar");

	}

	/**
	 * Metodo donde guarda los datos introducidos por pantalla en la base de datos
	 * @return boolean
	 * @throws ParseException
	 */
	private boolean registarUsuario() throws ParseException {

		Cliente cliente = new Cliente();
		
		boolean aux=true;

		/**
		 * Se comprueba que los campos no estén  vacios
		 */
		if (ventanaRegistro.getTextFieDni().getText().equals("")
				|| ventanaRegistro.getTextFieNombre().getText().equals("")
				|| ventanaRegistro.getTextFielApellido().getText().equals("")
				|| ventanaRegistro.getTextFieContraseña().getText().equals("")) {

			 aux=false;

		}

		/**
		 * Se guarda en la clase Cliente los datos introducidos por pantalla 
		 */
		cliente.setDni(ventanaRegistro.getTextFieDni().getText());

		cliente.setNombre(ventanaRegistro.getTextFieNombre().getText());

		cliente.setApellidos(ventanaRegistro.getTextFielApellido().getText());
		
		
		/**
		 * Se comprueba que la fecha sea ingresada en un formato expecifico 
		 * de lo contrario mostrara mensaje de error
		 */
		if (ventanaRegistro.getTextFecNac().getText().equals("yyyy-dd-mm")) {
			
			cliente.setFechaNaci(ventanaRegistro.getTextFecNac().getText()); 
			
			
		}else{
			
			JOptionPane.showMessageDialog(null, "la fecha se introduce año-mes-dia");
			
			aux=false;
			
		}
		

		/**
		 * Se comprueba que genero a elegido el usuario y se almacena en la base de datos
		 */
		if (ventanaRegistro.getComboBoxSexo().getSelectedItem().equals("HOMBRE")) {

			cliente.setSexo("H");

		} else {

			cliente.setSexo("M");
		}

		cliente.setContraseña(ventanaRegistro.getTextFieContraseña().getText());

		ClienteBD clienteBD = new ClienteBD();
		clienteBD.mInsetarContacto(cliente);

		return aux;
		
	}
	

}