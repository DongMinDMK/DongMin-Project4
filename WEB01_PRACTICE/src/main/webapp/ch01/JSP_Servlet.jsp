<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP_Servlet.jsp</title>
</head>
<body>
	<%
		String id = (String)request.getAttribute("id");	
		String pwd = (String)request.getAttribute("pwd");
		String gender = (String)request.getAttribute("gender");
		String content = (String)request.getAttribute("content");
		String[] item_list = (String[])request.getAttribute("items");
		String job = (String)request.getAttribute("job");
	%>
	
	<h2>
		아이디 : <%= id %> <br>
		비밀번호 : <%= pwd %><br>
		성별 : <%= gender %><br>
		하고싶은말 : <%= content %><br>
		구입하신 상품 : <%
		for(String item : item_list){
			out.print(item + " ");
		}
		%><br>
		직업 : <%= job %><br>
	</h2>
</body>
</html>