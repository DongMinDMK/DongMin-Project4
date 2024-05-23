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

public class OrderAllAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		MemberDTO memberDTO = (MemberDTO)session.getAttribute("loginUser");
		
		if(memberDTO == null) {
			response.sendRedirect("shop.do?command=loginForm");
		}else {
			ArrayList<OrderDTO> finalList = new ArrayList<OrderDTO>();
			
			OrderDAO orderDAO = OrderDAO.getInstance();
			ArrayList<Integer> oseqList = orderDAO.selectOseqOrderAll(memberDTO.getUserid());
			
			// 주문번호들로 반복실행하면 주문 상세내역을 조회 -> 조회된 내역을 하나로 합쳐서 finalList에 담습니다.
			for(Integer oseq : oseqList) {
				// 과정 : 주문번호로 주문목록을 조회(order_view) 에서 조회
				// 4번 주문의 3개의 상품에서 첫번째 상품이름을 "상품이름 포함 3건"으로 변경
				// 금액은 3개의 가격은 합산한 금액을 4번 상품의 price2에 저장
				// 그 변경된 첫번째 상품을 finalList에 저장
				
				// 주문번호(oseq) 로 상품들을 검색(oseq 4번 기준 3개의 주문리스트를 조회)
				ArrayList<OrderDTO> orderListByOseq = orderDAO.selectOrderByOseq(oseq);
				
				// 주문상품 상세 리스트의 첫번째 상품을 별도의 변수에 저장
				OrderDTO temp = (OrderDTO)orderListByOseq.get(0);
				
				temp.setPname(temp.getPname() + "포함 " + orderListByOseq.size() + "건");
				
				// 리스트를 이용해서 총 금액을 계산
				int totalPrice=0;
				for(OrderDTO orderDTO: orderListByOseq)
					totalPrice += (orderDTO.getPrice2() * orderDTO.getQuantity());
				
				
				temp.setPrice2(totalPrice);
				
				finalList.add(temp);
				
			}
			
			request.setAttribute("finalList", finalList);
			request.setAttribute("title", "총 주문내역");
			
			RequestDispatcher rd = request.getRequestDispatcher("mypage/mypage.jsp");
			rd.forward(request, response);
		}
	}

}
