package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	static {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			throw new RuntimeException(e);
		}
	}
	
	// Get connection to the database
	public static Connection getConnection() throws SQLException {
		return DriverManager
				.getConnection("jdbc:mysql://localhost/"
						+ "controlepredial"
						+ "?"
						+ "user=root"
						+ "&"
						+ "password=root");
	}

}
