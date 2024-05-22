package com.himedia.shop.dmk.controller.action.cart;

import java.io.IOException;

import com.himedia.shop.dmk.controller.action.Action;
import com.himedia.shop.dmk.dao.OrderDAO;
import com.himedia.shop.dmk.dto.MemberDTO;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class OrderInsertOneAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		MemberDTO memberDTO = (MemberDTO) session.getAttribute("loginUser");
		
		if(memberDTO == null) {
			RequestDispatcher rd = request.getRequestDispatcher("shop.do?command=loginForm");
			rd.forward(request, response);
		}else {
			int quantity = Integer.parseInt(request.getParameter("quantity"));
			int pseq = Integer.parseInt(request.getParameter("pseq"));
			
			OrderDAO orderDAO = OrderDAO.getInstance();
			orderDAO.insertOrders(memberDTO.getUserid()); // 주문하기를 누르면 orders 테이블에 사용자 아이디를 이용하여 추가
			
			int oseq = orderDAO.lookupMaxOseq(memberDTO.getUserid());
			
			orderDAO.insertOrderDetail(pseq, oseq, quantity);
			
			response.sendRedirect("shop.do?command=orderList&oseq=" + oseq);
			
			
		}
	}

}
