package com.himedia.shop.dmk.controller.action.mypage;

import java.io.IOException;

import com.himedia.shop.dmk.controller.action.Action;
import com.himedia.shop.dmk.dao.OrderDAO;
import com.himedia.shop.dmk.dto.MemberDTO;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class UpdateMemberAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		MemberDTO memberDTO = (MemberDTO)session.getAttribute("loginUser");
		
		if(memberDTO == null) {
			response.sendRedirect("shop.do?command=loginForm");
		}else {
			memberDTO = new MemberDTO();
			
			memberDTO.setUserid(request.getParameter("userid"));
			memberDTO.setPwd(request.getParameter("pwd"));
			memberDTO.setName(request.getParameter("name"));
			memberDTO.setPhone(request.getParameter("phone"));
			memberDTO.setEmail(request.getParameter("email"));
			memberDTO.setZip_num(request.getParameter("zip_num"));
			memberDTO.setAddress1(request.getParameter("address1"));
			memberDTO.setAddress2(request.getParameter("address2"));
			
			OrderDAO orderDAO = OrderDAO.getInstance();
			orderDAO.memberUpdate(memberDTO);
			
			session.setAttribute("loginUser", memberDTO);
			
			RequestDispatcher rd = request.getRequestDispatcher("mypage/updateTest.jsp");
			rd.forward(request, response);
		}
	}

}
