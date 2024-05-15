package com.himedia.dmk.controller.action.board;

import java.io.IOException;

import com.himedia.dmk.controller.action.Action;
import com.himedia.dmk.dao.BoardDAO;
import com.himedia.dmk.dto.BoardDTO;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class BoardViewWithoutCnt implements Action{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int num = Integer.parseInt(request.getParameter("num"));
		
		BoardDAO boardDAO = BoardDAO.getInstance();
		BoardDTO boardDTO = boardDAO.getBoard(num);
		
		request.setAttribute("board", boardDTO);
		
		RequestDispatcher rd = request.getRequestDispatcher("board/boardView.jsp");
		rd.forward(request, response);
	}

}
