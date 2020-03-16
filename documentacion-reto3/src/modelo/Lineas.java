package modelo;

/**
 * Clase donde se crean variables para guardar datos de 
 * las lineas y usarlos posteriormente  
 */
public class Lineas {
	
	private String cod_linea;
	private String nombre;
	private String autobuses;
	private String municipios;
	
	/**
	 * Constructores generados para inicializar variables
	 */
	public Lineas() {
		
	}

	public Lineas(String codlinea, String autobuses, String municipios) {
		super();
		this.cod_linea = codlinea;
		this.autobuses = autobuses;
		this.municipios = municipios;
	}

	/**
	 * Metodos get y set generados para guardar valores ingresados 
	 * @return valor de la varible
	 */
	public String getCodlinea() {
		return cod_linea;
	}

	public void setCodlinea(String codlinea) {
		this.cod_linea = codlinea;
	}

	public String getAutobuses() {
		return autobuses;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return this.nombre;
	}

	public void setAutobuses(String autobuses) {
		this.autobuses = autobuses;
	}

	public String getMunicipios() {
		return municipios;
	}

	public void setMunicipios(String municipios) {
		this.municipios = municipios;
	}
	
	
	
	

}
