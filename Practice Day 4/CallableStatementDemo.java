import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Types;


public class CallableStatementDemo {
public static void main(String[] args) {
	try {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con= DriverManager.getConnection("jdbc:mysql://localhost/emp", "root", "root");
		CallableStatement cs= con.prepareCall("{call p1(?,?,?)}");
		int no = Integer.parseInt(args[0]);
		cs.setInt(1, no);
		cs.registerOutParameter(2, Types.VARCHAR);
		cs.registerOutParameter(3, Types.DOUBLE);
		cs.execute();
		String str= cs.getString(2);
		System.out.println("employee name:"+str);
		double sal = cs.getDouble(3);
		System.out.println("Employee"+sal);
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
}
