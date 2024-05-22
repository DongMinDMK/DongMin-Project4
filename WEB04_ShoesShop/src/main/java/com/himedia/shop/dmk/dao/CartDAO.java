package com.himedia.shop.dmk.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.himedia.shop.dmk.dto.CartDTO;
import com.himedia.shop.dmk.util.DBman;

public class CartDAO {
	
	private CartDAO() {
		
	}
	
	private static CartDAO itc = new CartDAO();
	
	public static CartDAO getInstance() {
		return itc;
	}
	
	Connection con = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;

	public void insertCart(CartDTO cartDTO) {
		
		con = DBman.getConnection();
		
		String sql = "insert into cart(userid, pseq, quantity) values(?,?,?)";
		
		try {
			pstmt = con.prepareStatement(sql);
			
			pstmt.setString(1, cartDTO.getUserid());
			pstmt.setInt(2, cartDTO.getPseq());
			pstmt.setInt(3, cartDTO.getQuantity());
			
			pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBman.close(con, pstmt, rs);
		}
		
		
	}

	public ArrayList<CartDTO> getSelectedListCart(String userid) {
		
		ArrayList<CartDTO> list = new ArrayList<CartDTO>();
		
		con = DBman.getConnection();
		
		String sql = "select* from cart_view where userid = ?";
		
		try {
			pstmt = con.prepareStatement(sql);
			
			pstmt.setString(1, userid);
			
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				CartDTO cartDTO = new CartDTO();
				cartDTO.setCseq(rs.getInt("cseq"));
				cartDTO.setUserid(rs.getString("userid"));
				cartDTO.setMname(rs.getString("mname"));
				cartDTO.setPseq(rs.getInt("pseq"));
				cartDTO.setPname(rs.getString("pname"));
				cartDTO.setQuantity(rs.getInt("quantity"));
				cartDTO.setPrice2(rs.getInt("price2"));
				cartDTO.setIndate(rs.getTimestamp("indate"));
				
				list.add(cartDTO);
			}
			
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBman.close(con, pstmt, rs);
		}
		
		return list;
	}

	public void deleteCart(int cseq) {
		con = DBman.getConnection();
		
		String sql = "delete from cart where cseq = ?";
		
		try {
			pstmt = con.prepareStatement(sql);
			
			pstmt.setInt(1, cseq);
			
			pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBman.close(con, pstmt, rs);
		}
	}

	public CartDTO getCart(String cseq) {
		CartDTO cartDTO = null;
		
		con = DBman.getConnection();
		
		String sql = "select* from cart_view where cseq = ?";
		
		try {
			pstmt = con.prepareStatement(sql);
			
			pstmt.setInt(1, Integer.parseInt(cseq));
			
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				cartDTO = new CartDTO();
				
				cartDTO.setCseq(rs.getInt("cseq"));
				cartDTO.setUserid(rs.getString("userid"));
				cartDTO.setMname(rs.getString("mname"));
				cartDTO.setPseq(rs.getInt("pseq"));
				cartDTO.setPname(rs.getString("pname"));
				cartDTO.setQuantity(rs.getInt("quantity"));
				cartDTO.setPrice2(rs.getInt("price2"));
				cartDTO.setIndate(rs.getTimestamp("indate"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBman.close(con, pstmt, rs);
		}
		
		
		return cartDTO;
	}


	

}
