<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<div class = "sub_img">
	<img src = "images/member/sub_img.jpg">
</div>

<div class = "sub_page">

	<nav class = "sub_menu">
		<c:choose>
			<c:when test="${empty loginUser}">
				<div><a href="">LOGIN</a></div>
				<div><a href="">JOIN</a></div>
				<div><a href="" onClick="">FIND ID/PW</a></div>
			</c:when>
			<c:otherwise>
				<div><a href="">update MEMBER</a></div>
				<div><a href="">LOGOUT</a></div>
			</c:otherwise>
		</c:choose>
	</nav>

