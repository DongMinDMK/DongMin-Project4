<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file= "../header.jsp" %>

<section>
	<div class = "sub_img">
		<img src = "images/product/sub_img.jpg">
	</div>
	
	<div class = "sub_page">
		<article style="display:flex; flex-direction:column; align-items:center">
			<h1 style="margin-left:20px">${productDTO.name}</h1>
			<form method="post" name="formm" style="display:flex; flex-direction:column; align-content:center; border:1px solid blue;" 
				  action="shop.do?command=cartInsert">
				<div id="itemdetail">
					<div class="itemdetail-img-title">
						<div><img src="product_images/${productDTO.savefilename}"></div>
						<div>
							<label> 가 격 : </label>${productDTO.price2} 원<br>
							<label> 수 량 : </label>
							<input type = "text" name="quantity" size="2" value="1">
							<input type= "hidden" name="pseq" value="${productDTO.pseq}">
						</div>
					</div>
					<div class="itemdetail-content">
						<h3 style="font-size:200%">${productDTO.content}</h3>
					</div>
					
					<div class="btn">
						<input type="submit" value="장바구니에 담기" onClick="return go_cart()">
						<input type="button" value="즉시 구매" onClick="go_order()">
						<input type="button" value="메인으로" onClick="location.href='shop.do?command=index'">
					</div>
				</div>
			</form>
		</article>
	</div>
</section>


<%@ include file= "../footer.jsp" %>