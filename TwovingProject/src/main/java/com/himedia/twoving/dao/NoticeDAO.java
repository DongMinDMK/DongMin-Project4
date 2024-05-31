package com.himedia.twoving.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.himedia.twoving.util.DBman;
import com.himedia.twoving.util.Paging;
import com.himedia.twoving.vo.NoticeVO;

public class NoticeDAO {
	private NoticeDAO() {
		
	}
	
	private static NoticeDAO itc = new NoticeDAO();
	
	public static NoticeDAO getInstance() {
		return itc;
	}
	
	Connection con = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	
	

	public int getAllCount() {
		int count = 0;
		
		con = DBman.getConnection();
		
		String sql = "select count(*) as cnt  from notice";
		
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

	public ArrayList<NoticeVO> adminProductList(Paging paging) {
		ArrayList<NoticeVO> list = new ArrayList<NoticeVO>();
		
		con = DBman.getConnection();
		
		String  sql = "select* from notice where noticeyn='N' order by nseq desc limit ? offset ?";
		
		try {
			pstmt = con.prepareStatement(sql);
			
			pstmt.setInt(1, paging.getDisplayRow());
			pstmt.setInt(2, paging.getStartNum()-1);
			
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				NoticeVO noticeVO = new NoticeVO();
				noticeVO.setNseq(rs.getInt("nseq"));
				noticeVO.setUserid(rs.getString("userid"));
				noticeVO.setTitle(rs.getString("title"));
				noticeVO.setContent(rs.getString("content"));
				noticeVO.setIndate(rs.getTimestamp("indate"));
				noticeVO.setReadcount(rs.getInt("readcount"));
				noticeVO.setNoticeyn(rs.getString("noticeyn"));
				
				list.add(noticeVO);
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBman.close(con, pstmt, rs);
		}
		
		return list;
	}

	public void updateCount(int nseq) {
		con = DBman.getConnection();
		
		String sql = "update notice set readcount=readcount+1 where nseq=?";
		
		try {
			pstmt = con.prepareStatement(sql);
			
			pstmt.setInt(1, nseq);
			
			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBman.close(con, pstmt, rs);
		}
	}

	public NoticeVO getOneList(int nseq) {
		NoticeVO noticeVO = null;
		
		con = DBman.getConnection();
		
		String sql = "select* from notice where nseq=?";
		
		try {
			pstmt = con.prepareStatement(sql);
			
			pstmt.setInt(1, nseq);
			
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				noticeVO = new NoticeVO();
				noticeVO.setNseq(rs.getInt("nseq"));
				noticeVO.setUserid(rs.getString("userid"));
				noticeVO.setTitle(rs.getString("title"));
				noticeVO.setContent(rs.getString("content"));
				noticeVO.setIndate(rs.getTimestamp("indate"));
				noticeVO.setReadcount(rs.getInt("readcount"));
				noticeVO.setNoticeyn(rs.getString("noticeyn"));
			}
		} catch (SQLException e) {
		
			e.printStackTrace();
		} finally {
			DBman.close(con, pstmt, rs);
		}
		return noticeVO;
	}
}
