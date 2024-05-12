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

public class UpdateServlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public UpdateServlet1() {
     
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		String driver = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/scott";
		String id = "root";
		String pw = "adminuser";
		
		String sql = "select* from members where id = ?";
		
		String userid = request.getParameter("id");
		MemberDTO memberDTO = new MemberDTO();
		
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, id, pw);
			
			pstmt = con.prepareStatement(sql);
			
			pstmt.setString(1, userid);
			
			rs = pstmt.executeQuery();
			
			
			if(rs.next()) {
				memberDTO.setId(rs.getString("id"));
				memberDTO.setPwd(rs.getString("pwd"));
				memberDTO.setName(rs.getString("name"));
				memberDTO.setPhone(rs.getString("phone"));
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(con != null) con.close();
				if(pstmt != null) pstmt.close();
				if(rs != null) pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		request.setAttribute("member", memberDTO);
		
		RequestDispatcher rd = request.getRequestDispatcher("updateForm.jsp");
		rd.forward(request, response);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Connection con = null;
		PreparedStatement pstmt = null;
		
		String driver = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/scott";
		String id = "root";
		String pw = "adminuser";
		
		String sql = "update members set pwd = ?, name = ?, phone = ? where id = ?";
		
		try {
			
			Class.forName(driver);
			con = DriverManager.getConnection(url, id, pw);
			
			pstmt = con.prepareStatement(sql);
			
			pstmt.setString(1, request.getParameter("pwd"));
			pstmt.setString(2, request.getParameter("name"));
			pstmt.setString(3, request.getParameter("phone"));
			pstmt.setString(4, request.getParameter("id"));
			
			pstmt.executeUpdate();
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(con != null) con.close();
				if(pstmt != null) pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		RequestDispatcher rd = request.getRequestDispatcher("start.do");
		rd.forward(request, response);
	}

}
