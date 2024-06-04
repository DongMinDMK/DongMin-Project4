package com.himedia.twoving.product;

import java.io.IOException;
import java.util.ArrayList;

import com.himedia.twoving.action.Action;
import com.himedia.twoving.dao.productDao;
import com.himedia.twoving.vo.ProductVO;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class genreAction implements Action{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		String genre = request.getParameter("genre");
		String kind = request.getParameter("kind");
		
		productDao pdao = productDao.getInstance();
		ArrayList<ProductVO> list = pdao.selectGenreProduct(genre);
		
		request.setAttribute("genreProduct", list);
		request.setAttribute("genre", genre);
		request.setAttribute("kind", kind);
		
		request.getRequestDispatcher("genre.jsp").forward(request, response);
	}

}
