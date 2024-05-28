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
		
		<hr>
		
		<div class="notice_table">
			<table>
					<tr class="trow">
						<th>번호</th>
						<th>제목</th>
						<th>등록일</th>
						<th>조회수</th>
					</tr>
					<c:forEach items="${noticeList}" var="notice">
					<tr class="notice_row">
							<!-- <td style="color:red;">공지</td> -->
								<td class="notice_col">${notice.noticeid}</td>
								<td class="notice_col" >${notice.title}</td> <!-- 게시물 DB 데이터 끌고 와서 EL 문법으로 저장 -->
						 		<td class="notice_col">${notice.indate}</td> <!-- 게시물 DB 데이터 끌고 와서 EL 문법으로 저장 -->
								<td class="notice_col">${notice.readcount}</td> <!-- 게시물 DB 데이터 끌고 와서 EL 문법으로 저장 -->
					</tr>
					</c:forEach>
			</table>
		</div>
		<%-- <jsp:include page="paging/paging.jsp">
			<jsp:param value="twoving.do?command=notice" name="noticeList"/>
		</jsp:include> --%>
		</article>
	</div>
</section>

<%@ include file="footer.jsp" %>