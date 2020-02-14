<?xml version="1.0" encoding="UTF-8" ?>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 5.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>Insert title here</title>
<!-- 引入框架 -->
<link rel="stylesheet" type="text/css" href="css/bootstrap.min.css">
<style>
	#login{
		width:300px;
		height:300px;
		position:absolute;
		left:520px;
		top:150px;
		
	}
	#img1{
	position:absolute;
	left:600px;
	top:80px;
	}
	body,html{
	width:100%;
	height:100%;
	margin:0;
	font-family: "微软雅黑";
				font-style:inherit;
				color:white;
				overflow: scroll;/*对溢出后的标签进行裁剪*/
				
				/*去掉浏览器Y轴的滚动条*/
				overflow-y: hidden;
				overflow-x: hidden;
	}
	#video1{
	width:100%;
	z-index:-99
	}
</style>
</head>
<body>

	<!-- bootstrap 前段框架 -->
	<!-- layul 前端框架 -->
	<video id="video1" src="img/nbwgz.mp4" autoplay="autoplay" loop="loop"></video>
	<img id="img1" alt="" src="img/登录.png"></img>
	<div id="login">
<form action="LoginServlet" method="post">
  <div class="form-group">
    <label for="exampleInputEmail1">UserName</label>
    <input type="text" class="form-control" name="UserName" placeholder="请输入用户名..." value="${param.UserName} style="background-color:transparent">
  </div>
  <div class="form-group">
    <label for="exampleInputPassword1">Password</label>
    <input type="password" class="form-control" name="password" placeholder="请输入密码..." style="background-color:transparent">
  </div>
  <div class="form-group">
    <label for="exampleInputPassword1">Email</label>
    <input type="Email" class="form-control" name="Email" placeholder="请输入邮箱..." style="background-color:transparent">
  </div>

  <div class="checkbox">
    <label>
      <input type="checkbox"> Check me out
    </label>
  </div>
  <input type="submit" class="btn btn-default" value="登录">
  <button type="submit" class="btn btn-default">注册</button>
</form>
</div>
</body>
</html>