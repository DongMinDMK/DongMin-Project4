<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>updateForm.jsp</title>
</head>
<body>
	<h2>회원정보 수정</h2>
	<form method = "post" action = "update.do">
		<table>
			<tr><th>아이디 : </th><td>${member.id}<input type = "hidden" name = "id" value = "${member.id}"></td></tr>
			<tr><th>비밀번호 : </th><td><input type = "password" name = "pwd"></td></tr>
			<tr><th>이름 : </th><td><input type = "text" name = "name" value = "${member.name}"></td></tr>
			<tr><th>전화번호 : </th><td><input type = "text" name = "phone" value = "${member.phone}"></td></tr>
			<tr>
				<td colspan = "2">
					<input type = "submit" value = "수정">
					<input type = "reset" value = "취소">
					<input type = "button" value = "돌아가기" onClick = "location.href='start.do'">
				</td>
			</tr>
		</table>
	</form>
</body>
</html>