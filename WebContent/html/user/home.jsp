<?xml version="1.0" encoding="utf-8" ?>
<%@page import="com.neuedu.bean.Login" %>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<% Login l = (Login)session.getAttribute("Login"); %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>我的主页</title>
<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
	<meta name="keywords" content="fly,layui,前端社区">
	<meta name="description" content="Fly社区是模块化前端UI框架Layui的官网社区，致力于为web开发提供强劲动力">
	<link rel="stylesheet" href="../../res/layui/css/layui.css">
	<link rel="stylesheet" href="../../res/css/global1.css">
</head>
<body style="margin-top: 65px;">
<div class="header">
  <div class="main">
    <a class="logo" href="../user/afterlogin.jsp" title="Fly">Fly社区</a>
    <div class="nav">
      <a class="nav-this" href="index.jsp">
        <i class="iconfont icon-wenda"></i>问答
      </a>
      <a href="http://www.layui.com/" target="_blank">
        <i class="iconfont icon-ui"></i>框架
      </a>
    </div>
    
    <div class="nav-user">      
      <!-- 登入后的状态 -->
      
      <a class="avatar" href="../user/index.html">
        <img  src="https://hbimg.huabanimg.com/6d90aad88618872e6a10e0bad9d5dfbd68f34b714e9f-NQl4mH_sq140sf">
        <cite><%=l.getUserName() %></cite>
        <i>VIP2</i>
      </a>
      <div class="nav">
        <a href="../user/set.jsp"><i class="iconfont icon-shezhi"></i>设置</a>
        <a href="login.html"><i class="iconfont icon-tuichu" style="top: 0; font-size: 22px;"></i>退出</a>
      </div>
      
    </div>
  </div>
</div>



<div class="fly-home" style="background-image:url('../../res/images/tab.jpg');background-size:37%;height:500px;z-index: -9;">

<br /><br /><br /><br /><br /><br /><br /><br /><br /><br /><br />
<img id="img1" src="https://hbimg.huabanimg.com/6d90aad88618872e6a10e0bad9d5dfbd68f34b714e9f-NQl4mH_sq140sf" alt="{{info.username}}">
  <h1>
    <%=l.getUserName() %>
    <i class="iconfont icon-nan"></i> 
  </h1>
  <p class="fly-home-info">
    <i class="iconfont icon-zuichun" title="飞吻"></i><span style="color: #FF7200;">2400飞吻</span>
    <i class="iconfont icon-shijian"></i><span><%=l.getTime() %>加入</span>
    <i class="iconfont icon-chengshi"></i><span>来自<%=l.getCity() %></span>
  </p>
  <p class="fly-home-sign"><%=l.getSign() %> </p> 
</div>

<div class="main fly-home-main">
  <div class="layui-inline fly-home-jie">
    <div class="fly-panel">
      <h3 class="fly-panel-title"><%=l.getUserName() %> 最近的提问</h3>
      <ul class="jie-row">
        <li>
          <span class="fly-jing">精</span>
          <a href="/jie/{{item.id}}.html" class="jie-title">使用 layui 秒搭后台大布局（基本结构）</a>
          <i>1天前</i>
          <em>1136阅/27答</em>
        </li>
        <li>
          <a href="/jie/{{item.id}}.html" class="jie-title">使用 layui 秒搭后台大布局（基本结构）</a>
          <i>1天前</i>
          <em>1136阅/27答</em>
        </li>
        <li>
          <a href="/jie/{{item.id}}.html" class="jie-title">使用 layui 秒搭后台大布局（基本结构）</a>
          <i>1天前</i>
          <em>1136阅/27答</em>
        </li>
        <li>
          <a href="/jie/{{item.id}}.html" class="jie-title">使用 layui 秒搭后台大布局（基本结构）</a>
          <i>1天前</i>
          <em>1136阅/27答</em>
        </li>
        <li>
          <a href="/jie/{{item.id}}.html" class="jie-title">使用 layui 秒搭后台大布局（基本结构）</a>
          <i>1天前</i>
          <em>1136阅/27答</em>
        </li>
        <li>
          <a href="/jie/{{item.id}}.html" class="jie-title">使用 layui 秒搭后台大布局（基本结构）</a>
          <i>1天前</i>
          <em>1136阅/27答</em>
        </li>
        <li>
          <a href="/jie/{{item.id}}.html" class="jie-title">使用 layui 秒搭后台大布局（基本结构）</a>
          <i>1天前</i>
          <em>1136阅/27答</em>
        </li>
      </ul>
      <!-- <div class="fly-none" style="min-height: 50px; padding:30px 0; height:auto;"><i style="font-size:14px;">没有发表任何求解</i></div> -->
    </div>
  </div>
  
  <div class="layui-inline fly-home-da">
    <div class="fly-panel">
      <h3 class="fly-panel-title"><%=l.getUserName() %> 最近的回答</h3>
      <ul class="home-jieda">
        <li>
          <p>
          <span>1分钟前</span>
          在<a href="" target="_blank">tips能同时渲染多个吗?</a>中回答：
          </p>
          <div class="home-dacontent">
            尝试给layer.photos加上这个属性试试：
<pre>
full: true         
</pre>
            文档没有提及
          </div>
        </li>
        <li>
          <p>
          <span>5分钟前</span>
          在<a href="" target="_blank">在Fly社区用的是什么系统啊?</a>中回答：
          </p>
          <div class="home-dacontent">
            Fly社区采用的是NodeJS。分享出来的只是前端模版
          </div>
        </li>
      </ul>
      <!-- <div class="fly-none" style="min-height: 50px; padding:30px 0; height:auto;"><span>没有回答任何问题</span></div> -->
    </div>
  </div>

</div>
<div class="push" style="background-image:url('');width: 200;height: 300px;" >
	
	<!--<div class="fly-panel">--><!--<img src="../../res/images/laba.png "/>-->
	 <!-- <h4 class="push"   color:"#c00";><font size="5.5" face="仿宋"><img src="../../res/images/laba_副本.png" /> 灵感推荐</font></h4>-->
      <!--<ul class="push-row">-->
        <!--<li>
          <img src="../../res/images/pu.jpg " align="center"/>        
        </li>-->
        <!--<li>
           <a href="https://www.zcool.com.cn/work/ZMTgyMzMzNjg=.html"><font color="green">图片来源</font></a>                
        </li>-->
        <div id="div1" >
        	<p style="margin: 20px;"><font size="3" >访客</font></p>
        	<hr />
        	<table id="t1" style="margin: 30px;" align="center"  >
        		<tr >
        			<td width="100px" align="center"> <a href="https://www.zcool.com.cn/u/16714068">
       <img src="../../res/images/avatar/1.jpg "  style="width:70px; height:70px; border-radius:100%; overflow:hidden;"/></a> 
        				<br />
        				月亮
        				<br />
        				<p style="color: gray">刚刚</p>
        				   </td>
        	<td width="100px" align="center"> <a href="https://www.zcool.com.cn/u/16694207">
       <img src="../../res/images/avatar/0.jpg "  style="width:70px; height:70px; border-radius:100%; overflow:hidden;"/></a> 
        				<br />
        				江城
        				<br />
        				<p style="color: gray">77天前</p>
        				   </td>
        				   <td width="100px" align="center"> <a href="https://www.zcool.com.cn/u/18606829">
       <img src="../../res/images/avatar/6.jpg "  style="width:70px; height:70px; border-radius:100%; overflow:hidden;"/></a> 
        				<br />
        				星星
        				<br />
        				<p style="color: gray">165天前</p>
        				   </td>
        		</tr>
        	</table>
        	<!--  <img src="../../res/images/pu.jpg "  style="width:50px; height:50px; border-radius:100%; overflow:hidden;background-color: red;"/>   -->
        </div>
         <div id ="div2">
       
      <p  align="center"  color:"#c00"><font size="5.5" face="仿宋"><img src="../../res/images/laba_副本.png" />灵感推荐</font></p>
      <hr />
     <ul class="push-row">
      <li>
      	
          <img src="../../res/images/pu.jpg " align="center" height="200px"/>        
        </li>
        <li>
        	<br /><br /><p align="center"> <a href="https://www.zcool.com.cn/work/ZMTgyMzMzNjg=.html" ><font color="green" >图片来源</font></a>                </p>
          <!-- <a href="https://www.zcool.com.cn/work/ZMTgyMzMzNjg=.html" ><font color="green" >图片来源</font></a>                -->
        </li>
      </ul></div>
<!--</div>-->
</div>
<div class="footer">
  <p><a href="http://fly.layui.com/">Fly社区</a> 2017 &copy; <a href="http://www.layui.com/">layui.com</a></p>
  <p>
    <a href="http://fly.layui.com/auth/get" target="_blank">产品授权</a>
    <a href="http://fly.layui.com/jie/8157.html" target="_blank">获取Fly社区模版</a>
    <a href="http://fly.layui.com/jie/2461.html" target="_blank">微信公众号</a>
  </p>
</div>


<script src="../../res/layui/layui.js"></script>
<script>
layui.cache.page = 'user';
layui.cache.user = {
  username: '游客'
  ,uid: -1
  ,avatar: '../../res/images/avatar/00.jpg'
  ,experience: 83
  ,sex: '男'
};
layui.config({
  version: "2.0.0"
  ,base: '../../res/mods/'
}).extend({
  fly: 'index'
}).use('fly');


</script>
</body>
</html>