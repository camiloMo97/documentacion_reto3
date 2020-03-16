package modelo;

/**
 * Clase donde se crea variable para guardar datos de 
 * la hora y usarlos posteriormente  
 */
public class Hora {
	
	private String Hora;
	
	/**
	 * Constructores generados para inicializar variables
	 */
	public Hora() {
		
	}
	
	/**
	 * Metodos get y set generados para guardar valores ingresados 
	 * @return valor de la varible
	 */
	public Hora( String pHora) {
		
		this.Hora= pHora;
	}
	
	public String getHora() {
		return Hora;
	}

	public void setHora(String hora) {
		Hora = hora;
	}
	
	//otros
	public String toString() {
		
		return this.Hora;
	}

}
