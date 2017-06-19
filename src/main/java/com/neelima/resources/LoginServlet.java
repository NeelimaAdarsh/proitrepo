package com.neelima.resources;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.neelima.model.LoginModel;
import com.neelima.services.CLoginServiceImpl;
import com.neelima.services.ILoginService;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1234L;

	public LoginServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.getWriter().append("Served at request ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		String userName = request.getParameter("username");
		String password = request.getParameter("password");
		LoginModel loginModel = new LoginModel();
		loginModel.setUserName(userName);
		loginModel.setPassword(password);
		
	    ILoginService loginService = new CLoginServiceImpl();
	    try {
			boolean isValidUser = loginService.isValidUser(loginModel);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
	    
		
	}

}
