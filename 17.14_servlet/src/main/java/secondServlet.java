

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;


@WebServlet("/secondServlet")
public class secondServlet extends HttpServlet {

	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("control is in second servlet");
		
		HttpSession session = request.getSession(false);
		
		String name = (String)session.getAttribute("name");
		String city  = (String)session.getAttribute("city");
		
		PrintWriter writer = response.getWriter();
		writer.println("<h1>response from second servlet</h1> " + "<h1> Name is " + name   +  "</h1>" + "<h1> City  is " + city   +  "</h1>");
		
		
		writer.close();
	}

}
