package com.himedia.shop.dmk.controller.action.mypage;

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

public class OrderDetailAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session = request.getSession();
		MemberDTO memberDTO = (MemberDTO)session.getAttribute("loginUser");
		
		if(memberDTO == null) {
			response.sendRedirect("shop.do?command=loginForm");
		}else {
			int oseq = Integer.parseInt(request.getParameter("oseq"));
			OrderDAO orderDAO = OrderDAO.getInstance();
			
			ArrayList<OrderDTO> list = orderDAO.selectOrderByOseq(oseq);
			
			request.setAttribute("orderList", list);
			request.setAttribute("orderDetail", list.get(0));
			
			int totalPrice=0;
			
			for(OrderDTO orderDTO : list) {
				totalPrice += (orderDTO.getPrice2() * orderDTO.getQuantity());
			}
			
			request.setAttribute("totalPrice", totalPrice);
			
			RequestDispatcher rd = request.getRequestDispatcher("mypage/orderDetail.jsp");
			rd.forward(request, response);
			
			
			
			
			
		}
	}

}
