package com.neuedu.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.neuedu.bean.Login;
import com.neuedu.dao.LoginDaoImpm;
import com.neuedu.service.LoginServiceImpl;

//�޸ı�UpdateLoginServlet
public class UpdateLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public UpdateLoginServlet() {
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			
			request.setCharacterEncoding("UTF-8");
			response.setCharacterEncoding("UTF-8");

			String sex = request.getParameter("sex");
			String city = request.getParameter("city");
			String sign = request.getParameter("sign");
			String Email = request.getParameter("Email");
			
			HttpSession session = request.getSession();
			Login l = (Login)session.getAttribute("Login");
	
			LoginDaoImpm p = new LoginDaoImpm();
			p.updateUser(l.getEmail(), sex, city, sign);
			
			l.setCity(city);
			l.setSex(sex);
			l.setSign(sign);
			response.sendRedirect(request.getContextPath()+"/html/user/set.jsp");
			
			System.out.println(l);
			System.out.println(city);
			System.out.println(sex);
			System.out.println(l.getCity());
			System.out.println(l.getEmail());

	}

}
