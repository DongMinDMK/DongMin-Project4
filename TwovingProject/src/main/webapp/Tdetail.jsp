<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="Theader.jsp" %>
<br>
<br>
<br>
<section>
	<div class="sub_page">		
		<article>
			<form method="post" name="form" >
				<div id="background" 
				style="background-image: url('image2/${productVO.savefilename}');"></div>
				<div id="container">
					<div id="containerA">
						<div id="title">${productVO.title}</div>
						<div id="tag">${productVO.age} ${productVO.year} ${productVO.genre} ${productVO.time}</div>
							
						<div id="linkicon">
							<div class="a" id="b"><a href="">시청하기</a></div> 
							<div class="a" id="c"><a href="#" onClick="steamed();"><img src = images/heartWB.png></a><br>찜</div>
							<input type="hidden" name="pseq" value="${productVO.pseq}">
							<div class="a" id="d"><a href="#" onClick="share();"><img src = images/linkb.png></a><br>공유</div>
						</div>
								
						<div id="content">${productVO.content}</div>
					</div>
						
					<div id="containerB">							
						<div ><img src="image2/${productVO.savefilename}"></div>		
					</div>								
				</div>														
			</form>	
		</article>
	</div>	
</section>
<%@ include file="Tfooter.jsp" %>