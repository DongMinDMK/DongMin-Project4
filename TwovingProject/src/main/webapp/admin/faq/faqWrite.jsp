<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/admin/header.jsp"%>
<%@ include file="/admin/sub_menu.jsp"%>

<!-- <link rel="stylesheet" href="/admin/css/notice.css" /> -->

<article>
	<form name="faqWriteFrm" method="post"  enctype="multipart/form-data">
			<h1 style="text-align: center;"> FAQ 작성 </h1>
			<div class="field" >
					<label>분류</label> 
					<select name="inquirylist" id="inquirylist" style="width:100px;">
						<option value="전체">전체</option>
					    <option value="회원/로그인">회원/로그인</option>
					    <option value="이용권/결제">이용권/결제</option>
					    <option value="재생/오류">재생/오류</option>
					    <option value="해지/환불">해지/환불</option>
					    <option value="서비스/이용">서비스/이용</option>
					    
					    <!-- <option value="all">전체</option>
					    <option value="memberLogin">회원/로그인</option>
					    <option value="order">이용권/결제</option>
					    <option value="playError">재생/오류</option>
					    <option value="refund">해지/환불</option>
					    <option value="service">서비스/이용</option> -->
			  		</select>	
			</div>
			<div class="field" >
					<label>제목</label> <input type="text" name="subject" />
			</div>
			<div class="field" >
				<label>내용</label>
				<textarea rows="35" cols="112" name="content"></textarea>
			</div>
			<div class="btn" >
					<input type="button" value="상품등록" onClick="go_save3()">           
					<input type="button" value="목록으로" 
							onClick="location.href='twoving.do?command=adminFaqList'">
			</div>
	</form>
</article>

<%@ include file="/admin/footer.jsp"%>