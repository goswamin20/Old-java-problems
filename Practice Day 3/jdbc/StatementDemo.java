package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class StatementDemo {
public static void main(String[] args) {
	ResultSet rs=null;
	Connection con=null;
	PreparedStatement ps=null;
	Statement smt=null;
	try {
		Class.forName("com.mysql.jdbc.Driver");
		 con= DriverManager.getConnection("jdbc:mysql://localhost/customer", "root", "root");
	 smt= con.createStatement();
		String sql= "insert into customer values(101,'nandini')";
		int i= smt.executeUpdate(sql);
		
		if(i>0)
			System.out.println("record inserted");
		else
			System.out.println("record not inserted");
		Scanner sc= new Scanner(System.in);
		System.out.println("enter custId and custName");
		String sq2= "insert into customer values("+sc.next()+",'"+sc.next()+"')";
		int i1= smt.executeUpdate(sq2);
		if(i1>0)
			System.out.println("record inserted");
		else
			System.out.println("record not inserted");
		System.out.println("enter");
		String s= "insert into customer values(?,?)";
		 ps= con.prepareStatement(s);
		ps.setInt(1, sc.nextInt());
		ps.setString(2, sc.next());
		i=ps.executeUpdate();
		if(i>0)
			System.out.println("record inserted");
		else
			System.out.println("record not inserted");
	 rs= smt.executeQuery("select * from customer");
		while(rs.next()){
			int custId= rs.getInt(1);
			String custName= rs.getString(2);
			System.out.println(custId+" "+custName);
		}
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}finally{
		
		try {rs.close();
		smt.close();
		ps.close();
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
}
