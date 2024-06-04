<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/admin/header.jsp" %>
<%@ include file="/admin/sub_menu.jsp" %>

 <script type="text/javascript"> 
 	if( ${deleteNotice} == 1){   
		alert('공지사항이 정상적으로 삭제가 완료됐습니다.');
 	} else {
 		alert('공지사항 삭제 실패, 관리자에게 문의하세요');
 	}
 </script>
<article>
	<form method = "post" name="frm">
	<div class="tb">
		<div class="row">
			<div class="col" style="display:flex; align-items : center; border:3px solid black;">
				공지사항 제목 검색 : &nbsp;<input type="text" name="key" value="${key}">
				&nbsp;&nbsp;&nbsp;
				<div>
				<img src="admin/images/search.png" style="width:30px; cursor: pointer;" onClick="go_search( 'adminNoticeList' )">
				</div>
				&nbsp;&nbsp;&nbsp;
				<input type="button" style="margin-left: auto; background-color: black; color:white; border:none; font-size: 90%; cursor: pointer;" 
				value="공지사항 등록" onclick="go_wrt2();">
				<!-- onClick="go_search( 'adminProductList' )"> -->
			</div>
		</div>
		<!-- <br> -->
		<div class="row">			
			<div class="coltitle" style="flex:0.5;">번호</div>
			<div class="coltitle" style="flex:6;">제목</div>
			<div class="coltitle" style="flex:1;">등록일</div>
			<div class="coltitle" style="flex:1;">조회수(회원)</div>
		</div>
		<c:forEach items="${noticeList}" var="noticeVO">
			<div class="row">
				<div class="col" style="flex:0.5;">${noticeVO.nseq}</div>
				<div class="col" style="flex:6;">
					<a href="#" onClick="go_detail2( '${noticeVO.nseq}' )"> 
						${noticeVO.title}
							
						<c:if test="${noticeVO.noticeyn=='Y'}">
							<span style="font-weight: bold; color:red;">[공지글]</span>
						</c:if>
						<c:if test="${noticeVO.noticeyn=='N'}">
						</c:if>
					</a>	
				</div>
				<div class="col" style="flex:1"><fmt:formatDate value="${noticeVO.indate}" /></div>
				<div class="col" style="flex:1;">${noticeVO.readcount}</div>
			</div>
		</c:forEach>
		<jsp:include page="/admin/paging/paging.jsp">
			<jsp:param value="twoving.do?command=adminNoticeList" name="address" />
		</jsp:include>
	</div>
	</form>
</article>

<%@ include file="/admin/footer.jsp" %>