package com.himedia.dmk.controller.action.board;

import java.io.IOException;
import java.util.ArrayList;

import com.himedia.dmk.controller.action.Action;
import com.himedia.dmk.dao.BoardDAO;
import com.himedia.dmk.dto.BoardDTO;
import com.himedia.dmk.util.Paging;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class MainAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		BoardDAO boardDAO = BoardDAO.getInstance();
		
		
		Paging paging = new Paging();
		HttpSession session = request.getSession();
		
		int page = 1;
		
		if(request.getParameter("page") != null) {
			page = Integer.parseInt(request.getParameter("page"));
			session.setAttribute("page", page);
		}else if(session.getAttribute("page") != null) {
			page = (Integer)session.getAttribute("page");
		}else {
			session.removeAttribute("page");
		}
		
		paging.setPage(page);
		
		// 전체 게시물을 먼저 조회
		int count = boardDAO.getAllCount();
		
		System.out.println("전체 게시물 수 : " + count);
		
		
		paging.setTotalCount(count);
		
		ArrayList<BoardDTO> list = boardDAO.boardSelectAll(paging);
		
		request.setAttribute("boardList", list);
		request.setAttribute("paging", paging);
		
		RequestDispatcher rd = request.getRequestDispatcher("main.jsp");
		rd.forward(request, response);
	}

}
