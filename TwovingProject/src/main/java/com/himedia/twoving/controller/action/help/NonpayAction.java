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

public class NonpayAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nonpay = request.getParameter("inquirylist");
		
		FaqDAO faqDAO = FaqDAO.getInstance();
		
		ArrayList<FaqVO> nonpayList = faqDAO.getNonpay(nonpay);
		
		request.setAttribute("nonpayList", nonpayList);
		
		RequestDispatcher rd = request.getRequestDispatcher("faqNonPayList.jsp");
		rd.forward(request, response);
	}

}
