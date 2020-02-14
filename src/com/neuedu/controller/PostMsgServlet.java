package com.neuedu.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.neuedu.bean.Login;
import com.neuedu.bean.Msg;
import com.neuedu.dao.LoginDaoImpm;
import com.neuedu.service.LoginServiceImpl;

public class PostMsgServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
    public PostMsgServlet() {
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		System.out.println("我进来了");
		String title = request.getParameter("title");
		String content = request.getParameter("content");
		String creattime = request.getParameter("creattime");
	
		HttpSession session = request.getSession();
		Login l = (Login)session.getAttribute("Login");
		
		String email = l.getEmail();
		
		Msg m = new Msg();
	      
        m.setEmail(email);
        m.setTitle(title);
        m.setPage(content);
        
		ArrayList<Msg>  list  = new ArrayList<Msg>();
		list.add(m);
		/*session.setAttribute("list",list);
		list = (ArrayList<Msg>)session.getAttribute("list");*/
		LoginDaoImpm p = new LoginDaoImpm();
		p.addMsg(email, title, content, creattime);
		
		response.sendRedirect(request.getContextPath()+"/html/user/afterlogin.jsp");
		System.out.println(l.getEmail());
		System.out.println(title);
		System.out.println(list);
	}

}
