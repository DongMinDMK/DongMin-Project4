package com.himedia.shop.dmk.controller.action.mypage;

import java.io.IOException;

import com.himedia.shop.dmk.controller.action.Action;
import com.himedia.shop.dmk.dto.MemberDTO;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class QnaWriteFormAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd = request.getRequestDispatcher("qna/qnaWriteForm.jsp");
		rd.forward(request, response);
	}

}
