package com.himedia.dmk.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.himedia.dmk.dto.BoardDTO;
import com.himedia.dmk.dto.ReplyDTO;
import com.himedia.dmk.util.DBman;

public class BoardDAO {
	
	private BoardDAO() {
		
	}
	
	private static BoardDAO boardDAO = new BoardDAO();
	
	public static BoardDAO getInstance() {
		return boardDAO;
	}
	
	Connection con = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;

	public ArrayList<BoardDTO> boardSelectAll() {
		ArrayList<BoardDTO> list = new ArrayList<BoardDTO>();
		
		String sql = "select* from board";
		
		con = DBman.getConnection();
		
		try {
			pstmt = con.prepareStatement(sql);
			
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				BoardDTO boardDTO = new BoardDTO();
				boardDTO.setNum(rs.getInt("num"));
				boardDTO.setPass(rs.getString("pass"));
				boardDTO.setUserid(rs.getString("userid"));
				boardDTO.setEmail(rs.getString("email"));
				boardDTO.setTitle(rs.getString("title"));
				boardDTO.setContent(rs.getString("content"));
				boardDTO.setReadcount(rs.getInt("readcount"));
				boardDTO.setWritedate(rs.getTimestamp("writedate"));
				
				list.add(boardDTO);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return list;
	}

	public void insertBoard(BoardDTO boardDTO) {
		
		con = DBman.getConnection();
		
		String sql = "insert into board(pass, userid, email, title, content) values(?, ?, ?, ?, ?)";
		
		try {
			pstmt = con.prepareStatement(sql);
			
			pstmt.setString(1, boardDTO.getPass());
			pstmt.setString(2, boardDTO.getUserid());
			pstmt.setString(3, boardDTO.getEmail());
			pstmt.setString(4, boardDTO.getTitle());
			pstmt.setString(5, boardDTO.getContent());
			
			pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

	public BoardDTO getBoard(int num) {
		BoardDTO boardDTO = null;
		
		String sql = "select* from board where num = ?";
		
		con = DBman.getConnection();
		
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, num);
			
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				boardDTO = new BoardDTO();
				boardDTO.setNum(rs.getInt("num"));
				boardDTO.setPass(rs.getString("pass"));
				boardDTO.setUserid(rs.getString("userid"));
				boardDTO.setEmail(rs.getString("email"));
				boardDTO.setTitle(rs.getString("title"));
				boardDTO.setContent(rs.getString("content"));
				boardDTO.setReadcount(rs.getInt("readcount"));
				boardDTO.setWritedate(rs.getTimestamp("writedate"));
				
		}
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			DBman.close(con, pstmt, rs);
		}
		
		
		return boardDTO;
	}

	public void plusReadCount(int num) {
		con = DBman.getConnection();
		
		String sql = "update board set readcount = readcount+1 where num = ?";
		
		try {
			pstmt = con.prepareStatement(sql);
			
			pstmt.setInt(1, num);
			
			pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBman.close(con, pstmt, rs);
		}
	}

	public void updateBoard(BoardDTO boardDTO) {
		
		con = DBman.getConnection();
		
		String sql = "update board set pass=?, email=?, title=?, content=? where num = ?";
		
		
		try {
			pstmt = con.prepareStatement(sql);
			
			pstmt.setString(1, boardDTO.getPass());
			pstmt.setString(2, boardDTO.getEmail());
			pstmt.setString(3, boardDTO.getTitle());
			pstmt.setString(4, boardDTO.getContent());
			pstmt.setInt(5, boardDTO.getNum());
			
			pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			DBman.close(con, pstmt, rs);
			
		}
		
	}

	public void deleteBoard(int num) {
		
		con = DBman.getConnection();
		
		String sql = "delete from board where num = ?";
		
		try {
			pstmt = con.prepareStatement(sql);
			
			pstmt.setInt(1, num);
			
			pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBman.close(con, pstmt, rs);
		}
		
	}

	public ArrayList<ReplyDTO> getReply(int num) {
		ArrayList<ReplyDTO> list = new ArrayList<ReplyDTO>();
		
		con = DBman.getConnection();
		
		String sql = "select* from reply where boardnum = ?";
		
		try {
			pstmt = con.prepareStatement(sql);
			
			pstmt.setInt(1, num);
			
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				ReplyDTO replyDTO = new ReplyDTO();
				replyDTO.setReplynum(rs.getInt("replynum"));
				replyDTO.setBoardnum(rs.getInt("boardnum"));
				replyDTO.setUserid(rs.getString("userid"));
				replyDTO.setWritedate(rs.getTimestamp("writedate"));
				replyDTO.setContent(rs.getString("content"));
				
				list.add(replyDTO);
			}
		
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBman.close(con, pstmt, rs);
		}
		
		return list;
	}


}
