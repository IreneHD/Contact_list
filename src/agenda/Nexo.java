package agenda;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;
/**
 * 
 *Clase que conecta con la base de datos MySQL
 *
 *
 * @author Irene Hermida Díaz
 *
 */
public class Nexo {
	
	private static Connection nexo;
	
	private static final String cadena_MySQL = "com.mysql.cj.jdbc.Driver";
	private static final String cadena_nexo = "jdbc:mysql://localhost:3306/Contact_list?serverTimezone=UTC";
	private static final String usuario = "root";
	private static final String clave = "1111";
	
	public static void conectar() {
		try {
			Class.forName(cadena_MySQL);
			nexo = DriverManager.getConnection(cadena_nexo, usuario, clave);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	/**
	 * 
	 * @param Email_Mobile
	 */
	public static void mostrar(String Email_Mobile) {
		Statement statement = null;
		ResultSet resultSet = null;

		try {
			statement = nexo.createStatement();
			resultSet = statement.executeQuery("Select * from Contact_list.contacts where Mobile = '" + Email_Mobile + "' OR Email = '" + Email_Mobile + "'");

			if (resultSet.next()) {
				String Nombre = resultSet.getString(1);
				String Apellidos = resultSet.getString(2);
				String Dirección = resultSet.getString(3);
				String Correo = resultSet.getString(4);
				String Teléfono = resultSet.getString(5);
				Contact contact = new Contact(Nombre, Apellidos, Dirección, Correo, Teléfono);
				contact.mostrarContacto();
			} else {
				System.out.println("");
				System.out.println("Contacto no encontrado");
				System.out.println("");
			}

		} catch (SQLException e) {
			e.printStackTrace();

		}
	}

}
