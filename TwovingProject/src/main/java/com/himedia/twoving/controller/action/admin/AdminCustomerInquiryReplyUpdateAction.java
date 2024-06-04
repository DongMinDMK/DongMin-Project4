package com.himedia.twoving.controller.action.admin;

import java.io.IOException;

import com.himedia.twoving.action.Action;
import com.himedia.twoving.dao.AdminDao;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class AdminCustomerInquiryReplyUpdateAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int ciseq = Integer.parseInt(request.getParameter("ciseq"));
		String reply = request.getParameter("reply");
		AdminDao adao = AdminDao.getInstance();
		adao.inquiryReplyUpdate(ciseq,reply);
		response.sendRedirect("twoving.do?command=adminCustomerInquiryDetail&ciseq=" + ciseq);
	}
}
