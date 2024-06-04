package com.himedia.twoving.controller.action.admin;

import java.io.IOException;

import com.himedia.twoving.action.Action;
import com.himedia.twoving.dao.AdminDao;
import com.himedia.twoving.vo.FaqVO;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class AdminFaqUpdateAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		FaqVO fvo = new FaqVO();
		fvo.setQseq(Integer.parseInt(request.getParameter("qseq")));
		fvo.setInquirylist(request.getParameter("inquirylist"));
		fvo.setSubject(request.getParameter("subject"));
		fvo.setContent(request.getParameter("content"));
		
		AdminDao adao = AdminDao.getInstance();
		adao.updateFaq(fvo);
		response.sendRedirect("twoving.do?command=adminFaqDetail&qseq=" + fvo.getQseq());
	}
}
