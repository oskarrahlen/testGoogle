package com.firstMaven;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns="/login.do")
public class LoginServlet extends HttpServlet {
	
	private UserValidationService service = new UserValidationService();
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		
		request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request, response);
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		String name = request.getParameter("name");
		String pass = request.getParameter("pass");
		
		boolean isUserValid = service.isUserValid(name, pass);
		if(isUserValid){
			request.setAttribute("name", name);
			request.setAttribute("password", pass);
			request.getRequestDispatcher("/WEB-INF/views/welcome.jsp").forward(request, response);
		}
		else{
			request.setAttribute("errorMessage", "Invalid Credentials!");
			request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request, response);
		}
	}
}

