<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/admin/header.jsp"%>
<%@ include file="/admin/sub_menu.jsp"%>

<link rel="stylesheet" href="/admin/css/notice.css" />

<article>
	<form name="noticeWriteFrm" method="post"  enctype="multipart/form-data">
			<h1 style="text-align: center;"> 공지사항 작성 </h1>
			<div class="field" >
					<label>제목</label> <input type="text" name="title" size=100  />
			</div>
			<div class="field" >
					<label>내용</label><textarea name="content" rows="8" style="flex:4;"></textarea>
			</div>
			<div class="field" >
				<label>공지 유무</label>
				<div style="border:1px solid black; width:100px; text-align: left;">
					<input type="radio" name="noticeyn" value="Y">공지 글
					<input type="radio" name="noticeyn" value="N">일반 글
				</div>
			</div>
			<div class="btn" >
					<input type="button" value="상품등록" onClick="go_save2()">           
					<input type="button" value="목록으로" 
							onClick="location.href='twoving.do?command=adminNoticeList'">
			</div>
	</form>
</article>

<%@ include file="/admin/footer.jsp"%>