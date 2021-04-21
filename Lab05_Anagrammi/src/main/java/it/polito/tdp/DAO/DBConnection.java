package it.polito.tdp.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

		private static String jdbcURL = "jdbc:mysql://localhost/dizionario?user=root&password=258383";
		
		public static Connection getConnection(){
			Connection connection = null; 
			try {
				connection= DriverManager.getConnection(jdbcURL);
			}catch(SQLException e) {
				System.out.println("Errore apertura dabase" +e);
			}
			return connection; 
		}
}
