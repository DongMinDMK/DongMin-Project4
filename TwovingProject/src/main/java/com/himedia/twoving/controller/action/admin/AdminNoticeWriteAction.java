package com.himedia.twoving.controller.action.admin;

import java.io.IOException;

import com.himedia.twoving.action.Action;
import com.himedia.twoving.dao.AdminDao;
import com.himedia.twoving.vo.AdminVO;
import com.himedia.twoving.vo.NoticeVO;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class AdminNoticeWriteAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		AdminVO avo = (AdminVO)session.getAttribute("adminUser");
		String title = request.getParameter("title");
		String content = request.getParameter("content");
		String noticeyn = request.getParameter("noticeyn");
		
		if(avo == null) {
			response.sendRedirect("twoving.do?command=admin");
		} else {
			AdminDao adao = AdminDao.getInstance();
			NoticeVO nvo = new NoticeVO();
			
			nvo.setUserid(avo.getAdminid());
			nvo.setTitle(title);
			nvo.setContent(content);
			nvo.setNoticeyn(noticeyn);
			adao.adminWriteNotice(nvo);
			
			response.sendRedirect("twoving.do?command=adminNoticeList");
		}
	}
}
