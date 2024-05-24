package com.himedia.shop.dmk.controller.action.mypage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.himedia.shop.dmk.controller.action.Action;
import com.himedia.shop.dmk.dao.QnaDAO;
import com.himedia.shop.dmk.dto.MemberDTO;
import com.himedia.shop.dmk.dto.QnaDTO;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class QnaListAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		MemberDTO memberDTO = (MemberDTO)session.getAttribute("loginUser");
		
		if(memberDTO == null) {
			RequestDispatcher rd = request.getRequestDispatcher("shop.do?command=loginForm");
			rd.forward(request, response);
		}else {
			QnaDAO qnaDAO = QnaDAO.getInstance();
			ArrayList<QnaDTO> list = qnaDAO.getList();
			
			request.setAttribute("qnaList", list);
			
			RequestDispatcher rd = request.getRequestDispatcher("qna/qnaList.jsp");
			rd.forward(request, response);
		}
	}

}
