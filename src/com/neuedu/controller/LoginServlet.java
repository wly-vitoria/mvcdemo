package com.neuedu.controller;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.neuedu.bean.Login;
import com.neuedu.dao.LoginDaoImpm;
import com.neuedu.service.LoginServiceImpl;
//servlet文件 与前后台联系的控制层文件
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	
	
     //doget  不加密传递 不安全，数据有上限（2kb）2048字节
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}
	
	//dopost   加密传递 安全，数据不限量（无上限）
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		//获取用户名和密码
		String UserName = request.getParameter("UserName");
		String Password = request.getParameter("Password");
		String Email = request.getParameter("Email");
		//String time =request.getParameter("time");
		
		//根据标签的name属性获取此标签的value值
		//System.out.println("用户名是："+UserName);
		
		//System.out.println("密码是："+Password);
		
		//System.out.println("邮箱是："+Email);
		
		
		/*LoginDaoImpm ldi= new LoginDaoImpm();
		int sum = ldi.loginUser(UserName, Password, Email);
		System.out.println(sum);*/
		
		
		LoginServiceImpl ls = new LoginServiceImpl();
		//ls.GetTime(time);
		Login l=ls.login(UserName, Password, Email);
		//Login n=ls.GetTime(time);
		System.out.println(l.getTime());
		if(l.getId()==0) {
			System.out.println("登录失败，跳转到原页面");
			response.sendRedirect(request.getContextPath()+"/html/user/login.html");
			
		}
		else if(l.getId()!=0) {
			System.out.println("登录成功，跳转到主页面");
			//跳转到其他页面路径
			// 站外跳转response.sendRedirect("http://www.baidu.com");
			//站内跳转     getContextPath  获取项目路径
			//response.sendRedirect(request.getContextPath()+"/html/user/afterlogin.html");
			
			SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
			System.out.println(df.format(new Date()));// new Date()为获取当前系统时间
			 
			//共享资源
			//将数据存入session
			 HttpSession session = request.getSession();
			 session.setAttribute("Login", l);
			 response.sendRedirect(request.getContextPath()+"/html/user/afterlogin.jsp");
		}
		
			
			
	}

}
