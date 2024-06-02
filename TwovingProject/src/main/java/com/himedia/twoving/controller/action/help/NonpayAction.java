package com.himedia.twoving.controller.action.help;

import java.io.IOException;
import java.util.ArrayList;

import com.himedia.twoving.action.Action;
import com.himedia.twoving.dao.FaqDAO;
import com.himedia.twoving.util.Paging;
import com.himedia.twoving.vo.FaqVO;
import com.himedia.twoving.vo.MemberVO;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class NonpayAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		MemberVO memberVO = (MemberVO)session.getAttribute("loginUser");
		
		String nonpay = request.getParameter("inquirylist");
		
		int page = 1;
		  
		 if(request.getParameter("page") != null) {
			 
		  page =  Integer.parseInt(request.getParameter("page"));
		  
		  session.setAttribute("page", page);
		  
		 } else if(session.getAttribute("page") != null) { 
			 
		  page = (Integer)session.getAttribute("page"); 
		  
		} else {
		   session.removeAttribute("page"); 
		 }
		 
		 String key = "";
			
		if(request.getParameter("key") != null) {
			key = request.getParameter("key");
			session.setAttribute("key", key);
		}else if(session.getAttribute("key") != null){
			key = (String)session.getAttribute("key");
		}else {
			session.removeAttribute("key");
		}
		  
		  Paging paging = new Paging(); 
		  
		  paging.setPage(page);
		 
		  FaqDAO faqDAO = FaqDAO.getInstance();
			
		  int count = faqDAO.getAllCount5("faq", "subject", key, nonpay);
			 
		  System.out.println("count : " + count);
			 
		  paging.setTotalCount(count);
		
		ArrayList<FaqVO> nonpayList = faqDAO.getNonpay(nonpay, paging, key);
		
		request.setAttribute("nonpayList", nonpayList);
		request.setAttribute("paging", paging);
		
		RequestDispatcher rd = request.getRequestDispatcher("faqNonPayList.jsp");
		rd.forward(request, response);
	}

}