
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



public class ConnectinDb {
	static Connection con;
public Connection getConnectinDb() {
	
	try {
		Class.forName("com.mysql.jdbc.Driver");
		con= DriverManager.getConnection("jdbc:mysql://localhost/customer", "root", "root");
	} catch (ClassNotFoundException e) {
		e.printStackTrace();
	} catch (SQLException e) {
		e.printStackTrace();
	}
	return con;
}
public void closeConnectinDb() {
	try {
		con.close();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
