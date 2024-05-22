package com.himedia.shop.dmk.controller.action.cart;

import java.io.IOException;
import java.util.ArrayList;

import com.himedia.shop.dmk.controller.action.Action;
import com.himedia.shop.dmk.dao.OrderDAO;
import com.himedia.shop.dmk.dto.MemberDTO;
import com.himedia.shop.dmk.dto.OrderDTO;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class OrderListAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int oseq = Integer.parseInt(request.getParameter("oseq"));
		
		HttpSession session = request.getSession();
		MemberDTO memberDTO = (MemberDTO) session.getAttribute("loginUser");
		
		if(memberDTO == null) {
			RequestDispatcher rd = request.getRequestDispatcher("shop.do?command=loginForm");
			rd.forward(request, response);
		}else {
			OrderDAO orderDAO = OrderDAO.getInstance();
			ArrayList<OrderDTO> list = orderDAO.selectOrderByOseq(oseq);
			
			request.setAttribute("orderList", list);
			
			int totalPrice = 0;
			for(OrderDTO orderDTO : list) {
				totalPrice += (orderDTO.getPrice2() * orderDTO.getQuantity());
			}
			
			request.setAttribute("totalPrice", totalPrice);
			
			RequestDispatcher rd = request.getRequestDispatcher("mypage/orderList.jsp");
			rd.forward(request, response);
		}
	}

}
