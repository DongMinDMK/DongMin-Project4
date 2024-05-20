package com.himedia.shop.dmk.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.himedia.shop.dmk.dto.AddressDTO;
import com.himedia.shop.dmk.dto.MemberDTO;
import com.himedia.shop.dmk.util.DBman;

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
		
		con = DBman.getConnection();
		
		String sql = "select* from member where userid = ?";
		
		try {
			pstmt = con.prepareStatement(sql);
			
			pstmt.setString(1, userid);

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
				memberDTO.setIndate(rs.getTimestamp("indate"));
				memberDTO.setUseyn(rs.getString("useyn"));
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBman.close(con, pstmt, rs);
		}
		
		
		
		return memberDTO;
	}

	public ArrayList<AddressDTO> getSelectAddress(String dong) {
		ArrayList<AddressDTO> list = new ArrayList<AddressDTO>();
		
		con = DBman.getConnection();
		
		String sql = "select* from address where dong like concat('%',?,'%')";
		
		try {
			pstmt = con.prepareStatement(sql);
			
			pstmt.setString(1, dong);
			
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				AddressDTO addressDTO = new AddressDTO();
				addressDTO.setZip_num(rs.getString("zip_num"));
				addressDTO.setSido(rs.getString("sido"));
				addressDTO.setGugun(rs.getString("gugun"));
				addressDTO.setDong(rs.getString("dong"));
				addressDTO.setBunji(rs.getString("bunji"));
				addressDTO.setZip_code(rs.getString("zip_code"));
				
				list.add(addressDTO);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBman.close(con, pstmt, rs);
		}
		
		return list;
	}

}
