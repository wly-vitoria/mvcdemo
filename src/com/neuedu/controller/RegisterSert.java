package com.neuedu.controller;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.neuedu.bean.Login;
import com.neuedu.service.LoginServiceImpl;

public class RegisterSert extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		String UserName = request.getParameter("UserName");
		String Password = request.getParameter("Password");
		String Email = request.getParameter("Email");
		
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");//设置日期格式
		String time = df.format(new Date());
		
		LoginServiceImpl ls = new LoginServiceImpl();
		Login l = ls.insert(UserName, Password, Email,time);
		//Login l = new Login();
		System.out.println("条数据已插入");
		System.out.println(l);
		
		l.setUserName(UserName);
		l.setPassword(Password);
		l.setEmail(Email);
		l.setTime(time);
		
		System.out.println(l.getId());
		//判断注册是否成功
		if(l.getUserName()==null) {
			System.out.println("注册失败");
			response.sendRedirect(request.getContextPath()+"/html/user/login.html");
		}else if(l.getUserName()!=null) {
			System.out.println("注册成功");
			
			System.out.println(df.format(new Date()));// new Date()为获取当前系统时间
			
			System.out.println(time);
			System.out.println(l.getTime());
			
			HttpSession session = request.getSession();
			session.setAttribute("Login", l);
			response.sendRedirect(request.getContextPath()+"/html/user/set.jsp");
		}
		
	}

}
