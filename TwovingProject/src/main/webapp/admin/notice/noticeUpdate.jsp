<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/admin/header.jsp"%>
<%@ include file="/admin/sub_menu.jsp"%>

<link rel="stylesheet" href="/admin/css/notice.css" />

<article>
	<form name="noticeUpdateFrm" method="post"  enctype="multipart/form-data">
			<input type="hidden" name="nseq" value="${noticeVO.nseq}" />
			
			<h2> 공지사항 수정 </h2>
			<div class="field" >
					<label>제목</label> <input type="text" name="title" size=100 value="${noticeVO.title}" />
			</div>
			<div class="field" >
					<label>내용</label> <input type="text" name="content" value="${noticeVO.content}"/>
			</div>
			<div class="field" >
				<label>공지 유무</label>
				<div style="border:1px solid black; width:100px; text-align: left;">
					<c:if test="${noticeVO.noticeyn=='Y'}">
						<input type="radio" name="noticeyn" value="Y" checked>공지 글
						<input type="radio" name="noticeyn" value="N">일반 글
					</c:if>
					<c:if test="${noticeVO.noticeyn=='N'}">
						<input type="radio" name="noticeyn" value="Y">공지 글
						<input type="radio" name="noticeyn" value="N" checked>일반 글
					</c:if>
				</div>
			</div>
			<div class="btn" >
					<input type="button" value="공지수정" onClick="go_update2()">
					<input type="button" value="목록으로" 
							onClick="location.href='twoving.do?command=adminNoticeList'">
			</div>
	</form>
</article>

<%@ include file="/admin/footer.jsp"%>