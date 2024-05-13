package com.himedia.dmk.controller.action;

import java.io.IOException;

import com.himedia.dmk.dao.MemberDAO;
import com.himedia.dmk.dto.MemberDTO;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class LoginAction implements Action{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userid = request.getParameter("userid");
		String pwd = request.getParameter("pwd");
		
		MemberDAO memberDAO = MemberDAO.getInstance();
		MemberDTO memberDTO = memberDAO.getMember(userid);
		
		String url = null;
		
		if(memberDTO == null) {
			url = "member/loginForm.jsp";
			request.setAttribute("message", "존재하는 아이디가 없습니다...");
		}else if(memberDTO.getPwd() == null) { //DB에 비밀번호가 없다면
			url = "member/loginForm.jsp";
			request.setAttribute("message", "DB에 비밀번호가 있지 않습니다.");
		}else if(!memberDTO.getPwd().equals(pwd)) {
			url = "member/loginForm.jsp";
			request.setAttribute("message", "비밀번호가 일치하지 않습니다.");
		}else if(memberDTO.getPwd().equals(pwd)) { //로그인 성공, 세션 저장
			url = "board.do?command=main";
			HttpSession session = request.getSession();
			session.setAttribute("loginUser", memberDTO);
			
		}else {
			url = "member/loginForm.jsp";
			request.setAttribute("message", "알수 없는 오류로 로그인이 불가합니다...");
		}
		
		RequestDispatcher rd = request.getRequestDispatcher(url);
		rd.forward(request, response);
	}
}
