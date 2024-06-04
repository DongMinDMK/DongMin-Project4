package com.twoving.controller.action.member;

import java.io.IOException;

import com.himedia.twoving.action.Action;
import com.himedia.twoving.dao.MemberDao;
import com.himedia.twoving.vo.MemberVO;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class JoinAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		MemberDao mdao = MemberDao.getInstance();
		MemberVO mvo = new MemberVO();
		
		mvo.setUserid(request.getParameter("userid"));
		mvo.setPwd(request.getParameter("pwd"));
		mvo.setName(request.getParameter("name"));
		mvo.setEmail(request.getParameter("email"));
		//mvo.setPhone(request.getParameter("phone"));
		
		
		
		//int result = mdao.getMember(mvo);
//		HttpSession session = request.getSession();
//		if(result == 1)session.setAttribute("message", "회원가입이 완료되었습니다. 로그인 하세요");
//		else session.setAttribute("message", "회원가입 실패 관리자에게 문의하세요");
		int result = mdao.insertMember(mvo);
		HttpSession session = request.getSession();
		if(result == 1)session.setAttribute("message", "회원가입이 완료되었습니다. 로그인 하세요");
		else session.setAttribute("message", "회원가입 실패 관리자에게 문의하세요");
		
		
		response.sendRedirect("twoving.do?command=loginForm");

	}

}
