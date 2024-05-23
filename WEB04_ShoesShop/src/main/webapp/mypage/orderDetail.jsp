<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file= "../header.jsp" %>
	<section>
	<%@ include file = "sub_image_menu.jsp" %>
	
	<article>
		<form name="cartForm" method="post">
			<h2>주문자 정보</h2>
				<div class="tb" style="margin-bottom:20px;">
					<div class="row">
						<div class="coltitle">주문일자</div>
						<div class="coltitle">주문번호</div>
						<div class="coltitle">주문자성명</div>
						<div class="coltitle">주문총액</div>
					</div>
					<div class="row">
						<div class="col">${orderDetail.indate}</div>
						<div class="col">${orderDetail.oseq}</div>
						<div class="col">${orderDetail.mname}</div>
						<div class="col">${totalPrice}</div>
					</div>
					<div class="row">
						<div class = "coltitle" style="flex:1;">배송주소</div>
						<div class = "col" style="flex:4;">${orderDetail.zip_num} ${orderDetail.address1} ${orderDetail.address2}</div>
					</div>
				</div>
			<h2>주문 상품 정보</h2>
				<div class="tb">
					<div class="row">
						<div class="coltitle">상품명</div>
						<div class="coltitle">상품별 주문번호</div>
						<div class="coltitle">수량</div>
						<div class="coltitle">가격</div>
					</div>
					<c:forEach items="${orderList}" var="orderDTO">
						<div class="row">
							<div class="col">${orderDTO.pname}</div>
							<div class="col">${orderDTO.odseq}</div>
							<div class="col">${orderDTO.quantity}</div>
							<div class="col">${orderDTO.price2}</div>
						</div>
					</c:forEach>
				</div>
				<div class="btn">
					<input type="button" value="뒤로" onClick="location.href='shop.do?command=mypage'">
					<input type="button" value="메인으로" onClick="location.href='shop.do?command=index'">
				</div>
		</form>
	</article>
</div>
</section>

<%@ include file= "../footer.jsp" %>