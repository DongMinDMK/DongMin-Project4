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
			<%-- <div class="qes1">
				<input type="text"  name="key" value="${key}" placeholder="검색어를 입력해주세요">
				<a href="twoving.do?command=memberCustomerLogin&inquirylist=회원/로그인" id="link"><img src="images/search.png" width="60"></a>
			</div>
			<br><br> --%>
			<div class="qes2" style="">
				<span style="font-weight:bold; color:white;">자주 묻는 질문</span>&nbsp;&nbsp;
				<a href="twoving.do?command=memberCustomerLogin&inquirylist=회원/로그인"><span>로그인이 안돼요</span></a> &nbsp;&nbsp; |  &nbsp;&nbsp;
				<a href="twoving.do?command=passTicket&inquirylist=이용권/결제"><span>이용권이 있는 계정이 무엇인지 찾고 싶어요</span></a> &nbsp;&nbsp; |  &nbsp;&nbsp;
				<a href="twoving.do?command=passTicket&inquirylist=이용권/결제"><span>정기결제수단 변경은 어떻게 하나요?</span></a>
			</div>
		</div>
		
		<div class="inquiryCategory">
			<a href="twoving.do?command=faq">전체</a> | &nbsp;&nbsp;&nbsp;&nbsp;
			<a href="twoving.do?command=memberCustomerLogin&inquirylist=회원/로그인">회원/로그인</a> | &nbsp;&nbsp;&nbsp;
			<a href="twoving.do?command=passTicket&inquirylist=이용권/결제">이용권/결제</a> | &nbsp;&nbsp;&nbsp;
			<a href="twoving.do?command=loadingError&inquirylist=재생/오류">재생/오류</a> | &nbsp;&nbsp;&nbsp;
			<a href="twoving.do?command=nonpay&inquirylist=해지/환불">해지/환불</a> | &nbsp;&nbsp;&nbsp;
			<a href="twoving.do?command=servicerun&inquirylist=서비스 이용">서비스 이용</a>
		</div>
		
		<table style="display: flex; flex-direction:column;">
			<c:forEach items="${faqList}" var="faq" varStatus="loop">
				<tr class="fnq-trow" onClick="slideToggleFuc(${loop.index});" id="toggleClass" style="cursor:pointer;">
					<td class="fnq-tcol" style="color:gray; font-weight:bold; padding: 10px;">${faq.inquirylist}</td>
					<td class="fnq-tcol" style="color:gray; font-weight:bold; padding: 10px;">${faq.subject}</td>
					<td class="fnq-tcol"><img src="images/down4.png" width="35" class="toggle-btn" style="border-radius:50%;"></td>
				</tr>
				 <tr class="faq-content" style="display:none;">
				 	<td class="fnq-tcol" style="color:white; font-weight:bold; padding: 10px; font-size: 90%;">${faq.subject}</td>
            		<td colspan="3" style="color:gray; margin:0 auto; font-weight: bold;">${faq.content}</td>
       			 </tr>
			</c:forEach>
		</table>
		
		<jsp:include page="paging/faqPaging.jsp">
			<jsp:param value="twoving.do?command=faq" name="address"/>
		</jsp:include>
	</article>
</section>

<%@ include file="footer.jsp" %>
		
		