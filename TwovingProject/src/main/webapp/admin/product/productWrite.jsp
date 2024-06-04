<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/admin/header.jsp"%>
<%@ include file="/admin/sub_menu.jsp"%>

<!-- <script src="script/jquery-3.7.1.min.js"></script> -->

<article>
	<form name="productWriteFrm" method="post"  enctype="multipart/form-data">
			<h1 style="text-align: center;"> 시리즈 / 영화 작성 </h1>
			<%-- <div class="field" >
					<label>상품분류</label>
					<div>
						<select name="kind" style="width:200px;height:25px;font-size:105%;">
								<option value="">선택하세요</option>
								<c:forEach items="${kindList}" var="kind" varStatus="status">
						    			<option value="${status.count}">${kind}</option>
						   		</c:forEach>
						</select>
					</div>
			</div> --%>
			<div class="field" >
				<label>구분</label>
				<div style="border:1px solid black; width:100px; text-align: left;">
					<input type="radio" name="kind" value="0" checked>시리즈
					<input type="radio" name="kind" value="1">영화
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
			<!-- <div class="field" >
				<label>Use/New/Best</label>
				<input type='checkbox' name='useyn' value="Y" checked />사용 유무
				<input type='checkbox' name='newyn' value="Y" checked />New 시리즈/영화
				<input type='checkbox' name='bestyn' value="Y" />Best 시리즈/영화
				
				<div style="border:1px solid black;"><input type='checkbox' name='useyn' value=1 checked />사용 유무</div>
				<div style="border:1px solid black;"><input type='checkbox' name='newyn' value=1 checked />New 시리즈/영화</div>
				<div style="border:1px solid black;"><input type='checkbox' name='bestyn' value=1 />Best 시리즈/영화</div>
			</div> -->
			<div class="field" >
					<label style="color:blue;">사용 유무</label>
					<input type="radio" name="useyn" value="Y" checked>
					<input type="radio" name="useyn" value="N">
			</div>
			<div class="field" >
					<label style="color:red;">New 유무</label>
					<input type="radio" name="newyn" value="Y" checked>
					<input type="radio" name="newyn" value="N">
			</div>
			<div class="field" >
					<label style="color:green;">Best 유무</label>
					<input type="radio" name="bestyn" value="Y">
					<input type="radio" name="bestyn" value="N" checked>
			</div>
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
					<label>년도</label> <input type="text" name="year"  />
			</div>
			<div class="field" >
					<label>영상 시간</label>	<input type="text" name="time"  />
			</div>
			<div class="field" >
					<label>시리즈/영화명</label>	<input type="text" name="title"  />
			</div>
			<div class="field" >
					<label>상세설명</label><textarea name="content" rows="8" style="flex:4;"></textarea>
			</div>
			
			<!-- 서로 바껴서 들어감 우선적으로 name만 변경 --원복 -->
			<div class="field" >
					<label>시리즈/영화이미지</label><input type="file" name="image">
			</div>
			<div class="field" >
					<label>시리즈/영화이미지(디테일)</label><input type="file" name="image2">
			</div>
			
			<div class="btn" >
					<input type="button" value="상품등록" onClick="go_save()">           
					<input type="button" value="목록으로" 
							onClick="location.href='twoving.do?command=adminProductList'">
			</div>
	</form>
</article>

<%@ include file="/admin/footer.jsp"%>