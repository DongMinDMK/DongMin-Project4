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

public class ServiceRunAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String servicerun = request.getParameter("inquirylist");
		
		FaqDAO faqDAO = FaqDAO.getInstance();
		
		ArrayList<FaqVO> serviceRunList = faqDAO.getServiceRun(servicerun);
		
		request.setAttribute("serviceRunList", serviceRunList);
		
		RequestDispatcher rd = request.getRequestDispatcher("faqServiceRunList.jsp");
		rd.forward(request, response);
	}

}
