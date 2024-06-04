package com.himedia.twoving.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.himedia.twoving.util.DBman;
import com.himedia.twoving.vo.steamedVO;

public class steamedDao {

	private steamedDao() {}
	private static steamedDao itc = new steamedDao();
	public static steamedDao getInstance() {return itc;}

	Connection con = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	
	
	public void insertsteamed(steamedVO svo) {
		String sql = "insert into steamed(userid, pseq, indate) values (?,?,?)";
		con = DBman.getConnection();
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1,svo.getUserid());
			pstmt.setInt(2,svo.getPseq());
			pstmt.setTimestamp(3,svo.getIndate());
			pstmt.executeUpdate();
		} catch (SQLException e) {e.printStackTrace();
		} finally { DBman.close(con, pstmt, rs);}
	}
	
	public ArrayList<steamedVO> selectsteamed(String userid) {
		ArrayList<steamedVO> list = new ArrayList<steamedVO>();
		con = DBman.getConnection();
		String sql = "select * from steamed_view where userid=?";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1,userid);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				steamedVO svo = new steamedVO();
				svo.setSseq(rs.getInt("cseq"));
				svo.setUserid(rs.getString("userid"));
				svo.setPseq(rs.getInt("pseq"));
				svo.setIndate(rs.getTimestamp("indate"));
				list.add(svo);
			}
		} catch (SQLException e) {e.printStackTrace();
		} finally { DBman.close(con, pstmt, rs);}
		System.out.println(list.size());
		return list;
	}

	public void deletsteamed(int pseq) {
		con = DBman.getConnection();
		String sql = "delete from steamed where pseq=?";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, pseq);
			pstmt.executeUpdate();
		} catch (SQLException e) {e.printStackTrace();
		}finally { DBman.close(con, pstmt, rs);}

	}

	public steamedVO getsteamed(String sseq) {
		steamedVO svo = new steamedVO();
		con = DBman.getConnection();
		String sql = "select * from cart_view where sseq = ?";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, Integer.parseInt(sseq));
			rs = pstmt.executeQuery();
			if(rs.next()) {
				svo.setSseq(rs.getInt("sseq"));
				svo.setUserid(rs.getString("userid"));		
				svo.setPseq(rs.getInt("pseq"));
				svo.setIndate(rs.getTimestamp("indate"));
			}
		} catch (SQLException e) {e.printStackTrace();
		}finally { DBman.close(con, pstmt, rs);}
		
		return svo;
	}

	public ArrayList<steamedVO> selectCart(String userid) {
		// TODO Auto-generated method stub
		return null;
	}

}
