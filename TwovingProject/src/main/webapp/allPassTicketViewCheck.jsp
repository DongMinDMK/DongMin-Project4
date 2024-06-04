<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<%@ include file="header.jsp" %>

<title>이용권 선택</title>

<div class="popup" style="display:flex; flex-direction: column; margin-top: 100px;">
<div class="popupheader">
		<h1 style="color: white; margin: 0 auto; margin-top: 100px; margin-bottom: 30px;">변경할 이용권을 선택하세요</h1>
</div>
<div style="display:flex; flex-direction: column;">
	<form>
	<div class="sub_contents" style="display:flex; flex-direction: column;">
	<h1 style="color: white; margin: 0 auto; margin-bottom: 30px;">변경할 이용권을 선택하세요</h1>
	<section style="display:flex;">
		<div class="passTicketSelect" style="width: 100%; display:flex; justify-content: space-between;">
			<c:choose>
				<c:when test="${paymentVO.productname eq '광고형 스탠다드'}">
					<div class="advertiseStandard" onClick="colorRedOrGray(this);" onMouseOver="hoverEffect(this)" onMouseOut="resetColor(this)" style="border: 1px solid gray; width: 43%; opacity: 0.4; color:white; border-radius:15px 15px 15px 15px; padding: 40px; margin-right: 10px; background-color:red;">
						<p style="font-weight: bold; color:white; text-align:center;">광고형<br> 스탠다드</p>
						<input type="hidden" name="productname" value='광고형 스탠다드'>
					</div>
					<div class="basic" onClick="colorRedOrGray(this);" onMouseOver="hoverEffect(this)" onMouseOut="resetColor(this)" style="border: 1px solid gray; width: 43%; opacity: 0.4; color:white; border-radius:15px 15px 15px 15px; padding: 40px; margin-right: 10px; background-color:gray;">
						<p style="font-weight: bold; color:white; text-align:center;">베이직</p>
						<input type="hidden" name="productname" value='베이직'>
					</div>
					<div class="standard" onClick="colorRedOrGray(this);" onMouseOver="hoverEffect(this)" onMouseOut="resetColor(this)" style="border: 1px solid gray; width: 30%; opacity: 0.4; color:white; border-radius:15px 15px 15px 15px; padding: 40px; margin-right: 10px; background-color:gray;">
						<p style="font-weight: bold; color:white; text-align:center;">스탠다드</p>
						<input type="hidden" name="productname" value='스탠다드'>
					</div>
					<div class="premium" onClick="colorRedOrGray(this);" onMouseOver="hoverEffect(this)" onMouseOut="resetColor(this)" style="border: 1px solid gray; width: 30%; opacity: 0.4; color:white; border-radius:15px 15px 15px 15px; padding: 40px; background-color:gray;">
						<p style="font-weight: bold; color:white; text-align:center;">프리미엄</p>
						<input type="hidden" name="productname" value='프리미엄'>
					</div>
				</c:when>
				<c:when test="${paymentVO.productname eq '베이직'}">
					<div class="advertiseStandard" onClick="colorRedOrGray(this);" onMouseOver="hoverEffect(this)" onMouseOut="resetColor(this)" style="border: 1px solid gray; width: 43%; opacity: 0.4; color:white; border-radius:15px 15px 15px 15px; padding: 40px; margin-right: 10px; background-color:gray;">
						<p style="font-weight: bold; color:white; text-align:center;">광고형<br> 스탠다드</p>
						<input type="hidden" name="productname" value='광고형 스탠다드'>
					</div>
					<div class="basic" onClick="colorRedOrGray(this);" onMouseOver="hoverEffect(this)" onMouseOut="resetColor(this)" style="border: 1px solid gray; width: 43%; opacity: 0.4; color:white; border-radius:15px 15px 15px 15px; padding: 40px; margin-right: 10px; background-color:red;">
						<p style="font-weight: bold; color:white; text-align:center;">베이직</p>
						<input type="hidden" name="productname" value='베이직'>
					</div>
					<div class="standard" onClick="colorRedOrGray(this);" onMouseOver="hoverEffect(this)" onMouseOut="resetColor(this)" style="border: 1px solid gray; width: 30%; opacity: 0.4; color:white; border-radius:15px 15px 15px 15px; padding: 40px; margin-right: 10px; background-color:gray;">
						<p style="font-weight: bold; color:white; text-align:center;">스탠다드</p>
						<input type="hidden" name="productname" value='스탠다드'>
					</div>
					<div class="premium" onClick="colorRedOrGray(this);" onMouseOver="hoverEffect(this)" onMouseOut="resetColor(this)" style="border: 1px solid gray; width: 30%; opacity: 0.4; color:white; border-radius:15px 15px 15px 15px; padding: 40px; background-color:gray;">
						<p style="font-weight: bold; color:white; text-align:center;">프리미엄</p>
						<input type="hidden" name="productname" value='프리미엄'>
					</div>
				</c:when>
				<c:when test="${paymentVO.productname eq '스탠다드'}">
					<div class="advertiseStandard" onClick="colorRedOrGray(this);" onMouseOver="hoverEffect(this)" onMouseOut="resetColor(this)" style="border: 1px solid gray; width: 43%; opacity: 0.4; color:white; border-radius:15px 15px 15px 15px; padding: 40px; margin-right: 10px; background-color:gray;">
						<p style="font-weight: bold; color:white; text-align:center;">광고형<br> 스탠다드</p>
						<input type="hidden" name="productname" value='광고형 스탠다드'>
					</div>
					<div class="basic" onClick="colorRedOrGray(this);" onMouseOver="hoverEffect(this)" onMouseOut="resetColor(this)"  style="border: 1px solid gray; width: 43%; opacity: 0.4; color:white; border-radius:15px 15px 15px 15px; padding: 40px; margin-right: 10px; background-color:gray;">
						<p style="font-weight: bold; color:white; text-align:center;">베이직</p>
						<input type="hidden" name="productname" value='베이직'>
					</div>
					<div class="standard" onClick="colorRedOrGray(this);" onMouseOver="hoverEffect(this)" onMouseOut="resetColor(this)" style="border: 1px solid gray; width: 30%; opacity: 0.4; color:white; border-radius:15px 15px 15px 15px; padding: 40px; margin-right: 10px; background-color:red;">
						<p style="font-weight: bold; color:white; text-align:center;">스탠다드</p>
						<input type="hidden" name="productname" value='스탠다드'>
					</div>
					<div class="premium" onClick="colorRedOrGray(this);" onMouseOver="hoverEffect(this)" onMouseOut="resetColor(this)" style="border: 1px solid gray; width: 30%; opacity: 0.4; color:white; border-radius:15px 15px 15px 15px; padding: 40px; background-color:gray;">
						<p style="font-weight: bold; color:white; text-align:center;">프리미엄</p>
						<input type="hidden" name="productname" value='프리미엄'>
					</div>
				</c:when>
				<c:when test="${paymentVO.productname eq '프리미엄'}">
					<div class="advertiseStandard" onClick="colorRedOrGray(this);" onMouseOver="hoverEffect(this)" onMouseOut="resetColor(this)" style="border: 1px solid gray; width: 43%; opacity: 0.4; color:white; border-radius:15px 15px 15px 15px; padding: 40px; margin-right: 10px; background-color:gray;">
						<p style="font-weight: bold; color:white; text-align:center;">광고형<br> 스탠다드</p>
						<input type="hidden" name="productname" value='광고형 스탠다드'>
					</div>
					<div class="basic" onClick="colorRedOrGray(this);" onMouseOver="hoverEffect(this)" onMouseOut="resetColor(this)" style="border: 1px solid gray; width: 43%; opacity: 0.4; color:white; border-radius:15px 15px 15px 15px; padding: 40px; margin-right: 10px; background-color:gray;">
						<p style="font-weight: bold; color:white; text-align:center;">베이직</p>
						<input type="hidden" name="productname" value='베이직'>
					</div>
					<div class="standard" onClick="colorRedOrGray(this);" onMouseOver="hoverEffect(this)" onMouseOut="resetColor(this)" style="border: 1px solid gray; width: 30%; opacity: 0.4; color:white; border-radius:15px 15px 15px 15px; padding: 40px; margin-right: 10px; background-color:gray;">
						<p style="font-weight: bold; color:white; text-align:center;">스탠다드</p>
						<input type="hidden" name="productname" value='스탠다드'>
					</div>
					<div class="premium" onClick="colorRedOrGray(this);" onMouseOver="hoverEffect(this)" onMouseOut="resetColor(this)" style="border: 1px solid gray; width: 30%; opacity: 0.4; color:white; border-radius:15px 15px 15px 15px; padding: 40px; background-color:red;">
						<p style="font-weight: bold; color:white; text-align:center;">프리미엄</p>
						<input type="hidden" name="productname" value='프리미엄'>
					</div>
				</c:when>
			</c:choose>
		</div>
	</section>
   </div>
	<div style="display:flex; flex-direction: column;">
		<table class="updateDefuseTable" style="display: flex; flex-direction: column;">
		<c:choose>
			<c:when test="${paymentVO.productname eq '광고형 스탠다드'}">
				<tr>
					<th>월간요금</th>
				</tr>
				<tr>
					<td style="color:red;">
						5,500원
						<input type="hidden" name="paymentprice" value='5,500원'/>	
					</td>
					<td>9,500원</td>
					<td>13,500원</td>
					<td>17,000원</td>
				</tr>
				<tr>
					<th>동시시청</th>
				</tr>
				<tr>
					<td style="color:red;">2대</td>
					<td>1대</td>
					<td>2대</td>
					<td>4대</td>
				</tr>
				<tr>
					<th>프로필</th>
				</tr>
				<tr>
					<td style="color:red;">4개</td>
					<td>4개</td>
					<td>4개</td>
					<td>4개</td>
			</tr>
			<tr>
				<th>화질</th>
			</tr>
			<tr>
				<td style="color:red;">1080p</td>
				<td>720p</td>
				<td style="margin-left:60px;">1080p</td>
				<td>1080p(4K 일부)</td>
			</tr>
			<tr>
				<th>콘텐츠 다운로드</th>
			</tr>
			<tr>
				<td style="color:red;">15회</td>
				<td>200회</td>
				<td>300회</td>
				<td>400회</td>
			</tr>
			<tr>
				<th>모바일,태블릿,PC,TV지원</th>
			</tr>
			<tr>
				<td style="color:red;"><img src="images/checks.jpg" style="width:20px; border-radius:50%;"></td>
				<td><img src="images/checks.jpg" style="width:20px; border-radius:50%;"></td>
				<td><img src="images/checks.jpg" style="width:20px; border-radius:50%;"></td>
				<td><img src="images/checks.jpg" style="width:20px; border-radius:50%;"></td>
			</tr>
			<tr>
				<th>광고</th>
			</tr>
			<tr>
				<td style="color:red;"><img src="images/checks.jpg" style="width:20px; border-radius:50%;"></td>
				<td><img src="images/x.png" style="width:30px; border-radius:50%;"></td>
				<td><img src="images/x.png" style="width:30px; border-radius:50%;"></td>
				<td><img src="images/x.png" style="width:30px; border-radius:50%;"></td>
			</tr>
			</c:when>
			<c:when test="${paymentVO.productname eq '베이직'}">
				<tr>
					<th>월간요금</th>
				</tr>
				<tr>
					<td>5,500원</td>
					<td style="color:red;">
						9,500원
						<input type="hidden" name="paymentprice" value='9,500원'/>	
					</td>
					<td>13,500원</td>
					<td>17,000원</td>
				</tr>
				<tr>
					<th>동시시청</th>
				</tr>
				<tr>
					<td>2대</td>
					<td  style="color:red;">1대</td>
					<td>2대</td>
					<td>4대</td>
				</tr>
				<tr>
					<th>프로필</th>
				</tr>
				<tr>
					<td>4개</td>
					<td  style="color:red;">4개</td>
					<td>4개</td>
					<td>4개</td>
			</tr>
			<tr>
				<th>화질</th>
			</tr>
			<tr>
				<td>1080p</td>
				<td style="color:red;">720p</td>
				<td style="margin-left:60px;">1080p</td>
				<td>1080p(4K 일부)</td>
			</tr>
			<tr>
				<th>콘텐츠 다운로드</th>
			</tr>
			<tr>
				<td>15회</td>
				<td style="color:red;">200회</td>
				<td>300회</td>
				<td>400회</td>
			</tr>
			<tr>
				<th>모바일,태블릿,PC,TV지원</th>
			</tr>
			<tr>
				<td><img src="images/checks.jpg" style="width:20px; border-radius:50%;"></td>
				<td style="color:red;"><img src="images/checks.jpg" style="width:20px; border-radius:50%;"></td>
				<td><img src="images/checks.jpg" style="width:20px; border-radius:50%;"></td>
				<td><img src="images/checks.jpg" style="width:20px; border-radius:50%;"></td>
			</tr>
			<tr>
				<th>광고</th>
			</tr>
			<tr>
				<td><img src="images/checks.jpg" style="width:20px; border-radius:50%;"></td>
				<td style="color:red;"><img src="images/x.png" style="width:30px; border-radius:50%;"></td>
				<td><img src="images/x.png" style="width:30px; border-radius:50%;"></td>
				<td><img src="images/x.png" style="width:30px; border-radius:50%;"></td>
			</tr>
			</c:when>
			<c:when test="${paymentVO.productname eq '스탠다드'}">
				<tr>
					<th>월간요금</th>
				</tr>
				<tr>
					<td>5,500원</td>
					<td>9,500원</td>
					<td style="color:red;">
						13,500원
						<input type="hidden" name="paymentprice" value='13,500원'/>	
					</td>
					<td>17,000원</td>
				</tr>
				<tr>
					<th>동시시청</th>
				</tr>
				<tr>
					<td>2대</td>
					<td>1대</td>
					<td style="color:red;">2대</td>
					<td>4대</td>
				</tr>
				<tr>
					<th>프로필</th>
				</tr>
				<tr>
					<td>4개</td>
					<td>4개</td>
					<td style="color:red;">4개</td>
					<td>4개</td>
			</tr>
			<tr>
				<th>화질</th>
			</tr>
			<tr>
				<td>1080p</td>
				<td>720p</td>
				<td style="margin-left:60px; color:red;">1080p</td>
				<td>1080p(4K 일부)</td>
			</tr>
			<tr>
				<th>콘텐츠 다운로드</th>
			</tr>
			<tr>
				<td>15회</td>
				<td>200회</td>
				<td style="color:red;">300회</td>
				<td>400회</td>
			</tr>
			<tr>
				<th>모바일,태블릿,PC,TV지원</th>
			</tr>
			<tr>
				<td><img src="images/checks.jpg" style="width:20px; border-radius:50%;"></td>
				<td><img src="images/checks.jpg" style="width:20px; border-radius:50%;"></td>
				<td  style="color:red;"><img src="images/checks.jpg" style="width:20px; border-radius:50%;"></td>
				<td><img src="images/checks.jpg" style="width:20px; border-radius:50%;"></td>
			</tr>
			<tr>
				<th>광고</th>
			</tr>
			<tr>
				<td><img src="images/checks.jpg" style="width:20px; border-radius:50%;"></td>
				<td><img src="images/x.png" style="width:30px; border-radius:50%;"></td>
				<td style="color:red;"><img src="images/x.png" style="width:30px; border-radius:50%;"></td>
				<td><img src="images/x.png" style="width:30px; border-radius:50%;"></td>
			</tr>
			</c:when>
			<c:when test="${paymentVO.productname eq '프리미엄'}">
				<tr>
					<th>월간요금</th>
				</tr>
				<tr>
					<td>5,500원</td>
					<td>9,500원</td>
					<td>13,500원</td>
					<td style="color:red;">
						17,000원
						<input type="hidden" name="paymentprice" value='17,000원'/>	
					</td>
				</tr>
				<tr>
					<th>동시시청</th>
				</tr>
				<tr>
					<td>2대</td>
					<td>1대</td>
					<td>2대</td>
					<td style="color:red;">4대</td>
				</tr>
				<tr>
					<th>프로필</th>
				</tr>
				<tr>
					<td>4개</td>
					<td>4개</td>
					<td>4개</td>
					<td style="color:red;">4개</td>
			</tr>
			<tr>
				<th>화질</th>
			</tr>
			<tr>
				<td>1080p</td>
				<td>720p</td>
				<td style="margin-left:60px;">1080p</td>
				<td style="color:red;">1080p(4K 일부)</td>
			</tr>
			<tr>
				<th>콘텐츠 다운로드</th>
			</tr>
			<tr>
				<td>15회</td>
				<td>200회</td>
				<td>300회</td>
				<td style="color:red;">400회</td>
			</tr>
			<tr>
				<th>모바일,태블릿,PC,TV지원</th>
			</tr>
			<tr>
				<td><img src="images/checks.jpg" style="width:20px; border-radius:50%;"></td>
				<td><img src="images/checks.jpg" style="width:20px; border-radius:50%;"></td>
				<td><img src="images/checks.jpg" style="width:20px; border-radius:50%;"></td>
				<td style="color:red;"><img src="images/checks.jpg" style="width:20px; border-radius:50%;"></td>
			</tr>
			<tr>
				<th>광고</th>
			</tr>
			<tr>
				<td><img src="images/checks.jpg" style="width:20px; border-radius:50%;"></td>
				<td><img src="images/x.png" style="width:30px; border-radius:50%;"></td>
				<td><img src="images/x.png" style="width:30px; border-radius:50%;"></td>
				<td style="color:red;"><img src="images/x.png" style="width:30px; border-radius:50%;"></td>
			</tr>
			</c:when>
		</c:choose>
		</table>
	</div>
	<div class="checkAllPassTicket">
		<input type="button" value="모든 이용권 보기" onClick="allPassTicketView('${paymentVO.productname}')" style="background-color:black; border: 1px solid gray; color:white; margin: 0 auto; padding: 15px; cursor:pointer; border-radius:15px 15px 15px 15px;">
	</div>
	</form>
</div>
</div>