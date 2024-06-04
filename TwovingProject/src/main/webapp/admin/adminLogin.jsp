<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="admin/css/adminLogin.css">
<script src="admin/script/admin.js"></script>
</head>
<body>
<section class="login-form">
      <h1 style="color : white;">Admin Login</h1>
      <form method="post" action="twoving.do?command=adminlogin" name="loginForm">
          <div class="int-area">
              <input type="text" style="border : 3px solid white; color : white;" name="userid" id="id" placeholder="UserId">
              <!-- <label for="id" style="color : white; font-size: 130%;"></label> -->
          </div>
          <div class="int-area"> <!-- style="float:left;" -->
              <input type="password" style="border : 3px solid white; color : white;" name="pwd" id="pw" placeholder="Password" >
              <!-- <label for="pw" style="color : white; font-size: 130%;"></label> -->
              <!-- <img src="admin/img/pwd.png" width="30px;" style="display: block; margin-top: 10px;"> -->
          </div>
          <div>
              <div style="font-size:120%; color:red;">${message} </div>
          </div>
          <div style="height:30px;"></div>
          <div class="btn-area">
              <button id="btn" type="submit" onClick="return loginCheck()" value="LOGIN">로그인</button>
          </div>
          
      </form>
</section>
</body>
</html>