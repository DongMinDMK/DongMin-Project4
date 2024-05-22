package com.himedia.shop.dmk.controller.action.cart;

import java.io.IOException;
import java.util.ArrayList;

import com.himedia.shop.dmk.controller.action.Action;
import com.himedia.shop.dmk.dao.CartDAO;
import com.himedia.shop.dmk.dao.OrderDAO;
import com.himedia.shop.dmk.dto.CartDTO;
import com.himedia.shop.dmk.dto.MemberDTO;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class OrderInsertAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		MemberDTO memberDTO = (MemberDTO) session.getAttribute("loginUser");
		
		if(memberDTO == null) {
			RequestDispatcher rd = request.getRequestDispatcher("shop.do?command=loginForm");
			rd.forward(request, response);
		}else {
			// 1. 장바구니에 물건을 일괄주문할때 -> 아이디로 장바구니를 검색
			CartDAO cartDAO = CartDAO.getInstance();
			ArrayList<CartDTO> list1 = cartDAO.getSelectedListCart(memberDTO.getUserid());
			
			
			// 2. 장바구니의 선택한 물건만 주문할때 -> 전송된 cseq 틀로 검색
			String[] cseqs = request.getParameterValues("cseq");
			
			ArrayList<CartDTO> list2 = new ArrayList<CartDTO>();
			
			for(String cseq : cseqs) {
				CartDTO cartDTO = cartDAO.getCart(cseq);
				list2.add(cartDTO);
			}
			
			// 1. orders 테이블에 로그인 유저의 아이디로 레코드를 추가
			OrderDAO orderDAO = OrderDAO.getInstance();
			orderDAO.insertOrders(memberDTO.getUserid());
			
			//2. 방금 orders 테이블에 추가된 레코드에 oseq를 조회
			int oseq = orderDAO.lookupMaxOseq(memberDTO.getUserid());
			
			//3. list2 에 있는 물건들과 oseq 를 이용해서 order_detail 테이블에 레코드를 추가
			//4. 주문된 cart 내역은 cart 테이블에서 삭제
			
			for(CartDTO cartDTO : list2) {
				orderDAO.insertOrderDetail(cartDTO, oseq);
				cartDAO.deleteCart(cartDTO.getCseq());
			}
			
			// 5. 방금 주문에 성공한 주문번호를 갖고 주문내역을 다시 조회해서 jsp 로 이동합니다.
			response.sendRedirect("shop.do?command=orderList&oseq=" + oseq);
			
		}
	}

}
