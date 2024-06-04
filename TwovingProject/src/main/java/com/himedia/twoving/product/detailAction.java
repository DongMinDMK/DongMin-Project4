package com.himedia.twoving.product;

import java.io.IOException;

import com.himedia.twoving.action.Action;
import com.himedia.twoving.dao.productDao;
import com.himedia.twoving.vo.ProductVO;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class detailAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int pseq = Integer.parseInt(request.getParameter("pseq"));
	      
	      productDao pdao = productDao.getInstance();
	      ProductVO pvo = pdao.getProduct(pseq);

		
		request.setAttribute("productVO", pvo);

		request.getRequestDispatcher("Tdetail.jsp").forward(request, response);		
	}

}
