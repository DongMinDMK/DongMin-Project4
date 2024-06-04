package com.himedia.twoving.product;

import java.io.IOException;
import java.util.ArrayList;

import com.himedia.twoving.action.Action;
import com.himedia.twoving.dao.productDao;
import com.himedia.twoving.vo.ProductVO;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class searchListAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session = request.getSession();
		
		String key="";
		if( request.getParameter("key") != null) {
    		key = request.getParameter("key");
    		session.setAttribute("key", key);
		}else if( session.getAttribute("key") != null ) {
			key = (String)session.getAttribute("key");
		}else {
			session.removeAttribute("key");
		}

		
		productDao pdao = productDao.getInstance();	
		ArrayList<ProductVO> searchList = pdao.searchList( key );
		
		request.setAttribute("searchList",searchList);
		request.getRequestDispatcher("searchlist.jsp").forward(request, response);


	}

}
