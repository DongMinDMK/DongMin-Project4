<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<div class="rowpage" style="margin:0 auto;"> <!-- 페이지의 시작 -->
	<div class="colpage">
		<c:url var="action" value="${param.address}"></c:url> <!-- 파라미터는 el로 전달될때는 반드시 param 을 붙이고 적어야 한다!!!! -->
			<div style="font-size:120%; font-weight:bold;">
				<c:if test="${paging.prev}">
					<a href = "${action}&page=${paging.beginPage-1}">이전</a>&nbsp;
				</c:if>
				<c:forEach begin="${paging.beginPage}" end="${paging.endPage}" var="index">
					<c:if test="${paging.page == index}">
						<span style = "color:white; background-color:gray; width:10; font-weight: bold;">&nbsp;${index}&nbsp;</span>
					</c:if>
					<c:if test="${paging.page != index}">
						<a href="${action}&page=${index}">&nbsp;${index}&nbsp;</a>
					</c:if>
				</c:forEach>
				<c:if test="${paging.next}">
					<a href = "${action}&page=${paging.endPage+1}">다음</a>
				</c:if>
			</div>
	</div>
</div> <!-- 페이지의 끝 -->