package com.himedia.dmk.controller.action.board;

import java.io.IOException;

import com.himedia.dmk.controller.action.Action;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class LogoutAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		
		session.invalidate();
		
		RequestDispatcher rq = request.getRequestDispatcher("board.do?command=loginForm");
		rq.forward(request, response);
	}

}
