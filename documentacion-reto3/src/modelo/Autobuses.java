package modelo;

/**
 * Clase donde se crean variables para guardar datos de 
 * los Autobuses y usarlos posteriormente  
 *
 */
public class Autobuses {
	
	private int cod_autobus;
	private int num_plazas;
	private int consumo_km;
	private String color;
	private String fecha;
	private String Hora;
	
	/**
	 * Constructores generados para inicializar variables
	 */
	public Autobuses() {
		super();
	}

	public Autobuses(int cod_autobus, int num_plazas, int consumo_km, String color) {
		super();
		this.cod_autobus = cod_autobus;
		this.num_plazas = num_plazas;
		this.consumo_km = consumo_km;
		this.color = color;
	}

	/**
	 * Metodos get y set generados para guardar valores ingresados 
	 * @return valor de la varible
	 */
	public int getCod_autobus() {
		return cod_autobus;
	}

	public void setCod_autobus(int cod_autobus) {
		this.cod_autobus = cod_autobus;
	}

	public int getNum_plazas() {
		return num_plazas;
	}

	public void setNum_plazas(int num_plazas) {
		this.num_plazas = num_plazas;
	}

	public String getHora() {
		return Hora;
	}

	public void setHora(String hora) {
		Hora = hora;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public int getConsumo_km() {
		return consumo_km;
	}

	public void setConsumo_km(int consumo_km) {
		this.consumo_km = consumo_km;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	

}
