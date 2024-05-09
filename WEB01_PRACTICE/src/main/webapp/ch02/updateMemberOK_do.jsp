<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import ="java.sql.DriverManager" %>
<%@ page import ="java.sql.Connection" %>
<%@ page import ="java.sql.PreparedStatement" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>updateMemberOK_do.jsp</title>
<%
	Connection con = null;
	PreparedStatement pstmt = null;
	
	String driver = "com.mysql.cj.jdbc.Driver";
	String url = "jdbc:mysql://localhost:3306/scott";
	String id = "root";
	String pw = "adminuser";

	String sql = "update members set pwd = ?, name = ?, phone = ? where id = ?";
%>
</head>
<body>
<%
	try{
		Class.forName(driver);
		con = DriverManager.getConnection(url, id, pw);
		pstmt = con.prepareStatement(sql);
		
		pstmt.setString(1, request.getParameter("pwd"));
		pstmt.setString(2, request.getParameter("name"));
		pstmt.setString(3, request.getParameter("phone"));
		pstmt.setString(4, request.getParameter("id"));
		
		
		pstmt.executeUpdate();
		
		
%>

	<script>
		window.alert("성공적으로 수정이 완료되었습니다.");
		location.href = "MemberMGR.jsp";
	</script>
		
<%	
	}catch(Exception e){
		e.printStackTrace();
	}finally{
		try{
			if(con != null) con.close();
			if(pstmt != null) pstmt.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	
	
	
%>
</body>
</html>