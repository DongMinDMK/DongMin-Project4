<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>

<section>
	<article>
		<div class="costitle"><h3>고객센터</h3></div>
		<div class="cosmenu_wrapper">
			<a href="" class="cosmenu">공지사항</a>
			<a href="" class="cosmenu">FAQ</a>
			<a href="" class="cosmenu">고객문의</a>
			<a href="" class="cosmenu">다음 회차 결제 해지</a>
		</div>
		
		<hr>
		
		<div class="notice_table">
			<table>
				<thead>
					<tr class="trow">
						<th>번호</th>
						<th>제목</th>
						<th class="end">등록일</th>
						<th class="end">조회수</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="" var="notice">
						<tr href="" class="notice_row">
							<td style="color:red;">공지</td>
								<td></td> <!-- 게시물 DB 데이터 끌고 와서 EL 문법으로 저장 -->
								<td></td> <!-- 게시물 DB 데이터 끌고 와서 EL 문법으로 저장 -->
								<td></td> <!-- 게시물 DB 데이터 끌고 와서 EL 문법으로 저장 -->
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
		<jsp:include page="paging/paging.jsp">
			<jsp:param value="twoving.do?command=notice" name="noticeList"/>
		</jsp:include>
		</article>
	</div>
</section>

<%@ include file="footer.jsp" %>