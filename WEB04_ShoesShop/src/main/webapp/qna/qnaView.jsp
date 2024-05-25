<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file= "../header.jsp" %>

<section>
	<%@ include file = "sub_image_menu.jsp" %>
	<article>
		<form>
			<h2>Q&A View</h2>
				<div class="field" style="border-top:2px solid blueviolet;">
					<label>작성자</label>
					<div>${qnaDTO.userid}</div>
				</div>
				<div class="field" style="border-top:2px solid blueviolet;">
					<label>제목</label>
					<div>${qnaDTO.subject}</div>
				</div>
				<div class="field" style="border-top:2px solid blueviolet;">
					<label>작성내용</label>
					<div>${qnaDTO.content}</div>
				</div>
				<div class="field" style="border-top:2px solid blueviolet;">
					<label>답변내용</label>
					<div>${qnaDTO.reply}</div>
				</div>
				<div class="field" style="border-top:2px solid blueviolet;">
					<label>등록일자</label>
					<div><fmt:formatDate value="${qnaDTO.indate}"/></div>
				</div>
			<div class="btn">
				<input type="button" value="목록으로" onClick="location.href='shop.do?command=qnaList'">
			</div>
		</form>
	</article>

</div>	
</section>

<%@ include file= "../footer.jsp" %>