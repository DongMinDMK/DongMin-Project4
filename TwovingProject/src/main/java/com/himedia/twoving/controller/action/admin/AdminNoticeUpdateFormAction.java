package com.himedia.twoving.controller.action.admin;

import java.io.IOException;

import com.himedia.twoving.action.Action;
import com.himedia.twoving.dao.AdminDao;
import com.himedia.twoving.vo.NoticeVO;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class AdminNoticeUpdateFormAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int nseq = Integer.parseInt(request.getParameter("nseq"));
		AdminDao adao = AdminDao.getInstance();
		NoticeVO nvo = adao.getNotice(nseq);
		request.setAttribute("noticeVO", nvo);
		
		request.getRequestDispatcher("admin/notice/noticeUpdate.jsp").forward(request, response);

	}

}
