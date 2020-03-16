package vista;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import controlador.ControladorTrayecto;
import modelo.ClienteBD;

import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

/**
 *Clase donde se crean los paneles y botonos que el usurio utilizara 
 */
public class Trayecto extends JFrame {

	private JPanel contentPane;
	private JButton btnContinuar;
	private JButton btnSalir;
	private JButton btnRegresar;
	private JComboBox comboBoxDestino;
	private JComboBox comboBoxOrigen;


	/**
	 * Metodos get y set generados para guardar valores ingresados 
	 * @return valor o accion ingresado
	 */

	public JButton getBtnContinuar() {
		return btnContinuar;
	}

	public JComboBox getComboBoxDestino() {
		return comboBoxDestino;
	}
	
	public JComboBox getComboBoxOrigen() {
		return comboBoxOrigen;
	}

	public void setComboBoxOrigen(JComboBox comboBoxOrigen) {
		this.comboBoxOrigen = comboBoxOrigen;
	}

	public void setComboBoxDestino(JComboBox comboBoxDestino) {
		this.comboBoxDestino = comboBoxDestino;
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

	public JButton getBtnRegresar() {

		return btnRegresar;
	}

	public void setBtnRegresar(JButton btnRegresar) {
		this.btnRegresar = btnRegresar;
	}


	/**
	 * Metodo donde se crea un controlador de la ventana trayecto
	 */
	public static void mInicioTrayecto() {

		try {

			Trayecto ventanaTrayecto = new Trayecto();
			ventanaTrayecto.setVisible(true);

			ControladorTrayecto controladorTrayecto = new ControladorTrayecto(ventanaTrayecto);

		} catch (Exception e) {

			e.printStackTrace();
		}

	}

	/**
	 * Metodo donde se crean paneles, botones y cuadros de texto 
	 * con sus respectivos datos 
	 */
	public Trayecto() throws SQLException {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		//creacion de un nuevo panel
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(0, 0, 434, 261);
		contentPane.add(panel);
		panel.setLayout(null);

		//creacion de un nuevo cuadro de texto
		JLabel lblTrayexc = new JLabel("TRAYECTO");
		lblTrayexc.setBounds(120, 11, 172, 36);
		lblTrayexc.setFont(new Font("Arial", Font.BOLD, 30));
		panel.add(lblTrayexc);

		//creacion de un nuevo cuadro de texto
		JLabel lblOrigen = new JLabel("ORIGEN");
		lblOrigen.setFont(new Font("Arial", Font.BOLD, 25));
		lblOrigen.setBounds(26, 83, 108, 31);
		panel.add(lblOrigen);

		//creacion de un nuevo cuadro de texto
		JLabel lblDestino = new JLabel("DESTINO");
		lblDestino.setFont(new Font("Arial", Font.BOLD, 25));
		lblDestino.setBounds(288, 83, 125, 31);
		panel.add(lblDestino);

		//creacion de un nuevo ComboBox
		comboBoxDestino = new JComboBox();

		comboBoxDestino.setBounds(271, 137, 153, 22);
		panel.add(comboBoxDestino);

		//creacion de un nuevo boton
		btnContinuar = new JButton("CONTINUAR");
		btnContinuar.setBounds(10, 219, 108, 31);
		panel.add(btnContinuar);

		//creacion de un nuevo boton
		btnSalir = new JButton("SALIR");
		btnSalir.setBounds(324, 219, 89, 31);
		panel.add(btnSalir);

		//creacion de un nuevo boton
		btnRegresar = new JButton("REGRESAR");
		btnRegresar.setBounds(150, 219, 134, 31);
		panel.add(btnRegresar);
		
		//creacion de un nuevo ComboBox
		comboBoxOrigen = new JComboBox();
		comboBoxOrigen.setBounds(26, 137, 153, 22);
		panel.add(comboBoxOrigen);

	}
}