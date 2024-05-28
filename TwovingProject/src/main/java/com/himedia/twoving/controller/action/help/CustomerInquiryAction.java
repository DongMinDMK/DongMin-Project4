package com.himedia.twoving.controller.action.help;

import java.io.IOException;

import com.himedia.twoving.action.Action;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class CustomerInquiryAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd = request.getRequestDispatcher("customerInquiry.jsp");
		rd.forward(request, response);
	}

}
