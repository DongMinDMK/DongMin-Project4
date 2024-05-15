package com.himedia.dmk.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.himedia.dmk.dto.MemberDTO;
import com.himedia.dmk.util.DBman;

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
	
	public MemberDTO getMember(String userid) {
		MemberDTO memberDTO = null;
		
		String sql = "select* from member where userid = ?";
		
		con = DBman.getConnection();
		
		try {
			pstmt = con.prepareStatement(sql);
			
			pstmt.setString(1, userid);
			
			rs = pstmt.executeQuery();
			
			
			if(rs.next()) {
				memberDTO = new MemberDTO();
				
				memberDTO.setUserid(rs.getString("userid"));
				memberDTO.setName(rs.getString("name"));
				memberDTO.setPwd(rs.getString("pwd"));
				memberDTO.setEmail(rs.getString("email"));
				memberDTO.setPhone(rs.getString("phone"));
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBman.close(con, pstmt, rs);
		}
		
		return memberDTO;
	}

	public int getInsertMember(MemberDTO memberDTO) {
		int result = 0;
		
		String sql = "insert into member(userid, name, pwd, email, phone) values(?, ?, ?, ?, ?)";
		
		con = DBman.getConnection();
		
		try {
			pstmt = con.prepareStatement(sql);
			
			pstmt.setString(1, memberDTO.getUserid());
			pstmt.setString(2, memberDTO.getName());
			pstmt.setString(3, memberDTO.getPwd());
			pstmt.setString(4, memberDTO.getEmail());
			pstmt.setString(5, memberDTO.getPhone());
			
			result = pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			DBman.close(con, pstmt, rs);
		}
		
		return result;
	}

	public int memberUpdate(MemberDTO memberDTO) {
		int result = 0;
		
		con = DBman.getConnection();
		
		String sql = "update member set name = ?, pwd = ?, email = ?, phone = ? where userid = ?";
		
		try {
			pstmt = con.prepareStatement(sql);
			
			pstmt.setString(1, memberDTO.getName());
			pstmt.setString(2, memberDTO.getPwd());
			pstmt.setString(3, memberDTO.getEmail());
			pstmt.setString(4, memberDTO.getPhone());
			pstmt.setString(5, memberDTO.getUserid());
			
			result = pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			DBman.close(con, pstmt, rs);
		}
		
		return result;
	}

	public int deleteMember(MemberDTO memberDTO) {
		int result = 0;
		
		String sql = "delete from member where userid = ?";
		
		con = DBman.getConnection();
		
		try {
			pstmt = con.prepareStatement(sql);
			
			pstmt.setString(1, memberDTO.getUserid());
			
			result = pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			DBman.close(con, pstmt, rs);
		}
		
		return result;
	}
	
	

}
