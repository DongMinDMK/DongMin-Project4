package com.himedia.twoving.controller.action.help;

import java.io.IOException;

import com.himedia.twoving.action.Action;
import com.himedia.twoving.dao.PaymentDAO;
import com.himedia.twoving.vo.PaymentVO;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class UpdateDefuseCheckAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String productname = request.getParameter("productname");
		
		PaymentDAO paymentDAO = PaymentDAO.getInstance();
		PaymentVO paymentVO = paymentDAO.getPayment(productname);
		
		request.setAttribute("paymentVO", paymentVO);
		
		RequestDispatcher rd = request.getRequestDispatcher("updateDefuseCheck.jsp");
		rd.forward(request, response);
	}

}
