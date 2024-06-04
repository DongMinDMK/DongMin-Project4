package com.himedia.twoving.controller.action.admin;

import java.io.IOException;

import com.himedia.twoving.action.Action;
import com.himedia.twoving.dao.AdminDao;
import com.himedia.twoving.vo.NoticeVO;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class AdminNoticeUpdateAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		NoticeVO nvo = new NoticeVO();
		nvo.setNseq(Integer.parseInt(request.getParameter("nseq")));
		nvo.setTitle(request.getParameter("title"));
		nvo.setContent(request.getParameter("content"));
		nvo.setNoticeyn(request.getParameter("noticeyn"));
		
		AdminDao adao = AdminDao.getInstance();
		adao.updateNotice(nvo);
		response.sendRedirect("twoving.do?command=adminNoticeDetail&nseq=" + nvo.getNseq());

	}

}
