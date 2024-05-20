package com.himedia.shop.dmk.controller.action.member;

import java.io.IOException;

import com.himedia.shop.dmk.controller.action.Action;
import com.himedia.shop.dmk.dao.MemberDAO;
import com.himedia.shop.dmk.dto.MemberDTO;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class LoginAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userid = request.getParameter("userid");
		String pwd = request.getParameter("pwd");
		
		MemberDAO memberDAO = MemberDAO.getInstance();
		MemberDTO memberDTO = memberDAO.getMember(userid);
		
		if(memberDTO == null) {
			request.setAttribute("message", "아이디가 일치하지 않습니다...");
			RequestDispatcher rd = request.getRequestDispatcher("shop.do?command=loginForm");
			rd.forward(request, response);
		}else if(!memberDTO.getPwd().equals(pwd)) {
			request.setAttribute("message", "비밀번호가 일치하지 않습니다...");
			RequestDispatcher rd = request.getRequestDispatcher("shop.do?command=loginForm");
			rd.forward(request, response);
		}else if(memberDTO.getPwd().equals(pwd)) {
			HttpSession session = request.getSession();
			session.setAttribute("loginUser", memberDTO);
			
			RequestDispatcher rd = request.getRequestDispatcher("shop.do?command=index");
			rd.forward(request, response);
		}else {
			request.setAttribute("message", "알수 없는 이유로 로그인을 진행하실 수 없습니다.");
			RequestDispatcher rd = request.getRequestDispatcher("shop.do?command=loginForm");
			rd.forward(request, response);
		}
	}

}
