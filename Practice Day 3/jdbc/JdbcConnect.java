package jdbc;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcConnect {
public static void main(String[] args) {
	try {
		//load driver
		Class.forName("com.mysql.jdbc.Driver");
		//establish the connection
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost/EMP","root","root");
		System.out.println("connected");
		System.out.println(con.getClass().getName());
		
		
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
}
