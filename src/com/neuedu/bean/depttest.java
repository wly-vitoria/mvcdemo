package com.neuedu.bean;

import java.sql.Date;

import com.neuedu.dao.DeptDao;
import com.neuedu.dao.Emp;

public class depttest {
	public static void main(String[] args) {
		/*Dept d= new Dept();
		d.setDeptno(130);
		d.setEname("某部");
		d.setLoc("西安");
		System.out.println(d);*/
		
		//要求：存入dept封装类中的部门编号在0——100之间，
		   //  如果大于100或者小于等于0 属性将无法被存入
		//要求：字符长度在3——15字符之间
		
		
		DeptDao dd = new DeptDao();
		/*dd.selectDept();*/
		//按部门号查询
		/*dd.selectDeptByDeptno(40);*/
		Emp e = new Emp();
		e.setEmpno(7799);
		e.setEname("Bill");
		e.setJob("boss");
		e.setMgr(null);
		//将字符串转换成date类型
		e.setHiredate(Date.valueOf("2018-10-2"));
		e.setSal(500000);
		e.setComm(0);
		e.setDeptno(40);
		int number =dd.InsertEmp(e);
		System.out.println(number+" 插入数据成功");
		
		}
}
