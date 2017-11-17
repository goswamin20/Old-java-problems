package mamasg;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class part2 {
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
		int empId=sc.nextInt();
		String spl="select * from emp1 where empNo="+empId;
		rs = s.executeQuery(spl);
		while(rs.next()){
			
		System.out.println(rs.getFloat(6));
		}
		System.out.println("enter salary");
		String spl1="update emp1 set sal ="+sc.nextDouble()+"where empNo="+empId;
		int b=s.executeUpdate(spl1);
		if(b>0){
			System.out.println("updated");
		}
		else
			System.out.println("not Updated");
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

