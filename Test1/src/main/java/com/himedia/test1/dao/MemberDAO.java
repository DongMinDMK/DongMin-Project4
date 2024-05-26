package com.himedia.test1.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.himedia.test1.dto.MemberDTO;
import com.himedia.test1.util.DBman;

public class MemberDAO {
	private MemberDAO() {
		
	}
	
	private static MemberDAO itc = new MemberDAO();
	
	public static MemberDAO getInstance() {
		return itc;
	}
	
	Connection con = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;

	public MemberDTO selectMember(String id) {
		MemberDTO memberDTO = null;
		
		con = DBman.getConnection();
		
		String sql = "select* from member where userid = ?";
		
		try {
			pstmt = con.prepareStatement(sql);
			
			pstmt.setString(1, id);
			
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				memberDTO = new MemberDTO();
				
				memberDTO.setUserid(rs.getString("userid"));
				memberDTO.setPwd(rs.getString("pwd"));
				memberDTO.setName(rs.getString("name"));
				memberDTO.setPhone(rs.getString("phone"));
				memberDTO.setEmail(rs.getString("email"));
				memberDTO.setZip_num(rs.getString("zip_num"));
				memberDTO.setAddress1(rs.getString("address1"));
				memberDTO.setAddress2(rs.getString("address2"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBman.close(con, pstmt, rs);
		}
		
		return memberDTO;
	}
}
