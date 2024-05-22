<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file= "../header.jsp" %>

<section>
	<%@ include file = "sub_image_menu.jsp" %>
		<article>
			<form name="orderForm">
			<h2>Order List</h2>
			<c:choose>
				<c:when test="${orderList.size()==0}">
					<h3>주문내역이 존재하지 않습니다.</h3>
				</c:when>
				<c:otherwise>
					<div class="tb">
						<div class="row">
							<div class="coltitle">상품명</div>
							<div class="coltitle">수량</div>
							<div class="coltitle">가격</div>
							<div class="coltitle">주문일</div>
							<div class="coltitle">진행상태</div>
						</div>
						<c:forEach items="${orderList}" var="orderDTO">
							<div class="row">
								<div class="col">${orderDTO.pname}</div>
								<div class="col">${orderDTO.quantity}</div>
								<div class="col"><fmt:formatNumber value = "${orderDTO.price2}" type="currency"></fmt:formatNumber></div>
								<div class="col"><fmt:formatDate value="${orderDTO.indate}"/></div>
								<div class="col">처리 진행중....</div>
							</div>
						</c:forEach>
							<div class="row">
								<div class="col"> 총 액 </div>
								<div class="col">
									<fmt:formatNumber value="${totalPrice}" type="currency"></fmt:formatNumber>
								</div>
								<div class="col">
									<input type="button" value="쇼핑계속하기" onClick="location.href='shop.do?command=index'">
								</div>
							</div>
					</div>
				</c:otherwise>
			</c:choose>
		</form>
		</article>
	</div>
</section>

<%@ include file= "../footer.jsp" %>