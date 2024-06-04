package com.himedia.twoving.controller.action.help;

import java.io.IOException;
import java.util.ArrayList;

import com.himedia.twoving.action.Action;
import com.himedia.twoving.dao.NoticeDAO;
import com.himedia.twoving.util.Paging;
import com.himedia.twoving.vo.MemberVO;
import com.himedia.twoving.vo.NoticeVO;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class NoticeAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// session 에서 userid를 받아와서 일단 로그인 된 사용자인지 검증
		
		HttpSession session = request.getSession();
		MemberVO memberVO = (MemberVO)session.getAttribute("loginUser");
		
		if(memberVO == null) {
			RequestDispatcher rd = request.getRequestDispatcher("loginForm.jsp");
			rd.forward(request, response);
		}else {
			int page = 1;
			  
			 if(request.getParameter("page") != null) {
				 
			  page =  Integer.parseInt(request.getParameter("page"));
			  
			  session.setAttribute("page", page);
			  
			 } else if(session.getAttribute("page") != null) { 
				 
			  page = (Integer)session.getAttribute("page"); 
			  
			} else {
			   session.removeAttribute("page"); 
			 }
			  
			  Paging paging = new Paging(); 
			  
			  paging.setPage(page);
			 
			  NoticeDAO noticeDAO = NoticeDAO.getInstance();
				
			  int count = noticeDAO.getAllCount();
				 
			  System.out.println("count : " + count);
				 
			  paging.setTotalCount(count);
				 
			  ArrayList<NoticeVO> noticeList = noticeDAO.adminProductList(paging);
				
			  request.setAttribute("noticeList", noticeList);
			  request.setAttribute("paging", paging);
				
				RequestDispatcher rd = request.getRequestDispatcher("noticeCenter.jsp");
				rd.forward(request, response);
		    }
	}

}
