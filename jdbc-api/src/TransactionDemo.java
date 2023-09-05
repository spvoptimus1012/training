import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;


public class TransactionDemo {

	public static void main(String[] args) {
		String sql1 = "insert into customer values (145, 'Lovely', 'Gamer')";
		String sql2 = "update customer set domain= 'Sports' where cust_id=121";
		String sql3 = "delete from customer where cust_id=127";
		Connection conn = null;
		try {
			conn = JdbcFactory.getConnection();

			Statement stmt = conn.createStatement();
			// Adding batch of SQL queries to statements
			stmt.addBatch(sql1);
			stmt.addBatch(sql2);
			stmt.addBatch(sql3);

			conn.setAutoCommit(false); // setting auto-commit off
			stmt.executeBatch(); // Executing batch of queries at once

			conn.commit(); // Comitting the changes
			System.out.println("Transaction completed.");
		} catch (SQLException e) {
			System.out.println("Transaction failed due to...");
			try {
				conn.rollback(); // Rollback transaction on exception
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			e.printStackTrace();
		}
	}

}
