<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="Theader.jsp" %>

<section>
	<article>
		<div class="costitle">
			<%@ include file="customercenter.jsp" %>
		</div>
		<div class="cosmenu_wrapper">
			<%@ include file="cosmenu_wrapper.jsp" %>
		</div>
		
		<hr>
		
		<div class="notice_table">
			<table>
					<tr class="trow">
						<th style="">번호</th>
						<th style="">제목</th>
						<th style="">등록일</th>
						<th>조회수</th>
					</tr>
					<c:forEach items="${noticeList}" var="notice">
							<!-- <td style="color:red;">공지</td> -->
							<tr class="notice_row">
								<c:choose>
									<c:when test="${notice.noticeyn eq 'Y'}">
										<td class="notice_col" style=" color:red; font-weight:bold">공지</td>
										<td class="notice_col"><a style="color:gray;" href="twoving.do?command=noticeDetail&nseq=${notice.nseq}">${notice.title}</a></td> <!-- 게시물 DB 데이터 끌고 와서 EL 문법으로 저장 -->
						 				<td class="notice_col"><fmt:formatDate value="${notice.indate}"/></td> <!-- 게시물 DB 데이터 끌고 와서 EL 문법으로 저장 -->
										<td class="notice_col">${notice.readcount}</td> <!-- 게시물 DB 데이터 끌고 와서 EL 문법으로 저장 -->
									</c:when>
									<c:otherwise>
										<td class="notice_col">${notice.nseq}</td>
										<td class="notice_col"><a style="color:gray;" href="twoving.do?command=noticeDetail&nseq=${notice.nseq}">${notice.title}</a></td> <!-- 게시물 DB 데이터 끌고 와서 EL 문법으로 저장 -->
						 				<td class="notice_col"><fmt:formatDate value="${notice.indate}"/></td> <!-- 게시물 DB 데이터 끌고 와서 EL 문법으로 저장 -->
										<td class="notice_col">${notice.readcount}</td> <!-- 게시물 DB 데이터 끌고 와서 EL 문법으로 저장 -->
									</c:otherwise>
								</c:choose>
							</tr>
					</c:forEach>
			</table>
		</div>
		
		<div class="rowpage" style="margin:0 auto;">
			<div class="colpage">
			<!-- prev 버튼 표시 여부 -->
			<c:if test="${paging.prev}">
				<a href = "twoving.do?command=notice&page=${paging.beginPage-1}">이전</a>
			</c:if>
			
			<!-- beginPage 부터 endPage 이전까지 일렬로 페이지를 표시 -->
			<c:forEach begin="${paging.beginPage}" end="${paging.endPage}" var="index">
				<c:if test="${paging.page == index}">
					<span style = "color:white; background-color:gray; width:10; font-weight: bold;">&nbsp;${index}&nbsp;</span>
				</c:if>
				&nbsp;
				<c:if test="${paging.page != index}">
					<a href="twoving.do?command=notice&page=${index}">&nbsp;${index}&nbsp;</a>
				</c:if>
			</c:forEach>
			
			<!-- next 버튼 표시 여부 -->
			<c:if test="${paging.next}">
				<a href = "twoving.do?command=notice&page=${paging.endPage+1}">다음</a>
			</c:if>
		</div>
				<%-- <jsp:include page="paging/paging.jsp">
					<jsp:param value="twoving.do?command=notice" name="noticeList"/>
				</jsp:include> --%>
	</div>
	</article>
</section>

<%@ include file="Tfooter.jsp" %>