

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet("/Register")
public class Register extends HttpServlet {
		
	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("control is in servlet");
		
		String name= request.getParameter("uname");
		String email= request.getParameter("email");
		String upass= request.getParameter("password");
		String city= request.getParameter("ucity");
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			

			String url = "jdbc:mysql://localhost:3306/pwstddatabase";
	 		String username = "root";
			String password = "Mysql@12345@";
			
		    Connection connect = DriverManager.getConnection(url,username,password);
		    String sql = "insert into personInfo (uname, email, upass, ucity) values(?,?,?,?) ";
		    
		    PreparedStatement statement = connect.prepareStatement(sql);
		    
		    statement.setString(1, name);
		    statement.setString(2, email);
		    statement.setString(3, upass);
		    statement.setString(4, city);
		    
		    int row = statement.executeUpdate();
		    
		    PrintWriter writer = response.getWriter();
		    if(row != 0) {
		    	writer.println("<h1>Registration SuccessFul</h1>");
		    }
		    else {
		    	writer.println("<h1>Registration Failed</h1>");
		    }
		    
		   statement.close();
		   connect.close();
		    
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		
		
		
		
	}

}
