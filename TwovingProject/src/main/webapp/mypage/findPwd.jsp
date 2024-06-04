<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="css/findpwd.css">
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form>
  <input type="button"	 class="logo" onclick="location.href='twoving.do?command=index'" value="TWOVING" />
  <h1>비밀번호 찾기</h1>
  <div class="all">
  <div class="text">
  아이디 확인 후 등록된 이메일 주소로 비밀번호 재설정을 위한 인증 메일이 발송됩니다. 
  이메일을 확인하여 12시간 이내에 비밀번호 재설정을 완료해주세요.
  </div>
  
  <input type="text" placeholder="아이디" class="box1" />
  <br>
  <input type="button" class="box2" value="확인" />
  </div>
  </form>
</body>
</html>