package controlador;

import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import modelo.Cliente;
import modelo.ClienteBD;
import vista.Billete;
import vista.Entrar;
import vista.Inicio;
import vista.Registro;

public class ControladorEntrar implements ActionListener {

	private Entrar ventanaEntrar;

	/**
	 * Metodo donde se inicializa el controlador de la vista Entrar
	 * @param pEntrar
	 * @see #inicializarControlador();
	 */
	public ControladorEntrar(Entrar pEntrar) {
		
		this.ventanaEntrar = pEntrar;

		inicializarControlador();
	}

	/**
	 * Metodo que da funcionalidad a los botones salir y continuar
	 */
	public void inicializarControlador() {
		
		/**
		 * llama la ventana inicio, llama el boton Continuar y el boton Salir
		 * y aplica la funcion al presionar el boton
		 */
		this.ventanaEntrar.getBtnContinuar().addActionListener(this);
		this.ventanaEntrar.getBtnContinuar().setActionCommand("btnContinuar");
		
		this.ventanaEntrar.getBtnSalir().addActionListener(this);
		this.ventanaEntrar.getBtnSalir().setActionCommand("btnSalir");

	}

	
	/**
	 * Metodo donde se asigna la funcion ha realizar segun el 
	 * boton seleccionado 
	 */
	public void actionPerformed(ActionEvent e) {

		switch (e.getActionCommand()) {
		
		case "btnContinuar":
			
			try {
				
				this.validarUsuario();
				
			} catch (HeadlessException | SQLException e1) {
			
				e1.printStackTrace();
			}
			
			
			
			break;

		case "btnSalir":
			
			Inicio ventanaInicio = new Inicio();
			ventanaInicio.setVisible(true);
			
			ControladorInicio controladorInicio = new ControladorInicio(ventanaInicio);
			
			ventanaEntrar.dispose();
	
			break;
			
		}

	}

	/**
	 * Metodo que verifica si el Usuario existe o no
	 * @throws HeadlessException
	 * @throws SQLException
	 */
	private void validarUsuario() throws HeadlessException, SQLException {

		/**
		 * variables donde se guarda el valor ingresado desde pantalla para hacer comprobaciones 
		 */
		String dni = this.ventanaEntrar.getTextFieldDni().getText();
		String contrasena = this.ventanaEntrar.getPasswordField().getText();

		ClienteBD clienteBD = new ClienteBD();

		/**
		 * se hace comprobación si el DNI y la contraseña existen
		 */
		if (clienteBD.mBuscarContacto(dni, contrasena)==true) {
			
			Billete ventanaBillete = new Billete();
			ventanaBillete.setVisible(true);
			
			ControladorBillete controladorBillete = new ControladorBillete(ventanaBillete);
			
			ventanaEntrar.dispose();
			
		}else
			
			JOptionPane.showMessageDialog(null, "usuario o contraseña incorrecto");
			
		}

	}
	

