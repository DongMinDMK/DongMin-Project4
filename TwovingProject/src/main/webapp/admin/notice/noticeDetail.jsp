<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/admin/header.jsp"%>
<%@ include file="/admin/sub_menu.jsp"%>

<link rel="stylesheet" href="/admin/css/notice.css" />

<article>
	<form name="noticeWriteFrm" method="post"  enctype="multipart/form-data">
			<h1> 공지사항 상세 보기 </h1>
			<div class="field" >
					<label>제목</label><div>${NoticeVO.title}</div>
			</div>
			<div class="field" >
					<label>내용</label><div><pre>${NoticeVO.content}</pre></div>
			</div>
			<div class="field" >
				<c:if test="${NoticeVO.noticeyn=='Y'}">
					<label>공지 유무</label><div style="color : red; font-weight: bold;">공지글</div>
				</c:if>
				<c:if test="${NoticeVO.noticeyn=='N'}">
					<label>공지 유무</label><div style="color : blue;">일반글</div>
				</c:if>
			</div>
			<div class="btn" >
					<input type="button" value="수정하기" onClick="go_mod2('${NoticeVO.nseq}')">
					<input type="button" value="삭제하기" onClick="deleteNotice('${NoticeVO.nseq}')">       
					<input type="button" value="목록으로" 
							onClick="location.href='twoving.do?command=adminNoticeList'">
			</div>
	</form>
</article>

<%@ include file="/admin/footer.jsp"%>