package com.neuedu.bean;

import java.util.Date;

public class Msg {
	private int id;
	
	private String Email;
	private String title;
	private String content;
	private String creattime;
	private String page;
	
	
	public String getPage() {
		return page;
	}
	public void setPage(String page) {
		this.page = page;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getCreattime() {
		return creattime;
	}
	public void setCreattime(String creattime) {
		this.creattime = creattime;
	}
	@Override
	public String toString() {
		return "Msg [id=" + id + ", Email=" + Email + ", title=" + title + ", content=" + content + ", creattime="
				+ creattime + ", page=" + page + "]";
	}
	

}
