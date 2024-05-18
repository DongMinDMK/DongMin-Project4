<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<c:if test = "${empty loginUser}">
	<jsp:forward page="board.do?command=loginForm"></jsp:forward>
</c:if>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>main.jsp</title>
<link rel = "stylesheet" type = "text/css" href = "css/board.css"/>
<script src = "script/board.js"></script>
</head>
<body>
	<div id = "main_container">
		<h2>게시글 리스트</h2>
		<div class = "loginInfo">
			<div class = "login">
				${loginUser.name}(${loginUser.userid})님이 로그인하셨습니다.
				<input type = "button" value = "회원정보수정" onClick="location.href='board.do?command=updateMemberForm'">
				<input type = "button" value = "로그아웃" onClick="location.href='board.do?command=logout'">
				<input type = "button" value = "회원탈퇴" onClick="withDraw();">
			</div>
			<div class = "writeButton">
				<input type = "button" value = "게시글 등록" onClick="location.href='board.do?command=insertBoardForm'">
			</div>
		</div>
		<div class = "board">
			<div class = "title_row">
				<div class = "title_col">번호</div>
				<div class = "title_col">제목</div>
				<div class = "title_col">작성자</div>
				<div class = "title_col">작성일</div>
				<div class = "title_col">조회수</div>
			</div>
			<c:forEach items="${boardList}" var = "board">
				<div class = "row">
					<div class = "col">${board.num}</div>
					<div class = "col">
						<a style = "text-decoration:none;" href = 'board.do?command=boardView&num=${board.num}'>${board.title}</a>&nbsp;
						<c:if test="${board.replycnt > 0}">
							<span style = "color:red; font-weight:bold;">[${board.replycnt}]</span>
						</c:if>	
						<c:if test="${not empty board.savefilename}">
							<span style = "color:green;">[img]</span>
						</c:if>
					</div>
					<div class = "col">${board.userid}</div>
					<div class = "col"><fmt:formatDate value="${board.writedate}"/></div>
					<div class = "col">${board.readcount}</div>
				</div>
			</c:forEach>
		</div>
		
		<div class = "paging">
			<c:if test="${paging.prev}">
				<a href="board.do?command=main&page=${paging.beginPage-1}">◀</a>
			</c:if>
			
			<c:forEach begin="${paging.beginPage}" end="${paging.endPage}" var="index">
				<c:if test="${index == paging.page}">
					<span style = "color:red;">&nbsp;${index}&nbsp;</span>
				</c:if>
				<c:if test="${index != paging.page}">
					<a href = "board.do?command=main&page=${index}">&nbsp;${index}&nbsp;</a>
				</c:if>
			</c:forEach>
			
			
			<c:if test="${paging.next}">
				<a href="board.do?command=main&page=${paging.endPage+1}">▶</a>
			</c:if>
		
		</div>
	</div>
</body>
</html>