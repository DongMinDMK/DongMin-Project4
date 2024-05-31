package com.himedia.twoving.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.himedia.twoving.util.DBman;
import com.himedia.twoving.util.Paging;
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

	public ArrayList<FaqVO> getList(Paging paging, String key) {
		ArrayList<FaqVO> list = new ArrayList<FaqVO>();
		
		con = DBman.getConnection();
		
		String sql = "select* from faq where subject like concat('%',?,'%') limit ? offset ?";
		
		try {
			pstmt = con.prepareStatement(sql);
			
			pstmt.setString(1, key);
			pstmt.setInt(2, paging.getDisplayRow());
			pstmt.setInt(3, paging.getStartNum()-1);
			
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

	public ArrayList<FaqVO> getMemberCustomerLogin(String memberLoginList, Paging paging, String key) {
		ArrayList<FaqVO> list = new ArrayList<FaqVO>();
		
		con = DBman.getConnection();
		
		String sql = "select* from faq where inquirylist=? and subject like concat('%',?,'%') limit ? offset ?";
		
		try {
			pstmt = con.prepareStatement(sql);
			
			pstmt.setString(1, memberLoginList);
			pstmt.setString(2, key);
			pstmt.setInt(3, paging.getDisplayRow());
			pstmt.setInt(4, paging.getStartNum()-1);
			
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

	public ArrayList<FaqVO> getPassTicket(String passTicket, Paging paging, String key) {
		ArrayList<FaqVO> list = new ArrayList<FaqVO>();
		
		con = DBman.getConnection();
		
		String sql = "select* from faq where inquirylist=? and subject like concat('%',?,'%') limit ? offset ?";
		
		try {
			pstmt = con.prepareStatement(sql);
			
			pstmt.setString(1, passTicket);
			pstmt.setString(2, key);
			pstmt.setInt(3, paging.getDisplayRow());
			pstmt.setInt(4, paging.getStartNum()-1);
			
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

	public ArrayList<FaqVO> getLoadingError(String loadingErrorList, Paging paging, String key) {
		ArrayList<FaqVO> list = new ArrayList<FaqVO>();
		
		con = DBman.getConnection();
		
		String sql = "select* from faq where inquirylist=?  and subject like concat('%',?,'%') limit ? offset ?";
		
		try {
			pstmt = con.prepareStatement(sql);
			
			pstmt.setString(1, loadingErrorList);
			pstmt.setString(2, key);
			pstmt.setInt(3, paging.getDisplayRow());
			pstmt.setInt(4, paging.getStartNum()-1);
			
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

	public ArrayList<FaqVO> getNonpay(String nonpay, Paging paging, String key) {
		ArrayList<FaqVO> list = new ArrayList<FaqVO>();
		
		con = DBman.getConnection();
		
		String sql = "select* from faq where inquirylist=? and subject like concat('%',?,'%') limit ? offset ?";
		
		try {
			pstmt = con.prepareStatement(sql);
			
			pstmt.setString(1, nonpay);
			pstmt.setString(2, key);
			pstmt.setInt(3, paging.getDisplayRow());
			pstmt.setInt(4, paging.getStartNum()-1);
			
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

	public ArrayList<FaqVO> getServiceRun(String servicerun, Paging paging, String key) {
		
		ArrayList<FaqVO> list = new ArrayList<FaqVO>();
		
		con = DBman.getConnection();
		
		String sql = "select* from faq where inquirylist=? and subject like concat('%',?,'%') limit ? offset ?";
		
		try {
			pstmt = con.prepareStatement(sql);
			
			pstmt.setString(1, servicerun);
			pstmt.setString(2, key);
			pstmt.setInt(3, paging.getDisplayRow());
			pstmt.setInt(4, paging.getStartNum()-1);
			
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

	public int getAllCount(String tablename, String fieldName, String key) {
		int count = 0;
		
		con = DBman.getConnection();
		
		String sql = "select count(*) as cnt  from " + tablename + " where " + fieldName + " like concat('%',?,'%')";
		
		try {
			pstmt = con.prepareStatement(sql);
			
			pstmt.setString(1, key);
			
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

	public int getAllCount2(String tablename, String fieldName, String key, String memberLoginList) {
		int count = 0;
		
		con = DBman.getConnection();
		
		String sql = "select count(*) as cnt  from " + tablename + " where " + fieldName + " like concat('%',?,'%') and inquirylist=?";
		
		try {
			pstmt = con.prepareStatement(sql);
			
			pstmt.setString(1, key);
			pstmt.setString(2, memberLoginList);
			
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

	public int getAllCount3(String tablename, String fieldName, String key, String passTicket) {
		int count = 0;
		
		con = DBman.getConnection();
		
		String sql = "select count(*) as cnt  from " + tablename + " where " + fieldName + " like concat('%',?,'%') and inquirylist=?";
		
		try {
			pstmt = con.prepareStatement(sql);
			
			pstmt.setString(1, key);
			pstmt.setString(2, passTicket);
			
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

	public int getAllCount4(String tablename, String fieldName, String key, String loadingErrorList) {
		int count = 0;
		
		con = DBman.getConnection();
		
		String sql = "select count(*) as cnt  from " + tablename + " where " + fieldName + " like concat('%',?,'%') and inquirylist=?";
		
		try {
			pstmt = con.prepareStatement(sql);
			
			pstmt.setString(1, key);
			pstmt.setString(2, loadingErrorList);
			
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

	public int getAllCount5(String tablename, String fieldName, String key, String nonpay) {
		int count = 0;
		
		con = DBman.getConnection();
		
		String sql = "select count(*) as cnt  from " + tablename + " where " + fieldName + " like concat('%',?,'%') and inquirylist=?";
		
		try {
			pstmt = con.prepareStatement(sql);
			
			pstmt.setString(1, key);
			pstmt.setString(2, nonpay);
			
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

	public int getAllCount6(String tablename, String fieldName, String key, String servicerun) {
		int count = 0;
		
		con = DBman.getConnection();
		
		String sql = "select count(*) as cnt  from " + tablename + " where " + fieldName + " like concat('%',?,'%') and inquirylist=?";
		
		try {
			pstmt = con.prepareStatement(sql);
			
			pstmt.setString(1, key);
			pstmt.setString(2, servicerun);
			
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

	
}
