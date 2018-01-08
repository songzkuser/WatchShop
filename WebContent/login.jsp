<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>登录</title>
<link href="<%=request.getContextPath()%>/static/css/bootstrap.css" rel="stylesheet" type="text/css" media="all" />
<!--jQuery (necessary for Bootstrap's JavaScript plugins)-->
<script src="<%=request.getContextPath()%>/static/js/jquery-1.11.0.min.js"></script>
<!--Custom-Theme-files-->
<!--theme-style-->
<link href="<%=request.getContextPath()%>/static/css/style.css" rel="stylesheet" type="text/css" media="all" />	
<!--//theme-style-->
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords" content="Luxury Watches Responsive web template, Bootstrap Web Templates, Flat Web Templates, Andriod Compatible web template, 
Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyErricsson, Motorola web design" />
<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
<!--start-menu-->
<script src="<%=request.getContextPath()%>/static/js/simpleCart.min.js"> </script>
<link href="<%=request.getContextPath()%>/static/css/memenu.css" rel="stylesheet" type="text/css" media="all" />
<script type="text/javascript" src="<%=request.getContextPath()%>/static/js/memenu.js"></script>
<script>$(document).ready(function(){$(".memenu").memenu();});</script>	
<!--dropdown-->
<script src="<%=request.getContextPath()%>/static/js/jquery.easydropdown.js"></script>		
</head>
<body>
	<!--top-header-->
	<div class="top-header">
		<div class="container">
			<div class="top-header-main">
				<div class="col-md-6 top-header-left">
					<div class="drop">
						<div class="clearfix"></div>
					</div>
				</div>
				<div class="col-md-6 top-header-left">
					<div class="cart box_1">
						<a href="<%=request.getContextPath()%>/shopbag.jsp">
							<div class="total">
								<span>$ <%=request.getAttribute("money") %></span>
							</div>
								<img src="<%=request.getContextPath()%>/images/cart-1.png" alt="" />
						</a>
						<p><a href="javascript:;" class="simpleCart_empty">购物车</a></p>
						<div class="clearfix"> </div>
					</div>
				</div>
				<div class="clearfix"></div>
			</div>
		</div>
	</div>
	<!--top-header-->
	<!--start-logo-->
	<div class="logo">
		<a href="index.html"><h1>精品腕表</h1></a>
	</div>
	<!--start-logo-->
	<!--bottom-header-->
	<div class="header-bottom">
		<div class="container">
			<div class="header">
				<div class="col-md-9 header-left">
				<div class="top-nav">
					<ul class="memenu skyblue"><li class="active"><a href="<%=request.getContextPath()%>/watch/list">主页</a></li>
						<li class="grid"><a href="<%=request.getContextPath()%>/watch/selectbytype?type=男">男士</a>
						</li>
						<li class="grid"><a href="<%=request.getContextPath()%>/watch/selectbytype?type=女">女士</a>
						</li>
						<li class="grid"><a href="<%=request.getContextPath()%>/watch/selectbytype?type=儿童">儿童</a>
						</li>
					</ul>
				</div>
				<div class="clearfix"> </div>
			</div>
			<div class="col-md-3 header-right"> 
				<div class="search-bar">
					<input type="text" value="Search" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'Search';}">
					<input type="submit" value="">
				</div>
			</div>
			<div class="clearfix"> </div>
			</div>
		</div>
	</div>
	<!--bottom-header-->
	<!--start-breadcrumbs-->
	<div class="breadcrumbs">
		<div class="container">
			<div class="breadcrumbs-main">
				<ol class="breadcrumb">
					<li><a href="index.html">主页</a></li>
					<li class="active">账户</li>
				</ol>
			</div>
		</div>
	</div>
	<!--end-breadcrumbs-->
	<!--account-starts-->
	<div class="account">
		<div class="container">
		<div class="account-top heading">
				<h2>账户登录</h2>
			</div>
			<div class="account-main">
				<div class="col-md-6 account-left">
					<h3>现有的用户</h3>
					
					<!-- 用户登录 -->
					<form action="<%=request.getContextPath()%>/user/login">
					<div class="account-bottom">
						<input placeholder="Username" name="userName" type="text" tabindex="3" required>
						<input placeholder="Password" name="password" type="password" tabindex="4" required>
						<div class="address">
							<a class="forgot" href="#">忘记密码了吗？</a>
							<input type="submit" value="登录">
						</div>
					</div>
					</form>
				</div>
				<div class="col-md-6 account-right account-left">
					<h3>新用户？创建一个帐户</h3>
					<p>通过创建一个帐户与我们的商店，你将能够通过结帐过程更快，存储多个送货地址，查看和跟踪您的订单在您的帐户和更多。</p>
					<a href="register.html">创建一个帐户</a>
				</div>
				<div class="clearfix"></div>
			</div>
		</div>
	</div>
	<!--account-end-->
	<!--information-starts-->
	<div class="information">
		<div class="container">
			<div class="infor-top">
				<div class="col-md-3 infor-left">
					<h3>Follow Us</h3>
					<ul>
						<li><a href="#"><span class="fb"></span><h6>Facebook</h6></a></li>
						<li><a href="#"><span class="twit"></span><h6>推特</h6></a></li>
						<li><a href="#"><span class="google"></span><h6>Google+</h6></a></li>
					</ul>
				</div>
				<div class="col-md-3 infor-left">
					<h3>问询处</h3>
					<ul>
						<li><a href="#"><p>特价</p></a></li>
						<li><a href="#"><p>新产品</p></a></li>
						<li><a href="#"><p>我们的商店</p></a></li>
						<li><a href="contact.html"><p>联系我们</p></a></li>
						<li><a href="#"><p>畅销</p></a></li>
					</ul>
				</div>
				<div class="col-md-3 infor-left">
					<h3>我的账户</h3>
					<ul>
						<li><a href="account.html"><p>我的帐户</p></a></li>
						<li><a href="#"><p>我的信用卡</p></a></li>
						<li><a href="#"><p>我的退货</p></a></li>
						<li><a href="#"><p>我的个人信息</p></a></li>
						<li><a href="#"><p>我的地址</p></a></li>
					</ul>
				</div>
				<div class="col-md-3 infor-left">
					<h3>商店信息</h3>
					<h4>公司名称,
						<span>Lorem ipsum dolor,</span>
						Glasglow Dr 40 Fe 72.</h4>
					<h5>+955 123 4567</h5>	
					<p><a href="mailto:example@email.com">contact@example.com</a></p>
				</div>
				<div class="clearfix"></div>
			</div>
		</div>
	</div>
	<!--information-end-->
	<!--footer-end-->
</body>
</html>