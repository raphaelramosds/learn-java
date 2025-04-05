package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

/**
 * Data connection module implemented with DAO pattern
 * 
 * PostgreSQL JDBC: https://jdbc.postgresql.org/documentation/use/
 * MySQL JDBC: https://dev.mysql.com/doc/connector-j/en/connector-j-usagenotes-connect-drivermanager.html
 */
public class DAO {
	// Connection parameters
	private String driver = "org.postgresql.Driver";
	private String url = "jdbc:postgresql://0.0.0.0:5433/postgres";
	private String user = "postgres";
	private String password = "root";
	
	/**
	 * Connection method
	 * @return Connection
	 */
	private Connection connect() {
		Connection conn = null;
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, user, password);
			return conn;
		} catch (Exception e) {
			System.out.println(e);
			return null;
		}
	}
	
	/**
	 * Connection test
	 * @return void
	 */
	public void testConnection() {
		try {
			Connection conn = connect();
			System.out.println(conn);
			conn.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	

	public void save(JavaBeans contact) {
		String sql = "INSERT INTO contacts (name, phone, email) VALUES (?,?,?)";
		try {
			Connection conn = connect();
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setString(1, contact.getName()); // Set property name on the first question mark
			pst.setString(2, contact.getPhone()); // Set property phone on the second question mark
			pst.setString(3, contact.getEmail()); // Set property phone on the second question mark
			pst.executeUpdate();
			conn.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
