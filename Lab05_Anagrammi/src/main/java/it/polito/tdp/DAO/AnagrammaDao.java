package it.polito.tdp.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AnagrammaDao {

	
	public boolean isCorrect(String anagramma) {
		
		try {
			Connection conn= DBConnection.getConnection(); 
			
			String sql= "SELECT nome FROM parola WHERE nome=?";
			PreparedStatement st = conn.prepareStatement(sql);
			st.setString(1, anagramma);
			ResultSet res = st.executeQuery();
			
			st.close();
			conn.close();
			return res.next();
			
		
			
		}catch (SQLException e) {
			throw new RuntimeException("Non va"+e);
		}
		
	}
	
	
}
