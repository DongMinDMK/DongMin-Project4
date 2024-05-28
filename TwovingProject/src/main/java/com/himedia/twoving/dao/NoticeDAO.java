package com.himedia.twoving.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.himedia.twoving.util.DBman;
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

	public ArrayList<NoticeVO> adminProductList() {
		ArrayList<NoticeVO> list = new ArrayList<NoticeVO>();
		
		con = DBman.getConnection();
		
		String  sql = "select* from notice order by noticeid desc";
		
		try {
			pstmt = con.prepareStatement(sql);
			
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				NoticeVO noticeVO = new NoticeVO();
				noticeVO.setNoticeid(rs.getInt("noticeid"));
				noticeVO.setUserid(rs.getString("userid"));
				noticeVO.setTitle(rs.getString("title"));
				noticeVO.setContent(rs.getString("content"));
				noticeVO.setIndate(rs.getTimestamp("indate"));
				noticeVO.setReadcount(rs.getInt("readcount"));
				
				list.add(noticeVO);
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBman.close(con, pstmt, rs);
		}
		
		return list;
	}
}
