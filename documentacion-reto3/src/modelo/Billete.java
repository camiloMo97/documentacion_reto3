package modelo;

/**
 * Clase donde se crean variables para guardar datos de 
 * los Billetes y usarlos posteriormente  
 *
 */
public class Billete {
	
	private int num_billete;
	private String fechas;
	private String origen;
	private String destino;
	private String cod_autobus;
	private float precio;
	
	/**
	 * Constructores generados para inicializar variables
	 */
	public Billete() {
		
	}

	public Billete(int num_billete, String fechas, String origen, String destino, String cod_autobus, float precio) {
		super();
		this.num_billete = num_billete;
		this.fechas = fechas;
		this.origen = origen;
		this.destino = destino;
		this.cod_autobus = cod_autobus;
		this.precio = precio;
	}

	/**
	 * Metodos get y set generados para guardar valores ingresados 
	 * @return valor de la varible
	 */
	public int getNum_billete() {
		return num_billete;
	}

	public void setNum_billete(int num_billete) {
		this.num_billete = num_billete;
	}

	public String getFechas() {
		return fechas;
	}

	public void setFechas(String fechas) {
		this.fechas = fechas;
	}

	public String getOrigen() {
		return origen;
	}

	public void setOrigen(String origen) {
		this.origen = origen;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public String getCod_autobus() {
		return cod_autobus;
	}

	public void setCod_autobus(String cod_autobus) {
		this.cod_autobus = cod_autobus;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}
	
	
	
	
	

}
