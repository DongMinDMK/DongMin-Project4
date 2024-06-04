<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="css/findid.css">
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form>
  <input type="button"	 class="logo" onclick="location.href='twoving.do?command=index'" value="TWOVING" />
  <h1>아이디 찾기</h1>
  <div class="all">
  <div class="text"><p>이메일로 찾기</p>
  							<p style="color: gray;">가입 시 등록한 이메일을 입력해주세요</p></div>
  
  <input type="text" placeholder="이메일" class="box1" />
  <br>
  <input type="button" class="box2" value="확인" />
  </div>
  </form>
</body>
</html>