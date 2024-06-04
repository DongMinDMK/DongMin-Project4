<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="Theader.jsp" %>
<br>
<br>
<section>
<div class="sub_page">
		<article style="flex-direction: column;">		
			<h2 style="color:white;">검색결과</h2>
			<br>	
			<div class="kindproducts">
				<c:forEach items="${searchList}" var="productVO">
					<div class="kinditem"><a href="twoving.do?command=Tdetail&pseq=${productVO.pseq}">
						<img src="image2/${productVO.savefilename}"></a>													
					</div>
				</c:forEach>
			</div>
		</article>
	</div>
</section>





<%@ include file="Tfooter.jsp" %>