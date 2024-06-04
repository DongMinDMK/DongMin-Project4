<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%-- <%@ include file="../header.jsp" %> --%>
<script src="script/member.js"></script>
<link rel="stylesheet" href="css/login.css">
<link rel="stylesheet" href="css/header_footer.css">
<button type="submit" class="logo" style="cursor: pointer;"
	onclick="location.href='twoving.do?command=index'">TWOVING</button>
<section style="margin-left: 658px;">

    <% 
    // 세션에 저장된 메시지 확인
    String message = (String)session.getAttribute("message");
    if(message != null) {
        // 메시지가 존재하면 출력
        out.println("<p>" + message + "</p>");
        // 출력 후 세션에서 메시지 삭제
        session.removeAttribute("message");
    }
    %>
	<article style="">
		<form method="post" action="twoving.do?command=login" name="loginForm">
			
				<h2>TWOBING ID 로그인</h2>
				<div class="field">
					<input name="userid" type="text" placeholder="아이디"/>
				</div>
				<div class="field">
					<input name="pwd" type="password"  placeholder="비밀번호" />
				</div>
			
				<div class="edu">
					${message}
				</div>
			
				<div class="auto">
					<input type="checkbox" id="remember" checked> 
					<label for="remember" id="remember2" style=" color:gray; font-weight: bold;"> &nbsp;자동 로그인</label>
				</div>
			
			<!-- <input type="submit" class="btn1" value="LOGIN" onClick="return loginCheck()" /> -->
			<!-- <button onClick="return loginCheck()" class="btn1" >로그인하기</button> -->
			<button class="btn1" type="submit" onClick="return loginCheck()" value="LOGIN">로그인하기</button>
			
			<!-- <input type="submit" class="btn1" value="LOGIN" /> -->
			
			<div class="btn">
				<input type="button" onClick="location.href='twoving.do?command=findId'" class="btn2" value="아이디 찾기 &nbsp;&nbsp;" />
				<p>|</p>
				<input type="button"  onClick="location.href='twoving.do?command=findPwd'" class="btn3" value="&nbsp;&nbsp; 비밀번호 찾기" />
			</div>
			<div class="qs">
			<p>아직 계정이 없으신가요? &nbsp;&nbsp;&nbsp;</p><p style="cursor: pointer; font-weight: bold" onClick="location.href='twoving.do?command=joinForm'">회원가입하기</p> 
			</div>

		</form>
	</article>
	<!-- </div> -->
	<!-- nav 와 article 의 부모 끝 -->
</section>
<%@ include file="../footer.jsp" %>