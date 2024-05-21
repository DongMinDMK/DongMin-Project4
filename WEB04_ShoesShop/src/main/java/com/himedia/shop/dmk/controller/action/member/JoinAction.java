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

public class JoinAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		MemberDTO memberDTO = new MemberDTO();
		MemberDAO memberDAO = MemberDAO.getInstance();
		
		memberDTO.setUserid(request.getParameter("userid"));
		memberDTO.setPwd(request.getParameter("pwd"));
		memberDTO.setName(request.getParameter("name"));
		memberDTO.setPhone(request.getParameter("phone"));
		memberDTO.setEmail(request.getParameter("email"));
		memberDTO.setZip_num(request.getParameter("zip_num"));
		memberDTO.setAddress1(request.getParameter("address1"));
		memberDTO.setAddress2(request.getParameter("address2"));
		
		HttpSession session = request.getSession();
		
		int result = memberDAO.insertMember(memberDTO);
		
		if(result == 1) {
			request.setAttribute("message", "회원가입을 성공적으로 마쳤습니다.. 로그인하시면 됩니다.");
		}else {
			request.setAttribute("message", "회원가입 실패!");
		}
		
		RequestDispatcher rd = request.getRequestDispatcher("member/loginForm.jsp");
		rd.forward(request, response);
		
	}

}
