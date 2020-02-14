package com.neuedu.service;

import com.neuedu.bean.Login;

public interface LoginService {

	//验证登录
	Login login(String username,String password,String email);
}
