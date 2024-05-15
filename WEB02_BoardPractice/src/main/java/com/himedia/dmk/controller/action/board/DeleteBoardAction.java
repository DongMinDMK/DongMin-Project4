package com.himedia.dmk.controller.action.board;

import java.io.IOException;

import com.himedia.dmk.controller.action.Action;
import com.himedia.dmk.dao.BoardDAO;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class DeleteBoardAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int num = Integer.parseInt(request.getParameter("num"));
		
		BoardDAO boardDAO = BoardDAO.getInstance();
		boardDAO.deleteBoard(num);
		
		RequestDispatcher rd = request.getRequestDispatcher("board/deleteOk.jsp");
		rd.forward(request, response);
	}

}
