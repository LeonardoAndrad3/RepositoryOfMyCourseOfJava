package programJdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import db.Exception.DbException;
import db.config.DB;

public class Program {

	public static void main(String[]args) {
		Connection conn = null;
		Statement st = null;
		
		try {
			conn = DB.getConnection();
			conn.setAutoCommit(false);
			//Command used to confirm the transaction
			
			st = conn.createStatement();
			
			int rows1 = st.executeUpdate("Update seller set BaseSalary = 2090 where departmentid = 1");
			
			int x = 1;
			if(x < 2) throw new SQLException("Fake error");
			
			int rows2 = st.executeUpdate("Update seller set BaseSalary = 3090 where departmentid = 2");
			
			conn.commit();
			//Transaction confirm
			
			System.out.println("Rows1"+ rows1 + "! Rows affected: " + rows2);

		}
		catch(SQLException e) {
			try {
				conn.rollback();
				//Used "rollback" to revert database state
				throw new DbException("Transaction rolled back! Caused by: " + e.getMessage());
			} catch (SQLException e1) {
				throw new DbException("Error trying to rollback! Caused by: " + e1.getMessage());
			}
		}
		finally{
			DB.closeConnection();
			DB.closeStatement(st);
		}
		
	}
}
