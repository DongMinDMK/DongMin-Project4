<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import = "java.net.URLDecoder" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ActionUser.jsp</title>
</head>
<body>
	<%
		// String name = URLDecoder.decode(request.getParameter("name"), "UTF-8");
		// String name = (String)request.getAttribute("name");
		String name = URLDecoder.decode(request.getParameter("name"), "UTF-8");
	%>
	
	<h2><%= name %> 님(아이디:<%= request.getParameter("userid") %>) 로그인이 성공적으로 완료되셨습니다. </h2>
</body>
</html>