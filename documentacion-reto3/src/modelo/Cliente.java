package modelo;

/**
 * Clase donde se crean variables para guardar datos de 
 * los Clientes y usarlos posteriormente  
 */
public class Cliente {
	
	private String dni;
	private String nombre;
	private String apellidos;
	private String sexo;
	private String contraseña;
	private String fechaNaci;
	
	/**
	 * Constructores generados para inicializar variables
	 */
	public Cliente() {
		super();
	}

	public Cliente(String dni, String nombre, String apellidos, String sexo, String contraseña,String fechaNacimi) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.sexo = sexo;
		this.contraseña = contraseña;
		this.fechaNaci=fechaNacimi;
	}

	/**
	 * Metodos get y set generados para guardar valores ingresados 
	 * @return valor de la varible
	 */
	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni=dni ;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getContraseña() {
		return contraseña;
	}

	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}

	public String getFechaNaci() {
		return fechaNaci;
	}

	public String setFechaNaci(String fechaNaci) {
		return this.fechaNaci = fechaNaci;
	}



}