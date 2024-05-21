package com.himedia.shop.dmk.controller.action.product;

import java.io.IOException;
import java.util.ArrayList;

import com.himedia.shop.dmk.controller.action.Action;
import com.himedia.shop.dmk.dao.ProductDAO;
import com.himedia.shop.dmk.dto.ProductDTO;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class CategoryAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String kind = request.getParameter("kind");
		
		ProductDAO productDAO = ProductDAO.getInstance();
		ArrayList<ProductDTO> list = productDAO.selectKindProduct(kind);
		
		String[] kindList = {"", "Heels", "Boots", "Sandal", "Sneakers", "Sleeper"};
	
		request.setAttribute("kindProduct", list);
		request.setAttribute("kind", kindList[Integer.parseInt(kind)]);
		
		RequestDispatcher rd = request.getRequestDispatcher("product/productKind.jsp");
		rd.forward(request, response);
	}

}
