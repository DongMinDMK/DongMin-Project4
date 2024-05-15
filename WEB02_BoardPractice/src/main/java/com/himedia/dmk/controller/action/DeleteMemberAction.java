package com.himedia.dmk.controller.action;

import java.io.IOException;

import com.himedia.dmk.dao.MemberDAO;
import com.himedia.dmk.dto.MemberDTO;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class DeleteMemberAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		
		MemberDTO memberDTO = (MemberDTO)session.getAttribute("loginUser");
		
		MemberDAO memberDAO = MemberDAO.getInstance();
		int result = memberDAO.deleteMember(memberDTO);
		
		session.invalidate();
		
		
		if(result == 1) {
			request.setAttribute("message", "정상적으로 회원탈퇴가 완료되었습니다..");
		}else {
			request.setAttribute("message", "회원탈퇴를 하지 못하였습니다.");
		}
		
		RequestDispatcher rd = request.getRequestDispatcher("board.do?command=loginForm");
		rd.forward(request, response);
	}

}
