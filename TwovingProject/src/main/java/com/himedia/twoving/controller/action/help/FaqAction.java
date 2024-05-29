package com.himedia.twoving.controller.action.help;

import java.io.IOException;
import java.util.ArrayList;

import com.himedia.twoving.action.Action;
import com.himedia.twoving.dao.FaqDAO;
import com.himedia.twoving.vo.FaqVO;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class FaqAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// CustomerInquiryDAO cidao = CustomerInquiryDAO.getInstance();
		// CustomerInquiryVO civo = new CustomerInquiryVO();
		
		// String[] inquiryLists = {"전체", "회원/로그인", "이용권/결제", "재생/오류", "해지/환불", "서비스 이용"};
		
		// int index = Integer.parseInt(civo.getInquiryList());
		
		// request.setAttribute("inquiryList", inquiryLists);
		
		FaqDAO faqDAO = FaqDAO.getInstance();
		
		ArrayList<FaqVO> list = faqDAO.getList();
		
		request.setAttribute("faqList", list);
	
		
		RequestDispatcher rd = request.getRequestDispatcher("faqForm.jsp");
		rd.forward(request, response);
	}

}
