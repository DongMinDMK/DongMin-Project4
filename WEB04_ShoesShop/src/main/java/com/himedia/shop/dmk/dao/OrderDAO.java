package com.himedia.shop.dmk.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.himedia.shop.dmk.dto.CartDTO;
import com.himedia.shop.dmk.dto.OrderDTO;
import com.himedia.shop.dmk.util.DBman;

public class OrderDAO {
	
	private OrderDAO() {
		
	}
	
	private static OrderDAO itc = new OrderDAO();
	
	public static OrderDAO getInstance() {
		return itc;
	}
	
	Connection con = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;

	public void insertOrders(String userid) {
		con = DBman.getConnection();
		
		String sql = "insert into orders(userid) values(?)";
		
		try {
			pstmt = con.prepareStatement(sql);
			
			pstmt.setString(1, userid);
			
			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			DBman.close(con, pstmt, rs);
		}
	}

	public int lookupMaxOseq(String userid) {
		int result = 0;
		
		con = DBman.getConnection();
		
		String sql = "select max(oseq) as moseq from orders where userid = ?";
		
		try {
			pstmt = con.prepareStatement(sql);
			
			pstmt.setString(1, userid);
			
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				result = rs.getInt("moseq");
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBman.close(con, pstmt, rs);
		}
		
		
		return result;
	}

	public void insertOrderDetail(CartDTO cartDTO, int oseq) {
		con = DBman.getConnection();
		
		String sql = "insert into order_detail(oseq, pseq, quantity) values(?,?,?)";
		
		try {
			pstmt = con.prepareStatement(sql);
			
			pstmt.setInt(1, oseq);
			pstmt.setInt(2, cartDTO.getPseq());
			pstmt.setInt(3, cartDTO.getQuantity());
			
			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBman.close(con, pstmt, rs);
		}
	}

	public ArrayList<OrderDTO> selectOrderByOseq(int oseq) {
		ArrayList<OrderDTO> list = new ArrayList<OrderDTO>();
		
		con = DBman.getConnection();
		
		String sql = "select* from order_view where oseq=?";
		
		try {
			pstmt = con.prepareStatement(sql);
			
			pstmt.setInt(1, oseq);
			
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				OrderDTO orderDTO = new OrderDTO();
				
				orderDTO.setOdseq(rs.getInt("odseq"));
				orderDTO.setOseq(rs.getInt("oseq"));
				orderDTO.setIndate(rs.getTimestamp("indate"));
				orderDTO.setUserid(rs.getString("userid"));
				orderDTO.setMname(rs.getString("mname"));
				orderDTO.setZip_num(rs.getString("zip_num"));
				orderDTO.setAddress1(rs.getString("address1"));
				orderDTO.setAddress2(rs.getString("address2"));
				orderDTO.setPhone(rs.getString("phone"));
				orderDTO.setPseq(rs.getInt("pseq"));
				orderDTO.setPname(rs.getString("pname"));
				orderDTO.setPrice2(rs.getInt("price2"));
				orderDTO.setQuantity(rs.getInt("quantity"));
				orderDTO.setResult(rs.getString("result"));
				
				list.add(orderDTO);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBman.close(con, pstmt, rs);
		}
		
		
		return list;
	}

	public void insertOrderDetail(int pseq, int oseq, int quantity) {
		con = DBman.getConnection();
		
		String sql = "insert into order_detail(oseq, pseq, quantity) values(?,?,?)";
		
		try {
			pstmt = con.prepareStatement(sql);
			
			pstmt.setInt(1, oseq);
			pstmt.setInt(2, pseq);
			pstmt.setInt(3, quantity);
			
			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			DBman.close(con, pstmt, rs);
		}
	}

}
