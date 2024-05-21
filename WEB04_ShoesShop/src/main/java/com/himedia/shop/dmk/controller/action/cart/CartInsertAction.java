package com.himedia.shop.dmk.controller.action.cart;

import java.io.IOException;

import com.himedia.shop.dmk.controller.action.Action;
import com.himedia.shop.dmk.dao.CartDAO;
import com.himedia.shop.dmk.dto.CartDTO;
import com.himedia.shop.dmk.dto.MemberDTO;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class CartInsertAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int pseq = Integer.parseInt(request.getParameter("pseq"));
		int quantity = Integer.parseInt(request.getParameter("quantity"));
		
		HttpSession session = request.getSession();
		MemberDTO memberDTO = (MemberDTO) session.getAttribute("loginUser");
		
		if(memberDTO == null) {
			RequestDispatcher rd = request.getRequestDispatcher("shop.do?command=loginForm");
			rd.forward(request, response);
			
		}else {
			CartDAO cartDAO = CartDAO.getInstance();
			CartDTO cartDTO = new CartDTO();
			
			cartDTO.setUserid(memberDTO.getUserid());
			cartDTO.setPseq(pseq);
			cartDTO.setQuantity(quantity);
			
			cartDAO.insertCart(cartDTO); //DB Cart 테이블에 사용자의 정보 userid 를 포함한 장바구니에 넣은 상품의 번호, 수량을 저장.
			
			RequestDispatcher rd = request.getRequestDispatcher("shop.do?command=cartList");
			rd.forward(request, response);
		}
	}

}
