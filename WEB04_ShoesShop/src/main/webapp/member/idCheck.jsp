<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<script src = "script/member.js"></script>

<title>아이디 중복확인</title>
	<form action = "shop.do?command=idCheck" style = "margin:20px 0;" method = "post" name = "idCheck">
			User ID(아이디) : <input type = "text" name = "userid" value="${userid}">
			<input type = "submit" value = "검색">
	</form>
	
	
	<!-- 사용 가능/불가능 -->
	<div>
		<c:if test="${result==1}">
			<script>
				opener.document.joinForm.userid.value = '';
				opener.document.joinForm.reid.value = '';
			</script>
			${userid} 의 아이디는 이미 중복된 아이디입니다.
		</c:if>
		<c:if test="${result==-1}">
			${userid} 는 사용이 가능한 아이디입니다.
			<input type = "button" value = "사용" onClick = "isOk('${userid}')">
		</c:if>
	</div>