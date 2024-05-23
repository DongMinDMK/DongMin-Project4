package com.himedia.shop.dmk.controller.action.mypage;

import java.io.IOException;

import com.himedia.shop.dmk.controller.action.Action;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class UpdateMemberFormAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd = request.getRequestDispatcher("mypage/updateMemberForm.jsp");
		rd.forward(request, response);
	}

}
