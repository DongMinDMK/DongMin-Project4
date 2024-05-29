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
		
		<br>
		
		<div class="search">
			<input type="text"  name="searchingname" placeholder="검색어를 입력해주세요">
			<a href=""><img src="images/search.png" width="60"></a>
		</div>
		
		<div class="inquiryCategory">
			<a href="twoving.do?command=selectAll">전체</a> | &nbsp;&nbsp;&nbsp;&nbsp;
			<a href="twoving.do?command=memberLogin">회원/로그인</a> | &nbsp;&nbsp;&nbsp;
			<a href="twoving.do?command=passTicket">이용권/결제</a> | &nbsp;&nbsp;&nbsp;
			<a href="twoving.do?command=loadingError">재생오류</a> | &nbsp;&nbsp;&nbsp;
			<a href="twoving.do?command=nonpay">해지/환불</a> | &nbsp;&nbsp;&nbsp;
			<a href="twoving.do?command=seriverun">서비스 이용</a>
		</div>
		
		<table style="display: flex; flex-direction:column;">
			<c:forEach items="${faqList}" var="faq">
				<tr class="fnq-trow">
					<td class="fnq-tcol" style="color:gray; font-weight:bold; padding: 10px;">${faq.inquirylist}</td>
					<td class="fnq-tcol" style="color:gray; font-weight:bold; padding: 10px;">${faq.subject}</td>
					<td class="fnq-tcol"><img src="images/down4.png" width="35" style="border-radius:50%;"></td>
					<%-- <td class="fnq-tcol">${faq.content}</td> --%>
				</tr>
			</c:forEach>
		
		</table>
		
		
	</article>
</section>

<%@ include file="footer.jsp" %>
		
		