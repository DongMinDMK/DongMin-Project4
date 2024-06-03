<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="css/mypage.css">
<script src="script/payment.js"></script>
<title>Insert title here</title>
</head>
<body>
 
 <section>
	<article>
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
	         	<a> <input type="button" onClick="location.href='twoving.do?command=ticket'" value="이용권 구독"   style="background-color: #191919; border-radius: 3px; border:1px solid gray; color: white; cursor: pointer;"/></a></p></div>
	         
	         	<div class="box22-3" onClick="location.href='twoving.do?command=updateMemberForm'">
	         		<a><img src="member/톱니바퀴.png" width="30px" height="30px" /></a>회원정보 수정
	         	</div>
         </div>
         
         <div class="box44">
      		<div class="box44-1">시청 내역 &nbsp;</div>
      		<div class="box44-2">찜 &nbsp;</div>
      		<div class="box44-3">이용권 내역 &nbsp;</div>
      		<div class="box44-4">문의 내역 &nbsp;</div>
		</div>
		
		
		<div class="passTicketandcash">
			<div class="left">
				<a href=""><span style="color:gray; margin-left: 15px;">이용권</span></a> &nbsp;&nbsp; | &nbsp;&nbsp;
				<a href=""><span style="color:gray;">캐시</span></a>
			</div>
			<div class="right" style="">
				<input type="button" value="이용권 구독하기" style="background-color:black; border: 1px solid gray; color: gray; font-weight: bold; padding: 3px;">
			</div>
		</div>
		
		<div class="paymentTable" style="position:absolute; border: 1px solid white; width:100%;">
			<table style="display:flex; flex-direction: column; width: 100%;">
				<tr style="background-color:gray; width: 100%; color: white;">
					<th style="width: 100%;">상태</th>
					<th>상품명</th>
					<th>결제금액</th>
					<th>결제수단</th>
					<th>결제일</th>
					<th>이용기간</th>
				</tr>
					<c:forEach items="${passTicket2}" var="payment">
					<tr>
						<td>
							<c:choose>
								<c:when test="${payment.subscribeyn == 'N'}">
									<span style="color:gray; font-weight:bold;">만료</span>
								</c:when>
								<c:otherwise>
									<span style="color:red; font-weight:bold;">구독중</span>
								</c:otherwise>
							</c:choose>
						</td>
						<td>
							<c:choose>
								<c:when test="${payment.subscribeyn == 'Y'}">
									${payment.productname}<br>
									<input type="button" value="변경/해지"  onClick="updateDefuseCheck('${payment.productname}');" style="background-color:black; border: 1px solid gray; color: gray; margin-top: 3px; cursor:pointer;">
								</c:when>
								<c:otherwise>
									${payment.productname}
								</c:otherwise>
							</c:choose>
						</td>
						<td>${payment.paymentprice}</td>
						<td>${payment.paymentmeans}</td>
						<td><fmt:formatDate value="${payment.paymentday}"/></td>
						<td><fmt:formatDate value="${payment.runperiod1}"/> ~ <fmt:formatDate value="${payment.runperiod2}"/></td>
					</tr>
					</c:forEach>
			</table>
			
			<jsp:include page="paging/passTicketPaging2.jsp">
				<jsp:param value="twoving.do?command=passTicketList" name="address"/>
			</jsp:include>
		</div>
         
		</article>
</section>