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

public class LoadingErrorAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String loadingErrorList = request.getParameter("inquirylist");
		
		FaqDAO faqDAO = FaqDAO.getInstance();
		
		ArrayList<FaqVO> loadingErrorList2 = faqDAO.getLoadingError(loadingErrorList);
		
		request.setAttribute("loadingErrorList", loadingErrorList2);
		
		RequestDispatcher rd = request.getRequestDispatcher("faqloadingErrorList.jsp");
		rd.forward(request, response);
	}

}
