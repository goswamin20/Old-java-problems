import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;


public class TaxProgram {
	public static void main(String[] args) {
		
	
	try {
	
		Class.forName("com.mysql.jdbc.Driver");
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost/customer","root","root");
		System.out.println("connected");
		Scanner sc= new Scanner(System.in);
		System.out.println("enter 1st name , last name, pan, pending tax and submitting year");
		String s= "insert into income_tax values (?,?,?,?,?) ";
		
		PreparedStatement ps= con.prepareStatement(s);
		ps.setString(1, sc.next());
		ps.setString(2, sc.next());
		ps.setString(3, sc.next());
		ps.setFloat(4, sc.nextFloat());
		ps.setString(5, sc.next());
		ps.executeUpdate();
	}catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

}}
