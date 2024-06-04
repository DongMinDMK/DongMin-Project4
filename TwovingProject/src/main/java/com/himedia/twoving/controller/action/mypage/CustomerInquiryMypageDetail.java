package com.himedia.twoving.controller.action.mypage;

import java.io.IOException;

import com.himedia.twoving.action.Action;
import com.himedia.twoving.dao.AdminDao;
import com.himedia.twoving.vo.CustomerInquiryVO;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class CustomerInquiryMypageDetail implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int ciseq = Integer.parseInt(request.getParameter("ciseq"));
		AdminDao adao = AdminDao.getInstance();
		CustomerInquiryVO cvo = adao.getInquiry(ciseq);
		
		request.setAttribute("cvo", cvo);
		request.getRequestDispatcher("mypage/inquiryDetail.jsp").forward(request, response);
	}
}
