package com.neuedu.dao;

import java.util.ArrayList;

import com.neuedu.bean.Login;
import com.neuedu.bean.Msg;

public interface LoginDao {
	//验证登录
	Login loginUser(String username,String password,String email);
	
	
	//插入数据
	Login insertUser(String username,String password,String email, String time);
	
	//更新其他属性
	int updateUser(String email,String sex,String city,String sign);
	
	int updatepw(String password, String email);
	
	ArrayList<Msg> addMsg(String email, String title, String content, String creattime); 

}
