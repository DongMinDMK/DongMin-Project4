package com.himedia.twoving.controller.action.admin;

import java.io.IOException;

import com.himedia.twoving.action.Action;
import com.himedia.twoving.dao.AdminDao;
import com.himedia.twoving.vo.AdminVO;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class AdminNoticeDeleteAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		AdminVO avo = (AdminVO)session.getAttribute("adminUser");
		
		if(avo == null) {
			response.sendRedirect("twoving.do?command=admin");
		} else {
			int nseq = Integer.parseInt(request.getParameter("nseq"));
			AdminDao adao = AdminDao.getInstance();
			int result = adao.deleteNotice(nseq);
			
			/*
			 * if(result==1) session.setAttribute("message", "공지사항이 정상적으로 삭제가 완료됐습니다.");
			 * else session.setAttribute("message", "공지사항 삭제 실패, 관리자에게 문의하세요");
			 */
			
			if(result==1) request.setAttribute("deleteNotice", "1");
			else request.setAttribute("deleteNotice", "0");
			response.sendRedirect("twoving.do?command=adminNoticeList");
		}
	}
}
