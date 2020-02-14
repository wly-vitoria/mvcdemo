package com.neuedu.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.neuedu.bean.Dept;
import com.neuedu.util.DBUtil;

public class DeptDao implements DeptInterface {
	//ʵ�ֽӿ��ж���ķ���
	
	Connection conn=null;
	public Dept selectDept() {
		//��ȡ���ݿ������
		//Ԥ����
		PreparedStatement pstm=null;
		
		//����һ������ list����
		ArrayList<Dept> list = new ArrayList<Dept>();
		try {
			conn=DBUtil.getInstance().getConnection();
			String sql="SELECT * FROM DEPT";
			//��SQL�ַ���Ԥ����
			pstm=conn.prepareStatement(sql);
			//������õ�SQL���͵����ݿ�
			//����ֵ     resultset�������洢���ǲ�ѯ��Ľ����
			
			ResultSet rs = pstm.executeQuery();
			//��rs�д洢���ǲ�ѯ��Ľ��
			//rs.next()  �ж�rs����һ��Ԫ���Ƿ�������   �з���true  û�з���false
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
	
	//���ݲ��ű�Ų�ѯ����


	public Dept selectDeptByDeptno(int depton) {
		Connection conn= null;
		PreparedStatement pstm = null;
		ResultSet rs= null;
		try {
			conn=DBUtil.getInstance().getConnection();
			String sql = "SELECT * FROM DEPT WHERE DEPTON = ?";
			pstm = conn.prepareStatement(sql);
			//Ϊ������ռλ����ֵ
			
			
			pstm.setInt(1, depton);//��SQL����е�һ���ʺŵ�ֵΪdepton
			
			rs = pstm.executeQuery();
			//ֻ����һ�����ݣ�����ѭ��
			Dept d = new Dept();
			rs.next();
			d.setDeptno(depton);
			d.setEname(rs.getString("DNAME"));
			d.setLoc(rs.getString("LOC"));
			
			System.out.println("��ѯ�Ľ��Ϊ��"+d);
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			//���۳�����ʲô״̬������ִ��finally
			//�Ӻ���ǰ��
			DBUtil.rsClose(rs);
			DBUtil.pstmClose(pstm);
			DBUtil.connClose(conn);
		}
		// TODO Auto-generated method stub
		return null;
	}
	
	//��������
	public int InsertEmp(Emp e) {
		//��������
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
			
			//�ύSQL���
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
