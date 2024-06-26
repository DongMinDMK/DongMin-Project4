package com.himedia.dmk.controller.action.board;

import java.io.IOException;

import com.himedia.dmk.controller.action.Action;
import com.himedia.dmk.dao.BoardDAO;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class DeleteReplyAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int replynum = Integer.parseInt(request.getParameter("replynum"));
		int boardnum = Integer.parseInt(request.getParameter("boardnum"));
		
		BoardDAO boardDAO = BoardDAO.getInstance();
		boardDAO.deleteReply(replynum);
		
		response.sendRedirect("board.do?command=boardViewWithoutCnt&num=" + boardnum);
		
	}

}
