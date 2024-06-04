package com.twoving.controller.action.mypage;

import java.io.IOException;

import com.himedia.twoving.action.Action;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class UpdateMemberFormAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.getRequestDispatcher("mypage/updateMember.jsp").forward(request, response);

	}

}
