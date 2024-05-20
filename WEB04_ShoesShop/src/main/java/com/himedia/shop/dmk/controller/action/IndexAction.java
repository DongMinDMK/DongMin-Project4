package com.himedia.shop.dmk.controller.action;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.himedia.shop.dmk.dao.ProductDAO;
import com.himedia.shop.dmk.dto.ProductDTO;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class IndexAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ProductDAO productDAO = ProductDAO.getInstance();
		ArrayList<ProductDTO> blist = productDAO.bestList();
		ArrayList<ProductDTO> nlist = productDAO.newList();
		
		request.setAttribute("newList", nlist);
		request.setAttribute("bestList", blist);
		
		RequestDispatcher rd = request.getRequestDispatcher("main.jsp");
		rd.forward(request, response);

	}

}
