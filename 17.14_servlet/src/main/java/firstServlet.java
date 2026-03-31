

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;


@WebServlet("/firstServlet")
public class firstServlet extends HttpServlet {

	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("control is in first servlet");
		String name  = request.getParameter("uname");		
		String city  = request.getParameter("ucity");
		
		
		RequestDispatcher reqDispatch = request.getRequestDispatcher("secondServlet");
		
		HttpSession session = request.getSession();
		
		session.setAttribute("name", name);
		session.setAttribute("city", city);
		
		session.setMaxInactiveInterval(8000);

		reqDispatch.forward(request, response);
//		reqDispatch.include(request, response);
		
		
		
		System.out.println("control is in servlet1");
		
//		writer.close();
	}

}
