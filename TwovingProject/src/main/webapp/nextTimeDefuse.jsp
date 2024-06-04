<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="Theader.jsp" %>

<section>
	<article>
		<div class="coltitle">
			<%@ include file="customercenter.jsp" %>
		</div>
		
		<div class="cosmenu_wrapper">
			<%@ include file="cosmenu_wrapper.jsp" %>
		</div>
		
		<div class="defuse">
			<div class="defuse-title">
				<img src="images/period.png" width="100" style="border-radius:50%;">
				<h1>구독 중인 이용권의 정기결제 해지를 원하시나요?</h1>
				<p>정기결제 해지는 MY->나의 이용권에서 신청 가능하며 <br>
				   해지 신청 완료 시, 다음 정기 결제일부터 결제가 진행되지 않습니다.
				</p>
			</div>
			<div class="defuse-bottom">
				<input type="button" value="정기결제 해지하러 가기" style="background-color:white; font-size: 120%; font-weight: bold;" size="150" onClick="location.href='twoving.do?command=mymembership'">
			</div>
		</div>
		
	</article>
	</div>
</section>

<%@ include file="Tfooter.jsp" %>