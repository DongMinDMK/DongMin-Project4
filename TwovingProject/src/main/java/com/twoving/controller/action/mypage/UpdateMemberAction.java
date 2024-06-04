package com.twoving.controller.action.mypage;

import java.io.IOException;

import com.himedia.twoving.action.Action;
import com.himedia.twoving.dao.MemberDao;
import com.himedia.twoving.vo.MemberVO;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class UpdateMemberAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session = request.getSession();
		MemberVO mvo = (MemberVO)session.getAttribute("loginUser");
		
		if(mvo == null) {
			response.sendRedirect("twoving.do?command=loginForm");
		}else {
			MemberVO mvo1 =new MemberVO();
			mvo1.setUserid(request.getParameter("userid"));
			mvo1.setPwd(request.getParameter("pwd"));
			mvo1.setName(request.getParameter("name"));
			mvo1.setEmail(request.getParameter("email"));
			mvo1.setPhone(request.getParameter("phone"));
			
			MemberDao mdao = MemberDao.getInstance();
			mdao.updateMember(mvo1);
			session.setAttribute("loginUser", mvo1);
			
			
			response.sendRedirect("twoving.do?command=index");

	}

}}
