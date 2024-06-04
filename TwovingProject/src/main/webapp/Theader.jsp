<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="css/Theader.css">
<link rel="stylesheet" href="css/Tmain.css">
<link rel="stylesheet" href="css/Tfooter.css">
<link rel="stylesheet" href="css/Tdetail.css">
<link rel="stylesheet" href="css/kind.css">
<link rel="stylesheet" href="css/genre.css">
<link rel = "stylesheet" type =  "text/css" href = "css/header_footer.css"/>
<link rel = "stylesheet" type =  "text/css" href = "css/section.css"/>
<script src="script/jquery-3.7.1.min.js"></script>
<script src="script/faqForm.js"></script>
<script src="script/jqueryAction.js"></script>
<script src="script/customerinquiry.js"></script>
<script src="script/cosmenuWrapper.js"></script>
<script src="script/slideToggleFuc.js"></script>
<script src="script/mypage.js"></script>
<script src="script/Tmain.js"></script>

<script type="text/JavaScript">
$(function(){
	$('.mypage').click(function(){
                $('.profileclick').slideToggle(300);
				$(this).toggleClass('active');
			});
         });  
</script>
</head>
<body>
<div id="full">
	<header style="margin-bottom: 10px;">
		<nav id="rightlink">
			<div id="logo">			
				<a href="twoving.do?command=tMain">TWOVING</a>
			</div>&nbsp;&nbsp;&nbsp;&nbsp;
			<div id ="Category">
				<a href="twoving.do?command=kind&kind=0" >시리즈</a>&nbsp;&nbsp;&nbsp;&nbsp;
				<a href="twoving.do?command=kind&kind=1" >영화</a>	
			</div>
		</nav>
		<nav id ="search">							
			<form method="post" name="form">							
			<div id = "dbg">
				<div id="input"><input type="text" placeholder="검색"  name="key" value="${key}"></div>
				<div><a href="#" onClick="go_search('searchList')"><img src="images/dbg.png" width="50" height="50" ></a></div>							
			</div>
			</form>	
			 &nbsp;&nbsp;&nbsp;&nbsp;
			<div class="mypage"><a href="#"><img src="images/iconm.png"></a>
				<div class="profileclick" >
						<br><br>
						<div><a href="">My페이지</a></div>
						<br>
						<div><a href="">고객센터</a></div>
						<br>
						<div><a href="">로그아웃</a></div>
				</div>
			</div>		
		</nav>	
	</header>
	