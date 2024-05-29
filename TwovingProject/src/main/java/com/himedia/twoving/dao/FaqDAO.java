package com.himedia.twoving.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.himedia.twoving.util.DBman;
import com.himedia.twoving.vo.FaqVO;

public class FaqDAO {
	private FaqDAO() {
		
	}
	
	private static FaqDAO itc = new FaqDAO();
	
	public static FaqDAO getInstance() {
		return itc;
	}
	
	Connection con = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;

	public ArrayList<FaqVO> getList() {
		ArrayList<FaqVO> list = new ArrayList<FaqVO>();
		
		con = DBman.getConnection();
		
		String sql = "select* from faq";
		
		try {
			pstmt = con.prepareStatement(sql);
			
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				FaqVO faqVO = new FaqVO();
				faqVO.setQseq(rs.getInt("qseq"));
				faqVO.setInquirylist(rs.getString("inquirylist"));
				faqVO.setSubject(rs.getString("subject"));
				faqVO.setContent(rs.getString("content"));
				
				list.add(faqVO);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBman.close(con, pstmt, rs);
		}
		
		return list;
	}
}
