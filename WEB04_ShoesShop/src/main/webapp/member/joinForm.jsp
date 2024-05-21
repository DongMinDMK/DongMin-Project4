<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    
<%@ include file= "../header.jsp" %>

<section>
	<%@ include file = "sub_image_menu.jsp" %>
	
	<article>
		<form method = "post" name = "joinForm" action = "shop.do?command=join">
			<h2> Join Us(회원가입)</h2>
			<h3> Basic Info(필수입력)</h3>
			<div class = "field">
				<label>User ID</label>
				<div>
					<input type = "text" name = "userid" size="12">
					<input type= "hidden" name = "reid"> 
					<input type = "button" value = "중복체크" class = "dup" onClick="idCheck()">
				</div>
			</div>
			<div class = "field">
				<label>Password</label>
				<input type = "password" name = "pwd">
			</div>
			<div class = "field">
				<label>Retype Password</label>
				<input type = "password" name = "pwdCheck">
			</div>
			<div class = "field">
				<label>Name</label>
				<input type = "text" name = "name">
			</div>
			<div class = "field">
				<label>Phone</label>
				<input type = "text" name = "phone">
			</div>
			<div class = "field">
				<label>E-Mail</label>
				<input type = "text" name = "email">
			</div>
			<h3>Optional Info(선택입력)</h3>
			<div class = "field">
				<label>Zip Code(우편번호)</label>
				<div>
					<input type = "text" name = "zip_num">
					<input type = "button" value = "우편번호찾기" onClick="post_zip()">
				</div>
			</div>
			<div class = "field">
				<label>Address</label>
				<input type = "text" name = "address1" readonly>
			</div>
			<div class = "field">
				<label>Detail Address</label>
				<input type = "text" name = "address2">
			</div>
			<div class = "btn">
				<input type = "button" value = "회원가입" onClick="go_save()">
				<input type = "button" value = "메인으로 이동" onClick="location.href='shop.do?command=index'">
			</div>
		</form>
	</article>
	
</section>

<%@ include file= "../footer.jsp" %>