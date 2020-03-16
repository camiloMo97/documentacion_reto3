package vista;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controlador.ControladorComprobante;

import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;

/**
 *Clase donde se crean los paneles y botonos que el usurio utilizara 
 */
public class Comprobante extends JFrame {

	private JPanel contentPane;
	private JButton btnSi;
	private JButton btnNo;
	
	/**
	 * Metodos get y set generados para guardar valores ingresados 
	 * @return valor o accion ingresado
	 */
	public JButton getBtnSi() {
		return btnSi;
	}

	public void setBtnSi(JButton btnSi) {
		this.btnSi = btnSi;
	}

	public JButton getBtnNo() {
		return btnNo;
	}

	public void setBtnNo(JButton btnNo) {
		this.btnNo = btnNo;
	}

	
	/**
	 * Metodo donde se crea una ventana y un controlador de la ventana comprobante
	 */
	public static void mInicioComprobante() {

		try {
			
			Comprobante VentanaComprobante = new Comprobante();
			VentanaComprobante.setVisible(true);
			
			ControladorComprobante controladorComprobante = new ControladorComprobante(VentanaComprobante);
		
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	/**
	 * Metodo donde se crean paneles, botones y cuadros de texto 
	 * con sus respectivos datos 
	 */
	public Comprobante() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 261);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		//creacion de un nuevo panel
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(0, 0, 434, 228);
		contentPane.add(panel);
		panel.setLayout(null);

		//creacion de un nuevo cuadro de texto
		JLabel lblComprobante = new JLabel("COMPROBANTE");
		lblComprobante.setFont(new Font("Arial", Font.BOLD, 30));
		lblComprobante.setBounds(96, 11, 259, 54);
		panel.add(lblComprobante);

		//creacion de un nuevo cuadro de texto
		JLabel lbldPreguntaFactura = new JLabel("\u00BFDesea guardar el ticket de la factura?");
		lbldPreguntaFactura.setFont(new Font("Arial", Font.BOLD, 20));
		lbldPreguntaFactura.setBounds(37, 84, 387, 24);
		panel.add(lbldPreguntaFactura);

		//creacion de un nuevo boton
		btnSi = new JButton("SI");
		btnSi.setFont(new Font("Arial", Font.BOLD, 15));
		btnSi.setBounds(37, 170, 89, 37);
		panel.add(btnSi);

		//creacion de un nuevo boton
		btnNo = new JButton("NO");
		btnNo.setFont(new Font("Arial", Font.BOLD, 15));
		btnNo.setBounds(321, 170, 89, 37);
		panel.add(btnNo);
	}

}