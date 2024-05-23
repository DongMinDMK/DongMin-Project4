<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<div class = "sub_img">
	<img src="images/mypage/sub_img.jpg">
</div>

<div class = "sub_page">
	<nav class = "sub_menu">
		<div><a href="shop.do?command=cartList">cart</a></div>
		<div><a href="shop.do?command=mypage">진행중인 주문</a></div>
		<div><a href="shop.do?command=orderAll">총 주문</a></div>
		<div><a href="shop.do?command=updateMemberForm">정보수정</a></div>
		<div><a href="#" onClick="">회원탈퇴</a></div>
	
	</nav>
