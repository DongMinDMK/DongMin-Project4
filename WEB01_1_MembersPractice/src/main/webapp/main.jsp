<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>main.jsp</title>
<script>
	function deleteConfirm(userid){
		var res = window.confirm("정말로 삭제할까요?");
		
		if(res){
			location.href = "delete.do?id=" + userid;
			window.alert("삭제가 성공적으로 완료되었습니다.");
		}else{
			window.alert("삭제가 취소버튼을 누르셨으므로 취소됩니다.");
			return;
		}
	}

</script>
</head>
<body>
	<table width = "800" bgcolor = "black" cellspacing = "2">
		<tr bgcolor = "white"><th>아이디</th><th>비밀번호</th><th>이름</th><th>전화번호</th><th>수정</th><th>삭제</th></tr>
		<c:forEach items = "${memberList}" var = "member">
			<tr bgcolor = "white" align = "center">
				<td>${member.id}</td>
				<td>${member.pwd}</td>
				<td>${member.name}</td>
				<td>${member.phone}</td>
				<td><input type = "button" value = "수정" onClick="location.href='update.do?id=${member.id}'"></td>
				<td><input type = "button" value = "삭제" onClick="deleteConfirm('${member.id}')"></td>
			</tr>
		</c:forEach>
	</table>
	<input type = "button" value = "멤버추가" onClick='location.href="insert.do"'/>
</body>
</html>