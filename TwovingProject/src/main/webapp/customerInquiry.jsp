<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="Theader.jsp" %>

<section>
	<article>
		<div class="coltitle">
			<%@ include file="customercenter.jsp" %>
		</div>
		
		<div class="cosmenu_wrapper">
			<%@ include file="cosmenu_wrapper.jsp" %>
		</div>
		
		 <div class="search">
			<div class="qes2" style="padding : 5px;">
				<span style="font-weight:bold; color:white;">자주 묻는 질문</span>&nbsp;&nbsp;
				<a href="twoving.do?command=memberCustomerLogin&inquirylist=회원/로그인"><span>로그인이 안돼요</span></a> &nbsp;&nbsp; |  &nbsp;&nbsp;
				<a href="twoving.do?command=passTicket&inquirylist=이용권/결제"><span>이용권이 있는 계정이 무엇인지 찾고 싶어요</span></a> &nbsp;&nbsp; |  &nbsp;&nbsp;
				<a href="twoving.do?command=passTicket&inquirylist=이용권/결제"><span>정기결제수단 변경은 어떻게 하나요?</span></a>
			</div>
		</div>
		
		 <p style="border-bottom: 1px solid gray; padding: 20px; color:gray; font-weight: bold; font-size:80%;"> *는 필수입력사항입니다. </p>
		<div class="form-layout">
			<!-- <div class="form-box1"> -->
				<!-- <div class="form-box1-presemi"> -->
					<div class="form-box-semi1">
						<label style="padding: 20px; font-weight: bold; font-size:115%;">기본정보</label>
					</div>
					<form action="twoving.do?command=qnaList" method="post" name="inquiryForm" style="" class="inquiryClassForm">
					<div class="field">
						<span>이름*</span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
						<input type="text" value="김동민" name="name" style="color:white; font-weight:bold;" readonly>
					</div>
					<div class="field">
						<span>이메일*</span>&nbsp;&nbsp;&nbsp;
						<input type="text" width="100" name="emailid" class="detailInput" id="email-datail1">&nbsp;
						<span style="color:white;">@</span>&nbsp;
						<input type="text" width="100" name="emailid2" class="detailInput"  id="email-datail2">&nbsp;&nbsp;&nbsp;
						<select name="email" id="emailList" onChange="emailSelect();">
							<option value="" selected>직접입력</option>
							<option value="daum.net">daum.net</option>
							<option value="naver.com">naver.com</option>
							<option value="nate.com">nate.com</option>
							<option value="gmail.com">gmail.com</option>
						</select>
					</div>
					<div class="field">
					<span>연락처*</span>&nbsp;&nbsp;&nbsp;
					<select name="phone">
						<option selected>010</option>
						<option>011</option>
						<option>016</option>
						<option>017</option>
						<option>018</option>
						<option>019</option>
					</select>
					&nbsp;&nbsp;&nbsp;
					<span>-</span>
					&nbsp;&nbsp;&nbsp;
					<input type="text" name="phone1" width="150">
					&nbsp;&nbsp;&nbsp;
					<span>-</span>
					&nbsp;&nbsp;&nbsp;
					<input type="text" name="phone2" width="150" style="background-color:gray;">
				</div>
				<br>
				<div class="field">
					<span>문의종류*</span>
						<input type="radio" name="radio1" class="rd" value="사이트 이용"><label>사이트 이용</label>
						<input type="radio" name="radio1" class="rd" value="회원/로그인"><label>회원/로그인</label>
						<input type="radio" name="radio1" class="rd" value="환불/해지 신청"><label>환불/해지 신청</label>
						<input type="radio" name="radio1" class="rd" value="이용권 결제"><label>이용권 결제</label>
						<input type="radio" name="radio1" class="rd" value="장애 신고"><label>장애신고</label>
						<input type="radio" name="radio1" class="rd" value="콘텐츠/채널"><label>콘텐츠/채널</label>
						<input type="radio" name="radio1" class="rd" value="이벤트"><label>이벤트</label>
						<input type="radio" name="radio1" class="rd" value="서비스 제한"><label>서비스 제한</label>
						<input type="radio" name="radio1" class="rd" value="기타"><label>기타</label>
				</div>
				<div class="field">
						<span>디바이스</span>&nbsp;&nbsp;&nbsp;&nbsp;
						<select name="devicephone" id="deviceList">
							<option value="" style="color: gray;">선택</option>
							<option value="PC">PC</option>
							<option value="iPhone">아이폰</option>
							<option value="Android">안드로이드폰</option>
							<option value="AndroidTablet">안드로이드 태블릿</option>
							<option value="lgSmart">LG스마트TV</option>
							<option value="samsungSmart">삼성스마트TV</option>
						</select>
						&nbsp;&nbsp;&nbsp;&nbsp;
						<input type="text" name="devicemodelname" size= 50 placeholder="기기명을 입력해주세요...">
				</div>
				
				<div class="field">
						<span>이용시간</span>&nbsp;&nbsp;&nbsp;&nbsp;
						<select name="time1" id="timeList">
							<option selected>선택</option>
							<option value="00:00">00:00</option>
							<option value="00:30">00:30</option>
							<option value="01:00">01:00</option>
							<option value="01:30">01:30</option>
							<option value="02:00">02:00</option>
							<option value="02:30">02:30</option>
							<option value="03:00">03:00</option>
							<option value="03:30">03:30</option>
							<option value="04:00">04:00</option>
							<option value="04:30">04:30</option>
							<option value="05:00">05:00</option>
							<option value="05:30">05:30</option>
							<option value="06:00">06:00</option>
							<option value="06:30">06:30</option>
							<option value="07:00">07:00</option>
							<option value="07:30">07:30</option>
							<option value="08:00">08:00</option>
							<option value="08:30">08:30</option>
							<option value="09:00">09:00</option>
							<option value="09:30">09:30</option>
							<option value="10:00">10:00</option>
							<option value="10:30">10:30</option>
							<option value="11:00">11:00</option>
							<option value="11:30">11:30</option>
							<option value="12:00">12:00</option>
							<option value="12:30">12:30</option>
							<option value="13:00">13:00</option>
							<option value="13:30">13:30</option>
							<option value="14:00">14:00</option>
							<option value="14:30">14:30</option>
							<option value="15:00">15:00</option>
							<option value="15:30">15:30</option>
							<option value="16:00">16:00</option>
							<option value="16:30">16:30</option>
							<option value="17:00">17:00</option>
							<option value="17:30">17:30</option>
							<option value="18:00">18:00</option>
							<option value="18:30">18:30</option>
							<option value="19:00">19:00</option>
							<option value="19:30">19:30</option>
							<option value="20:00">20:00</option>
							<option value="20:30">20:30</option>
							<option value="21:00">21:00</option>
							<option value="21:30">21:30</option>
							<option value="22:00">22:00</option>
							<option value="22:30">22:30</option>
							<option value="23:00">23:00</option>
							<option value="23:30">23:30</option>
						</select>
						<span> ~ </span>
						<select name="time2" id="timeList">
							<option selected>선택</option>
							<option value="00:00">00:00</option>
							<option value="00:30">00:30</option>
							<option value="01:00">01:00</option>
							<option value="01:30">01:30</option>
							<option value="02:00">02:00</option>
							<option value="02:30">02:30</option>
							<option value="03:00">03:00</option>
							<option value="03:30">03:30</option>
							<option value="04:00">04:00</option>
							<option value="04:30">04:30</option>
							<option value="05:00">05:00</option>
							<option value="05:30">05:30</option>
							<option value="06:00">06:00</option>
							<option value="06:30">06:30</option>
							<option value="07:00">07:00</option>
							<option value="07:30">07:30</option>
							<option value="08:00">08:00</option>
							<option value="08:30">08:30</option>
							<option value="09:00">09:00</option>
							<option value="09:30">09:30</option>
							<option value="10:00">10:00</option>
							<option value="10:30">10:30</option>
							<option value="11:00">11:00</option>
							<option value="11:30">11:30</option>
							<option value="12:00">12:00</option>
							<option value="12:30">12:30</option>
							<option value="13:00">13:00</option>
							<option value="13:30">13:30</option>
							<option value="14:00">14:00</option>
							<option value="14:30">14:30</option>
							<option value="15:00">15:00</option>
							<option value="15:30">15:30</option>
							<option value="16:00">16:00</option>
							<option value="16:30">16:30</option>
							<option value="17:00">17:00</option>
							<option value="17:30">17:30</option>
							<option value="18:00">18:00</option>
							<option value="18:30">18:30</option>
							<option value="19:00">19:00</option>
							<option value="19:30">19:30</option>
							<option value="20:00">20:00</option>
							<option value="20:30">20:30</option>
							<option value="21:00">21:00</option>
							<option value="21:30">21:30</option>
							<option value="22:00">22:00</option>
							<option value="22:30">22:30</option>
							<option value="23:00">23:00</option>
							<option value="23:30">23:30</option>
						</select>
				</div>
				<div class="field">
						<span>이용 콘텐츠</span>&nbsp;&nbsp;&nbsp;&nbsp;
						<input type="text" name="runcontent" placeholder="이용하실 콘텐츠를 입력해주세요..."  style="width: 400px;">
				</div>
					
				<div class="field">
						<span>이용 환경</span>&nbsp;&nbsp;&nbsp;&nbsp;
						<input type="radio" class="enviro" name="runenvironment" value="PC"><label>PC</label>&nbsp;&nbsp;&nbsp;
						<input type="radio" class="enviro" name="runenvironment" value="와이파이"><label>와이파이</label>&nbsp;&nbsp;&nbsp;
						<input type="radio" class="enviro" name="runenvironment" value="통신사(3G/4G/5G)"><label>통신사(3G/4G/5G)</label>&nbsp;&nbsp;&nbsp;
				</div>
				
				<div class="field">
						<span>이용장소</span>&nbsp;&nbsp;&nbsp;
						<input type="text" name="runplace" placeholder="이용장소를 선택해주세요(집,버스 등)" style="width: 300px;">
				</div>
					
				<div class="field">
					<span>문의 제목*</span>&nbsp;&nbsp;&nbsp;&nbsp;
					<input type="text" name="inquirytitle" placeholder="문의 제목을 입력해주세요." size=50>
				</div>	
				
				<div class="field" style="border-bottom: 1px solid black;">
					<span>문의 내용*</span>&nbsp;&nbsp;&nbsp;&nbsp;
					<textarea rows="10" cols="100" placeholder="문의 내용을 입력해주세요." name="inquirycontent"></textarea>
				</div>	
				<p style="border-bottom: 1px solid gray; padding: 15px; color:gray;">※ 빠른 검토를 위해 영어 2000자, 한글 1000자 내외로 입력하세요.</p>
				
				
				<div class="bott" style="display:flex; flex-direction: column;">
					<span>개인정보 수집 및 동의</span>
					<p>※ 동의하지 않을 경우 고객 문의 답변에 제한이 있을 수 있습니다.</p>
					<div class="bott-box" style="background-color:gray; padding: 30px;">
						<p>
							개인 정보 수집 및 이용목적<br>
							1. 개인 정보 수집항목 : 성명, 전화번호, 이메일, 아이디<br>
							2. 개인 정보 이용목적 : 문의 접수, 고객 불편 사항 확인 및 처리 결과 회신<br>
							3. 개인 정보 이용기간 : 접수 후, 3년간 보관 후 파기<br>
						</p>	
					</div>
					<div class="bott-img-check-box" style="display:flex; padding: 8px; cursor:pointer;">
						<img src="images/checkblack.png" class="bott-check-image" id="checkBlack" style="width:30px; border-radius:50%;">&nbsp;&nbsp;<span>동의합니다.</span>
						<img src="images/checkcolor.jpeg" class="bott-check-image" id="checkColor" style="display:none; width:30px; border-radius:50%;">&nbsp;&nbsp;<span style="display:none;">동의합니다.</span>
					</div>
				</div>
				<input type="submit" value="문의 남기기" class="buttons" id="submitButton" onClick="return inquiryCheck();">	
			</form>
		</div>
	</article>
</section>


<%@ include file="Tfooter.jsp" %>