package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import conexion.Conexion;

/**
 * Clase donde se hace las respectivas consultas a la base de datos
 */
public class PrecioBD {

	/**
	 * Metodo donde obtine la longitud y latitud de origen
	 * 
	 * @param origen
	 * @throws SQLException
	 */
	public static void obtenerLatLongOrigen(String origen) throws SQLException {

		Connection con = Conexion.conectar();

		// linea de comando para obtener la latitud y longitud de origen
		String sql = "select Latitud,Longitud from Parada where Nombre='" + origen + "';";

		PreparedStatement ps = con.prepareStatement(sql);

		ResultSet rs = ps.executeQuery();

		try {

			ps = con.prepareStatement(sql);

			while (rs.next()) {

				Precio p1 = new Precio();

				p1.setLat1(rs.getFloat("Latitud"));
				p1.setLng1(rs.getFloat("Longitud"));
			}

			ps.close();
			rs.close();
			con.close();

		} catch (Exception e) {

			System.out.println("Error: Clase Contacto, método obtener paradas");

		}

	}

	/**
	 * Metodo donde obtine la longitud y latitud de destino
	 * 
	 * @param origen
	 * @throws SQLException
	 */
	public static void obtenerLatLongDestino(String destino) throws SQLException {

		Connection con = Conexion.conectar();

		// linea de comando para obtener la latitud y longitud de origen
		String sql = "select Latitud,Longitud from Parada where Nombre='" + destino + "';";

		PreparedStatement ps = con.prepareStatement(sql);

		ResultSet rs = ps.executeQuery();

		ArrayList<Parada> paradas = new ArrayList<Parada>();

		try {

			ps = con.prepareStatement(sql);

			while (rs.next()) {

				Precio p1 = new Precio();

				p1.setLat2(rs.getFloat("Latitud"));
				p1.setLgn2(rs.getFloat("Longitud"));

			}

			ps.close();
			rs.close();
			con.close();

		} catch (Exception e) {

			System.out.println("Error: Clase Contacto, método obtener paradas");

		}

	}

	/**
	 * Metodo para Obtener el Autobus de la base de datos
	 * @param cod_Linea
	 * @param fecha
	 * @param Hora
	 * @return autobus selecionado 
	 * @throws SQLException
	 */
	public static int obtenerAutobus(String cod_Linea, String fecha, String Hora) throws SQLException {

		Connection con = Conexion.conectar();
		//linea de comando para obtener el codigo del autobus 
		String sql = "select Cod_bus from linea_autobus where Cod_Linea=(SELECT Cod_Linea from Linea where Nombre='"
				+ cod_Linea + "') and Fecha='" + fecha + "' and Hora='" + Hora + "'";

		PreparedStatement ps = con.prepareStatement(sql);

		ResultSet rs = ps.executeQuery();

		ps = con.prepareStatement(sql);
		int autobus = 0;
		if (rs.next()) {

			autobus = rs.getInt("Cod_bus");

			ps.close();
			rs.close();
			con.close();
			return autobus;
		}

		ps.close();
		rs.close();
		con.close();

		return autobus;

	}

	/**
	 * metodo para obtener el consumo del autobus segun las plazas ocupadas
	 * @param cod_bus
	 * @throws SQLException
	 */
	public static void obtenerConsumoPlazas(double cod_bus) throws SQLException {

		Connection con = Conexion.conectar();

		//linea de comando para obtener el numero de plazas y el consumo en Km de la base de datos
		String sql = "select N_plazas,Consumo_km from Autobus where cod_bus='" + cod_bus + "';";

		PreparedStatement ps = con.prepareStatement(sql);

		ResultSet rs = ps.executeQuery();

		try {

			ps = con.prepareStatement(sql);

			while (rs.next()) {

				Precio p1 = new Precio();

				p1.setNum_plazas(rs.getDouble("N_plazas"));
				p1.setConsumo_km(rs.getDouble("Consumo_km"));

			}

			ps.close();
			rs.close();
			con.close();

		} catch (Exception e) {

			System.out.println("Error: Clase Contacto, método obtener paradas");

		}

	}
}
