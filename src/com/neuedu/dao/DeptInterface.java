package com.neuedu.dao;

import com.neuedu.bean.Dept;

public interface DeptInterface {
	//���巽��
	//ȡ�ã���ѯ��dept���е���������
	//�ڽӿ��ж���һ������     ֻ��������û��ʵ��
	//����   ��deptDao��ʵ��
	public Dept selectDept();
	
	//���ݲ��ű�Ų�ѯ��Ӧ����Ϣ
	public Dept selectDeptByDeptno(int depton);
	
	//����һ��Ա����Ϣ��emp��
	public int InsertEmp(Emp e);
	

}
