<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>insertBoardForm.jsp</title>
<link rel = "stylesheet" type = "text/css" href = "css/board.css"/>
<script src = "script/board.js"></script>
</head>
<body>
	<div id = "main_container">
		<h2>게시물 등록</h2>
		<div class = "board">
			<form name = "insertBoard" class = "insertBoard" class = "login-form" action = "board.do" method = "post" enctype = "multipart/form-data">
				<input type = "hidden" name = "command" value = "insertBoard">
				<div class = "field">
					<label>작성자</label>
					<input type = "text" name = "userid" value = "${loginUser.userid}" readonly>
				</div>
				<div class = "field">
					<label>비밀번호</label>
					<input style = "flex:2;" type = "password" name = "pass">
					<div style = "flex:2; margin-left:10px;">수정/삭제시에 필요합니다..</div>
				</div>
				<div class = "field">
					<label>이메일</label>
					<input type = "text" name = "email" value = "${loginUser.email}">
				</div>
				<div class = "field">
					<label>제목</label>
					<input type = "text" name = "title">
				</div>
				<div class = "field">
					<label>내용</label>
					<textarea name = "content" rows="10" cols="110"></textarea>	
				</div>
				
				<div class = "field">
					<label>이미지</label>
					<input type = "file" name = "image">
				</div>
				<div class = "field">
					<input type = "submit" value = "작성완료" onClick='return boardCheck()'>
				</div>
			</form>
		</div>	
	</div>
</body>
</html>