package com.himedia.dmk.controller.action.board;

import java.io.IOException;
import java.util.ArrayList;

import com.himedia.dmk.controller.action.Action;
import com.himedia.dmk.dao.BoardDAO;
import com.himedia.dmk.dto.BoardDTO;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class MainAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		BoardDAO boardDAO = BoardDAO.getInstance();
		ArrayList<BoardDTO> list = boardDAO.boardSelectAll();
		
		request.setAttribute("boardList", list);
		
		RequestDispatcher rd = request.getRequestDispatcher("main.jsp");
		rd.forward(request, response);
	}

}
