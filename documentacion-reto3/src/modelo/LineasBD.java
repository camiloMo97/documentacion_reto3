package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import conexion.Conexion;

/**
 * Clase donde se hace la consulta a la base de datos
 */
public class LineasBD {
	
	private  ArrayList<Lineas> listaLineas;


	public LineasBD() {
		
	}
	
	/**
	 * Metodos get y set generados para guardar valores ingresados 
	 * @return valor de la varible
	 */
	
	public ArrayList<Lineas> getListaLineas() {
		return listaLineas;
	}

	public void setListaLineas(ArrayList<Lineas> listaLineas) {
		this.listaLineas = listaLineas;
	}
	
	/**
	 * Metodo donde se realiza la consulta a la base de datos para obtener
	 * los datos de las lineas 
	 * @return las lineas obtenidas
	 * @throws SQLException
	 */
	public static ArrayList<Lineas> obtenerLineas() throws SQLException{
		
		Connection con= Conexion.conectar();
		
		//linea de comando que ira a la base de datos
		String sql="SELECT * FROM Linea ";
		
		PreparedStatement ps=con.prepareStatement(sql);
		
		ResultSet rs=ps.executeQuery();
		

		ArrayList<Lineas> lineas= new ArrayList<Lineas>();
		
		try {
			
			ps=con.prepareStatement(sql);
		
			while (rs.next()) {
				
				Lineas miLinea = new Lineas();
				
				miLinea.setCodlinea(rs.getString("Cod_Linea"));
				miLinea.setNombre(rs.getString("Nombre"));
				
				lineas.add(miLinea);
			

			}

			ps.close();
			rs.close();
			con.close();
			
		} catch (Exception e) {
			
			System.out.println("Error: Clase Contacto, método obtener linea");
			
		}
		
		return lineas ;
		
	}



}
