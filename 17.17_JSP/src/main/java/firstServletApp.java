

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet("/firstServlet")
public class firstServletApp extends HttpServlet {
	
	int age = 13;
	
    public firstServletApp() {
        System.out.println("servet object is created internally by servlet container");
    }

	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String name = request.getParameter("uname");
		String city = request.getParameter("ucity");
		
		PrintWriter writer = response.getWriter();
		
//		writer.println("Hello " + name);
//		writer.println("I know you are from " + city);
		
		writer.println(
			    "<html><head>" +
			    "<style>" +
			    "body{font-family:Arial;background:#f5f5f5;}" +
			    "table{border-collapse:collapse;margin-top:20px;width:40%;}" +
			    "th,td{border:1px solid #333;padding:10px;text-align:left;}" +
			    "th{background:#4CAF50;color:white;}" +
			    "td{background:#fff;}" +
			    "</style>" +
			    "</head><body>" +

			    "<h2>User Details</h2>" +
			    "<table>" +
			    "<tr><th>Field</th><th>Value</th></tr>" +
			    "<tr><td>Name</td><td>" + name + "</td></tr>" +
			    "<tr><td>City</td><td>" + city + "</td></tr>" +
			    "</table>" +

			    "</body></html>"
			);


		
		
		
		
		
		writer.close(); 
		
	}

}
