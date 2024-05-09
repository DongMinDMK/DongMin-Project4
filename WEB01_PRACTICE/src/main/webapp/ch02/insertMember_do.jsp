<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import ="java.sql.DriverManager" %>
<%@ page import ="java.sql.Connection" %>
<%@ page import ="java.sql.PreparedStatement" %>

<%
	Connection con = null;
	PreparedStatement pstmt = null;
	
	String driver = "com.mysql.cj.jdbc.Driver";
	String url = "jdbc:mysql://localhost:3306/scott";
	String id = "root";
	String pw = "adminuser";

	String sql = "insert into members(id, pwd, name, phone) values(?, ?, ?, ?)";
%>

<%
	try{
		Class.forName(driver);
		con = DriverManager.getConnection(url, id, pw);
		pstmt = con.prepareStatement(sql);
		
		pstmt.setString(1, request.getParameter("userid"));
		pstmt.setString(2, request.getParameter("userpwd"));
		pstmt.setString(3, request.getParameter("name"));
		pstmt.setString(4, request.getParameter("phone"));
		
		pstmt.executeUpdate();
		
%>
	<script>
		window.alert("정상적으로 데이터추가가 완료되었습니다.");
		location.href="MemberMGR.jsp";
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