package programJdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import db.Exception.DbIntegrityException;
import db.config.DB;

public class Program {

	public static void main(String[]args) {
		Connection conn = null;
		PreparedStatement st = null;
		
		try {
			conn = DB.getConnection();
			
			st = conn.prepareStatement(
					"Delete from departament "
					+ "where "
					+ "Id = ?"
					);
			
			st.setInt(1, 2);
			
			int rowsAffected = st.executeUpdate();
			System.out.println("Done! Rows affected: " + rowsAffected);

		}
		catch(SQLException e) {
			throw new DbIntegrityException(e.getMessage());
		}
		finally{
			DB.closeConnection();
			DB.closeStatement(st);
		}
		
	}
}
