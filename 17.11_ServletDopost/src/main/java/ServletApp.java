

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet("/ServletApp")
public class ServletApp extends HttpServlet {
	
//	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		
//		System.out.println("control in servlet / controler");
//		
//		String name = request.getParameter("uname");
//		String city = request.getParameter("ucity");
//		
//		if(name.equals("singh") && city.equals("pune")) {
//			System.out.println("success , correct logic");
//		}
//		else {
//			System.out.println("wrong login ");
//		}
//	}





public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("control in servlet / controler");
		
		String name = request.getParameter("uname");
		String city = request.getParameter("ucity");
		
		if(name.equals("singh") && city.equals("pune")) {
			System.out.println("success , correct logic");
		}
		else {
			System.out.println("wrong login ");
		}
	}
	
	

}
