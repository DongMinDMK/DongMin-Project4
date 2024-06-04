package com.himedia.twoving.controller.action.admin;

import java.io.IOException;

import com.himedia.twoving.action.Action;
import com.himedia.twoving.dao.AdminDao;
import com.himedia.twoving.vo.ProductVO;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class AdminProductDetailAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int pseq = Integer.parseInt(request.getParameter("pseq"));
		AdminDao adao = AdminDao.getInstance();
		ProductVO pvo = adao.adminGetProduct(pseq);
		
		System.out.println(pvo.getPseq() + " // twoving 1 : " + pvo.getSavefilename() + " // 2 : " + pvo.getSavefilename2());
		request.setAttribute("productVO", pvo);
		request.getRequestDispatcher("admin/product/productDetail.jsp").forward(request, response);
	}
}
