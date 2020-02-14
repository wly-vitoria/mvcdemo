package com.neuedu.dao;

import com.neuedu.bean.Dept;

public interface DeptInterface {
	//定义方法
	//取得（查询）dept表中的所有数据
	//在接口中定义一个函数     只有声明，没有实现
	//具体   让deptDao类实现
	public Dept selectDept();
	
	//根据部门编号查询对应的信息
	public Dept selectDeptByDeptno(int depton);
	
	//插入一条员工信息（emp表）
	public int InsertEmp(Emp e);
	

}
