<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>boardUpdateForm.jsp</title>
<link rel = "stylesheet" type = "text/css" href = "css/board.css"/>
<script src = "script/board.js"></script>
</head>
<body>
	<div id = "main_container">
		<h2>게시물 수정</h2>
		<div class = "board">
			<form name = "insertBoard" method = "post" action = "board.do" class = "insertBoard" enctype = "multipart/form-data">
				<input type = "hidden" name = "command" value = "updateBoard">
				<input type = "hidden" name = "num" value = "${board.num}">
				<div class = "field">
					<label>작성자</label>
					<input type = "text" name = "userid" value = "${board.userid}" readonly/>
				</div>
				<div class = "field">
					<label>비밀번호</label>
					<input style = "flex:2;" type = "password" name = "pass"/>
					<div style = "flex:2; margin-left: 20px;">게시물 작성시 입력한 비밀번호</div>
				</div>
				<div class = "field">
					<label>이메일</label>
					<input type = "text" name = "email" value = "${board.email}"/>
				</div>
				<div class = "field">
					<label>제목</label>
					<input type = "text" name = "title" value = "${board.title}"/>
				</div>
				<div class = "field">
					<label>내용</label>
					<textarea name = "content" rows="10" cols="110">${board.content}</textarea>
				</div>
				<div class = "field">
					<label>이미지</label>
					<input type = "file" name = "image"/>
				</div>
				<div class = "field">
					<label>기존이미지</label>
					<c:choose>
						<c:when test="${empty board.savefilename}">
							<img src = "images/noname.jpg" width = "90" style = "text-align:right;">
						</c:when>
						<c:otherwise>
							<img src = "images/${board.savefilename}" width = "90" style = "text-align:right;">
						</c:otherwise>
					</c:choose>
					<input type = "hidden" name = "oldimage" value="${board.image}">
					<input type = "hidden" name = "oldsavefilename" value = "${board.savefilename}">
				</div>
				<div class = "login-button">
					<input type = "submit" class = "btn-login" value = "수정완료" onClick='return updateBoardCheck("${board.pass}")'>
					<input type = "button" class = "btn-login" value = "되돌아가기" onClick=''>
				</div>
			</form>
		</div>
	</div>
</body>
</html>