package com.himedia.dmk.controller.action.board;

import java.io.IOException;
import java.util.ArrayList;

import com.himedia.dmk.controller.action.Action;
import com.himedia.dmk.dao.BoardDAO;
import com.himedia.dmk.dto.BoardDTO;
import com.himedia.dmk.dto.ReplyDTO;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class BoardViewAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int num = Integer.parseInt(request.getParameter("num"));
		
		BoardDAO boardDAO = BoardDAO.getInstance();
		
		boardDAO.plusReadCount(num);
		
		BoardDTO boardDTO = boardDAO.getBoard(num);
		
		ArrayList<ReplyDTO> list = boardDAO.getReply(num);
		
		request.setAttribute("replyList", list);
		
		request.setAttribute("board", boardDTO);
		
		RequestDispatcher rd = request.getRequestDispatcher("board/boardView.jsp");
		rd.forward(request, response);
		
		
		

	}

}
