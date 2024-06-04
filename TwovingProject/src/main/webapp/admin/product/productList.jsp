<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/admin/header.jsp" %>
<%@ include file="/admin/sub_menu.jsp" %>
<article>
	<form method = "post" name="frm">
	<div class="tb">
		<div class="row">
			<div class="col" style="display:flex; align-items : center; border:3px solid black;">
				시리즈/영화 제목 검색 : &nbsp;<input type="text" name="key" value="${key}">
				&nbsp;&nbsp;&nbsp;
				<div>
				
				<!-- <a href="twoving.do?command=adminLogout"> -->
				<img src="admin/images/search.png" style="width:30px; cursor: pointer;" onClick="go_search( 'adminProductList' )">
				
				<!-- <input class="btn" type="button" name="btn_search" value="검색"
				onClick="go_search( 'adminProductList' )">	 -->			
				</div>
				&nbsp;&nbsp;&nbsp;
				<input type="button" style="margin-left: auto; background-color: black; color:white; border:none; font-size: 90%; cursor: pointer;" 
				value="시리즈/영화 등록" onclick="go_wrt();">	
			</div>
		</div>
		<!-- <br> -->
		<div class="row">			
			<div class="coltitle" style="flex:0.5;">번호</div>
			<div class="coltitle" style="flex:1;">종류</div>
			<div class="coltitle" style="flex:2;">장르</div>
			<div class="coltitle" style="flex:4;">제목</div>
			<div class="coltitle" style="flex:0.8;">사용유무</div>
			<div class="coltitle" style="flex:0.8;">New유무</div>
			<div class="coltitle" style="flex:0.8;">Best유무</div> <!-- best/use/new -->
		</div>
		<c:forEach items="${productList}" var="productVO">
			<div class="row">
				<div class="col" style="flex:0.5;">${productVO.pseq}</div>
				<div class="col" style="flex:1;">
					<c:if test="${productVO.kind eq '0'}">시리즈</c:if>
					<c:if test="${productVO.kind eq '1'}">영화</c:if>
				</div>
				<div class="col" style="flex:2;">${productVO.genre}</div>
				<div class="col" style="flex:4;">
					<a href="#" onClick="go_detail( '${productVO.pseq}' )">
						${productVO.title}
					</a>	
				</div>
				<div class="col" style="flex:0.8;">
					<c:choose>
						<c:when test="${productVO.useyn=='N'}"><span style="font-weight: bold; color:red;">미사용</span></c:when>
						<c:otherwise><span style="font-weight: bold; color:blue;">사용</span></c:otherwise>
					</c:choose>
				</div>
				<div class="col" style="flex:0.8;">
					<c:choose>
						<c:when test="${productVO.newyn=='N'}">일반</c:when>
						<c:otherwise><span style="font-weight: bold; color:green;">New</span></c:otherwise>
					</c:choose>
				</div>
				<div class="col" style="flex:0.8;">
					<c:choose>
						<c:when test="${productVO.bestyn=='N'}">일반</c:when>
						<c:otherwise><span style="font-weight: bold; color:magenta;">Best</span></c:otherwise>
					</c:choose>
				</div>
			</div>
		</c:forEach>
		<jsp:include page="/admin/paging/paging.jsp">
			<jsp:param value="twoving.do?command=adminProductList" name="address" />
		</jsp:include>
	</div>
	</form>
</article>

<%@ include file="/admin/footer.jsp" %>