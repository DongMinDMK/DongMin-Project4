package com.himedia.shop.dmk.controller.action.mypage;

import java.io.IOException;

import com.himedia.shop.dmk.controller.action.Action;
import com.himedia.shop.dmk.dao.QnaDAO;
import com.himedia.shop.dmk.dto.QnaDTO;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class QnaWriteAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userid = request.getParameter("userid");
		String subject = request.getParameter("subject");
		String content = request.getParameter("content");
		
		QnaDTO qnaDTO = new QnaDTO();
		qnaDTO.setUserid(userid);
		qnaDTO.setSubject(subject);
		qnaDTO.setContent(content);
		
		QnaDAO qnaDAO = QnaDAO.getInstance();
		qnaDAO.insertQna(qnaDTO);
		
		RequestDispatcher rd = request.getRequestDispatcher("shop.do?command=qnaList");
		rd.forward(request, response);
		
	}

}
