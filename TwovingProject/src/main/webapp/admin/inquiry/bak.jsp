<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/admin/header.jsp" %>
<%@ include file="/admin/sub_menu.jsp" %>
		<p> *는 필수입력사항입니다. </p>
		<div class="form-layout">
			<div class="form-box1">
				<div class="form-box1-presemi">
					<div class="form-box-semi1">
						<h4>기본정보</h4>
					</div>
					<form action="twoving.do?command=qnaList" method="post" name="inquiryForm" style="border:1px solid white;" class="inquiryClassForm">
					<div class="field">
						<span>이름*</span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
						<input type="text" value="김동민" name="name" readonly>
					</div>
					<div class="field">
						<span style="color:white;">이메일*</span>&nbsp;&nbsp;&nbsp;
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
					<span style="color:white;">연락처*</span>&nbsp;&nbsp;&nbsp;
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
					<input type="text" name="phone2" width="150">
				</div>
				<br>
				<div class="field">
					<span>문의종류*</span>
						<input type="radio" name="radio1" class="rd" value="사이트 이용"><label>사이트 이용</label>
						<input type="radio" name="radio1" class="rd" value="회원/로그인"><label>회원/로그인</label>
						<input type="radio" name="radio1" class="rd" value="환불/해지 신청"><label>환불/해지 신청</label>
						<input type="radio" name="radio1" class="rd" value="이용권 결제"><label>이용권 결제</label>
						<input type="radio" name="radio1" class="rd" value="장애 신고"><label>장애신고</label>
						<input type="radio" name="radio1" class="rd" value="콘텐츠/채널"><label>콘텐츠/채널<br></label>
						<input type="radio" name="radio1" class="rd" value="이벤트"><label>이벤트</label>
						<input type="radio" name="radio1" class="rd" value="서비스 제한"><label>서비스 제한</label>
						<input type="radio" name="radio1" value="기타"><label>기타</label>
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
						<input type="text" name="runcontent" placeholder="이용하실 콘텐츠를 입력해주세요..."  size=50>
				</div>
					
				<div class="field">
						<span>이용 환경</span>&nbsp;&nbsp;&nbsp;&nbsp;
						<input type="radio" name="runenvironment" value="PC"><span>PC</span>&nbsp;&nbsp;&nbsp;
						<input type="radio" name="runenvironment" value="와이파이"><span>와이파이</span>&nbsp;&nbsp;&nbsp;
						<input type="radio" name="runenvironment" value="통신사(3G/4G/5G)"><span>통신사(3G/4G/5G)</span>&nbsp;&nbsp;&nbsp;
				</div>
				
				<div class="field">
						<span>이용장소</span>&nbsp;&nbsp;&nbsp;
						<input type="text" name="runplace">
				</div>
					
				<div class="field">
					<span>문의 제목*</span>&nbsp;&nbsp;&nbsp;&nbsp;
					<input type="text" name="inquirytitle" placeholder="문의 제목을 입력해주세요." size=50>
				</div>	
				<div class="field">
					<span>문의 내용*</span>&nbsp;&nbsp;&nbsp;&nbsp;
					<textarea rows="10" cols="100" placeholder="문의 내용을 입력해주세요." name="inquirycontent"></textarea>
				</div>	
				<p>※ 빠른 검토를 위해 영어 2000자, 한글 1000자 내외로 입력하세요.</p>
				<input type="submit" value="문의 남기기" onClick="return inquiryCheck();"  width="20" style="padding:10px;">
			</form>
			</div>
		</div>
	</div>
	
	</article>
	</div>
</section>


<%@ include file="/admin/footer.jsp" %>