package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 * Data connection module implemented with DAO pattern
 * 
 * PostgreSQL JDBC: https://jdbc.postgresql.org/documentation/use/
 * MySQL JDBC: https://dev.mysql.com/doc/connector-j/en/connector-j-usagenotes-connect-drivermanager.html
 */
public class DAO {
	// Connection parameters
	private String driver = "org.postgresql.Driver";
	private String url = "jdbc:postgresql://0.0.0.0:5432/postgres";
	private String user = "eclipse";
	private String password = "eclipse";
	
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

	/**
	 * Save contact on database
	 * @param contact
	 */
	public void save(JavaBeans contact) {
		String sql = "INSERT INTO contacts (name, phone, email) VALUES (?,?,?)";
		try {
			Connection conn = connect();
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setString(1, contact.getName()); // Set property name on the first question mark
			pst.setString(2, contact.getPhone()); // Set property phone on the second question mark
			pst.setString(3, contact.getEmail()); // Set property phone on the third question mark
			pst.executeUpdate();
			conn.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	/**
	 * Update a contact
	 * @param contact
	 */
	public void update(JavaBeans contact) {
		String sql = "UPDATE contacts SET name = ?, phone = ?, email = ? WHERE id = ?";
		try {
			Connection conn = connect();
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setString(1, contact.getName());
			pst.setString(2, contact.getPhone());
			pst.setString(3, contact.getEmail());
			pst.setInt(4, Integer.parseInt(contact.getId()));
			pst.executeUpdate();
			conn.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	/**
	 * Delete a contact
	 * @param contact
	 */
	public void delete(JavaBeans contact) {
		String sql = "DELETE FROM contacts WHERE id = ?";
		try {
			Connection conn = connect();
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setInt(1, Integer.parseInt(contact.getId()));
			pst.executeUpdate();
			conn.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	/**
	 * Find a contact by this primary key
	 * @param contact
	 */
	public void findOne(JavaBeans contact) {
		String sql = "SELECT * FROM contacts WHERE id = (?) LIMIT 1";
		try {
			Connection conn = connect();
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setInt(1, Integer.parseInt(contact.getId()));
			ResultSet rs = pst.executeQuery();

			// Fill attributes by reference
			while (rs.next()) {
				contact.setName(rs.getString("name"));
				contact.setPhone(rs.getString("phone"));
				contact.setEmail(rs.getString("email"));
			}

			conn.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	/**
	 * List all contacts
	 * @return
	 */
	public ArrayList<JavaBeans> findAll() {
		ArrayList<JavaBeans> contacts = new ArrayList<>();
		String sql= "SELECT * FROM contacts ORDER BY name";
		try {
			Connection conn = connect();
			PreparedStatement pst = conn.prepareStatement(sql);
			ResultSet rs = pst.executeQuery();

			while (rs.next()) {
				// Assign each property accordingly to its position on the contacts table
				String id = rs.getString(1);
				String name = rs.getString(2);
				String phone = rs.getString(3);
				String email = rs.getString(4);
				
				// Add to the list
				contacts.add(new JavaBeans(id, name, phone, email));
				
				// Go to next row of the query with next()
			}

			conn.close();
			return contacts;
		} catch (Exception e) {
			System.out.println(e);
			return contacts;
		}
	}
	
	protected ArrayList<JavaBeans> queryAll(ArrayList<JavaBeans> contacts) {
		// TODO: encapsulate SELECT statement
		return contacts;
	}
}
