package vista;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JPasswordField;

/**
 *Clase donde se crean los paneles y botonos que el usurio utilizara 
 */
public class Registro extends JFrame {

	private JPanel contentPane;
	private JTextField textFieNombre;
	private JTextField textFielApellido;
	private JTextField textFieDni;
	private JTextField textFecNac;
	
	private JButton btnContinuar;
	private JButton btnSalir;
	
	private JLabel lblNombre;
	private JLabel lblApellido;
	private JLabel lblDni;
	private JLabel lblSexo;
	private JLabel lblContrasena;
	private JLabel lblFechaNacimiento;
	
	private JPasswordField passwordField;
	private JComboBox comboBoxSexo;
	
	
	
	/**
	 * Metodos get y set generados para guardar valores ingresados 
	 * @return valor o accion ingresado
	 */
	
	public JComboBox getComboBoxSexo() {
		return comboBoxSexo;
	}

	public void setComboBoxSexo(JComboBox comboBoxSexo) {
		this.comboBoxSexo = comboBoxSexo;
	}

	public JButton getBtnContinuar() {
		return btnContinuar;
	}

	public void setBtnContinuar(JButton btnContinuar) {
		this.btnContinuar = btnContinuar;
	}

	public JButton getBtnSalir() {
		return btnSalir;
	}

	public void setBtnSalir(JButton btnSalir) {
		this.btnSalir = btnSalir;
	}

	public JTextField getTextFieNombre() {
		return textFieNombre;
	}

	public void setTextFieNombre(JTextField textFieNombre) {
		this.textFieNombre = textFieNombre;
	}

	public JTextField getTextFielApellido() {
		return textFielApellido;
	}

	public void setTextFielApellido(JTextField textFielApellido) {
		this.textFielApellido = textFielApellido;
	}

	public JTextField getTextFieDni() {
		return textFieDni;
	}

	public void setTextFieDni(JTextField textFieDni) {
		this.textFieDni = textFieDni;
	}

	public JTextField getTextFieContraseña() {
		return passwordField;
	}

	public void setTextFieContraseña(JPasswordField textFieContraseña) {
		this.passwordField = textFieContraseña;
	}

	public JLabel getLblNombre() {
		return lblNombre;
	}

	public void setLblNombre(JLabel lblNombre) {
		this.lblNombre = lblNombre;
	}

	public JLabel getLblApellido() {
		return lblApellido;
	}

	public void setLblApellido(JLabel lblApellido) {
		this.lblApellido = lblApellido;
	}

	public JLabel getLblDni() {
		return lblDni;
	}

	public void setLblDni(JLabel lblDni) {
		this.lblDni = lblDni;
	}

	public JLabel getLblSexo() {
		return lblSexo;
	}

	public void setLblSexo(JLabel lblSexo) {
		this.lblSexo = lblSexo;
	}

	public JLabel getLblContrasena() {
		return lblContrasena;
	}

	public void setLblContrasena(JLabel lblContrasena) {
		this.lblContrasena = lblContrasena;
	}

	public JTextField getTextFecNac() {
		return textFecNac;
	}

	public void setTextFecNac(JTextField textFecNac) {
		this.textFecNac = textFecNac;
	}

	/**
	 * Metodo donde se crea un controlador de la ventana registro
	 */
	public void mControladorRegistro() {
		
		try {
			
			Registro ventanaRegistro = new Registro();
			ventanaRegistro.setVisible(true);
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}

	/**
	 * Metodo donde se crean paneles, botones y cuadros de texto 
	 * con sus respectivos datos 
	 */
	public Registro() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 433);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//creacion de un nuevo panel
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(0, 0, 434, 394);
		contentPane.add(panel);
		panel.setLayout(null);
		
		//creacion de un nuevo cuadro de texto
		JLabel lblRegistro = new JLabel("REGISTRO");
		lblRegistro.setBounds(141, 11, 156, 36);
		lblRegistro.setFont(new Font("Arial", Font.BOLD, 30));
		panel.add(lblRegistro);
		
		//creacion de un nuevo cuadro de texto
		lblNombre = new JLabel("NOMBRE");
		lblNombre.setFont(new Font("Arial", Font.BOLD, 15));
		lblNombre.setBounds(29, 80, 68, 18);
		panel.add(lblNombre);
		
		//creacion de un nuevo cuadro de texto
		lblApellido = new JLabel("APELLIDO");
		lblApellido.setFont(new Font("Arial", Font.BOLD, 15));
		lblApellido.setBounds(29, 124, 85, 18);
		panel.add(lblApellido);
		
		//creacion de un nuevo cuadro de texto
		lblDni = new JLabel("DNI");
		lblDni.setFont(new Font("Arial", Font.BOLD, 15));
		lblDni.setBounds(29, 165, 68, 18);
		panel.add(lblDni);
		
		//creacion de un nuevo cuadro de texto
		lblSexo = new JLabel("SEXO");
		lblSexo.setFont(new Font("Arial", Font.BOLD, 15));
		lblSexo.setBounds(29, 252, 68, 18);
		panel.add(lblSexo);
		
		//creacion de un nuevo cuadro de texto
		lblContrasena = new JLabel("CONTRASE\u00D1A");
		lblContrasena.setFont(new Font("Arial", Font.BOLD, 15));
		lblContrasena.setBounds(29, 300, 112, 18);
		panel.add(lblContrasena);
		
		//creacion de un nuevo cuadro de texto
		textFieNombre = new JTextField();
		textFieNombre.setBounds(192, 80, 184, 20);
		panel.add(textFieNombre);
		textFieNombre.setColumns(10);
		
		//creacion de un nuevo cuadro de texto
		textFielApellido = new JTextField();
		textFielApellido.setColumns(10);
		textFielApellido.setBounds(192, 122, 184, 20);
		panel.add(textFielApellido);
		
		//creacion de un nuevo cuadro de texto
		textFieDni = new JTextField();
		textFieDni.setColumns(10);
		textFieDni.setBounds(192, 165, 184, 20);
		panel.add(textFieDni);
		
		//creacion de un nuevo ComboBox
		comboBoxSexo = new JComboBox();
		comboBoxSexo.setModel(new DefaultComboBoxModel(new String[] {"MUJER", "HOMBRE"}));
		comboBoxSexo.setMaximumRowCount(2);
		comboBoxSexo.setBounds(228, 251, 96, 22);
		panel.add(comboBoxSexo);
	
		//creacion de un nuevo boton
		btnContinuar = new JButton("CONTINUAR");
		btnContinuar.setBounds(10, 347, 116, 36);
		panel.add(btnContinuar);
		
		//creacion de un nuevo boton
		btnSalir = new JButton("SALIR");
		btnSalir.setBounds(320, 347, 104, 36);
		panel.add(btnSalir);
		
		//creacion de un nuevo cuadro de texto
		passwordField = new JPasswordField();
		passwordField.setBounds(192, 300, 184, 20);
		panel.add(passwordField);
		
		//creacion de un nuevo cuadro de texto
		JLabel label = new JLabel("*");
		label.setForeground(Color.RED);
		label.setBackground(Color.RED);
		label.setBounds(386, 83, 48, 14);
		panel.add(label);
		
		//creacion de un nuevo cuadro de texto
		JLabel label_1 = new JLabel("*");
		label_1.setForeground(Color.RED);
		label_1.setBackground(Color.RED);
		label_1.setBounds(386, 127, 48, 14);
		panel.add(label_1);
		
		//creacion de un nuevo cuadro de texto
		JLabel label_2 = new JLabel("*");
		label_2.setForeground(Color.RED);
		label_2.setBackground(Color.RED);
		label_2.setBounds(386, 168, 48, 14);
		panel.add(label_2);
		
		//creacion de un nuevo cuadro de texto
		JLabel label_3 = new JLabel("*");
		label_3.setForeground(Color.RED);
		label_3.setBackground(Color.RED);
		label_3.setBounds(386, 255, 48, 14);
		panel.add(label_3);
		
		//creacion de un nuevo cuadro de texto
		lblFechaNacimiento = new JLabel("FECHA NACIMIENTO\r\n");
		lblFechaNacimiento.setFont(new Font("Arial", Font.BOLD, 15));
		lblFechaNacimiento.setBounds(31, 206, 165, 14);
		panel.add(lblFechaNacimiento);
		
		//creacion de un nuevo cuadro de texto
		textFecNac = new JTextField();
		textFecNac.setColumns(10);
		textFecNac.setBounds(192, 204, 184, 20);
		panel.add(textFecNac);
		
		//creacion de un nuevo cuadro de texto
		JLabel label_4 = new JLabel("*");
		label_4.setForeground(Color.RED);
		label_4.setBackground(Color.RED);
		label_4.setBounds(386, 207, 48, 14);
		panel.add(label_4);
		
		//creacion de un nuevo cuadro de texto
		JLabel label_5 = new JLabel("*");
		label_5.setForeground(Color.RED);
		label_5.setBackground(Color.RED);
		label_5.setBounds(386, 303, 48, 14);
		panel.add(label_5);
	}
}