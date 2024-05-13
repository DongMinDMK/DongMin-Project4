package com.himedia.dmk.controller.action;

import java.io.IOException;

import com.himedia.dmk.dao.MemberDAO;
import com.himedia.dmk.dto.MemberDTO;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class JoinAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		MemberDTO memberDTO = new MemberDTO();
		
		memberDTO.setUserid(request.getParameter("userid"));
		memberDTO.setName(request.getParameter("name"));
		memberDTO.setPwd(request.getParameter("pwd"));
		memberDTO.setEmail(request.getParameter("email"));
		memberDTO.setPhone(request.getParameter("phone"));
		
		MemberDAO memberDAO = MemberDAO.getInstance();
		
		String message = "";
		
		int result = memberDAO.getInsertMember(memberDTO);
		
		if(result == 1) {
			message = "회원가입이 성공적으로 완료되었습니다.";
		}else {
			message = "회원가입에 실패하였습니다. 관리자에게 문의하세요...";
		}
		
		HttpSession session = request.getSession();
		session.setAttribute("message", message);
		
		response.sendRedirect("board.do?command=loginForm");
	}

}
