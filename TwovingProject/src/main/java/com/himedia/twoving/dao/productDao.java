package com.himedia.twoving.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.himedia.twoving.util.DBman;
import com.himedia.twoving.vo.ProductVO;

public class productDao {

	private productDao() {}
	private static productDao itc = new productDao();
	public static productDao getInstance() {return itc;}

	Connection con = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;

	public ArrayList<ProductVO> bestList() {
		ArrayList<ProductVO> list = new ArrayList<ProductVO>();
		con = DBman.getConnection();
		String sql = "select * from best_pro_view";
		
		try {
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				ProductVO pvo = new ProductVO();
				pvo.setPseq(rs.getInt("pseq"));
				pvo.setTitle(rs.getString("title"));
				pvo.setImage(rs.getString("image"));
				pvo.setSavefilename(rs.getString("savefilename"));
				pvo.setKind(rs.getInt("kind"));
				pvo.setGenre(rs.getString("genre"));
				list.add(pvo);
			}
		}catch(SQLException e){e.printStackTrace();
		}finally{DBman.close(con, pstmt, rs);}
			return list;
		}

	
	public ArrayList<ProductVO> newList() {
		ArrayList<ProductVO> list = new ArrayList<ProductVO>();
		con = DBman.getConnection();
		String sql = "select * from new_pro_view";

		try {
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				ProductVO pvo = new ProductVO();
				pvo.setPseq(rs.getInt("pseq"));
				pvo.setTitle(rs.getString("title"));
				pvo.setImage(rs.getString("image"));
				pvo.setSavefilename(rs.getString("savefilename"));
				pvo.setKind(rs.getInt("kind"));
				pvo.setGenre(rs.getString("genre"));
				list.add(pvo);
			}
		}catch(SQLException e){e.printStackTrace();
		}finally{DBman.close(con, pstmt, rs);}
			return list;
		}

		
	public ArrayList<ProductVO> selectKindProduct(int kind){
		ArrayList<ProductVO> list = new ArrayList<ProductVO>();
		con = DBman.getConnection();
		String sql = "select * from product where kind=?";
		
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, kind);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				ProductVO pvo = new ProductVO();
				pvo.setPseq(rs.getInt("pseq"));
				pvo.setTitle(rs.getString("title"));
				pvo.setImage(rs.getString("image"));
				pvo.setSavefilename(rs.getString("savefilename"));
				pvo.setKind(rs.getInt("kind"));
				pvo.setGenre(rs.getString("genre"));
				list.add(pvo);
			}
		}catch(SQLException e){e.printStackTrace();
		}finally{DBman.close(con, pstmt, rs);}
			return list;
		}
	
	
	public ArrayList<ProductVO> selectGenreProduct(String genre){		
		ArrayList<ProductVO> list = new ArrayList<ProductVO>();
		con = DBman.getConnection();
		String sql = "select * from product where genre=?";
		
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, genre);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				ProductVO pvo = new ProductVO();
				pvo.setPseq(rs.getInt("pseq"));
				pvo.setTitle(rs.getString("title"));
				pvo.setImage(rs.getString("image"));
				pvo.setSavefilename(rs.getString("savefilename"));
				pvo.setKind(rs.getInt("kind"));
				pvo.setGenre(rs.getString("genre"));
				list.add(pvo);
			}
		}catch(SQLException e){e.printStackTrace();
		}finally{DBman.close(con, pstmt, rs);}
			return list;
		}

	 
	public ProductVO getProduct(int pseq) {
		ProductVO pvo = new ProductVO();
		con = DBman.getConnection();
		String sql = "select * from product where pseq=?";
		
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, pseq);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				pvo.setPseq(rs.getInt("pseq"));
				pvo.setKind(rs.getInt("kind"));
				pvo.setAge(rs.getString("age"));
				pvo.setCount(rs.getInt("count"));
				pvo.setTitle(rs.getString("title"));
				pvo.setTime(rs.getString("time"));
				pvo.setYear(rs.getString("year"));
				pvo.setGenre(rs.getString("genre"));
				pvo.setContent(rs.getString("content"));
				pvo.setNewyn(rs.getString("newyn"));
				pvo.setUseyn(rs.getString("useyn"));
				pvo.setBestyn(rs.getString("bestyn"));
				pvo.setImage(rs.getString("image"));
				pvo.setImage2(rs.getString("image2"));
				pvo.setSavefilename(rs.getString("savefilename"));
				pvo.setSavefilename2(rs.getString("savefilename2"));
		}
		}catch(SQLException e){e.printStackTrace();
		}finally{DBman.close(con, pstmt, rs);}
			return pvo;
		}


	public ArrayList<ProductVO> mainList() {
		
		ArrayList<ProductVO> list = new ArrayList<ProductVO>();
		con = DBman.getConnection();
		String sql = "select * from main_pro_view";

		try {
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				ProductVO pvo = new ProductVO();
				pvo.setPseq(rs.getInt("pseq"));
				pvo.setTitle(rs.getString("title"));
				pvo.setImage(rs.getString("image"));
				pvo.setSavefilename(rs.getString("savefilename"));
				pvo.setKind(rs.getInt("kind"));
				pvo.setGenre(rs.getString("genre"));
				pvo.setAge(rs.getString("age"));
				pvo.setTime(rs.getString("time"));
				pvo.setYear(rs.getString("year"));
				pvo.setContent(rs.getString("content"));				
				list.add(pvo);
			}
		}catch(SQLException e){e.printStackTrace();
		}finally{DBman.close(con, pstmt, rs);}
			return list;
	}


	public ArrayList<ProductVO> searchList(String key) {
		ArrayList<ProductVO> list = new ArrayList<ProductVO>();
		String sql = "select * from product "
							+ " where title like concat('%' , ? , '%') "
							+ " order by pseq desc ";
		con = DBman.getConnection();
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1,  key);			
			rs = pstmt.executeQuery();
			while(rs.next()) {
				ProductVO pvo = new ProductVO();
    	    	pvo.setPseq(rs.getInt("pseq"));   
    	    	pvo.setTitle(rs.getString("title"));    	    	
    	    	pvo.setImage(rs.getString("image"));
    	    	pvo.setSavefilename(rs.getString("savefilename"));
    	    	pvo.setKind(rs.getInt("kind"));
				pvo.setGenre(rs.getString("genre"));	
    	    	list.add(pvo);
			} 
		}catch (SQLException e) { e.printStackTrace();
		} finally { DBman.close(con, pstmt, rs);  }
		return list;		
	}

}
