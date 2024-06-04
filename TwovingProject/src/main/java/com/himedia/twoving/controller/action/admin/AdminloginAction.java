package com.himedia.twoving.controller.action.admin;

import java.io.IOException;

import com.himedia.twoving.action.Action;
import com.himedia.twoving.dao.AdminDao;
import com.himedia.twoving.vo.AdminVO;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class AdminloginAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String adminid = request.getParameter("userid");
		String pwd = request.getParameter("pwd");
		
		AdminDao adao = AdminDao.getInstance();
		AdminVO avo = adao.getAdmin(adminid);
		
		String url = "admin/adminLogin.jsp";
		if(avo==null)
			request.setAttribute("message", "존재하지 않는 아이디입니다.");
		else if( ! avo.getPwd().equals(pwd))
			request.setAttribute("message", "패스워드가 일치하지 않습니다.");
		else if( avo.getPwd().equals(pwd)) {
			HttpSession session = request.getSession();
			session.setAttribute("adminUser", avo);
			url = "twoving.do?command=adminProductList";
		}
			
		request.getRequestDispatcher(url).forward(request, response);
	}
}
