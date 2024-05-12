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
import java.util.ArrayList;


public class StartServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public StartServlet() {
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		String driver = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/scott";
		String id = "root";
		String pw = "adminuser";
		
		String sql = "select* from members";
		
		ArrayList<MemberDTO> list = new ArrayList<MemberDTO>();
		
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, id, pw);
			
			pstmt = con.prepareStatement(sql);
			
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				MemberDTO memberDTO = new MemberDTO();
				memberDTO.setId(rs.getString("id"));
				memberDTO.setPwd(rs.getString("pwd"));
				memberDTO.setName(rs.getString("name"));
				memberDTO.setPhone(rs.getString("phone"));
				
				list.add(memberDTO);
			}
			
			
			
		}catch(Exception e) {
			
		}finally {
			try {
				if(con != null) con.close();
				if(pstmt != null) pstmt.close();
				if(rs != null) pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		request.setAttribute("memberList", list);
		
		RequestDispatcher rd = request.getRequestDispatcher("main.jsp");
		rd.forward(request, response);
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
