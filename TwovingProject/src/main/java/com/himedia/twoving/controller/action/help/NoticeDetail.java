package com.himedia.twoving.controller.action.help;

import java.io.IOException;

import com.himedia.twoving.action.Action;
import com.himedia.twoving.dao.NoticeDAO;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class NoticeDetail implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int nseq = Integer.parseInt(request.getParameter("nseq"));
		
		NoticeDAO noticeDAO = NoticeDAO.getInstance();
		
		noticeDAO.updateCount(nseq);
		
		// request.setAttribute("noticeList",  noticeList);
		
		RequestDispatcher rd = request.getRequestDispatcher("noticeDetail.jsp");
		rd.forward(request, response);
	}

}
