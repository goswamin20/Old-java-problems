package mamasg;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
import java.sql.Date;
public class JdbcAssgn {
public static void main(String[] args) {
	Connection con=null;
	Statement s=null;
	ResultSet rs= null;
	try {
		Class.forName("com.mysql.jdbc.Driver");
		con= DriverManager.getConnection("jdbc:mysql://localhost/emp1", "root", "root");
	 s= con.createStatement();
		Scanner sc= new Scanner(System.in);
		System.out.println("enter emp id");
		String spl="select * from emp1 where empNo="+sc.nextInt();
		rs = s.executeQuery(spl);
		while(rs.next()){
		
		System.out.println(rs.getInt(1));
		System.out.println(rs.getString(2));
		System.out.println(rs.getString(3));
		System.out.println(rs.getInt(4));
		Date d= rs.getDate(5);
		System.out.println(d);
		System.out.println(rs.getFloat(6));
		System.out.println(rs.getFloat(7));
		System.out.println(rs.getInt(8));
		}
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}finally{
		try {
			con.close();
			rs.close();
			s.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
}
