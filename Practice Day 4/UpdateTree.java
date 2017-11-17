import java.sql.Connection;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class UpdateTree {
public void update(String treeName) {
	
	ConnectinDb c= new ConnectinDb();
		Connection con =c.getConnectinDb();
		Statement smt;
		try {
			smt = con.createStatement();
			String s="select * from tree where tree_name='"+treeName+"'";
			ResultSet rst= smt.executeQuery(s);
			while(rst.next()){
				System.out.println("Thank you for information , you can collect from stall "+ rst.getInt(2));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	
}

}  
	



