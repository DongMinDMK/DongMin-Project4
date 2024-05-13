<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>idCheck.jsp</title>
<link rel = "stylesheet" type = "text/css" href = "css/board.css"/>
<script src = "script/board.js"></script>
<script>
	function isOk(id){
		opener.document.join.userid.value = id;
		opener.document.join.reid.value = id;
		self.close();
	}
</script>
<style>
	body{
		display:flex;
		justify-contents : center;
		align-items: center;	
		height: 100vh;
		flex-direction: column;
	}

</style>
</head>
<body>
	<!-- 재검색창 -->
	<form action = "board.do">
		<input type = "hidden" name = "command" value = "idCheck">
		아이디 : <input type = "text" name = "userid" value="${userid}">
		<input type = "submit" value = "중복체크">
	</form>
	
	
	<!-- 사용 가능/불가능 -->
	<div>
		<c:choose>
			<c:when test="${result==1}">
				<script>
					opener.document.join.userid.value = '';
					opener.document.join.reid.value = '';
				</script>
				${userid} 의 아이디는 이미 중복된 아이디입니다.
			</c:when>
			<c:otherwise>
				${userid} 의 아이디는 사용이 가능합니다.
				<input type = "button" value = "사용" onClick = 'isOk("${userid}")'>
			</c:otherwise>
		</c:choose>
	</div>
</body>
</html>