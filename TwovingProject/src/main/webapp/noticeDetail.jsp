<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>

<section>
	<article>
		<div class="costitle">
			<%@ include file="customercenter.jsp" %>
		</div>
		<div class="cosmenu_wrapper">
			<%@ include file="cosmenu_wrapper.jsp" %>
		</div>
		
		<p style="font-weight:bold; font-size:200%;">분데스리가 종료 안내입니다.</p><br>
		<p style="font-size:120%; color: gray;"> 
			모든 국민은 인간다운 생활을 할 권리를 가진다. 국가는 지역간의 균형있는 발전을 위하여 지역경제를 육성할 의무를 진다. <br>

			교육의 자주성·전문성·정치적 중립성 및 대학의 자율성은 법률이 정하는 바에 의하여 보장된다. <br>

			행정권은 대통령을 수반으로 하는 정부에 속한다. 이 헌법은 1988년 2월 25일부터 시행한다.
		</p>
		
		<div class="detail-button">
			<input type="button" value="목록으로" onClick="location.href='twoving.do?command=notice'" size="150">
		</div>
		
		</article>
	</div>
</section>

<%@ include file="footer.jsp" %>