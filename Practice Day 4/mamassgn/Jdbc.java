package mamassgn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Jdbc {
public static void main(String[] args){
	Scanner sc= new Scanner(System.in);
	
	Connection con;
	try {
		Class.forName("com.mysql.jdbc.Driver");
		con= DriverManager.getConnection("jdbc:mysql://localhost/customer","root","root");
		Statement smt= con.createStatement();
		System.out.println("enter location name");
		String s1= "select * from hotel where location='"+sc.next()+"'";
		ResultSet rs=smt.executeQuery(s1);
		while(rs.next()){
			System.out.println("hotel id: "+rs.getInt(1));
			System.out.println("hotel name: "+rs.getString(2));
			System.out.println("hotel availability: "+rs.getString(3));
			
		}
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

}
}
