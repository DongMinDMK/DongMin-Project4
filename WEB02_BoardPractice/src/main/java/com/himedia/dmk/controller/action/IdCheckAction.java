package com.himedia.dmk.controller.action;

import java.io.IOException;

import com.himedia.dmk.dao.MemberDAO;
import com.himedia.dmk.dto.MemberDTO;

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
		
		if(memberDTO == null) { // 사용가능
			request.setAttribute("result", "-1");
			
		}else { //사용 불가능
			request.setAttribute("result", "1");
		}
		
		request.setAttribute("userid", userid);
		
		
		RequestDispatcher rd = request.getRequestDispatcher("member/idCheck.jsp");
		rd.forward(request, response);
		
	}

}
