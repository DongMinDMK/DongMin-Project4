package com.himedia.shop.dmk.controller.action.product;

import java.io.IOException;

import com.himedia.shop.dmk.controller.action.Action;
import com.himedia.shop.dmk.dao.ProductDAO;
import com.himedia.shop.dmk.dto.ProductDTO;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class ProductDetailAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int pseq = Integer.parseInt(request.getParameter("pseq"));
		
		ProductDAO productDAO = ProductDAO.getInstance();
		ProductDTO productDTO = productDAO.getProduct(pseq);
		
		request.setAttribute("productDTO", productDTO);
		
		RequestDispatcher rd = request.getRequestDispatcher("product/productDetail.jsp");
		rd.forward(request, response);
		
	}

}
