package com.neuedu.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.neuedu.bean.Dept;
import com.neuedu.util.DBUtil;

public class DeptDao implements DeptInterface {
	//实现接口中定义的方法
	
	Connection conn=null;
	public Dept selectDept() {
		//获取数据库的连接
		//预编译
		PreparedStatement pstm=null;
		
		//声明一个集合 list集合
		ArrayList<Dept> list = new ArrayList<Dept>();
		try {
			conn=DBUtil.getInstance().getConnection();
			String sql="SELECT * FROM DEPT";
			//将SQL字符串预编译
			pstm=conn.prepareStatement(sql);
			//将编译好的SQL发送到数据库
			//返回值     resultset容器（存储的是查询后的结果）
			
			ResultSet rs = pstm.executeQuery();
			//在rs中存储的是查询后的结果
			//rs.next()  判断rs中下一个元素是否有数据   有返回true  没有返回false
			Dept d = null;
			while(rs.next()) {
				d = new Dept();
				d.setDeptno(rs.getInt("depton"));
				d.setEname(rs.getString("dname"));
				d.setLoc(rs.getString("loc"));
				list.add(d);
			}
			for(int i = 0 ; i < list.size();i++)
			{
				
				System.out.println(list.get(i));
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// TODO Auto-generated method stub
		return null;
	}
	
	//根据部门编号查询数据


	public Dept selectDeptByDeptno(int depton) {
		Connection conn= null;
		PreparedStatement pstm = null;
		ResultSet rs= null;
		try {
			conn=DBUtil.getInstance().getConnection();
			String sql = "SELECT * FROM DEPT WHERE DEPTON = ?";
			pstm = conn.prepareStatement(sql);
			//为（？）占位符赋值
			
			
			pstm.setInt(1, depton);//此SQL语句中第一个问号的值为depton
			
			rs = pstm.executeQuery();
			//只返回一条数据，不用循环
			Dept d = new Dept();
			rs.next();
			d.setDeptno(depton);
			d.setEname(rs.getString("DNAME"));
			d.setLoc(rs.getString("LOC"));
			
			System.out.println("查询的结果为："+d);
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			//无论程序处于什么状态，都会执行finally
			//从后向前关
			DBUtil.rsClose(rs);
			DBUtil.pstmClose(pstm);
			DBUtil.connClose(conn);
		}
		// TODO Auto-generated method stub
		return null;
	}
	
	//插入数据
	public int InsertEmp(Emp e) {
		//插入数据
		Connection conn= null;
		PreparedStatement pstm = null;
		int num = 0;
		try {
			conn=DBUtil.getInstance().getConnection();
			String sql = "insert into emp values (?,?,?,?,?,?,?,?)";
			
			pstm=conn.prepareStatement(sql);
			pstm.setInt(1, e.getEmpno());
			pstm.setString(2, e.getEname());
			pstm.setString(3, e.getJob());
			pstm.setString(4, e.getMgr());
			pstm.setDate(5, e.getHiredate());
			pstm.setInt(6, e.getSal());
			pstm.setInt(7, e.getComm());
			pstm.setInt(8, e.getDeptno());
			
			//提交SQL语句
			num = pstm.executeUpdate();
			
			
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		finally {
			DBUtil.pstmClose(pstm);
			DBUtil.connClose(conn);
		}
		// TODO Auto-generated method stub
		return num;
	}
	
	

}
