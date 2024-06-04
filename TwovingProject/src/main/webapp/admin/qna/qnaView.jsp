<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/admin/header.jsp"%>
<%@ include file="/admin/sub_menu.jsp"%>
<article>
<form method="post" name="frm">
		<h2> Q & A View </h2>
				<input type="hidden" name="qseq" value="${qnaVO.qseq}" />
				<div class="field" style="border-top:2px solid black;">
					<label>작성자</label><div>${qnaVO.userid}</div>
				</div>
				<div class="field" style="border-top:1px dotted black;">
					<label>제목</label><div>${qnaVO.subject}</div>
				</div>
				<div class="field" style="border-top:1px dotted black;">
					<label>등록일</label><div><fmt:formatDate value="${qnaVO.indate}" type="date"/></div>
				</div>
				<div class="field" style="border-top:1px dotted black;">
					<label>질문내용</label><div><pre>${qnaVO.content}</pre></div>
				</div>
				<div class="field" style="border-bottom:2px solid black;border-top:2px solid black;">
					<label>답변내용</label>
					<div style="padding:10px; align-items: center;">
					
							<c:choose>
								<c:when test='${empty qnaVO.reply}'> <!-- 관리자 답변 전 표시 -->
										<img src="admin/images/opinionimg01.gif" width="200" style="flex:1">
							    		<textarea name="reply" rows="3"  cols="60"></textarea>
						   				<input type="button"  style="flex:1" value="저장" onClick="go_rep()">
								</c:when>
								<c:otherwise>  <!-- 관리자 답변 후 표시 -->
									${qnaVO.reply}
								</c:otherwise>
							</c:choose>
							
					</div>
				</div>
				<div class="btn" >
		   			<input type="button" value="목록으로" 
		   				onClick="location.href='shop.do?command=adminQnaList'">	
		   		</div>	
</form>
</article>
<%@ include file="/admin/footer.jsp"%>