package com.himedia.shop.dmk.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.himedia.shop.dmk.dto.QnaDTO;
import com.himedia.shop.dmk.util.DBman;

public class QnaDAO {
	private QnaDAO() {
		
	}
	
	private static QnaDAO itc = new QnaDAO();
	
	public static QnaDAO getInstance() {
		return itc;
	}
	
	Connection con = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;

	public ArrayList<QnaDTO> getList() {
		ArrayList<QnaDTO> list = new ArrayList<QnaDTO>();
		
		con = DBman.getConnection();
		
		String sql = "select* from qna order by qseq desc";
		
		try {
			pstmt = con.prepareStatement(sql);

			
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				QnaDTO qnaDTO = new QnaDTO();
				
				qnaDTO.setQseq(rs.getInt("qseq"));
				qnaDTO.setUserid(rs.getString("userid"));
				qnaDTO.setSubject(rs.getString("subject"));
				qnaDTO.setContent(rs.getString("content"));
				qnaDTO.setReply(rs.getString("reply"));
				qnaDTO.setIndate(rs.getTimestamp("indate"));
				
				list.add(qnaDTO);
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBman.close(con, pstmt, rs);
		}
		
		
		return list;
	}

	public QnaDTO getOneSelect(int qseq) {
		QnaDTO qnaDTO = null;
		
		con = DBman.getConnection();
		
		String sql = "select* from qna where qseq=?";
		
		try {
			pstmt = con.prepareStatement(sql);
			
			pstmt.setInt(1, qseq);
			
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				qnaDTO = new QnaDTO();
				
				qnaDTO.setQseq(rs.getInt("qseq"));
				qnaDTO.setUserid(rs.getString("userid"));
				qnaDTO.setSubject(rs.getString("subject"));
				qnaDTO.setContent(rs.getString("content"));
				qnaDTO.setReply(rs.getString("reply"));
				qnaDTO.setIndate(rs.getTimestamp("indate"));
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBman.close(con, pstmt, rs);
		}
		
		
		return qnaDTO;
	}

	public void insertQna(QnaDTO qnaDTO) {
		con = DBman.getConnection();
		
		String sql = "insert into qna(userid, subject, content) values(?,?,?)";
		
		try {
			pstmt = con.prepareStatement(sql);
			
			pstmt.setString(1, qnaDTO.getUserid());
			pstmt.setString(2, qnaDTO.getSubject());
			pstmt.setString(3, qnaDTO.getContent());
			
			pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBman.close(con, pstmt, rs);
		}
	}
}
