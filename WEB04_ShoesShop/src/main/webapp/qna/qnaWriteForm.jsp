<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file= "../header.jsp" %>

<section>
	<%@ include file = "sub_image_menu.jsp" %>
	<article>
		<form method="post" action="shop.do?command=qnaWrite">
			<h2>Q&A WriteForm</h2>
				<div class="field" style="border-top:2px solid blueviolet;">
					<label>작성자</label>
					<input type="text" name="userid" value="${loginUser.userid}" readonly>
				</div>
				<div class="field" style="border-top:2px solid blueviolet;">
					<label>제목</label>
					<input type="text" name="subject">
				</div>
				<div class="field" style="border-top:2px solid blueviolet;">
					<label>질문내용</label>
					<textarea rows="10" cols="90" name="content"></textarea>
				</div>
			<div class="btn">
				<input type="submit" value="작성하기">
			</div>
		</form>
	</article>
	</div>
</section>

<%@ include file= "../footer.jsp" %>