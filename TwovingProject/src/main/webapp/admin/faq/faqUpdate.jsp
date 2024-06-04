<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/admin/header.jsp"%>
<%@ include file="/admin/sub_menu.jsp"%>

<!-- <link rel="stylesheet" href="/admin/css/notice.css" /> -->
<script type="text/javascript"> 
	console.log(${FaqVO.inquirylist})
</script>
<article>
	<form name="faqWriteFrm" method="post"  enctype="multipart/form-data">
			<input type="hidden" name="qseq" value="${FaqVO.qseq}" />
			<h1 style="text-align: center;"> FAQ 수정 </h1>
			<div class="field" >
					<label>분류</label> 
					<select name="inquirylist" id="inquirylist" style="width:100px;">
						<c:if test="${FaqVO.inquirylist=='전체'}">
							<option value="전체" selected>전체</option>
						    <option value="회원/로그인">회원/로그인</option>
						    <option value="이용권/결제">이용권/결제</option>
						    <option value="재생/오류">재생/오류</option>
						    <option value="해지/환불">해지/환불</option>
						    <option value="서비스/이용">서비스/이용</option>
						</c:if>
						<c:if test="${FaqVO.inquirylist=='회원/로그인'}">
							<option value="전체" >전체</option>
						    <option value="회원/로그인" selected>회원/로그인</option>
						    <option value="이용권/결제">이용권/결제</option>
						    <option value="재생/오류">재생/오류</option>
						    <option value="해지/환불">해지/환불</option>
						    <option value="서비스/이용">서비스/이용</option>
						</c:if>
						<c:if test="${FaqVO.inquirylist=='이용권/결제'}">
							<option value="전체" >전체</option>
						    <option value="회원/로그인" >회원/로그인</option>
						    <option value="이용권/결제" selected>이용권/결제</option>
						    <option value="재생/오류">재생/오류</option>
						    <option value="해지/환불">해지/환불</option>
						    <option value="서비스/이용">서비스/이용</option>
						</c:if>
						<c:if test="${FaqVO.inquirylist=='재생/오류'}">
							<option value="전체" >전체</option>
						    <option value="회원/로그인" >회원/로그인</option>
						    <option value="이용권/결제" >이용권/결제</option>
						    <option value="재생/오류" selected>재생/오류</option>
						    <option value="해지/환불">해지/환불</option>
						    <option value="서비스/이용">서비스/이용</option>
						</c:if>
						<c:if test="${FaqVO.inquirylist=='해지/환불'}">
							<option value="전체" >전체</option>
						    <option value="회원/로그인" >회원/로그인</option>
						    <option value="이용권/결제" >이용권/결제</option>
						    <option value="재생/오류" >재생/오류</option>
						    <option value="해지/환불" selected>해지/환불</option>
						    <option value="서비스/이용">서비스/이용</option>
						</c:if>
						<c:if test="${FaqVO.inquirylist=='서비스/이용'}">
							<option value="전체" >전체</option>
						    <option value="회원/로그인" >회원/로그인</option>
						    <option value="이용권/결제" >이용권/결제</option>
						    <option value="재생/오류" >재생/오류</option>
						    <option value="해지/환불" >해지/환불</option>
						    <option value="서비스/이용" selected >서비스/이용</option>
						</c:if>
			  		</select>	
			</div>
			<div class="field" >
					<label>제목</label> <input type="text" name="subject" value="${FaqVO.subject}" />
			</div>
			<div class="field" >
				<label>내용</label>
				<textarea rows="35" cols="112" name="content">${FaqVO.content}</textarea>
			</div>
			<div class="btn" >
					<input type="button" value="FAQ수정" onClick="go_update3()">           
					<input type="button" value="목록으로" 
							onClick="location.href='twoving.do?command=adminFaqList'">
			</div>
	</form>
</article>

<%@ include file="/admin/footer.jsp"%>