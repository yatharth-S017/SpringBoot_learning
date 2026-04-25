import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCUtil {
	
	static {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		}
		catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		System.out.println("Driver is registered");
	}
	
	public static Connection getDBConnection() throws SQLException {
		String url = "jdbc:mysql://localhost:3306/telusko";
 		String username = "root";
		String password = "Mysql@12345@";
		
		return DriverManager.getConnection(url, username, password);
	}
	
	public static void closeResource(Connection connect , Statement st) throws SQLException {
		if(connect != null) {
			connect.close(); 
		}
		else if(st != null) {
			st.close();
		}
	}

}
