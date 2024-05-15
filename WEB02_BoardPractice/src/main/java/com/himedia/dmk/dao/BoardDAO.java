package com.himedia.dmk.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.himedia.dmk.dto.BoardDTO;
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

}
