package com.himedia.twoving.controller.action.admin;

import java.io.IOException;

import com.himedia.twoving.action.Action;
import com.himedia.twoving.dao.AdminDao;
import com.himedia.twoving.vo.AdminVO;
import com.himedia.twoving.vo.FaqVO;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class AdminFaqWriteAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		AdminVO avo = (AdminVO)session.getAttribute("adminUser");
		
		String inquirylist = request.getParameter("inquirylist");
		String subject = request.getParameter("subject");
		String content = request.getParameter("content");
		
		if(avo == null) {
			response.sendRedirect("twoving.do?command=admin");
		} else {
			AdminDao adao = AdminDao.getInstance();
			FaqVO fvo = new FaqVO();
			
			fvo.setInquirylist(inquirylist);
			fvo.setSubject(subject);
			fvo.setContent(content);
			adao.adminWriteFaq(fvo);
			
			response.sendRedirect("twoving.do?command=adminFaqList");
		}
	}
}
