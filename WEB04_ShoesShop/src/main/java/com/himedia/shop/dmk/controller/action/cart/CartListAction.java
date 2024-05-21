package com.himedia.shop.dmk.controller.action.cart;

import java.io.IOException;
import java.util.ArrayList;

import com.himedia.shop.dmk.controller.action.Action;
import com.himedia.shop.dmk.dao.CartDAO;
import com.himedia.shop.dmk.dto.CartDTO;
import com.himedia.shop.dmk.dto.MemberDTO;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class CartListAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		MemberDTO memberDTO = (MemberDTO) session.getAttribute("loginUser");
		
		if(memberDTO == null) {
			RequestDispatcher rd = request.getRequestDispatcher("shop.do?command=loginForm");
			rd.forward(request, response);
		}else {
			CartDAO cartDAO = CartDAO.getInstance();
			ArrayList<CartDTO> list = cartDAO.getSelectedListCart(memberDTO.getUserid());
			
			int totalPrice = 0;
			
			for(CartDTO cartDTO : list) {
				totalPrice += (cartDTO.getPrice2() * cartDTO.getQuantity());
			}
			
			request.setAttribute("totalPrice", totalPrice);
			request.setAttribute("cartList", list);
			
			RequestDispatcher rd = request.getRequestDispatcher("mypage/cartList.jsp");
			rd.forward(request, response);
		}
	}

}
