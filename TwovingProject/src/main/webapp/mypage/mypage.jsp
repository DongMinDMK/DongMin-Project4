<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<script src="script/member.js"></script>

<link rel="stylesheet" href="css/mypage.css">
<link rel="stylesheet" href="css/header_footer.css">
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<section>
	<article>
	<form>
	<div class="box">
	
	<div class="box1">
	<input type="button" class="logo" onclick="location.href='twoving.do?command=index'" style="cursor: pointer;"value="TWOVING" />
					<div class="box1-2">시리즈</div>
					<div class="box1-3">영화</div>
				</div>
		<div class="box2">
					<div class="box2-2"><img src="member/돋보기.png" width="40px" height="40px"  />&nbsp;&nbsp;</div>
			<div class="box2-1"><img src="member/logo.png" width="40px" height="40px"  />&nbsp;&nbsp;</div>

		</div>
		</div>
		<div class="box22">
			<div class="box22-1"><img src="member/logo.png" width="120px" height="120px"  /></div>
			<div class="box22-2"><p>이름</p>
			<p><a><img src="member/구름.png" width="30px" height="30px" /></a>&nbsp; 나의 이용권&nbsp;&nbsp;
			<a class="ticket" href="twoving.do?command=ticket" onClick="window.open(this.href, '', 'width=550, height=650, top=150, left=690' ); return false;">이용권 구독</a></p></div>
			
			<div class="box22-3" onClick="location.href='twoving.do?command=updateMemberForm'"><a><img src="member/톱니바퀴.png" width="30px" height="30px" /></a>회원정보 수정</div>
			
		</div>
		<div class="box33">
		<div class="box33-1">
			이용권을 구독하고 <a>twoving</a> 등 인기 TV프로그램과 다양한 영화를 자유롭게 시청하세요!
		</div>
		</div>
		
		<div class="box44">
		
	
		<div class="box44-1">시청 내역 &nbsp;</div>
		<div class="box44-2">찜 &nbsp;</div>
		<div class="box44-3">이용권 내역 &nbsp;</div>
		<div class="box44-4">문의 내역 &nbsp;</div>

		
		
		</div>
	</form>
	
	</article>
</section>
</body>
</html>

