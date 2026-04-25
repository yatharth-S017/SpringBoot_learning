

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

@WebServlet("/Register")
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String name = request.getParameter("uname");
		String email  = request.getParameter("email");
		String password = request.getParameter("password");
		String ucity = request.getParameter("ucity");
		
		HttpSession session = request.getSession();
		session.setAttribute("name", name);
		
		Model model = new Model();
		model.setName(name);
		model.setEmail(email);
		model.setPass(password);
		model.setCity(ucity);
		
		int row = model.register();
		if(row == 0) {  //no data is affected
			response.sendRedirect("fail.jsp");
		}
		else {  // some data is inserted into database
			response.sendRedirect("succes.jsp");
		}
		
		
		
	}

}
