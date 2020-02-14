package com.neuedu.dao;

import java.sql.Date;

public class Emp {
	private int Empno;//≤ø√≈±‡∫≈
	private String Ename;//–’√˚
	private String Job;
	private String Mgr;
	private Date Hiredate;
	private int Sal;
	private int Comm;
	private int Deptno;
	public int getEmpno() {
		return Empno;
	}
	public void setEmpno(int empno) {
		Empno = empno;
	}
	public String getEname() {
		return Ename;
	}
	public void setEname(String ename) {
		Ename = ename;
	}
	public String getJob() {
		return Job;
	}
	public void setJob(String job) {
		Job = job;
	}
	public String getMgr() {
		return Mgr;
	}
	public void setMgr(String mgr) {
		Mgr = mgr;
	}
	public Date getHiredate() {
		return Hiredate;
	}
	public void setHiredate(Date Hiredate) {
		this.Hiredate = Hiredate;
	}
	public int getSal() {
		return Sal;
	}
	public void setSal(int sal) {
		Sal = sal;
	}
	public int getComm() {
		return Comm;
	}
	public void setComm(int comm) {
		Comm = comm;
	}
	public int getDeptno() {
		return Deptno;
	}
	public void setDeptno(int deptno) {
		Deptno = deptno;
	}
	@Override
	public String toString() {
		return "Emp [Empno=" + Empno + ", Ename=" + Ename + ", Job=" + Job + ", Mgr=" + Mgr + ", hiredate=" + Hiredate
				+ ", Sal=" + Sal + ", Comm=" + Comm + ", Deptno=" + Deptno + "]";
	}

}
