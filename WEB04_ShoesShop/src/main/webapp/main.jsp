<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%> 
<%@ include file= "header.jsp" %>

<!-- main.jsp의 내용 -->
<div id = "main_img">
	<img src="images/main_img.jpg">
</div>

<!-- 신상품 -->
<div id="NewItem">
	<h2>New Item</h2>
	<div class = "products">
		<c:forEach items="${newList}" var="productDTO" varStatus="status">
			<c:choose>
				<c:when test="${status.index==0}">
					<div class="left">
				</c:when>
				<c:when test="${status.index==2}">
					<div class="left">
				</c:when>
				<c:otherwise></c:otherwise>
			</c:choose>
			<div id = "item">
				<div>
					<a href="shop.do?command=productDetail&pseq=${productDTO.pseq}">
						<img src="product_images/${productDTO.image}">
					</a>
				</div>
				<div>
					<a href="shop.do?command=productDetail&pseq=${productDTO.pseq}">
						${productDTO.name}-	<fmt:formatNumber value="${productDTO.price2}" type="currency"></fmt:formatNumber>
					</a>
				</div>
			</div>
			<c:choose>
				<c:when test="${status.index==1}">
					</div>
				</c:when>
				<c:when test="${status.index==3}">
					</div>
				</c:when>
				<c:otherwise></c:otherwise>
			</c:choose>
		</c:forEach>
	</div>
</div>

<!-- 베스트상품 -->
<div id="NewItem">
	<h2>Best Item</h2>
	<div class = "products">
		<c:forEach items="${bestList}" var="productDTO" varStatus="status">
			<c:choose>
				<c:when test="${status.index==0}">
					<div class="left">
				</c:when>
				<c:when test="${status.index==2}">
					<div class="left">
				</c:when>
				<c:otherwise></c:otherwise>
			</c:choose>
			<div id = "item">
				<div>
					<a href="shop.do?command=productDetail&pseq=${productDTO.pseq}">
						<img src="product_images/${productDTO.image}">
					</a>
				</div>
				<div>
					<a href="shop.do?command=productDetail&pseq=${productDTO.pseq}">
						${productDTO.name}-<fmt:formatNumber value="${productDTO.price2}" type="currency"></fmt:formatNumber>
					</a>
				</div>
			</div>
			<c:choose>
				<c:when test="${status.index==1}">
					</div>
				</c:when>
				<c:when test="${status.index==3}">
					</div>
				</c:when>
				<c:otherwise></c:otherwise>
			</c:choose>
		</c:forEach>
	</div>
</div>

<%@ include file= "footer.jsp" %>