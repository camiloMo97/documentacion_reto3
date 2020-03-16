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
public class ParadasBD {
	
	
	private  ArrayList<Parada> listaParadas;


	
	public ParadasBD() {
		
	}

	/**
	 * Metodos get y set generados para guardar valores ingresados 
	 * @return valor de la variable
	 */
	public ArrayList<Parada> getListaLineas() {
		return listaParadas;
	}

	public void setListaLineas(ArrayList<Parada> listaParadas) {
		this.listaParadas = listaParadas;
	}

	
	/**
	 * Metodo para obtener los nombres de las paradas 
	 * @param String
	 * @return el nombre de todas la paradas encontradas 
	 * @throws SQLException
	 */
	public static ArrayList<Parada> obtenerParadas(String cod_Linea) throws SQLException{
		
		Connection con= Conexion.conectar();
		
		String sql="select Nombre from Parada INNER JOIN linea_parada ON parada.Cod_Parada = linea_parada.Cod_Parada where linea_parada.cod_linea='"+cod_Linea+"';";
		
		PreparedStatement ps=con.prepareStatement(sql);
		
		ResultSet rs=ps.executeQuery();
		

		ArrayList<Parada> paradas= new ArrayList<Parada>();
		
		try {
			
			ps=con.prepareStatement(sql);
		
			while (rs.next()) {
				
				Parada miParada = new Parada();
				
				miParada.setNombre(rs.getString("Nombre"));
				
				paradas.add(miParada);
			
			}

			ps.close();
			rs.close();
			con.close();
			
			
		} catch (Exception e) {
			
			System.out.println("Error: Clase Contacto, método obtener paradas");
			
		}
		
		return paradas ;
		
	}


}
