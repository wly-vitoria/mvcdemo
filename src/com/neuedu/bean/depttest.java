package com.neuedu.bean;

import java.sql.Date;

import com.neuedu.dao.DeptDao;
import com.neuedu.dao.Emp;

public class depttest {
	public static void main(String[] args) {
		/*Dept d= new Dept();
		d.setDeptno(130);
		d.setEname("ĳ��");
		d.setLoc("����");
		System.out.println(d);*/
		
		//Ҫ�󣺴���dept��װ���еĲ��ű����0����100֮�䣬
		   //  �������100����С�ڵ���0 ���Խ��޷�������
		//Ҫ���ַ�������3����15�ַ�֮��
		
		
		DeptDao dd = new DeptDao();
		/*dd.selectDept();*/
		//�����źŲ�ѯ
		/*dd.selectDeptByDeptno(40);*/
		Emp e = new Emp();
		e.setEmpno(7799);
		e.setEname("Bill");
		e.setJob("boss");
		e.setMgr(null);
		//���ַ���ת����date����
		e.setHiredate(Date.valueOf("2018-10-2"));
		e.setSal(500000);
		e.setComm(0);
		e.setDeptno(40);
		int number =dd.InsertEmp(e);
		System.out.println(number+" �������ݳɹ�");
		
		}
}
