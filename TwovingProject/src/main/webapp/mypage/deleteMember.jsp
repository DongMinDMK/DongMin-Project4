<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="css/delete.css">
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<input type="button"	 class="logo" onclick="location.href='twoving.do?command=index'" value="TWOVING" />
  <h1>회원탈퇴</h1>
  <form>
  <div class="text1"> 탈퇴를 원하시면, 아래 사항을 반드시 확인해주세요.</div>
  <div  class="text2">회원 탈퇴 시 티빙 서비스를 이용하실 수 없으며 보유하신 이용권이나 캐시, 쿠폰 등 유료서비스가 종료됩니다.</div>
 <div class="a">
  <div  class="text3">- 정기결제 이용권이 있는 경우, 정기결제 해지에 동의하셔야 하며, 탈퇴 완료 시 잔여기간을 이용하실 수 없습니다.<br>
- 단건 이용권의 잔여 유효일자가 3일 이상인 경우, 상품 포기에 동의하셔야 하며, 탈퇴 완료 시 캐시가 삭제됩니다.<br>
- 이용권이나 잔여 캐시를 보유한 경우 상품 포기에 동의하셔야 하며, 탈퇴 완료 시 상품 및 캐시가 삭제됩니다.<br>
(1,000캐시 이상의 충전 캐시는 환불 가능합니다. 원하시는 경우 탈퇴 전에고객센터 > '고객문의 > 요금/결제/환불' 카테고리 선택에서 환불 신청해주세요.<br>
- 작성하신 티빙톡은 회원탈퇴 후에는 편집 및 삭제처리가 불가능합니다.<br>
삭제를 원하시는 경우, 먼저 해당 게시물을 삭제하신 후 탈퇴절차를 진행해주시길 바랍니다.</div>
</div>
  <div class="text4">현재 이용중인 상품</div>
  
  <div class="b">
	  <div class="box1">
	  <div class="tb1">이용권</div>
	  <div class="tb2">캐시</div>
	  </div>
	  </div>
	  
	  <div class="c">
	  <div class="box2">
	  <div class="tb3">.</div>
	  <div class="tb4">0</div>
	  </div>
</div> 
<div class="agree">
				<input type="checkbox" id="agree" > 
				<label for="agree" id="agree2" style=" color:gray; font-weight: bold;"> &nbsp;정기 결제 해지와 이용중이던 상품 포기에 동의합니다.</label>
			</div> 
  <div class="btn">
  <input type="button"  class="btn1" value="확인" onClick="" />
  <input type="button"  class="btn2" value="취소" onClick="location.href='twoving.do?command=updateMemberForm'"/>
  </div>
  </form>
</body>
</html>