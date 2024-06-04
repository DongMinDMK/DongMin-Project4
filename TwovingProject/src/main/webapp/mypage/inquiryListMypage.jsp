<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<script src="/script/mypage.js"></script>
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
			<div class="coltitle" style="flex:1.5;">상태</div>
			<div class="coltitle" style="flex:2;">구분</div>
			<div class="coltitle" style="flex:6;">제목</div>
			<div class="coltitle" style="flex:1;">등록일</div>
		</div>
		<c:forEach items="${inquiryList}" var="inquiryVO">
			<div class="row">
				<div class="col" style="flex:1.5;">
					<c:choose>
	                     <c:when test='${empty inquiryVO.reply}'>
	                       <span style="color:red;">처리중</span> 
	                    </c:when>
	                    <c:otherwise>
	                       <!-- <span style="font-weight: bold;">답변완료</span> -->
	                       답변완료
	                    </c:otherwise>
                	</c:choose>	
				</div>
				
				<div class="col" style="flex:2;">${inquiryVO.inquiryList}</div>
				<div class="col" style="flex:6;">
					<a href="#" onClick="go_detailInquiryMypage( '${inquiryVO.ciseq}' )"> 
						${inquiryVO.inquirytitle}
					</a>
				</div>
				<div class="col" style="flex:1;">
					<fmt:formatDate value="${inquiryVO.indate}" />
				</div>
				
			</div>
		</c:forEach>
		<jsp:include page="/admin/paging/paging.jsp">
			<jsp:param value="twoving.do?command=customerInquiryListMypage" name="address" />
		</jsp:include>
	</div>
	</form>
</article>

<%@ include file="/admin/footer.jsp" %>