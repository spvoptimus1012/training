import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;

import com.mysql.cj.jdbc.Driver;



public class ConnectionDemo {

	public static void main(String[] args) throws Exception {

//		String url = "jdbc:mysql://localhost:3306/Training";
//		
//		DriverManager.registerDriver(new Driver());
//		Connection conn = DriverManager.getConnection(url,"root","Vapras@2000");
//		System.out.println("Connection successful!");

		Connection conn = JdbcFactory.getConnection();
		System.out.println("Connection successful");

		DatabaseMetaData meta = conn.getMetaData();
		System.out.println("DB Name: " + meta.getDatabaseProductName());
		System.out.println("DB Ver: " + meta.getDatabaseProductVersion());
		System.out.println("Driver Name: " + meta.getDriverName());
		System.out.println("Driver Ver: " + meta.getDriverVersion());

	}

}
