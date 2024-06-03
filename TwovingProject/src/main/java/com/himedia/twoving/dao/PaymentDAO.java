package com.himedia.twoving.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.himedia.twoving.util.DBman;
import com.himedia.twoving.util.Paging;
import com.himedia.twoving.vo.PaymentVO;

public class PaymentDAO {
	
	private PaymentDAO() {
		
	}
	
	private static PaymentDAO itc = new PaymentDAO();
	
	public static PaymentDAO getInstance() {
		return itc;
	}
	
	Connection con = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;

	public ArrayList<PaymentVO> getAllList(Paging paging) {
		ArrayList<PaymentVO> list = new ArrayList<PaymentVO>();
		
		con = DBman.getConnection();
		
		String sql = "select* from payment order by pmseq desc limit ? offset ?";
		
		try {
			pstmt = con.prepareStatement(sql);
			
			pstmt.setInt(1, paging.getDisplayRow());
			pstmt.setInt(2, paging.getStartNum()-1);
			
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				PaymentVO paymentVO = new PaymentVO();
				
				paymentVO.setPmseq(rs.getInt("pmseq"));
				paymentVO.setSubscribeyn(rs.getString("subscribeyn"));
				paymentVO.setProductname(rs.getString("productname"));
				paymentVO.setPaymentprice(rs.getString("paymentprice"));
				paymentVO.setPaymentmeans(rs.getString("paymentmeans"));
				paymentVO.setPaymentday(rs.getTimestamp("paymentday"));
				paymentVO.setRunperiod1(rs.getTimestamp("runperiod1"));
				paymentVO.setRunperiod2(rs.getTimestamp("runperiod2"));
				
				list.add(paymentVO);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBman.close(con, pstmt, rs);
		}
		return list;
	}

	public int getAllCount() {
		int count = 0;
		
		con = DBman.getConnection();
		
		String sql = "select count(*) as cnt  from payment";
		
		try {
			pstmt = con.prepareStatement(sql);
			
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				count = rs.getInt("cnt");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBman.close(con, pstmt, rs);
		}
		
		return count;
	}

	public PaymentVO getPayment(String productname) {
		PaymentVO paymentVO = null;
		
		con = DBman.getConnection();
		
		String sql = "select* from payment where productname=?";
		
		try {
			pstmt = con.prepareStatement(sql);
			
			pstmt.setString(1, productname);
			
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				paymentVO = new PaymentVO();
				
				paymentVO.setPmseq(rs.getInt("pmseq"));
				paymentVO.setSubscribeyn(rs.getString("subscribeyn"));
				paymentVO.setProductname(rs.getString("productname"));
				paymentVO.setPaymentprice(rs.getString("paymentprice"));
				paymentVO.setPaymentmeans(rs.getString("paymentmeans"));
				paymentVO.setPaymentday(rs.getTimestamp("paymentday"));
				paymentVO.setRunperiod1(rs.getTimestamp("runperiod1"));
				paymentVO.setRunperiod2(rs.getTimestamp("runperiod2"));
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBman.close(con, pstmt, rs);
		}
		
		
		return paymentVO;
	}

}
