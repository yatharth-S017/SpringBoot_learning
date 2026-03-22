

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet("/firstServlet")
public class firstServlet extends HttpServlet {

	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("control is in first servlet");
		
		RequestDispatcher reqDispatch = request.getRequestDispatcher("secondServlet");
		
		//using foward() method
		reqDispatch.forward(request, response);
		
		
		//using include() method
//		reqDispatch.include(request, response);
		
		//for demo purpose only
		PrintWriter writer = response.getWriter();
		writer.println("<h1>Response from servlet1</h1>");
		
		System.out.println("control is in servlet1");
		
		writer.close();
	}

}
