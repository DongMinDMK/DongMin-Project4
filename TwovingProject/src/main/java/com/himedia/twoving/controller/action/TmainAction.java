package com.himedia.twoving.controller.action;

import java.io.IOException;
import java.util.ArrayList;

import com.himedia.twoving.action.Action;
import com.himedia.twoving.dao.productDao;
import com.himedia.twoving.vo.ProductVO;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class TmainAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	      productDao pdao = productDao.getInstance();
	      ArrayList<ProductVO> list = pdao.mainList();   
	      ArrayList<ProductVO> blist = pdao.bestList(); 
	      ArrayList<ProductVO> nlist = pdao.newList();
	      
	     
	      request.setAttribute("newList", nlist); 
	      request.setAttribute("bestList", blist);   
	      request.setAttribute("mainList", list);
		
		request.getRequestDispatcher("Tmain.jsp").forward(request, response);
	}

}
