package com.himedia.twoving.controller.action.admin;

import java.io.IOException;
import java.util.ArrayList;

import com.himedia.twoving.action.Action;
import com.himedia.twoving.dao.AdminDao;
import com.himedia.twoving.util.Paging;
import com.himedia.twoving.vo.AdminVO;
import com.himedia.twoving.vo.FaqVO;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class AdminFaqListAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		AdminVO avo = (AdminVO)session.getAttribute("adminUser");
		if( avo == null ) {
			response.sendRedirect("twoving.do?command=admin");
		} else {
			int page = 1;
			if(request.getParameter("page") != null) {
				page = Integer.parseInt(request.getParameter("page"));
				session.setAttribute("page", page);
			} else if ( session.getAttribute("page") !=null ) {
				page = (Integer)session.getAttribute("page");
			} else {
				session.removeAttribute("page");
			}
			
			String key ="";
			if(request.getParameter("key")!=null) {
				key = request.getParameter("key");
				session.setAttribute("key", key);
			} else if ( session.getAttribute("key") != null ) {
				key = (String)session.getAttribute("key");
			} else {
				session.removeAttribute("key");
			}
			
			Paging paging = new Paging();
			paging.setPage(page); 
			
			AdminDao adao = AdminDao.getInstance();
			int count = adao.getAllCount("faq", "subject", key);
			paging.setTotalCount(count);
			
			ArrayList<FaqVO> faqList = adao.adminFaqList(paging, key);
			request.setAttribute("faqList", faqList);
			request.setAttribute("paging", paging);
			request.getRequestDispatcher("admin/faq/faqList.jsp").forward(request, response);
		}
	}
}
