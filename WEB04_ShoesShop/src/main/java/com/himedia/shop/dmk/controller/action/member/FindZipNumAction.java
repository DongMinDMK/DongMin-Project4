package com.himedia.shop.dmk.controller.action.member;

import java.io.IOException;
import java.util.ArrayList;

import com.himedia.shop.dmk.controller.action.Action;
import com.himedia.shop.dmk.dao.MemberDAO;
import com.himedia.shop.dmk.dto.AddressDTO;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class FindZipNumAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String dong = request.getParameter("dong");
		
		if(dong != null) {
			if(dong.equals("") == false) {
				MemberDAO memberDAO = MemberDAO.getInstance();
				ArrayList<AddressDTO> list = memberDAO.getSelectAddress(dong);
				
				request.setAttribute("addressList", list);
			}
		}
		
		
		RequestDispatcher rd = request.getRequestDispatcher("member/findZipNum.jsp");
		rd.forward(request, response);
	}

}
