<%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>
<%@ include file="Theader.jsp" %>
<br>
<br>
<section>
	<div class="sub_page">
		<article style="flex-direction: column;">		
			<div style="display:flex;"><h2 style="color:white;">${kind}</h2> <h2 style="color:white;">-${genre}</h2></div>
			<div class="genreproducts">
			<c:forEach items="${genreProduct}" var="productVO">
				<div class="genreitem"><a href="twoving.do?command=Tdetail&pseq=${productVO.pseq}">
					<img src="image2/${productVO.savefilename}"></a>		
				</div>
			</c:forEach>
			</div>
		</article>
	</div>
</section>
<%@ include file="Tfooter.jsp" %>