package com.himedia.twoving.product;

import java.io.IOException;
import java.util.ArrayList;

import com.himedia.twoving.action.Action;
import com.himedia.twoving.dao.productDao;
import com.himedia.twoving.vo.ProductVO;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class kindAction implements Action{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int kind = Integer.parseInt(request.getParameter("kind"));
		
		
		productDao pdao = productDao.getInstance();
		ArrayList<ProductVO> list = pdao.selectKindProduct(kind);
		
		String kindList[] = {"시리즈","영화"};
		String SgenreList[] = {"사극", "멜로", "예능", "애니메이션", "교양(다큐)", "스포츠", "키즈", "공연", "오리지널", "해외"};
		String MgenreList[] = {"사극", "멜로", "액션", "히어로", "공포", "범죄", "판타지", "코미디", "애니메이션", "스릴러" };
		
	
	
		
		request.setAttribute("kindProduct", list);
		request.setAttribute("kind", kindList[kind]);
		
		request.setAttribute("Mgenre", MgenreList);
		request.setAttribute("Sgenre", SgenreList);
		
		request.getRequestDispatcher("kind.jsp").forward(request, response);
	}
}
