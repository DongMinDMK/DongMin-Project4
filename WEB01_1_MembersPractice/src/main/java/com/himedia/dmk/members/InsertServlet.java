package com.himedia.dmk.members;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class InsertServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
    public InsertServlet() {
        
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd = request.getRequestDispatcher("insertForm.jsp");
		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Connection con = null;
		PreparedStatement pstmt = null;
		
		String driver = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/scott";
		String id = "root";
		String pw = "adminuser";
		
		String sql = "insert into members(id, pwd, name, phone) values(?, ?, ?, ?)";
		
		
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, id, pw);
			pstmt = con.prepareStatement(sql);
			
			pstmt.setString(1, request.getParameter("userid"));
			pstmt.setString(2, request.getParameter("pwd"));
			pstmt.setString(3, request.getParameter("name"));
			pstmt.setString(4, request.getParameter("phone"));
			
			pstmt.executeUpdate();
			
		}catch(Exception e) {
			e.printStackTrace();
		}try {
			if(con != null) con.close();
			if(pstmt != null) pstmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		RequestDispatcher rd = request.getRequestDispatcher("start.do");
		rd.forward(request, response);
	}

}
