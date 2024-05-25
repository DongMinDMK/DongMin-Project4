package com.himedia.shop.dmk.controller.action.mypage;

import java.io.IOException;

import com.himedia.shop.dmk.controller.action.Action;
import com.himedia.shop.dmk.dao.QnaDAO;
import com.himedia.shop.dmk.dto.MemberDTO;
import com.himedia.shop.dmk.dto.QnaDTO;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class QnaViewAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		MemberDTO memberDTO = (MemberDTO)session.getAttribute("loginUser");
		
		
		if(memberDTO == null) {
			RequestDispatcher rd = request.getRequestDispatcher("shop.do?command=loginForm");
			rd.forward(request, response);
		}else {
			int qseq = Integer.parseInt(request.getParameter("qseq"));
			
			QnaDAO qnaDAO = QnaDAO.getInstance();
			
			QnaDTO qnaDTO = qnaDAO.getOneSelect(qseq);
			
			request.setAttribute("qnaDTO", qnaDTO);
			
			RequestDispatcher rd = request.getRequestDispatcher("qna/qnaView.jsp");
			rd.forward(request, response);
		}
	}

}
