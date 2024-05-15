package com.himedia.dmk.controller.action;

import java.io.IOException;

import com.himedia.dmk.dao.MemberDAO;
import com.himedia.dmk.dto.MemberDTO;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class UpdateMemberAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userid = request.getParameter("userid");
		
		MemberDTO memberDTO = new MemberDTO();
		memberDTO.setUserid(userid);
		memberDTO.setName(request.getParameter("name"));
		memberDTO.setPwd(request.getParameter("pwd"));
		memberDTO.setEmail(request.getParameter("email"));
		memberDTO.setPhone(request.getParameter("phone"));
		
		MemberDAO memberDAO = MemberDAO.getInstance();
		int result = memberDAO.memberUpdate(memberDTO);
		
		if(result == 1) {
			HttpSession session = request.getSession();
			session.setAttribute("loginUser", memberDTO);
			
		}
		
		RequestDispatcher rd = request.getRequestDispatcher("board.do?command=main");
		rd.forward(request, response);
		
	}

}
