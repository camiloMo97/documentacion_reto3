package vista;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import controlador.ControladorInicio;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.Font;

import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.UIManager;
import javax.swing.border.LineBorder;
import javax.swing.SwingConstants;

/**
 *Clase donde se crean los paneles y botonos que el usurio utilizara 
 */

public class Inicio extends JFrame {

	private JPanel contentPane;
	private JLabel lblBienvenido;
	private JButton btnEntrar;
	private JButton btnRegistro;
	private JLabel lblNewLabel;
	private JLabel lblPulseEntrarO;
	
	/**
	 * Metodos get y set generados para guardar valores ingresados 
	 * @return valor o accion ingresado
	 */
	public JButton getBtnRegistro() {
		return btnRegistro;
	}

	public void setBtnRegistro(JButton btnRegistro) {
		this.btnRegistro = btnRegistro;
	}

	public JButton getBtnEntrar() {
		return btnEntrar;
	}

	public void setBtnEntrar(JButton btnEntrar) {
		this.btnEntrar = btnEntrar;
	}

	/**
	 * Metodo donde se crea un controlador de la ventana inicio
	 */
	public static void mControladorInicio() {
		
		try {
			
			Inicio ventanaInicio = new Inicio();
			ventanaInicio.setVisible(true);
			
			ControladorInicio controladorInicio = new ControladorInicio(ventanaInicio);	
			
		} catch (Exception e) {
			e.printStackTrace();
		}	
	
	}
	
	/**
	 * Metodo donde se crean paneles, botones y cuadros de texto 
	 * con sus respectivos datos 
	 */
	public Inicio() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 615, 366);
		contentPane = new JPanel();
		contentPane.setBackground(Color.RED);
		contentPane.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		setContentPane(contentPane);
		contentPane.setLayout(null);
	
		//creacion de un nuevo panel
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel.setBackground(UIManager.getColor("ToggleButton.background"));
		panel.setBounds(41, 27, 506, 269);
		contentPane.add(panel);
		panel.setLayout(null);
		
		//creacion de un nuevo boton 
		btnEntrar = new JButton(" ENTRAR");
		btnEntrar.setBackground(Color.LIGHT_GRAY);
		btnEntrar.setFont(new Font("Arial", Font.BOLD, 12));
		btnEntrar.setBounds(37, 187, 148, 48);
		panel.add(btnEntrar);
		
		//creacion de un nuevo boton 
		btnRegistro = new JButton("REGISTRO");
		btnRegistro.setBackground(UIManager.getColor("ToggleButton.light"));
		btnRegistro.setFont(new Font("Arial", Font.BOLD, 12));
		btnRegistro.setBounds(308, 187, 162, 48);
		panel.add(btnRegistro);
		
		//creacion de un nuevo cuadro de texto
		lblBienvenido = new JLabel("BIENVENIDO/A");
		lblBienvenido.setFont(new Font("Lucida Sans", Font.BOLD, 35));
		lblBienvenido.setBounds(115, 28, 269, 31);
		panel.add(lblBienvenido);
		
		//creacion de un nuevo cuadro de texto
		lblNewLabel = new JLabel("Para realizar la compra de su billete, pulse Entrar.\r\n");
		lblNewLabel.setToolTipText("");
		lblNewLabel.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel.setBounds(94, 70, 323, 31);
		panel.add(lblNewLabel);
		
		//creacion de un nuevo cuadro de texto
		lblPulseEntrarO = new JLabel("Reg\u00EDstrese \r\nen caso de no tener un usuario v\u00E1lido");
		lblPulseEntrarO.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblPulseEntrarO.setBounds(94, 112, 323, 31);
		panel.add(lblPulseEntrarO);
	}
}



