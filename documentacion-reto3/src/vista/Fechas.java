package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import controlador.ControladorFechas;

import javax.swing.border.BevelBorder;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JEditorPane;
import javax.swing.JList;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class Fechas extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldDestino;
	private JTextField textFieldPrecio;
	private JButton btnContinuar;
	private JButton btnSalir;
	private JButton btnRegresar;
	private JTextField textFieldFechaIda;
	private JTextField textFieldFechaVuelta;
	private String destino;
	
	//get-set
	
	
	
	public JButton getBtnContinuar() {
		return btnContinuar;
	}

	public JButton getBtnRegresar() {
		return btnRegresar;
	}

	public void setBtnRegresar(JButton btnRegresar) {
		this.btnRegresar = btnRegresar;
	}

	public JTextField getTextFieldDestino() {
		return textFieldDestino;
	}

	public void setTextFieldDestino(JTextField textFieldDestino) {
		this.textFieldDestino = textFieldDestino;
	}

	public JTextField getTextFieldPrecio() {
		return textFieldPrecio;
	}

	public void setTextFieldPrecio(JTextField textFieldPrecio) {
		this.textFieldPrecio = textFieldPrecio;
	}

	public JTextField getTextFieldFechaIda() {
		return textFieldFechaIda;
	}

	public void setTextFieldFechaIda(JTextField textFieldFechaIda) {
		this.textFieldFechaIda = textFieldFechaIda;
	}

	public JTextField getTextFieldFechaVuelta() {
		return textFieldFechaVuelta;
	}

	public void setTextFieldFechaVuelta(JTextField textFieldFechaVuelta) {
		this.textFieldFechaVuelta = textFieldFechaVuelta;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
		textFieldDestino.setText(destino);
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

	
	//otros metodos
	public static void mInicioFechas() {
		
		try {
			
			Fechas ventanaFechas = new Fechas();
			ventanaFechas.setVisible(true);
			
			ControladorFechas ControladorFechas = new ControladorFechas(ventanaFechas);
					
		} catch (Exception e) {
			e.printStackTrace();
		}
	}


	public Fechas() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 358);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(0, 0, 434, 319);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblFechasHorarios = new JLabel("FECHAS / HORARIOS");
		lblFechasHorarios.setBounds(92, 11, 258, 30);
		lblFechasHorarios.setFont(new Font("Arial", Font.BOLD, 25));
		panel.add(lblFechasHorarios);
		
		textFieldDestino = new JTextField();
		textFieldDestino.setEditable(false);
		textFieldDestino.setBounds(23, 88, 195, 20);
		panel.add(textFieldDestino);
		textFieldDestino.setColumns(10);
		
		JLabel lblLabelDestino = new JLabel("DESTINO SELECIONADO");
		lblLabelDestino.setFont(new Font("Arial", Font.BOLD, 15));
		lblLabelDestino.setBounds(23, 57, 195, 20);
		panel.add(lblLabelDestino);
		
		JLabel lblPrecio = new JLabel("PRECIO");
		lblPrecio.setFont(new Font("Arial", Font.BOLD, 15));
		lblPrecio.setBounds(116, 222, 63, 14);
		panel.add(lblPrecio);
		
		textFieldPrecio = new JTextField();
		textFieldPrecio.setEditable(false);
		textFieldPrecio.setBounds(189, 220, 96, 20);
		panel.add(textFieldPrecio);
		textFieldPrecio.setColumns(10);
		
		btnContinuar = new JButton("CONTINUAR");
		btnContinuar.setBounds(10, 274, 119, 34);
		panel.add(btnContinuar);
		
		btnSalir = new JButton("SALIR");
		btnSalir.setBounds(322, 274, 102, 34);
		panel.add(btnSalir);
		
		JLabel lblFecha = new JLabel("FECHA IDA:");
		lblFecha.setBounds(10, 130, 83, 14);
		panel.add(lblFecha);
		
		JLabel lblHora = new JLabel("HORA IDA:");
		lblHora.setBounds(219, 130, 60, 14);
		panel.add(lblHora);
		
		JComboBox comboBoxHoraIda =  new JComboBox();
		comboBoxHoraIda.setToolTipText("");
		comboBoxHoraIda.setMaximumRowCount(2);
		comboBoxHoraIda.setBounds(303, 126, 102, 22);
		panel.add(comboBoxHoraIda);
		
		ArrayList<String> horaIda = new ArrayList<String>();
		horaIda.add("10:30");
		horaIda.add("12:30");
		horaIda.add("14:30");
		
		for(int i=0; i < horaIda.size() ; i++) {
			String x = horaIda.get(i);
			comboBoxHoraIda.addItem(x);
		}
		
		textFieldFechaIda = new JTextField();
		textFieldFechaIda.setColumns(10);
		textFieldFechaIda.setBounds(92, 127, 96, 20);
		panel.add(textFieldFechaIda);
		
		textFieldFechaVuelta = new JTextField();
		textFieldFechaVuelta.setColumns(10);
		textFieldFechaVuelta.setBounds(92, 172, 96, 20);
		panel.add(textFieldFechaVuelta);
		
		JLabel lblFechaVuelta = new JLabel("FECHA VUELTA:");
		lblFechaVuelta.setBounds(7, 172, 86, 20);
		panel.add(lblFechaVuelta);
		
		JLabel lblHoraVuelta = new JLabel("HORA VUELTA:");
		lblHoraVuelta.setBounds(219, 175, 74, 14);
		panel.add(lblHoraVuelta);
		
		JComboBox comboBoxHoraVuelta = new JComboBox();
		comboBoxHoraVuelta.setToolTipText("");
		comboBoxHoraVuelta.setMaximumRowCount(2);
		comboBoxHoraVuelta.setBounds(303, 171, 102, 22);
		panel.add(comboBoxHoraVuelta);
		
		btnRegresar = new JButton("REGRESAR");
		btnRegresar.setBounds(162, 274, 117, 34);
		panel.add(btnRegresar);
		
		ArrayList<String> horaVuelta = new ArrayList<String>();
		horaVuelta.add("10:30");
		horaVuelta.add("12:30");
		horaVuelta.add("14:30");
		
		for(int i=0; i < horaVuelta.size() ; i++) {
			String x = horaVuelta.get(i);
			comboBoxHoraVuelta.addItem(x);
		}
	}
}