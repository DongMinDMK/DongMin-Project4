package com.himedia.dmk.controller.action.board;

import java.io.IOException;

import com.himedia.dmk.controller.action.Action;
import com.himedia.dmk.dao.BoardDAO;
import com.himedia.dmk.dto.BoardDTO;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class UpdateBoardAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int num = Integer.parseInt(request.getParameter("num"));
		
		BoardDAO boardDAO = BoardDAO.getInstance();
		
		BoardDTO boardDTO = new BoardDTO();
		boardDTO.setNum(num);
		boardDTO.setPass(request.getParameter("pass"));
		boardDTO.setUserid(request.getParameter("userid"));
		boardDTO.setEmail(request.getParameter("email"));
		boardDTO.setTitle(request.getParameter("title"));
		boardDTO.setContent(request.getParameter("content"));
		
		boardDAO.updateBoard(boardDTO);
		
		RequestDispatcher rd = request.getRequestDispatcher("board.do?command=main");
		rd.forward(request, response);
		
	}

}
