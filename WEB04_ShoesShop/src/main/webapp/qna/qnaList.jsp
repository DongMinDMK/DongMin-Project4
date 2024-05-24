<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file= "../header.jsp" %>

<section>
	<%@ include file = "sub_image_menu.jsp" %>
	<article>
		<form>
			<h2>Q&A List</h2>
				<div class="tb">
						<div class="row">
							<div class="coltitle">번호</div>
							<div class="coltitle">제목</div>
							<div class="coltitle">작성일</div>
							<div class="coltitle">답변여부</div>
						</div>
						<c:forEach items="${qnaList}" var="qnaDTO">
							<div class="row">
								<div class="col">${qnaDTO.qseq}</div>
								<div class="col">${qnaDTO.subject}</div>
								<div class="col"><fmt:formatDate value="${qnaDTO.indate}"/></div>
								<div class="col">
									<c:choose>
										<c:when test="${empty qnaDTO.reply}">
											NO
										</c:when>
										<c:otherwise>
											YES
										</c:otherwise>
									</c:choose>
								</div>
							</div>
						</c:forEach>
					</div>
			<div class="btn">
				<input type="button" value="질문작성하기" onClick="location.href='shop.do?command=qnaWriteForm'">
			</div>
		</form>
	</article>

</div>	
</section>
<%@ include file= "../footer.jsp" %>