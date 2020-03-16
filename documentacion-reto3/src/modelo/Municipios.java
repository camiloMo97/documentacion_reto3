package modelo;

/**
 * Clase donde se crean variables para guardar datos de 
 * los Municipios y usarlos posteriormente  
 */
public class Municipios {
	
	private String nombre;
	private int cod_postal;
	private String paradas;
	
	/**
	 * Constructores generados para inicializar variables
	 */
	public Municipios() {
		super();
	}
	
	/**
	 * Metodos get y set generados para guardar valores ingresados 
	 * @return valor de la varible
	 */
	public Municipios(String nombre, int cod_postal, String paradas) {
		super();
		this.nombre = nombre;
		this.cod_postal = cod_postal;
		this.paradas = paradas;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCod_postal() {
		return cod_postal;
	}

	public void setCod_postal(int cod_postal) {
		this.cod_postal = cod_postal;
	}

	public String getParadas() {
		return paradas;
	}

	public void setParadas(String paradas) {
		this.paradas = paradas;
	}
	
	
	
}