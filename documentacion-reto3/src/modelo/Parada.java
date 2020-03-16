package modelo;

/**
 * Clase donde se crean variables para guardar datos de 
 * las paradas y usarlos posteriormente  
 */
public class Parada {
	
	private String cod_parada;
	private String calle;
	private String nombre;
	private String coordenadas;
	
	/**
	 * Constructores generados para inicializar variables
	 */
	public Parada() {
		super();
	}

	public Parada(String cod_parada, String calle, String nombre, String coordenadas) {
		super();
		this.cod_parada = cod_parada;
		this.calle = calle;
		this.nombre = nombre;
		this.coordenadas = coordenadas;
	}

	/**
	 * Metodos get y set generados para guardar valores ingresados 
	 * @return valor de la varible
	 */
	public String getCodparada() {
		return cod_parada;
	}

	public void setCodparada(String cod_parada) {
		this.cod_parada = cod_parada;
	}

	public String getCalle() {
		return calle;
	}

	public void setCalle(String calle) {
		this.calle = calle;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCoordenadas() {
		return coordenadas;
	}

	public void setCoordenadas(String coordenadas) {
		this.coordenadas = coordenadas;
	}
	
	public String toString() {
		
		return this.nombre;
	}
	
}
