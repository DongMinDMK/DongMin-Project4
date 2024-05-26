package com.himedia.test1.controller.action.member;

import java.io.IOException;

import com.himedia.test1.controller.action.Action;
import com.himedia.test1.dao.MemberDAO;
import com.himedia.test1.dto.MemberDTO;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class UserLoginAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		
		String id = request.getParameter("id");
		String pass = request.getParameter("pass");
		
		MemberDAO memberDAO = MemberDAO.getInstance();
		
		MemberDTO memberDTO = memberDAO.selectMember(id);
		
		
		if(memberDTO == null) {
			request.setAttribute("msg", "아이디가 일치하지 않습니다.");
			RequestDispatcher rd = request.getRequestDispatcher("test.do?command=index");
			rd.forward(request, response);
		}else if(!memberDTO.getPwd().equals(pass)) {
			request.setAttribute("msg", "비밀번호가 일치하지 않습니다.");
			RequestDispatcher rd = request.getRequestDispatcher("test.do?command=index");
			rd.forward(request, response);
		}else if(memberDTO.getPwd().equals(pass)) {
			session.setAttribute("lUser", memberDTO);
			RequestDispatcher rd = request.getRequestDispatcher("main.jsp");
			rd.forward(request, response);
		}

		
		
	}

}
