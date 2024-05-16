package com.himedia.dmk.controller.action.board;

import java.io.IOException;

import com.himedia.dmk.controller.action.Action;
import com.himedia.dmk.dao.BoardDAO;
import com.himedia.dmk.dto.ReplyDTO;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class InsertReplyAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userid = request.getParameter("userid");
		int boardnum = Integer.parseInt(request.getParameter("boardnum"));
		
		ReplyDTO replyDTO = new ReplyDTO();
		
		replyDTO.setBoardnum(boardnum);
		replyDTO.setContent(request.getParameter("content"));
		replyDTO.setUserid(userid);
		
		BoardDAO boardDAO = BoardDAO.getInstance();
		boardDAO.insertReply(replyDTO);
		
		response.sendRedirect("board.do?command=boardViewWithoutCnt&num=" + replyDTO.getBoardnum());
		
	}

}
