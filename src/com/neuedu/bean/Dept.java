package com.neuedu.bean;

public class Dept {
	//属性       表中的列
	private int Deptno;
	private String Ename;
	private String Loc;
	//提供公有的方法去存储或者取得私有属性的值
	//取得部门编号的值
	/*public int getDeptno() {
		return this.Deptno;
	}
	//存部门编号
	public void setDeptno() {
		this.Deptno=Deptno;
	}
	//取部门名
	public String getEname() {
		return this.Ename;
	}
	public void setEname() {
		this.Ename=Ename;
	}
	//取部门地址
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
			System.out.println("输入的部门编号不符合规定");
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
			System.out.println("部门名称不符合规定");
		}
	}

	public String getLoc() {
		return Loc;
	}

	public void setLoc(String loc) {
		Loc = loc;
	}
	//内容的打印
	@Override
	public String toString() {
		return "Dept [Deptno=" + Deptno + ", Ename=" + Ename + ", Loc=" + Loc + "]";
	}
	
}
