<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import ="java.sql.DriverManager" %>
<%@ page import ="java.sql.Connection" %>
<%@ page import ="java.sql.PreparedStatement" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>deleteMember_do.jsp</title>
<%
	Connection con = null;
	PreparedStatement pstmt = null;
	
	String driver = "com.mysql.cj.jdbc.Driver";
	String url = "jdbc:mysql://localhost:3306/scott";
	String id = "root";
	String pw = "adminuser";

	String sql = "delete from members where id = ?";
%>
</head>
<body>

	<script>
		var res = window.confirm("정말로 삭제하시겠습니까?");
		
		if(!res){
			window.alert("삭제를 안하고 메인으로 돌아갑니다.");
			location.href = "MemberMGR.jsp";
		}
	</script>

<% 
	try{
		Class.forName(driver);
		con = DriverManager.getConnection(url, id, pw);
		pstmt = con.prepareStatement(sql);
		
		pstmt.setString(1, request.getParameter("id"));
		
		pstmt.executeUpdate();
		

%>
	<script>
		window.alert("성공적으로 삭제가 완료되었습니다.");
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