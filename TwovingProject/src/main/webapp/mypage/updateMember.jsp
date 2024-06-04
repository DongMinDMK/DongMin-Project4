<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
    <script src="script/mypage.js"></script>

<link rel="stylesheet" href="css/update.css">
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form method="post" action="twoving.do?command=updateMember" name="joinForm">
	<button class="logo" onclick="location.href='twoving.do?command=index'" style="cursor: pointer;">TWOVING</button>
						
							
							<h3>회원정보 수정</h3>
							<div class="field">
								<label>아이디</label>
								<div class="userid">${userid}</div>
							</div>
							<div class="field">
								<label>이름</label>
								<div class="name">${name}</div>
							</div>
							<div class="field">
								<label>이메일</label><input name="email" type="text" value="${loginUser.email}"/>
							</div>
							<div class="field">
								<label>휴대폰 번호</label><input name="phone" type="text" value="${loginUser.phone}"/>
							</div>
				
				<input type="button" class="secession" onclick="location.href='twoving.do?command=deleteMember'" value="회원탈퇴" />
	<div class="btn">
	<input type="button"  class="btn1" value="확인" onClick="go_updateMember()" />
  <input type="button"  class="btn2" value="취소" onClick="location.href='twoving.do?command=mypage'"/>
	</div>
	</form>
	
		
</body>
</html>