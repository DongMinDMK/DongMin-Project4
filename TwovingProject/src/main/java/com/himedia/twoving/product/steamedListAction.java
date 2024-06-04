package com.himedia.twoving.product;

import java.io.IOException;
import java.util.ArrayList;

import com.himedia.twoving.action.Action;
import com.himedia.twoving.dao.steamedDao;
import com.himedia.twoving.vo.MemberVO;
import com.himedia.twoving.vo.steamedVO;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class steamedListAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		MemberVO mvo = (MemberVO)session.getAttribute("loginUser");
		
		if(mvo ==null) {
			response.sendRedirect("twoving.do?command=loginForm");
		}else {
			
			steamedDao sdao = steamedDao.getInstance();
			ArrayList<steamedVO> list = sdao.selectCart(mvo.getUserid());
			
			
			request.setAttribute("steamedList", list);
			request.getRequestDispatcher("steamedtlist.jsp").forward(request, response);
		}

	}

	
	}

