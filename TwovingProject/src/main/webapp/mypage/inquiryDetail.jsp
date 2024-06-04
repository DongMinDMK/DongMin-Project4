<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/admin/header.jsp"%>
<%@ include file="/admin/sub_menu.jsp"%>

<script src="/script/mypage.js"></script>

<article>
	<form name="inquiryViewFrm" method="post"  enctype="multipart/form-data">
	<input type="hidden" name="ciseq" value="${cvo.ciseq}" />
			<input type="button" style="margin-left: auto; background-color: black; color:white; border:none; font-size: 90%; cursor: pointer;" 
				value="문의하기" onclick="location.href='twoving.do?command=customerInquiryListMypage'">
				<!-- 고객문의로 가기 -->
			<div class="field" >
					<label style="font-weight: bold; font-size: 180%;">${cvo.inquirytitle}&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
					&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
					&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
					&nbsp;&nbsp;&nbsp;&nbsp;
					${cvo.indate}</label>
			</div>
			<div class="field" >
					<c:choose>
					<c:when test="${empty cvo.reply }"> 
						<label style="font-size: 115%;">처리중&nbsp;
							<c:out value="|" />&nbsp;
							${cvo.inquiryList}	
						</label> 
					</c:when>
					<c:otherwise>	<!-- 관리자 답변 후 표시 -->
						<label style="font-size: 115%;">답변완료&nbsp;
							<c:out value="|" />&nbsp;
							${cvo.inquiryList}	
						</label> 
					</c:otherwise>
				</c:choose>
			</div>
			<div class="field" >
					<label></label>
			</div>
			<div class="field" >
					<label>1.디바이스 : ${cvo.devicephone} / 디바이스명 : ${cvo.devicemodelname}</label>
			</div>
			<div class="field" >
					<label>2.통신 환경 :${cvo.runenvironment}</label>
			</div>
			<div class="field" >
					<label>3.이용장소 : ${cvo.runplace}</label>
			</div>
			<div class="field" >
					<label>4.이용시간 : ${cvo.runtime1}~${cvo.runtime2}</label>
			</div>
			<div class="field" >
					<label>5.이용 콘텐츠 : ${cvo.runcontent}</label>
			</div>
			<div class="field" >
					<label>6.상세내용 : ${cvo.inquirycontent}</label>
			</div>
			<p>
			<hr style="overflow: visible; border-style: solid;">
			<label style="font-size: 140%;">-------------------------------------------------------------------------------------------------------------</label>
			<p>
			<c:choose>
					<c:when test="${empty cvo.reply }"> <!-- 관리자 답변 전 표시 -->
					</c:when>
					<c:otherwise>	<!-- 관리자 답변 후 표시 -->
						<div class="field" >
								<label style="font-weight: bold; font-size: 180%;">
								답변드립니다.
								</label>
						</div>
						<div class="field" >
								<label style="font-size: 130%;"><pre>${cvo.reply}</pre></label>
						</div>	
					</c:otherwise>
				</c:choose>
			<input type="button" style="margin-left: auto; background-color: black; color:white; border:none; font-size: 90%; cursor: pointer;" 
				value="목록으로" onclick="location.href='twoving.do?command=customerInquiryListMypage'">
	</form>
</article>

<%@ include file="/admin/footer.jsp"%>