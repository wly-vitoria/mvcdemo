package com.neuedu.util;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

//mysql的连接
public class DBUtil {
	private static DBUtil util;
	private String driver;
	private String url;
	private String username;
	private String password;
	
	//第一步：私有化构造器
	private DBUtil() {
		Properties pr = new Properties();
		
		//load 得到对应路径下properties文件的数据
		try {
			pr.load(this.getClass().getClassLoader().getResourceAsStream("db.properties"));
			driver=pr.getProperty("jdbc.driver");
			url= pr.getProperty("jdbc.url");
			username=pr.getProperty("jdbc.username");
			password=pr.getProperty("jdbc.password");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}//得到目标文件
		
	}
	
	//单例模式 dbutil
	//第二步：构造方法，开始连接数据库
	//保证此类只能创建一个对象
	//返回一个DBUtil对象
	//synchronized  加锁，防止多线程并发访问
	public synchronized static DBUtil getInstance() {
		//判断util 对象是否建立
		if(null==util) {
			//如果没有就创建一个
			util = new DBUtil();
		}
		return util;
	}
	
	//真正的连接
	//获得连接Connection 获取与数据库链接的一个接口
	public Connection getConnection() throws ClassNotFoundException, SQLException {
		//ͨ通过反射得到核心类  核心jar包中的类
		Class.forName(driver);
		//声明接口
		Connection conn = DriverManager.getConnection(url, username, password);
		System.out.println("MYSQL数据库连接成功！");
		return conn;
	}
	
	//关闭连接
	public static void connClose(Connection c) {
		try {
			c.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void pstmClose(PreparedStatement pstm) {
		try {
			pstm.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void rsClose(ResultSet rs) {
		try {
			rs.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
