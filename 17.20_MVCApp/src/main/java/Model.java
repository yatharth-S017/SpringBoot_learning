
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Model {
   private String name;
   private String email;
   private String pass;
   private String city;
   
   private Connection connect = null;
   private PreparedStatement pst = null;
   private int row;
   
   
   public String getName() {
	return name;
   }
   public void setName(String name) {
	this.name = name;
   }
   public String getEmail() {
	return email;
   }
   public void setEmail(String email) {
	this.email = email;
   }
   public String getPass() {
	return pass;
   }
   public void setPass(String pass) {
	this.pass = pass;
   }
   public String getCity() {
	return city;
   }
   public void setCity(String city) {
	this.city = city;
   }
   
   
   
   public int register() {
	   try{
		   connect = JDBCUtil.getDBConnection();
		   String sql = "insert into personInfo (uname,email,upass, ucity) values (?, ?, ?, ?)" ;
		    pst = connect.prepareStatement(sql);
		    
		    pst.setString(1, name);
		    pst.setString(2, email);
		    pst.setString(3, pass);
		    pst.setString(4, city);
		    
		    row = pst.executeUpdate();
		   
	   }
	   catch(SQLException e) {
		   e.printStackTrace();
	   }
	   finally {
		   try {
			JDBCUtil.closeResource(connect, pst);
		   } catch (SQLException e) {
			e.printStackTrace();
		   }
	   }
	   
	   return row;
	 
   }
   
   
}
