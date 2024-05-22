package com.himedia.shop.dmk.controller.action.cart;

import java.io.IOException;

import com.himedia.shop.dmk.controller.action.Action;
import com.himedia.shop.dmk.dao.CartDAO;
import com.himedia.shop.dmk.dto.CartDTO;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class CartDeleteAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String[] cseqs = request.getParameterValues("cseq");
		
		CartDAO cartDAO = CartDAO.getInstance();
		
		for(String cseq : cseqs) {
			cartDAO.deleteCart(Integer.parseInt(cseq));
		}
		
		response.sendRedirect("shop.do?command=cartList");
	}

}
