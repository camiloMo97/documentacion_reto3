package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import conexion.Conexion;
import datos.DatosTicket;

/**
 * Clase donde se hace las respectivas consultas a la base de datos
 */
public class ClienteBD {

	/**
	 * Metodo donde se inserta un nuevo Cliente en la base de datos
	 * @param cliente
	 * @return boolean true si se inserto correctamente 
	 * @return false si no se inserto correctamente
	 */
	public boolean mInsetarContacto(Cliente cliente) {

		boolean registrar = false;

		Connection con = null;

		//linea de comando que ira a la base de datos
		String sql = "INSERT INTO cliente VALUES (?,?,?,?,?,?) ";

		try {

			con = Conexion.conectar();

			PreparedStatement cs = con.prepareStatement(sql);

			cs.setString(1, cliente.getDni());
			cs.setString(2, cliente.getNombre());
			cs.setString(3, cliente.getApellidos());
			cs.setString(4, cliente.getFechaNaci());
			cs.setString(5, cliente.getSexo());
			cs.setString(6, cliente.getContraseña());

			cs.execute();

			registrar = true;

		} catch (SQLException e) {

			System.out.println("Error: Clase Contacto, método insertar");

		}
		return registrar;
	}

	/**
	 * Metodo donde se Busca el Cliente en la base de datos  
	 * @param dni
	 * @param contrasena
	 * @return boolean true si se encontro el Cliente
	 * @return false si no se encontro correctamente
	 */
	public boolean mBuscarContacto(String dni, String contrasena) {

		boolean existeUsuario = false;

		try {

			Connection con = Conexion.conectar();

			//linea de comando que ira a la base de datos
			String sql = "SELECT * FROM cliente WHERE dni = ? and contraseña = ?";
			PreparedStatement ps = con.prepareStatement(sql);

			ps.setString(1, dni);
			ps.setString(2, contrasena);
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				
				
				DatosTicket.nombre = rs.getString("Nombre");
				
				
				existeUsuario = true;
			}

			ps.close();
			rs.close();
			con.close();

		} catch (SQLException e) {

			System.out.println("Error: Clase Contacto, método buscar");
			e.printStackTrace();
		}

		return existeUsuario;
	}

	public Cliente mObtenerCliente(String dni, String contrasena) {

		Cliente cliente = new Cliente();

		try {

			Connection con = Conexion.conectar();

			String sql = "SELECT * FROM cliente WHERE dni = ? and contraseña = ?";
			PreparedStatement ps = con.prepareStatement(sql);

			ps.setString(1, dni);
			ps.setString(2, contrasena);
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				cliente.setDni(rs.getString("DNI"));
				cliente.setNombre(rs.getString("Nombre"));
				cliente.setApellidos(rs.getString("Apellidos"));
				cliente.setContraseña(rs.getString("Contraseña"));
				cliente.setFechaNaci(rs.getString("Fecha_Nac"));
				cliente.setSexo(rs.getString("Sexo"));

			}

			ps.close();
			rs.close();
			con.close();

		} catch (SQLException e) {

			System.out.println("Error: Clase Contacto, método buscar");
			e.printStackTrace();
		}

		return cliente;

	}

}