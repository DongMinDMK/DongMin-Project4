package com.himedia.twoving.controller.action.admin;

import java.io.IOException;

import com.himedia.twoving.action.Action;
import com.himedia.twoving.dao.AdminDao;
import com.himedia.twoving.vo.AdminVO;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class AdminFaqDeleteAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		AdminVO avo = (AdminVO)session.getAttribute("adminUser");
		
		if(avo == null) {
			response.sendRedirect("twoving.do?command=admin");
		} else {
			int qseq = Integer.parseInt(request.getParameter("qseq"));
			AdminDao adao = AdminDao.getInstance();
			int result = adao.deleteFaq(qseq);
			
			if(result==1) request.setAttribute("deleteFaq", "1");
			else request.setAttribute("deleteFaq", "0");
			response.sendRedirect("twoving.do?command=adminFaqList");
		}

	}

}
