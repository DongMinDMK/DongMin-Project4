<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>

<title>이용권 선택</title>

<div class="sub_contents" style="display:flex; flex-direction: column;">
	<h1 style="color: white; margin: 0 auto; margin-bottom: 30px;">변경할 이용권을 선택하세요</h1>
	<section style="display:flex;">
		<div class="passTicketSelect" style="width: 100%; display:flex; justify-content: space-between;">
			<div class="advertiseStandard" style="border: 1px solid gray; width: 43%; background-color:gray; opacity: 0.4; color:white; border-radius:15px 15px 15px 15px; padding: 40px; margin-right: 10px;">
				<p style="font-weight: bold; color:white; text-align:center;">광고형<br> 스탠다드</p>
			</div>
			<div class="standard" style="border: 1px solid gray; background-color:gray; width: 30%; opacity: 0.4; color:white; border-radius:15px 15px 15px 15px; padding: 40px; margin-right: 10px;">
				<p style="font-weight: bold; color:white; text-align:center;">스탠다드</p>
			</div>
			<div class="premium" style="border: 1px solid gray; background-color:gray; width: 30%; opacity: 0.4; color:white; border-radius:15px 15px 15px 15px; padding: 40px;">
				<p style="font-weight: bold; color:white; text-align:center;">프리미엄</p>
			</div>
		</div>
	</section>
</div>


<%@ include file="footer.jsp" %>