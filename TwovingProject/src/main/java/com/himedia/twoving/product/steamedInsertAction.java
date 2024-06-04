package com.himedia.twoving.product;

import java.io.IOException;

import com.himedia.twoving.action.Action;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class steamedInsertAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int pseq = Integer.parseInt(request.getParameter("pseq"));

		
//		  HttpSession session = request.getSession(); 
//		  MemberVO mvo = (memberVO)session.getAttribute("loginUser");
//		  
//		 
//		  
//		  if(mvo ==null) { 
//			  response.sendRedirect("twoving.do?command=loginForm"); 
//		  }else{ 
//			  steamedDao sdao = steamedDao.getInstance(); 
//			  steamedVO svo = new steamedVO();
//			  productVO pvo = getProduct(pseq);		
//		  
//		  svo.setUserid(mvo.getUserid()); 
//		  svo.setPseq(pseq); 
//		  sdao.insertsteamed(svo);
//		 
//		  
//		  }
		 

	}

}
