<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/admin/header.jsp"%>
<%@ include file="/admin/sub_menu.jsp"%>

<article>
	<form name="productUpdateFrm" method="post"  enctype="multipart/form-data">
			<input type="hidden" name="pseq" value="${productVO.pseq}">
			<input type="hidden" name="oldimage" value="${productVO.image}">
			<input type="hidden" name="oldsavefilename" value="${productVO.savefilename}">
			<input type="hidden" name="oldimage2" value="${productVO.image2}">
			<input type="hidden" name="oldsavefilename2" value="${productVO.savefilename2}">
			
			<h1 style="text-align: center;"> 시리즈 / 영화 수정 </h1>
			
			<!-- 라디오 버튼 불러오기 -->
				<!-- <input type="radio" name="kind" value="0" checked>시리즈
					<input type="radio" name="kind" value="1">영화 -->
			<div class="field" >
				<label>구분</label>
				<div style="border:1px solid black; width:100px; text-align: left;">
					<c:choose>
						<c:when test='${productVO.kind==0}'>
							<input type="radio" name="kind" value="0" checked="checked">시리즈
							<input type="radio" name="kind" value="1">영화
						</c:when>
						<c:otherwise>
							<input type="radio" name="kind" value="0">시리즈
							<input type="radio" name="kind" value="1" checked="checked">영화
						</c:otherwise>
					</c:choose>
				</div>
			</div>
			<div class="field" >
				<label>장르</label>
				<select name="genre" id="genre" style="width:100px;">
				    <option value="사극">사극</option>
				    <option value="멜로">멜로</option>
				    <option value="액션">액션</option>
				    <option value="히어로">히어로</option>
				    <option value="공포">공포</option>
				    <option value="범죄">범죄</option>
				    <option value="판타지">판타지</option>
				    <option value="코미디">코미디</option>
				    <option value="애니메이션">애니메이션</option>
				    <option value="스릴러">스릴러</option>
			  	</select>	
			</div>
			<!-- 
				<div class="field">
					<label>상품분류</label>
					<div>
						<select name="kind" style="width:200px; height:20px; font-size: 105%;">
							<option value="">선택하세요</option>
							<c:forEach items="${kindList}" var="kind" varStatus="status">
								<c:choose>
									<c:when test="${status.count==productVO.kind}">
										<option value="${status.count}" selected>${kind}</option>
									</c:when>
									<c:otherwise>
										<option value="${status.count}">${kind}</option>
									</c:otherwise>
								</c:choose>
							</c:forEach>
						</select>
					</div>
				</div>
			 -->
			 <div class="field" >
				<label style="color:blue;">사용 유무</label>
				<div style="border:1px solid black; width:100px; text-align: left;">
					<c:choose>
						<c:when test='${productVO.useyn=="Y"}'>
							<input type="radio" name="useyn" value="Y" checked>Y
							<input type="radio" name="useyn" value="N">N
						</c:when>
						<c:otherwise>
							<input type="radio" name="useyn" value="Y">Y
							<input type="radio" name="useyn" value="N" checked>N
						</c:otherwise>
					</c:choose>
				</div>
			</div>
			<div class="field" >
				<label style="color:red;">New 유무</label>
				<div style="border:1px solid black; width:100px; text-align: left;">
					<c:choose>
						<c:when test='${productVO.newyn=="Y"}'>
							<input type="radio" name="newyn" value="Y" checked>Y
							<input type="radio" name="newyn" value="N">N
						</c:when>
						<c:otherwise>
							<input type="radio" name="newyn" value="Y">Y
							<input type="radio" name="newyn" value="N" checked>N
						</c:otherwise>
					</c:choose>
				</div>
			</div>
			<div class="field" >
				<label style="color:green;">Best 유무</label>
				<div style="border:1px solid black; width:100px; text-align: left;">
					<c:choose>
						<c:when test='${productVO.bestyn=="Y"}'>
							<input type="radio" name="bestyn" value="Y" checked>Y
							<input type="radio" name="bestyn" value="N">N
						</c:when>
						<c:otherwise>
							<input type="radio" name="bestyn" value="Y">Y
							<input type="radio" name="bestyn" value="N" checked>N
						</c:otherwise>
					</c:choose>
				</div>
			</div>
			<!-- select 불러오기 -->
			<div class="field" >
					<label>관람 나이 제한</label>
					<select name="age" id="age">
					    <option value="ALL">ALL</option>
					    <option value="12">12</option>
					    <option value="15">15</option>
					    <option value="18">18</option>
			  		</select>	
			</div>
			<div class="field" >
					<label>년도</label> <input type="text" name="year" value="${productVO.year}" />
			</div>
			<div class="field" >
					<label>영상 시간</label>	<input type="text" name="time" value="${productVO.time}"  />
			</div>
			<div class="field" >
					<label>시리즈/영화명</label>	<input type="text" name="title" value="${productVO.title}"  />
			</div>
			<div class="field" >
					<label>상세설명</label><textarea name="content" rows="8" style="flex:4;">${productVO.content}</textarea>
			</div>
			
			<!-- 서로 바껴서 들어감 우선적으로 name만 변경(원복) -->
			<div class="field">
				<label>시리즈/영화 이미지</label>
				<input type="file" name="image">
			</div>
			<div class="field" >
					<label>기존 이미지</label>
					<img src="product_images/${productVO.savefilename}" width="200">
			</div>
			
			<div class="field">
				<label>시리즈/영화 이미지(디테일)</label>
				<input type="file" name="image2">
			</div>
			<div class="field" >
					<label>기존이미지(디테일)</label>
					<img src="product_images/${productVO.savefilename2}" width="200">
			</div>
			
			<div class="btn">
				<input type="button" value="상품수정" onclick="go_update()" >
				<input type="button" value="목록으로" 
				onclick="location.href='twoving.do?command=adminProductList'" >
		</div>
	</form>
</article>

<%@ include file="/admin/footer.jsp"%>