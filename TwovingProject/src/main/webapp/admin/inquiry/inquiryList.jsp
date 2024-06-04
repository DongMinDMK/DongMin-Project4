<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/admin/header.jsp" %>
<%@ include file="/admin/sub_menu.jsp" %>

<article>
	<form method = "post" name="frm">
	<div class="tb">
		<div class="row">
			<div class="col" style="display:flex; align-items : center; border:3px solid black;">
				고객문의 제목 검색 : &nbsp;<input type="text" name="key" value="${key}">
				&nbsp;&nbsp;&nbsp;
				<div>
				<img src="admin/images/search.png" style="width:30px; cursor: pointer;" onClick="go_search( 'adminCustomerInquiryList' )">
				</div>
				&nbsp;&nbsp;&nbsp;
			</div>
		</div>
		<!-- <br> -->
		<div class="row">			
			<div class="coltitle" style="flex:0.5;">번호</div>
			<div class="coltitle" style="flex:1;">이름</div>
			<div class="coltitle" style="flex:2.5;">이메일</div>
			<div class="coltitle" style="flex:2;">번호</div>
			<div class="coltitle" style="flex:6;">제목(답변여부)</div>
			<div class="coltitle" style="flex:1.5;">이용콘텐츠</div>
		</div>
		<c:forEach items="${inquiryList}" var="inquiryVO">
			<div class="row">
				<div class="col" style="flex:0.5;">${inquiryVO.ciseq}</div>
				<div class="col" style="flex:1;">${inquiryVO.name}</div>
				<div class="col" style="flex:2.5;">${inquiryVO.email}</div>
				<div class="col" style="flex:2;">${inquiryVO.phone}</div>
				<div class="col" style="flex:6;">
					<a href="#" onClick="go_detail4( '${inquiryVO.ciseq}' )"> 
						${inquiryVO.inquirytitle}
					</a>
					<c:choose>
	                     <c:when test='${empty inquiryVO.reply}'>
	                       (미처리)
	                    </c:when>
	                    <c:otherwise>
	                       <span style="font-weight: bold; color:red;">(답변완료)</span>
	                    </c:otherwise>
                	</c:choose>	
				</div>
				<div class="col" style="flex:1.5;">${inquiryVO.runcontent}</div>
<%-- 				<div class="col" style="flex:1"><fmt:formatDate value="${noticeVO.indate}" /></div> --%>
			</div>
		</c:forEach>
		<jsp:include page="/admin/paging/paging.jsp">
			<jsp:param value="twoving.do?command=adminCustomerInquiryList" name="address" />
		</jsp:include>
	</div>
	</form>
</article>

<%@ include file="/admin/footer.jsp" %>