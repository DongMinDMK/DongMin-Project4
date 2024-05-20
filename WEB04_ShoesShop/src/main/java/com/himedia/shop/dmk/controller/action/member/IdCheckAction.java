package com.himedia.shop.dmk.controller.action.member;

import java.io.IOException;

import com.himedia.shop.dmk.controller.action.Action;
import com.himedia.shop.dmk.dao.MemberDAO;
import com.himedia.shop.dmk.dto.MemberDTO;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class IdCheckAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userid = request.getParameter("userid");
		
		MemberDAO memberDAO = MemberDAO.getInstance();
		MemberDTO memberDTO = memberDAO.getMember(userid);
		
		if(memberDTO == null) { // 사용 가능
			request.setAttribute("result", -1);
		}else {
			request.setAttribute("result", 1);
		}
		
		request.setAttribute("userid", userid);
		
		RequestDispatcher rd = request.getRequestDispatcher("member/idCheck.jsp");
		rd.forward(request, response);
		
	}

}
