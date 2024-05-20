<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<link rel="stylesheet" href="css/header_footer.css">
<link rel="stylesheet" href="css/main.css">
<link rel="stylesheet" href="css/section.css">
<script src = "script/member.js"></script>

<div id = "popup">
	<form method = "post" name = "formm" action="shop.do?command=findZipNum">
		동 이름 : <input type="text" name = "dong">
		<input type = "submit" value = "찾기" class = "submit">
	</form>
		
		<table id = "zipcode" border="1">
			<tr><th width="100">우편번호</th><th>주소</th></tr>
			<c:forEach items = "${addressList}" var = "add">
				<tr>
					<td>
						<a href="#" onClick="addressOK('${add.zip_num}', '${add.sido}', '${add.gugun}', '${add.dong}')">
							${add.zip_num}
						</a>
					</td>
					<td>
						<a href="#" onClick="addressOK('${add.zip_num}', '${add.sido}', '${add.gugun}', '${add.dong}')">
							${add.sido} ${add.gugun} ${add.dong}
						</a>
					</td>
				</tr>
			</c:forEach>
		</table>
	
	
</div>
