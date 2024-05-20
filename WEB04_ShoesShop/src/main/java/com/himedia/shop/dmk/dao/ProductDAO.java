package com.himedia.shop.dmk.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.himedia.shop.dmk.dto.ProductDTO;
import com.himedia.shop.dmk.util.DBman;

public class ProductDAO {
	private ProductDAO() {
		
	}
	
	private static ProductDAO itec = new ProductDAO();
	
	public static ProductDAO getInstance() {
		return itec;
	}
	
	Connection con = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;

	public ArrayList<ProductDTO> bestList() {
		ArrayList<ProductDTO> list = new ArrayList<ProductDTO>();
		
		con = DBman.getConnection();
		
		String sql = "select* from best_pro_view";
		
		try {
			pstmt = con.prepareStatement(sql);
			
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				ProductDTO productDTO = new ProductDTO();
				productDTO.setPseq(rs.getInt("pseq"));
				productDTO.setName(rs.getString("name"));
				productDTO.setPrice2(rs.getInt("price2"));
				productDTO.setImage(rs.getString("image"));
				
				list.add(productDTO);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBman.close(con, pstmt, rs);
		}
		
		return list;
	}

	public ArrayList<ProductDTO> newList() {
		ArrayList<ProductDTO> list = new ArrayList<ProductDTO>();
		
		con = DBman.getConnection();
		
		String sql = "select* from new_pro_view";
		
		try {
			pstmt = con.prepareStatement(sql);
			
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				ProductDTO productDTO = new ProductDTO();
				productDTO.setPseq(rs.getInt("pseq"));
				productDTO.setName(rs.getString("name"));
				productDTO.setPrice2(rs.getInt("price2"));
				productDTO.setImage(rs.getString("image"));
				
				list.add(productDTO);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBman.close(con, pstmt, rs);
		}
		
		return list;
	}
	
	
}
