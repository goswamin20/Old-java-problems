package mamasg;

import java.sql.Connection;
import java.sql.DriverManager;

import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Part3 {
public static void main(String[] args) {
	Connection con=null;
	Statement s=null;

	try {
		Class.forName("com.mysql.jdbc.Driver");
		con= DriverManager.getConnection("jdbc:mysql://localhost/emp1", "root", "root");
	 s= con.createStatement();
		Scanner sc= new Scanner(System.in);
		System.out.println("enter emp id");
		String spl="delete from emp1 where empNo="+sc.nextInt();
		int i=s.executeUpdate(spl);
		if(i>0){
			System.out.println("successfully deleted");
		}
		else{
			System.out.println("wrong empId entered ");
			System.out.println("please enter again");
			String spl1="delete from emp1 where empNo="+sc.nextInt();
			s.executeUpdate(spl1);
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
			
			s.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
}

