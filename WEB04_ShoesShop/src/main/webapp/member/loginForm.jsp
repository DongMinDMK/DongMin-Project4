<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file= "../header.jsp" %>

<section>
	<%@ include file = "sub_image_menu.jsp" %>

		<article>
			<form method="post" action="shop.do?command=login" name="loginForm"> 
				<h2>Login(로그인)</h2>
				<div class = "field">
					<label>User ID</label>
					<input type = "text" name = "userid">
				</div>
				<div class = "field">
					<label>Password</label>
					<input type = "password" name = "pwd">
				</div>
				
				<div class = "btn">
					<input type = "submit" value = "LOGIN" onClick="return loginCheck()">
					<input type = "button" value = "JOIN(회원가입)" onClick="">
					<input type = "button" value = "FIND ID(ID찾기)" onClick="">
				</div>
				
				<div style="font-size:80%; font-weight:bold;">${message}</div>
			</form>
		</article>
	</div>
</section>
	
<%@ include file= "../footer.jsp" %>