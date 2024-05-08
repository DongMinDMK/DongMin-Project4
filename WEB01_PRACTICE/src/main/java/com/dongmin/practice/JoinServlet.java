package com.dongmin.practice;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

public class JoinServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public JoinServlet() {
       
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
	    response.setCharacterEncoding("UTF-8");
	    
	    String id = request.getParameter("id");
	    String pwd = request.getParameter("pwd");
	    String gender = request.getParameter("gender");
	    String content = request.getParameter("content");
	    String[] items = request.getParameterValues("item");
	    String job = request.getParameter("job");
	    
	    request.setAttribute("id", id);
	    request.setAttribute("pwd", pwd);
	    
	    if(gender.equals("1")) {
	    	request.setAttribute("gender", "남성");
	    }else {
	    	request.setAttribute("gender", "여성");
	    }
	    
	    request.setAttribute("content", content);
	    
	    String[] item_list = new String[items.length];
	    
	    for(int i=0; i<items.length; i++) {
	    	switch(items[i]) {
	    	case "1":
	    		item_list[i] = "신발";
	    		break;
	    	case "2":
	    		item_list[i] = "가방";
	    		break;
	    	case "3":
	    		item_list[i] = "벨트";
	    		break;
	    	case "4":
	    		item_list[i] = "모자";
	    		break;
	    	}
	    }
	    
	    request.setAttribute("items", item_list);
	    
	    switch(job) {
	    case "1":
	    	request.setAttribute("job", "학생");
	    	break;
	    case "2":
	    	request.setAttribute("job", "컴퓨터/인터넷");
	    	break;
	    case "3":
	    	request.setAttribute("job", "언론");
	    	break;
	    }
	    
	    RequestDispatcher rd = request.getRequestDispatcher("ch01/JSP_Servlet.jsp");
	    rd.forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
