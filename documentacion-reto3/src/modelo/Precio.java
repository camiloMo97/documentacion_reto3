package modelo;

/**
 * Clase donde se crean variables para guardar datos del precio
 *  y usarlos posteriormente  
 */
public class Precio {
	
	private static double precio;
	private double distancia;
	private static double gasolina = 0.80;
	private static double consumo_km;
	private static double num_plazas;
	private static float lat1;
	private static float lat2;
	private static float lng1;
	private static float lgn2;
	
	/**
	 * Constructores generados para inicializar variables
	 */
	public Precio(double consumo_km, double num_plazas) {
		super();

		this.consumo_km = consumo_km;
		this.num_plazas = num_plazas;

	}

	public Precio(float lat1, float lat2, float lng1, float lgn2) {
		super();
		this.lat1 = lat1;
		this.lat2 = lat2;
		this.lng1 = lng1;
		this.lgn2 = lgn2;
	}

	public Precio() {
		super();
	}

	/**
	 * Metodos get y set generados para guardar valores ingresados 
	 * @return valor de la varible
	 */
	public static double getPrecio() {
		return precio;
	}

	public static void setPrecio(double precioo) {
		precio = precioo;
	}

	public double getDistancia() {
		return distancia;
	}

	public void setDistancia(double distancia) {
		this.distancia = distancia;
	}

	public static double getGasolina() {
		return gasolina;
	}

	public void setGasolina(double gasolina) {
		this.gasolina = gasolina;
	}

	public static double getConsumo_km() {
		return consumo_km;
	}

	public void setConsumo_km(double consumo_km) {
		this.consumo_km = consumo_km;
	}

	public static double getNum_plazas() {
		return num_plazas;
	}

	public void setNum_plazas(double num_plazas) {
		this.num_plazas = num_plazas;
	}

	public static float getLat1() {
		return lat1;
	}

	public void setLat1(float lat1) {
		this.lat1 = lat1;
	}

	public static float getLat2() {
		return lat2;
	}

	public void setLat2(float lat2) {
		this.lat2 = lat2;
	}

	public static float getLng1() {
		return lng1;
	}

	public void setLng1(float lng1) {
		this.lng1 = lng1;
	}

	public static float getLgn2() {
		return lgn2;
	}

	public void setLgn2(float lgn2) {
		this.lgn2 = lgn2;
	}
	
	/**
	 * Metodo donde se calcula el precio del ticket 
	 * @param lat1
	 * @param lng1
	 * @param lat2
	 * @param lng2
	 * @return distacia obtenida
	 */
	public static double distanciaCoord(float lat1, float lng1, float lat2, float lng2) {  
        //double radioTierra = 3958.75;//en millas  
        double radioTierra = 6371;//en kilómetros  
        double dLat = Math.toRadians(lat2 - lat1);  
        double dLng = Math.toRadians(lng2 - lng1);  
        double sindLat = Math.sin(dLat / 2);  
        double sindLng = Math.sin(dLng / 2);  
        double va1 = Math.pow(sindLat, 2) + Math.pow(sindLng, 2)  
                * Math.cos(Math.toRadians(lat1)) * Math.cos(Math.toRadians(lat2));  
        double va2 = 2 * Math.atan2(Math.sqrt(va1), Math.sqrt(1 - va1));  
        double distancia = radioTierra * va2;
        return distancia;  
    }

}
