package com.neuedu.dao;

import java.sql.Connection; 
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.neuedu.bean.Login;
import com.neuedu.bean.Msg;
import com.neuedu.util.DBUtil;

public class LoginDaoImpm  implements LoginDao{
	
	Connection conn=null;
	int sum=0;
    Login l = new Login();
    Msg m = new Msg();
    //ArrayList<Login>  list  =  new  ArrayList<Login>();
	public Login loginUser(String username, String password, String email) {
		
		PreparedStatement pstm=null;
		ResultSet rs= null;
		try {
			conn=DBUtil.getInstance().getConnection();
			String sql = "select * from login_fly where username=? and password =? and email=?";
			
			pstm=conn.prepareStatement(sql);
			pstm.setString(1, username);
			pstm.setString(2, password);
			pstm.setString(3, email);
			
			rs=pstm.executeQuery();
			while(rs.next())
			{
				 //sum=rs.getInt("count");
				l.setId(rs.getInt("id"));
				l.setUserName(rs.getString("username"));
				l.setEmail(rs.getString("email"));
				l.setPassword(rs.getString("password"));
				l.setSex(rs.getString("sex"));
				l.setCity(rs.getString("city"));
				l.setSign(rs.getString("sign"));
				l.setTime(rs.getString("time"));
				
			}
			System.out.println("获取到时间");
			System.out.println(l);
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			DBUtil.rsClose(rs);
			DBUtil.pstmClose(pstm);
			DBUtil.connClose(conn);
		}
		// TODO Auto-generated method stub
		return l;
	}
	
	

	public Login insertUser(String username, String password, String email, String time) {
		
		PreparedStatement pstm=null;
		int num = 0;
		
		try {
			conn=DBUtil.getInstance().getConnection();
			
			String sql = "insert into login_fly(username,password,email,time) values(?,?,?,?)";
			
			pstm=conn.prepareStatement(sql);
			pstm.setString(1, username);
			pstm.setString(2, password);
			pstm.setString(3, email);
			pstm.setString(4, time);
			num=pstm.executeUpdate();
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			DBUtil.connClose(conn);
			DBUtil.pstmClose(pstm);
		}
		
		// TODO Auto-generated method stub
		return l;
	}

	public int updateUser(String email,String sex,String city,String sign) {
		
		PreparedStatement pstm=null;
		int num = 0;
		try {
			conn=DBUtil.getInstance().getConnection();
			
			String sql = "UPDATE login_fly SET sex=?, city=?, sign=? WHERE Email=?";
			pstm=conn.prepareStatement(sql);		
			pstm.setString(1, sex);
			pstm.setString(2, city);
			pstm.setString(3, sign);
			pstm.setString(4, email);
			num=pstm.executeUpdate();
			System.out.println("成功修改"+num+"条数据");
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			DBUtil.connClose(conn);
			DBUtil.pstmClose(pstm);
		}
		// TODO Auto-generated method stub
		return num;
	}
	
	public int updatepw(String password, String email) {
		
		PreparedStatement pstm=null;
		int num = 0;
		try {
			conn=DBUtil.getInstance().getConnection();
			String sql = "UPDATE login_fly SET password=? WHERE Email=?";
			pstm=conn.prepareStatement(sql);		
			pstm.setString(1, password);
			pstm.setString(2, email);
			num=pstm.executeUpdate();
			System.out.println("成功修改"+num+"条密码");
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			DBUtil.connClose(conn);
			DBUtil.pstmClose(pstm);
		}
		// TODO Auto-generated method stub
		return num;
	}
	
public ArrayList<Msg> addMsg(String email, String title, String content, String creattime){
		
	PreparedStatement  pstm  = null;
	int num = 0;
	String sql  ="insert into msg(email,title,content,creattime) values(?,?,?,?)";
	//声明集合
	ArrayList<Msg>  list  =  new  ArrayList<Msg>();
	try {
		conn=DBUtil.getInstance().getConnection();
		pstm=conn.prepareStatement(sql);
		pstm.setString(1, email);
		pstm.setString(2, title);
		pstm.setString(3, content);
		pstm.setString(4, creattime);
		num=pstm.executeUpdate();
		System.out.println("成功发了"+num+"条帖子");
		
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	finally {
		DBUtil.connClose(conn);
		DBUtil.pstmClose(pstm);
	}
	
	// TODO Auto-generated method stub
	return list;
}

}
	
