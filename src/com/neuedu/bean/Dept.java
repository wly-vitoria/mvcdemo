package com.neuedu.bean;

public class Dept {
	//����       ���е���
	private int Deptno;
	private String Ename;
	private String Loc;
	//�ṩ���еķ���ȥ�洢����ȡ��˽�����Ե�ֵ
	//ȡ�ò��ű�ŵ�ֵ
	/*public int getDeptno() {
		return this.Deptno;
	}
	//�沿�ű��
	public void setDeptno() {
		this.Deptno=Deptno;
	}
	//ȡ������
	public String getEname() {
		return this.Ename;
	}
	public void setEname() {
		this.Ename=Ename;
	}
	//ȡ���ŵ�ַ
	public String getLoc() {
		return this.Loc;
	}
	public void setLoc() {
		this.Loc=Loc;
	}*/
	

	public int getDeptno() {
		return Deptno;
	}

	public void setDeptno(int deptno) {
		if(deptno>=0&&deptno<100)
		{
			
			Deptno = deptno;
		}
		else
		{
			System.out.println("����Ĳ��ű�Ų����Ϲ涨");
		}
	}

	public String getEname() {
		return Ename;
	}

	public void setEname(String ename) {
		if(ename.length()>=3&&ename.length()<15) {
			
			Ename = ename;
		}
		else
		{
			System.out.println("�������Ʋ����Ϲ涨");
		}
	}

	public String getLoc() {
		return Loc;
	}

	public void setLoc(String loc) {
		Loc = loc;
	}
	//���ݵĴ�ӡ
	@Override
	public String toString() {
		return "Dept [Deptno=" + Deptno + ", Ename=" + Ename + ", Loc=" + Loc + "]";
	}
	
}
