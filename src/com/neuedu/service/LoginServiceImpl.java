package com.neuedu.service;

import java.util.ArrayList;

import com.neuedu.bean.Login;
import com.neuedu.bean.Msg;
import com.neuedu.dao.LoginDaoImpm;

public class LoginServiceImpl implements LoginService{
//调用dao层中的业务逻辑
	LoginDaoImpm Id = new LoginDaoImpm();
	public Login login(String username,String password,String email) {
		
		return Id.loginUser(username,password,email);
	}
	
	public Login insert(String username,String password,String email, String time) {
		return Id.insertUser(username, password, email,time);
	}
	
	public int update(String email,String sex,String city,String sign) {
		return Id.updateUser(email,sex,city,sign);
	}
	
	public int updatepw(String password, String email) {
		return Id.updatepw(password, email);
	}
	
	public ArrayList<Msg> addMsg(String email, String title, String content, String creattime) {
		
		return Id.addMsg(email, title,content,creattime);
		
	}
	
	
}
