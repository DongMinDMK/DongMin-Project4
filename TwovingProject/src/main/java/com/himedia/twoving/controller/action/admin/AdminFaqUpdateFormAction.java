package com.himedia.twoving.controller.action.admin;

import java.io.IOException;

import com.himedia.twoving.action.Action;
import com.himedia.twoving.dao.AdminDao;
import com.himedia.twoving.vo.FaqVO;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class AdminFaqUpdateFormAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int qseq = Integer.parseInt(request.getParameter("qseq"));
		AdminDao adao = AdminDao.getInstance();
		FaqVO fvo = adao.getFaq(qseq);
		request.setAttribute("FaqVO", fvo);
		
		request.getRequestDispatcher("admin/faq/faqUpdate.jsp").forward(request, response);
	}
}
