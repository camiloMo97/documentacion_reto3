package vista;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import controlador.ControladorEntrar;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.UIManager;

import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JPasswordField;

/**
 *Clase donde se crean los paneles y botonos que el usurio utilizara 
 */
public class Entrar extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldDni;
	private JButton btnContinuar;
	private JButton btnSalir;
	private JPasswordField passwordField;
	
	
	/**
	 * Metodos get y set generados para guardar valores ingresados 
	 * @return valor o accion ingresado
	 */
	
	public JButton getBtnSalir() {
		return btnSalir;
	}

	public JPasswordField getPasswordField() {
		return passwordField;
	}

	public void setPasswordField(JPasswordField passwordField) {
		this.passwordField = passwordField;
	}

	public void setBtnSalir(JButton btnSalir) {
		this.btnSalir = btnSalir;
	}

	public JTextField getTextFieldDni() {
		return textFieldDni;
	}

	public void setTextFieldDni(JTextField textFieldDni) {
		this.textFieldDni = textFieldDni;
	}

	public JButton getBtnContinuar() {
		return btnContinuar;
	}

	public void setBtnContinuar(JButton btnContinuar) {
		this.btnContinuar = btnContinuar;
	}


	/**
	 * Metodo donde se crea una ventana y un controlador de la ventana entrar
	 */
	public void mControlador(){
		
		try {
			Entrar ventanaEntrar = new Entrar();
			ventanaEntrar.setVisible(true);
			
			
			ControladorEntrar controladorEntrar = new ControladorEntrar(ventanaEntrar);
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}


	/**
	 * Metodo donde se crean paneles, botones y cuadros de texto 
	 * con sus respectivos datos 
	 */
	public Entrar() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 615, 366);
		contentPane = new JPanel();
		contentPane.setBackground(Color.RED);
		contentPane.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//Creacion de un nuevo panel
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel.setBackground(Color.WHITE);
		panel.setBackground(UIManager.getColor("ToggleButton.background"));
		panel.setBounds(41, 27, 506, 269);
		contentPane.add(panel);
		panel.setLayout(null);
		
		//Creacion de un nuevo cuadro de texto
		JLabel lblTitulo = new JLabel("ENTRAR");
		lblTitulo.setFont(new Font("Lucida Sans", Font.BOLD, 35));
		lblTitulo.setBounds(167, 11, 159, 36);
		panel.add(lblTitulo);
		
		//Creacion de un nuevo cuadro de texto
		JLabel lblDni = new JLabel("DNI");
		lblDni.setFont(new Font("Lucida Sans", Font.BOLD, 25));
		lblDni.setBounds(26, 91, 91, 27);
		panel.add(lblDni);
		
		//creacion de un nuevo cuadro de texto
		JLabel lblContrasea = new JLabel("CONTRASE\u00D1A");
		lblContrasea.setFont(new Font("Lucida Sans", Font.BOLD, 25));
		lblContrasea.setBounds(26, 140, 213, 36);
		panel.add(lblContrasea);
		
		//creacion de un nuevo cuadro de texto
		textFieldDni = new JTextField();
		textFieldDni.setBounds(236, 91, 188, 27);
		panel.add(textFieldDni);
		textFieldDni.setColumns(10);
		
		//creacion de un nuevo boton
		btnContinuar = new JButton("CONTINUAR");
		btnContinuar.setBackground(UIManager.getColor("ToggleButton.light"));
		btnContinuar.setFont(new Font("Arial", Font.BOLD, 12));
		btnContinuar.setBounds(26, 197, 162, 48);
		panel.add(btnContinuar);
		
		//creacion de un nuevo boton
		btnSalir = new JButton("SALIR");
		btnSalir.setBackground(UIManager.getColor("ToggleButton.light"));
		btnSalir.setFont(new Font("Arial", Font.BOLD, 12));
		btnSalir.setBounds(337, 197, 141, 48);
		panel.add(btnSalir);
		
		//creacion de un nuevo boton
		passwordField= new JPasswordField();
		passwordField.setBounds(236, 147, 188, 27);
		panel.add(passwordField);
	}
}
