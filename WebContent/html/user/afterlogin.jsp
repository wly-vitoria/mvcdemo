<%@page import="com.neuedu.bean.Login" %>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<% Login l = (Login)session.getAttribute("Login"); %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>基于 layui 的极简社区页面模版</title>
	<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
	<meta name="keywords" content="fly,layui,前端社区">
	<meta name="description" content="Fly社区是模块化前端UI框架Layui的官网社区，致力于为web开发提供强劲动力">
	<link rel="stylesheet" href="../../res/layui/css/layui.css">
	<link rel="stylesheet" href="../../res/css/global.css">
	
	  <!--add-->
  <link type="text/css" rel="stylesheet" href="../../res/css/css.css">
  <script src="../../js/jquery-1.9.1.min.js"></script>
  <script src="../../js/index.js"></script>
  
</head>
<body>
<!--头部-->
<div class="header" ">
  <div class="main">
    <a class="logo" href="./afterlogin.jsp" title="Fly">Fly社区</a>
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
       
      <a class="avatar" href="../user/home.jsp">
        <img src="http://tp4.sinaimg.cn/1345566427/180/5730976522/0">
        <cite ><%=l.getUserName() %></cite>
        <i>VIP2</i>
      </a>
      <div class="nav">
        <a href="../user/set.jsp"><i class="iconfont icon-shezhi"></i>设置</a>
        <a href="../user/login.html"><i class="iconfont icon-tuichu" style="top: 0; font-size: 22px;"></i>退了</a>
      </div> 
      
    </div>
  </div>
</div>

<div class="all-lunvo">

      <!--<!--<!--轮播图-->
<div class="box" >
	<!-- 存放大图的容器-->
	<div class="all">
		<div class="top-img">
			<div class="activeimg">
				<img src="../../res/images/img/1.png">
				<img src="../../res/images/img/2_副本.png">
			</div>
			<div class="left"><img src="../../res/images/img/left.png"> </div>
			<div class="right"><img src="../../res/images/img/right.png"></div>
		</div>
		<!-- 存放缩略图的容器-->
		<div class="bot-img">
			<ul>
				<li class="active"><img src="../../res/images/img/1.png"> </li>
				<li><img src="../../res/images/img/2.png"> </li>

			</ul>
		</div>
	</div>
</div>

	<div class="wenxin">
		<div class="head_wenxin">
			<p id="zi">温馨通道</p>
			<p style="color: lightgray">  _____________________________________________________</p>
		</div>	
		
		
		<div class="table_set">
			<table id="table_all" style="text-align: center;"  height="120px" width="300px">
				<tr >
					<td><a href="...">组件平台</a></td>
					<td><a href="...">年度案例</a></td>
				</tr>
				<tr>
					<td><a href="...">精贴集锦</a></td>
					<td><a href="...">Git仓库</a></td>
				</tr>
				<tr>
					<td><a href="...">Layui模块</a></td>
					<td><a href="...">关于飞吻</a></td>
				</tr>
			</table>	
		</div>

	</div>

</div>

<div class="main layui-clear"   >
  <div class="wrap"  >
    <div class="content" >
      <div class="fly-tab fly-tab-index">
        <a href="" class="tab-this">全部</a>
          <a href="">未结帖</a>
          <a href="">已采纳</a>
          <a href="">精帖</a>
          <a href="../user/index.html">我的帖</a>
        </span>
        <form action="http://cn.bing.com/search" class="fly-search">
          <i class="iconfont icon-sousuo"></i>
          <input class="layui-input" autocomplete="off" placeholder="搜索内容，回车跳转" type="text" name="q">
        </form>
        <a href="../jie/add.jsp" class="layui-btn jie-add">发布问题</a>
      </div>

      
      <ul class="fly-list fly-list-top">
        <li class="fly-list-li">
          <a href="user/home.html" class="fly-list-avatar">
            <img src="http://tp4.sinaimg.cn/1345566427/180/5730976522/0" alt="">
          </a>
          <h2 class="fly-tip">
            <a href="jie/detail.html">基于 layui的轻量级问答社区页面模版 V2版本</a>
            <span class="fly-tip-stick">置顶</span>
            <span class="fly-tip-jing">精帖</span>
          </h2>
          <p>
            <span><a href="user/home.jsp"><%=l.getUserName() %></a></span>
            <span>刚刚</span>
            <span>layui框架综合</span>
            <span class="fly-list-hint"> 
              <i class="iconfont" title="回答">&#xe60c;</i> 317
              <i class="iconfont" title="人气">&#xe60b;</i> 6830
            </span>
          </p>
        </li>
        <li class="fly-list-li">
          <a href="user/home.html" class="fly-list-avatar">
            <img src="../res/images/avatar/00.jpg" alt="">
          </a>
          <h2 class="fly-tip">
            <a href="jie/detail.html">基于 layui的轻量级问答社区页面模版 V2版本</a>
            <span class="fly-tip-stick">置顶</span>
          </h2>
          <p>
            <span><a href="user/home.html">纸飞机</a></span>
            <span>30分钟前</span>
            <span>技术闲谈</span>
            <span class="fly-list-hint"> 
              <i class="iconfont" title="回答">&#xe60c;</i> 502
              <i class="iconfont" title="人气">&#xe60b;</i> 81689
            </span>
          </p>
        </li>
      </ul>
      
      <ul class="fly-list">
        <li class="fly-list-li">
          <a href="user/home.html" class="fly-list-avatar">
            <img src="../res/images/avatar/default.png" alt="">
          </a>
          <h2 class="fly-tip">
            <a href="jie/detail.html">关于layui 引用其他插件，扩展模块 的用法</a>
          </h2>
          <p>
            <span><a href="user/home.html">用户昵称</a></span>
            <span>1小时前</span>
            <span>layui框架综合</span>
            <span class="fly-list-hint"> 
              <i class="iconfont" title="回答">&#xe60c;</i> 8
              <i class="iconfont" title="人气">&#xe60b;</i> 106
            </span>
          </p>
        </li>
        <li class="fly-list-li">
          <a href="user/home.html" class="fly-list-avatar">
            <img src="../res/images/avatar/default.png" alt="">
          </a>
          <h2 class="fly-tip">
            <a href="jie/detail.html">关于layui 引用其他插件，扩展模块 的用法</a>
          </h2>
          <p>
            <span><a href="user/home.html">用户昵称</a></span>
            <span>1小时前</span>
            <span>layui框架综合</span>
            <span class="fly-list-hint"> 
              <i class="iconfont" title="回答">&#xe60c;</i> 8
              <i class="iconfont" title="人气">&#xe60b;</i> 106
            </span>
          </p>
        </li>
        <li class="fly-list-li">
          <a href="user/home.html" class="fly-list-avatar">
            <img src="../res/images/avatar/default.png" alt="">
          </a>
          <h2 class="fly-tip">
            <a href="jie/detail.html">关于layui 引用其他插件，扩展模块 的用法</a>
          </h2>
          <p>
            <span><a href="user/home.html">用户昵称</a></span>
            <span>1小时前</span>
            <span>layui框架综合</span>
            <span class="fly-list-hint"> 
              <i class="iconfont" title="回答">&#xe60c;</i> 8
              <i class="iconfont" title="人气">&#xe60b;</i> 106
            </span>
          </p>
        </li>
        <li class="fly-list-li">
          <a href="user/home.html" class="fly-list-avatar">
            <img src="../res/images/avatar/default.png" alt="">
          </a>
          <h2 class="fly-tip">
            <a href="jie/detail.html">关于layui 引用其他插件，扩展模块 的用法</a>
          </h2>
          <p>
            <span><a href="user/home.html">用户昵称</a></span>
            <span>1小时前</span>
            <span>layui框架综合</span>
            <span class="fly-list-hint"> 
              <i class="iconfont" title="回答">&#xe60c;</i> 8
              <i class="iconfont" title="人气">&#xe60b;</i> 106
            </span>
          </p>
        </li>
        <li class="fly-list-li">
          <a href="user/home.html" class="fly-list-avatar">
            <img src="../res/images/avatar/default.png" alt="">
          </a>
          <h2 class="fly-tip">
            <a href="jie/detail.html">关于layui 引用其他插件，扩展模块 的用法</a>
          </h2>
          <p>
            <span><a href="user/home.html">用户昵称</a></span>
            <span>1小时前</span>
            <span>layui框架综合</span>
            <span class="fly-list-hint"> 
              <i class="iconfont" title="回答">&#xe60c;</i> 8
              <i class="iconfont" title="人气">&#xe60b;</i> 106
            </span>
          </p>
        </li>
        <li class="fly-list-li">
          <a href="user/home.html" class="fly-list-avatar">
            <img src="../res/images/avatar/default.png" alt="">
          </a>
          <h2 class="fly-tip">
            <a href="jie/detail.html">关于layui 引用其他插件，扩展模块 的用法</a>
          </h2>
          <p>
            <span><a href="user/home.html">用户昵称</a></span>
            <span>1小时前</span>
            <span>layui框架综合</span>
            <span class="fly-list-hint"> 
              <i class="iconfont" title="回答">&#xe60c;</i> 8
              <i class="iconfont" title="人气">&#xe60b;</i> 106
            </span>
          </p>
        </li>
        <li class="fly-list-li">
          <a href="user/home.html" class="fly-list-avatar">
            <img src="../res/images/avatar/default.png" alt="">
          </a>
          <h2 class="fly-tip">
            <a href="jie/detail.html">关于layui 引用其他插件，扩展模块 的用法</a>
          </h2>
          <p>
            <span><a href="user/home.html">用户昵称</a></span>
            <span>1小时前</span>
            <span>layui框架综合</span>
            <span class="fly-list-hint"> 
              <i class="iconfont" title="回答">&#xe60c;</i> 8
              <i class="iconfont" title="人气">&#xe60b;</i> 106
            </span>
          </p>
        </li>
        <li class="fly-list-li">
          <a href="user/home.html" class="fly-list-avatar">
            <img src="../res/images/avatar/default.png" alt="">
          </a>
          <h2 class="fly-tip">
            <a href="jie/detail.html">关于layui 引用其他插件，扩展模块 的用法</a>
          </h2>
          <p>
            <span><a href="user/home.html">用户昵称</a></span>
            <span>1小时前</span>
            <span>layui框架综合</span>
            <span class="fly-list-hint"> 
              <i class="iconfont" title="回答">&#xe60c;</i> 8
              <i class="iconfont" title="人气">&#xe60b;</i> 106
            </span>
          </p>
        </li>
        <li class="fly-list-li">
          <a href="user/home.html" class="fly-list-avatar">
            <img src="../res/images/avatar/default.png" alt="">
          </a>
          <h2 class="fly-tip">
            <a href="jie/detail.html">关于layui 引用其他插件，扩展模块 的用法</a>
          </h2>
          <p>
            <span><a href="user/home.html">用户昵称</a></span>
            <span>1小时前</span>
            <span>layui框架综合</span>
            <span class="fly-list-hint"> 
              <i class="iconfont" title="回答">&#xe60c;</i> 8
              <i class="iconfont" title="人气">&#xe60b;</i> 106
            </span>
          </p>
        </li>
        <li class="fly-list-li">
          <a href="user/home.html" class="fly-list-avatar">
            <img src="../res/images/avatar/default.png" alt="">
          </a>
          <h2 class="fly-tip">
            <a href="jie/detail.html">关于layui 引用其他插件，扩展模块 的用法</a>
          </h2>
          <p>
            <span><a href="user/home.html">用户昵称</a></span>
            <span>1小时前</span>
            <span>layui框架综合</span>
            <span class="fly-list-hint"> 
              <i class="iconfont" title="回答">&#xe60c;</i> 8
              <i class="iconfont" title="人气">&#xe60b;</i> 106
            </span>
          </p>
        </li>
        <li class="fly-list-li">
          <a href="user/home.html" class="fly-list-avatar">
            <img src="../res/images/avatar/default.png" alt="">
          </a>
          <h2 class="fly-tip">
            <a href="jie/detail.html">关于layui 引用其他插件，扩展模块 的用法</a>
          </h2>
          <p>
            <span><a href="user/home.html">用户昵称</a></span>
            <span>1小时前</span>
            <span>layui框架综合</span>
            <span class="fly-list-hint"> 
              <i class="iconfont" title="回答">&#xe60c;</i> 8
              <i class="iconfont" title="人气">&#xe60b;</i> 106
            </span>
          </p>
        </li>
        <li class="fly-list-li">
          <a href="user/home.html" class="fly-list-avatar">
            <img src="../res/images/avatar/default.png" alt="">
          </a>
          <h2 class="fly-tip">
            <a href="jie/detail.html">关于layui 引用其他插件，扩展模块 的用法</a>
          </h2>
          <p>
            <span><a href="user/home.html">用户昵称</a></span>
            <span>1小时前</span>
            <span>layui框架综合</span>
            <span class="fly-list-hint"> 
              <i class="iconfont" title="回答">&#xe60c;</i> 8
              <i class="iconfont" title="人气">&#xe60b;</i> 106
            </span>
          </p>
        </li>
        <li class="fly-list-li">
          <a href="user/home.html" class="fly-list-avatar">
            <img src="../res/images/avatar/default.png" alt="">
          </a>
          <h2 class="fly-tip">
            <a href="jie/detail.html">关于layui 引用其他插件，扩展模块 的用法</a>
          </h2>
          <p>
            <span><a href="user/home.html">用户昵称</a></span>
            <span>1小时前</span>
            <span>layui框架综合</span>
            <span class="fly-list-hint"> 
              <i class="iconfont" title="回答">&#xe60c;</i> 8
              <i class="iconfont" title="人气">&#xe60b;</i> 106
            </span>
          </p>
        </li>
        <li class="fly-list-li">
          <a href="user/home.html" class="fly-list-avatar">
            <img src="../res/images/avatar/default.png" alt="">
          </a>
          <h2 class="fly-tip">
            <a href="jie/detail.html">关于layui 引用其他插件，扩展模块 的用法</a>
          </h2>
          <p>
            <span><a href="user/home.html">用户昵称</a></span>
            <span>1小时前</span>
            <span>layui框架综合</span>
            <span class="fly-list-hint"> 
              <i class="iconfont" title="回答">&#xe60c;</i> 8
              <i class="iconfont" title="人气">&#xe60b;</i> 106
            </span>
          </p>
        </li>
        <li class="fly-list-li">
          <a href="user/home.html" class="fly-list-avatar">
            <img src="../res/images/avatar/default.png" alt="">
          </a>
          <h2 class="fly-tip">
            <a href="jie/detail.html">关于layui 引用其他插件，扩展模块 的用法</a>
          </h2>
          <p>
            <span><a href="user/home.html">用户昵称</a></span>
            <span>1小时前</span>
            <span>layui框架综合</span>
            <span class="fly-list-hint"> 
              <i class="iconfont" title="回答">&#xe60c;</i> 8
              <i class="iconfont" title="人气">&#xe60b;</i> 106
            </span>
          </p>
        </li>
      </ul>
      
      <div style="text-align: center">
        <div class="laypage-main">
          <a href="jie/index.html" class="laypage-next">更多求解</a>
        </div>
      </div>
      
    </div>
  </div>
  
  <div class="edge">
    <div class="fly-panel leifeng-rank"> 
      <h3 class="fly-panel-title">近一月回答榜 - TOP 12</h3>
      <dl>
        <dd>
          <a href="user/home.html">
            <img src="../res/images/avatar/default.png">
            <cite>纸飞机</cite>
            <i>159次回答</i>
          </a>
        </dd>
        <dd>
          <a href="user/home.html">
            <img src="../res/images/avatar/default.png">
            <cite>纸飞机</cite>
            <i>159次回答</i>
          </a>
        </dd>
        <dd>
          <a href="user/home.html">
            <img src="../res/images/avatar/default.png">
            <cite>纸飞机</cite>
            <i>159次回答</i>
          </a>
        </dd>
        <dd>
          <a href="user/home.html">
            <img src="../res/images/avatar/default.png">
            <cite>纸飞机</cite>
            <i>159次回答</i>
          </a>
        </dd>
        <dd>
          <a href="user/home.html">
            <img src="../res/images/avatar/default.png">
            <cite>纸飞机</cite>
            <i>159次回答</i>
          </a>
        </dd>
        <dd>
          <a href="user/home.html">
            <img src="../res/images/avatar/default.png">
            <cite>纸飞机</cite>
            <i>159次回答</i>
          </a>
        </dd>
        <dd>
          <a href="user/home.html">
            <img src="../res/images/avatar/default.png">
            <cite>纸飞机</cite>
            <i>159次回答</i>
          </a>
        </dd>
        <dd>
          <a href="user/home.html">
            <img src="../res/images/avatar/default.png">
            <cite>纸飞机</cite>
            <i>159次回答</i>
          </a>
        </dd>
        <dd>
          <a href="user/home.html">
            <img src="../res/images/avatar/default.png">
            <cite>纸飞机</cite>
            <i>159次回答</i>
          </a>
        </dd>
        <dd>
          <a href="user/home.html">
            <img src="../res/images/avatar/default.png">
            <cite>纸飞机</cite>
            <i>159次回答</i>
          </a>
        </dd>
        <dd>
          <a href="user/home.html">
            <img src="../res/images/avatar/default.png">
            <cite>纸飞机</cite>
            <i>159次回答</i>
          </a>
        </dd>
        <dd>
          <a href="user/home.html">
            <img src="../res/images/avatar/default.png">
            <cite>纸飞机</cite>
            <i>159次回答</i>
          </a>
        </dd>
      </dl>
    </div>
    
    <dl class="fly-panel fly-list-one"> 
      <dt class="fly-panel-title">最近热帖</dt>
      <dd>
        <a href="jie/detail.html">使用 layui 秒搭后台大布局（基本结构）</a>
        <span><i class="iconfont">&#xe60b;</i> 6087</span>
      </dd>
      <dd>
        <a href="jie/detail.html">Java实现LayIM后端的核心代码</a>
        <span><i class="iconfont">&#xe60b;</i> 767</span>
      </dd>
      <dd>
        <a href="jie/detail.html">使用 layui 秒搭后台大布局（基本结构）</a>
        <span><i class="iconfont">&#xe60b;</i> 6087</span>
      </dd>
      <dd>
        <a href="jie/detail.html">Java实现LayIM后端的核心代码</a>
        <span><i class="iconfont">&#xe60b;</i> 767</span>
      </dd>
      <dd>
        <a href="jie/detail.html">使用 layui 秒搭后台大布局（基本结构）</a>
        <span><i class="iconfont">&#xe60b;</i> 6087</span>
      </dd>
      <dd>
        <a href="jie/detail.html">Java实现LayIM后端的核心代码</a>
        <span><i class="iconfont">&#xe60b;</i> 767</span>
      </dd>
      <dd>
        <a href="jie/detail.html">使用 layui 秒搭后台大布局（基本结构）</a>
        <span><i class="iconfont">&#xe60b;</i> 6087</span>
      </dd>
      <dd>
        <a href="jie/detail.html">Java实现LayIM后端的核心代码</a>
        <span><i class="iconfont">&#xe60b;</i> 767</span>
      </dd>
    </dl>
    
    <dl class="fly-panel fly-list-one"> 
      <dt class="fly-panel-title">近期热议</dt>
      <dd>
        <a href="jie/detail.html">使用 layui 秒搭后台大布局之基本结构</a>
        <span><i class="iconfont">&#xe60c;</i> 96</span>
      </dd>
      <dd>
        <a href="jie/detail.html">使用 layui 秒搭后台大布局之基本结构</a>
        <span><i class="iconfont">&#xe60c;</i> 96</span>
      </dd>
      <dd>
        <a href="jie/detail.html">使用 layui 秒搭后台大布局之基本结构</a>
        <span><i class="iconfont">&#xe60c;</i> 96</span>
      </dd>
      <dd>
        <a href="jie/detail.html">使用 layui 秒搭后台大布局之基本结构</a>
        <span><i class="iconfont">&#xe60c;</i> 96</span>
      </dd>
      <dd>
        <a href="jie/detail.html">使用 layui 秒搭后台大布局之基本结构</a>
        <span><i class="iconfont">&#xe60c;</i> 96</span>
      </dd>
      <dd>
        <a href="jie/detail.html">使用 layui 秒搭后台大布局之基本结构</a>
        <span><i class="iconfont">&#xe60c;</i> 96</span>
      </dd>
      <dd>
        <a href="jie/detail.html">使用 layui 秒搭后台大布局之基本结构</a>
        <span><i class="iconfont">&#xe60c;</i> 96</span>
      </dd>
      <dd>
        <a href="jie/detail.html">使用 layui 秒搭后台大布局之基本结构</a>
        <span><i class="iconfont">&#xe60c;</i> 96</span>
      </dd>
    </dl>
    
    <div class="fly-panel fly-link"> 
      <h3 class="fly-panel-title">友情链接</h3>
      <dl>
        <dd>
          <a href="http://www.layui.com/" target="_blank">layui</a>
        </dd>
        <dd>
          <a href="http://layim.layui.com/" target="_blank">LayIM</a>
        </dd>
        <dd>
          <a href="http://layer.layui.com/" target="_blank">layer</a>
        </dd>
      </dl>
    </div>


  </div>
</div>

<div class="footer">
  <p><a href="http://fly.layui.com/">Fly社区</a> 2017 &copy; <a href="http://www.layui.com/">layui.com</a></p>
  <p>
    <a href="http://fly.layui.com/auth/get" target="_blank">产品授权</a>
    <a href="http://fly.layui.com/jie/8157.html" target="_blank">获取Fly社区模版</a>
    <a href="http://fly.layui.com/jie/2461.html" target="_blank">微信公众号</a>
  </p>
</div>
<script src="../res/layui/layui.js"></script>
<script>
layui.cache.page = '';
layui.cache.user = {
  username: '游客'
  ,uid: -1
  ,avatar: '../res/images/avatar/00.jpg'
  ,experience: 83
  ,sex: '男'
};
layui.config({
  version: "2.0.0"
  ,base: '../res/mods/'
}).extend({
  fly: 'index'
}).use('fly');
</script>
</body>
</html>