
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;



public class consolePreparedDemo {

	public static void main(String[] args) {
		// ? is known as place holders, their index starts from 1
		// String sql = "insert into customer values (?, ?, ?)";

		try {

			Scanner console = new Scanner(System.in);
			System.out.println("Enter the code");
			int code = console.nextInt();
			System.out.println("Enter the name");
			String name = console.next();
			System.out.println("Enter the domain");
			String domain = console.next();
			String sql = "insert into customer values(?,?,?)";
			Connection conn = JdbcFactory.getConnection();
			// Pre-compile statement created with query
			PreparedStatement stmt = conn.prepareStatement(sql);
			// Replacing place holders with values
            stmt.setInt(1, code);
            stmt.setString(2, name);
            stmt.setString(3, domain);
            
			stmt.executeUpdate();
			System.out.println("Record successfully inserted...");
		} catch (SQLException e) {
			System.out.println("Record is not successfully inserted");
			e.printStackTrace();
		}

	}

}
