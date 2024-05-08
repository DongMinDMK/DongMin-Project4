<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import = "java.net.URLEncoder" %>

	<%
	String userId = request.getParameter("userid");
	String userPwd = request.getParameter("userpwd");
	String loginCheck = request.getParameter("loginCheck");
	
	// 사용자가 로그인을 하면 ? ActionUser.jsp
	// 관리자가 로그인을 하면 ? ActionManager.jsp
			
	// response.sendRedirect 로 전송하는 경우
	/* if(userId.equals("scott") && userPwd.equals("1234")){
		if(loginCheck.equals("user")){
			response.sendRedirect("ActionUser.jsp?userid=" + userId + "&name=" + URLEncoder.encode("홍길동","UTF-8"));
		}else{
			response.sendRedirect("ActionManager.jsp?userid=" + userId + "&name=" + URLEncoder.encode("홍길동","UTF-8"));
		}
	}else{
		response.sendRedirect("ActionTag.jsp");
	} */
	
	
	//2. forward 로 전송하는 경우
	/* String url = null;
	if(userId.equals("scott") && userPwd.equals("1234")){
		if(loginCheck.equals("user")){
			url = "ActionUser.jsp";
		}else{
			url = "ActionManager.jsp";
		}
	}else{
		response.sendRedirect("ActionTag.jsp");
	}
	
	request.setAttribute("name", "홍길남");
	
	RequestDispatcher rd = request.getRequestDispatcher(url);
	rd.forward(request, response); */
	
	//3. 액션태그를 이용하는 경우
	
	if(userId.equals("scott") && userPwd.equals("1234")){
		if(loginCheck.equals("user")){
	%>
		<jsp:forward page = "ActionUser.jsp">
			<jsp:param value='<%=URLEncoder.encode("홍길동", "UTF-8") %>' name="name"/>
		</jsp:forward>

	<%			
		}else{
	%>
		<jsp:forward page = "ActionManager.jsp">
			<jsp:param value='<%=URLEncoder.encode("홍길동", "UTF-8") %>' name="name"/>
		</jsp:forward>
	<%
		}
	}else{
		response.sendRedirect("ActionTag.jsp");
	}
	%>