import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;


public class Entering {

public String accept() {
	String treeName=" ";
	System.out.println("enter empId, name, desingnation, contact, tree name");
	Scanner sc= new Scanner(System.in);
	ConnectinDb c= new ConnectinDb();
	Connection con= c.getConnectinDb();
	String s="insert into employee values(?,?,?,?,?)";
	try {
		PreparedStatement ps= con.prepareStatement(s);
		ps.setInt(1, sc.nextInt());
		ps.setString(2, sc.next());
		ps.setString(3, sc.next());
		ps.setString(4, sc.next());
		 treeName=sc.next();
		ps.setString(5, treeName);
		int i=ps.executeUpdate();
		if(i>0){
			System.out.println("inserted successfully");
		}
		else{
			System.out.println("not inserted");
		}
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	c.closeConnectinDb();
	return treeName;
}

}
