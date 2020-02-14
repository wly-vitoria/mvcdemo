package com.neuedu.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.neuedu.bean.Login;
import com.neuedu.dao.LoginDaoImpm;

public class UpdatepwServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public UpdatepwServlet() {
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");

		String nowpass = request.getParameter("nowpass");
		String password = request.getParameter("pass");
		String repassword = request.getParameter("repass");
		String Email = request.getParameter("Email");

		HttpSession session = request.getSession();
		Login l = (Login)session.getAttribute("Login");
			
		System.out.println(l);
		LoginDaoImpm p = new LoginDaoImpm();
		p.updatepw(password, l.getEmail());
		
		//l.setPassword(repassword);
		response.sendRedirect(request.getContextPath()+"/html/user/set.jsp");
		//System.out.println(l.getPassword());
			}
			
		}
		
		
	

