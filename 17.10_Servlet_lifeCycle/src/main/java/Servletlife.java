

import java.io.IOException;

import jakarta.servlet.Servlet;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet("/servlet_life")   //url mapping
public class Servletlife extends HttpServlet {
	
	static {
		System.out.println("servlet is loaded ...");
	}

	
   
    public Servletlife() {
        System.out.println("servlet object is created");
    }
    
   
	public void init(ServletConfig config) throws ServletException {
		System.out.println("servelt initailized");
	}

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("service method to handle http request and to response back");
	}

	public void destroy() {
		System.out.println("object get destroyed");
	}
}
