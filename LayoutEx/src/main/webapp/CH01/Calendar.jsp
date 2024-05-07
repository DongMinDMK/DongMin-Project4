<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import = "java.util.Calendar" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Calendar.jsp</title>
	<style>
		.title{
			text-align:center;
			width : 700px;
			height: 80px;
			border: 1px solid gray;
			margin: 0 auto;
		}
		
		.container{
			display: flex;
			justify-content: center;
			align-items: center;
			flex-direction: column;
			width: 700px;
			border: 1px solid gray;
			margin: 0 auto;
		}
		
		.row{
			display: flex;
			width: 100%;
			height: 80px;
		}
		
		.column{
			text-align:center;
			flex:1;
			border: 1px solid gray;
			line-height: 80px;
		}
		
		.container *{
			font-weight: bold;
			font-size: 130%;
		}
		
		.row .column:first-child{
			color : red;
		}
		
		.row .column:last-child{
			color : blue;
		}
		
		@media(max-width: 700px){
			.title{
				width: 100%;
			}
			
			.container{
				width: 100%;
			}
		}
	</style>
</head>
<body>
<%
	request.setCharacterEncoding("UTF-8");
	response.setCharacterEncoding("UTF-8");
%>
	<% 
	
		Calendar calendar = Calendar.getInstance(); // 현재 날짜 추출
	   int year = calendar.get(Calendar.YEAR); // 현재 날짜 기준 연도추출
	   int month = calendar.get(Calendar.MONTH); //현재 날짜 월 추출(월은 0부터 시작)
	   
 		// request.getParameter("year"); // null;
	   
	   if(request.getParameter("year") != null){
		   year = Integer.parseInt(request.getParameter("year"));
		   month = Integer.parseInt(request.getParameter("month")); // month 는 0부터 11까지 총 12
		    
		   if(month == 12){
			   month = 0;
			   year++;
		   }
		   
		   if(month == -1){
			   month = 11;
			   year--;
		   }
	   }
	   
	   calendar.set(year, month, 1); //현재 연도와 월의 1일을 추출(ex. 2024년 5월 1일로 수정)
	   
	   int last_day = calendar.getActualMaximum(Calendar.DATE); // 2024년 5월 마지막날을 추출 즉 31일.
	   int start_week = calendar.get(Calendar.DAY_OF_WEEK); // 2024년 5월의 시작 요일을 추출(번호로 1번이 일요일, 2번이 월요일)
	   
	%>
	
	<div class = "title">
		<span><input type = "button" value = "이전달" onClick = "location.href='Calendar.jsp?year=<%=year%>&month=<%=month-1%>'">&nbsp;</span>
			  <% out.print("<span style='font-size:180%; font-weight:bold'>" + year + "년 " + (month+1) + "월</span>");%>
			  &nbsp; 
			  <input type = "button" value = "다음달" onClick = "location.href='Calendar.jsp?year=<%=year%>&month=<%=month+1%>'">
			  <br><br>
	</div>
	
	<div class = "container">
		<div class = "row">
			<div class = "column">일</div>
			<div class = "column">월</div>
			<div class = "column">화</div>
			<div class = "column">수</div>
			<div class = "column">목</div>
			<div class = "column">금</div>
			<div class = "column">토</div>
		</div>
		
		
		<% 
			//1일이 포함된 첫 행 출력
			out.print("<div class = 'row'>");
			
			int k;
			
			for(k=1; k<start_week; k++)
				out.print("<div class = 'column'>&nbsp;</div>");
			
			int day = 1;
			
			for(int i=k; i<=7; i++){
				out.print("<div class = 'column'>" + day + "</div>");
				day++;
			}
			
			out.print("</div>");
			
			for(int i=1; i<=5; i++){
				out.print("<div class = 'row'>");
				
				for(int j=1; j<=7; j++){
					if(day > last_day){
						out.print("<div class = 'column'>&nbsp;</div>");
					}else{
						out.print("<div class = 'column'>" + day + "</div>");
						day++;
					}
				}
				
				out.print("</div>");
			}
			
		%>
	</div>
</body>
</html>