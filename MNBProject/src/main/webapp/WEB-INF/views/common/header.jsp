<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<style>
	body {margin:0;padding:0;  text-decoration:none; font-family:"NanumSquare","NanumMyeongjo","malgun","나눔고딕", "NanumGothic", "돋움", "Dotum", "굴림", "Gulim", "Sans-serif","Roboto"; font-size:13px; letter-spacing:-1px; background:#fff;line-height:160%}
	html{ }
	img{border:0; vertical-align:middle;}
	ul{list-style:none;}
	li{list-style:none;}
	a {text-decoration:none;color:#000;cursor:pointer;}
	a:link, a:visited {text-decoration:none;color:#000;}
	a:hover, a:focus, a:active{background:none;text-decoration:none;}
	.both {height: 0;
	    clear: both;
	    visibility: hidden;
	    margin: 0px;
	    padding: 0px;}
	
	
	/*#header {width:100%;background:url('../images/main/header_bak_img.png') no-repeat;min-height:908px;} */
	.header_btn_wrap {background-color:#535353;}
	.header_btn {width:1200px;margin:0 auto;padding:8px 0;}
	.header_btn ul {min-height:25px;float:right;}
	.header_btn ul li {float:left; color:#fff; margin-right:25px;}
	.header_btn ul li:last-child {float:left; color:#fff; margin-right:0px;}
	.header_btn ul li a {color:#fff}
	
	.header_nav {width:100%;background-color:#fff;box-shadow:5px 5px 5px rgba(46,46,46,0.3);min-height:150px;}
	.header_nav_wrap {width:1400px;margin:0 auto;padding:25px 0;}
	.header_nav_wrap img {float:left;}
	.header_nav_wrap ul {padding:38px 0 0 760px;}
	.header_nav_wrap ul li {float:left; font-size:20px; font-weight:bold;margin-right:68px;}
	.header_nav_wrap ul li:last-child {float:left; font-size:20px; font-weight:bold;margin-right:0px;}
</style>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

  <div id = "header">
	<div class="header_btn_wrap">
		<div class="header_btn">
			<ul>
				<li><A href="#">HOME</a></li>
				<li><A href="#">LOGIN</a></li>
				<li><A href="#">JOIN</a></li>
				<li><A href="#">베이비시터등록</a></li>
			</ul>
		</div>
		<div class="both"></div>
	</div>
	
	<div class="header_nav">
		<div class="header_nav_wrap">
			<img src="<%=request.getContextPath()%>/images/main/logo.png">
			<ul>
				<li><A href="#">Mom And Babe</a></li>
				<li><A href="#">베이비시터</a></li>
				<li><A href="#">커뮤니티</a></li>
			</ul>
		</div>
	</div>
  </div>

</body>
</html>