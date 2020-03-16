package vista;

import java.awt.Color;
import java.awt.Font;
import java.sql.SQLException;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.border.LineBorder;

import controlador.ControladorBillete;

/**
 *Clase donde se crean los paneles y botonos que el usurio utilizara 
 */
public class Billete extends JFrame {

	private JPanel contentPane;
	private JButton btnContinuar;
	private JButton btnSalir;
	private JComboBox comboBoxLinea;
	

	/**
	 * Metodos get y set generados para guardar valores ingresados 
	 * @return valor o accion ingresado
	 */
	public JComboBox getcomboBoxLinea() {
		return comboBoxLinea;
	}

	public void setcomboBoxLinea(JComboBox comboBoxLinea) {
		this.comboBoxLinea = comboBoxLinea;
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

	
	/**
	 * Metodo donde se crea una ventan y un controlador de la ventana billete
	 */
	public static void mInicioBillete() {
		
		try {

			Billete ventanaBillete = new Billete();
			ventanaBillete.setVisible(true);

			ControladorBillete controladorBillete = new ControladorBillete(ventanaBillete);

		} catch (Exception e) {
			
			e.printStackTrace();
		}

	}

	@SuppressWarnings("unchecked")
	/**
	 * Metodo donde se crean paneles, botones y cuadros de texto 
	 * con sus respectivos datos 
	 */
	public Billete() throws SQLException {
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
		panel.setBackground(Color.WHITE);
		panel.setBackground(UIManager.getColor("ToggleButton.background"));
		panel.setBounds(41, 27, 506, 269);
		contentPane.add(panel);
		panel.setLayout(null);

		//creacion de un nuevo cuadro de texto
		JLabel lblComprarBillete = new JLabel("COMPRAR BILLETE");
		lblComprarBillete.setBounds(98, 11, 288, 36);
		lblComprarBillete.setFont(new Font("Lucida Sans", Font.BOLD, 30));
		panel.add(lblComprarBillete);

		//creacion de un nuevo cuadro de texto
		JLabel lblOrigen = new JLabel("SELECIONE LINEA ");
		lblOrigen.setFont(new Font("Lucida Sans", Font.BOLD, 20));
		lblOrigen.setBounds(40, 80, 218, 24);
		panel.add(lblOrigen);

		//creacion de un nuevo ComboBox
		comboBoxLinea = new JComboBox<>();
		comboBoxLinea.setBounds(40, 125, 162, 22);
		panel.add(comboBoxLinea);

		//creacion de un nuevo boton
		btnContinuar = new JButton("CONTINUAR");
		btnContinuar.setBackground(UIManager.getColor("ToggleButton.light"));
		btnContinuar.setFont(new Font("Lucida Sans", Font.BOLD, 12));
		btnContinuar.setBounds(24, 197, 162, 48);
		panel.add(btnContinuar);

		//creacion de un nuevo boton
		btnSalir = new JButton("SALIR");
		btnSalir.setBackground(UIManager.getColor("ToggleButton.light"));
		btnSalir.setFont(new Font("Lucida Sans", Font.BOLD, 12));
		btnSalir.setBounds(329, 197, 141, 48);
		panel.add(btnSalir);
	}
}
