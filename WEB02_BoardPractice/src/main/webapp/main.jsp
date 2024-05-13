<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<c:if test = "${empty loginUser}">
	<jsp:forward page="board.do?command=loginForm"></jsp:forward>
</c:if>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>main.jsp</title>
<link rel = "stylesheet" type = "text/css" href = "css/board.css"/>
<script src = "script/board.js"></script>
</head>
<body>
	<div id = "main_container">
		<h2>게시글 리스트</h2>
		<div class = "loginInfo">
			<div class = "login">
				${loginUser.name}(${loginUser.userid})님이 로그인하셨습니다.
				<input type = "button" value = "회원정보수정" onClick="location.href='board.do?comand=updateMemberForm'">
				<input type = "button" value = "로그아웃" onClick="location.href='board.do?command=logout'">
				<input type = "button" value = "회원탈퇴" onClick="location.href='withDraw();'">
			</div>
			<div class = "writeButton">
				<input type = "button" value = "게시글 등록" onClick="location.href='board.do?command=insertBoardForm'">
			</div>
		</div>
		<div class = "board">
			<div class = "title_row">
				<div class = "title_col">번호</div>
				<div class = "title_col">제목</div>
				<div class = "title_col">작성자</div>
				<div class = "title_col">작성일</div>
				<div class = "title_col">조회수</div>
			</div>
			<c:forEach items="${boardList}" var = "board">
				<div class = "row">
					<div class = "col">${board.num}</div>
					<div class = "col">${board.title}</div>
					<div class = "col">${board.userid}</div>
					<div class = "col"><fmt:formatDate value="${board.writedate}"/></div>
					<div class = "col">${board.readcount}</div>
				</div>
			</c:forEach>
		</div>
	</div>
</body>
</html>