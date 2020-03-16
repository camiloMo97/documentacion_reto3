package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import vista.Comprobante;
import vista.Fechas;
import vista.Final;
import vista.Inicio;


public class ControladorComprobante  implements ActionListener {

	private Comprobante ventanaComprobante;

	/**
	 * Metodo donde se inicializa el controlador de la vista Comprobante
	 * @param pComprobante
	 * @see #inicializarControlador();
	 */
	public ControladorComprobante(Comprobante pComprobante) {
		
		this.ventanaComprobante=pComprobante;
		
		inicializarControlador();
		
	}

	/**
	 * Metodo que da funcionalidad a los botones si y no
	 * 
	 */
	public void inicializarControlador() {

		/**
		 * llama la ventana inicio, llama el boton Si y el boton No
		 * y aplica la funcion al presionar el boton
		 */
		this.ventanaComprobante.getBtnSi().addActionListener(this);
		this.ventanaComprobante.getBtnSi().setActionCommand("btnSi");

		this.ventanaComprobante.getBtnNo().addActionListener(this);
		this.ventanaComprobante.getBtnNo().setActionCommand("btnNo");

	}

	/**
	 * Metodo donde se asigna la funcion ha realizar segun el 
	 * boton seleccionado 
	 */
	public void actionPerformed(ActionEvent e) {

		switch (e.getActionCommand()) {

		case "btnSi":
			
			JOptionPane.showMessageDialog(null, "imprimiendo....");
			
			Final ventanaFinal = new Final();
			ventanaFinal.setVisible(true);
			
			ventanaComprobante.dispose();
			
			break;
			
		case "btnNo":
			
			Final ventanaFinal2 = new Final();
			ventanaFinal2.setVisible(true);

			ventanaComprobante.dispose();


			break;

		}

	}

	
}