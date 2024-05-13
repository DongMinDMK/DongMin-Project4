package com.himedia.dmk;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import com.himedia.dmk.controller.action.Action;
import com.himedia.dmk.controller.action.LoginAction;
import com.himedia.dmk.controller.action.LoginFormAction;


public class BoardServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public BoardServlet() {
        
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		
		Action ac;
		
		String command = request.getParameter("command");
		System.out.println("command : " + command);
		
		ActionFactory af = ActionFactory.getInstance();
		ac = af.getAction(command);
		
		
		if(ac == null) {
			System.out.println("Action 전달 오류!!");
		}else {
			ac.execute(request, response);
		}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
