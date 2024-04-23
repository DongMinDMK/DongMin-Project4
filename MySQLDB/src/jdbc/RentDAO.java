package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class RentDAO {
	
	Connection con = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	
	private RentDAO() {
		
	}
	
	private static RentDAO rentDAO = new RentDAO();
	
	public static RentDAO getInstance() {
		return rentDAO;
	}

	public List<RentDTO> rentAllSelect() {
		List<RentDTO> list = new ArrayList<RentDTO>();
		
		con = DBman.getConnection();
		
		String sql = "select * from rentDetail order by rent_num desc";
		
		try {
			pstmt = con.prepareStatement(sql);
			
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				RentDTO rentDTO = new RentDTO();
				rentDTO.setRent_num(rs.getInt("rent_num"));
				rentDTO.setRent_date(rs.getString("rent_date"));
				rentDTO.setB_num(rs.getInt("b_num"));
				rentDTO.setSubject(rs.getString("subject"));
				rentDTO.setM_num(rs.getInt("m_num"));
				rentDTO.setName(rs.getString("name"));
				rentDTO.setDiscount(rs.getInt("discount"));
				
				list.add(rentDTO);
				
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		DBman.close(con, pstmt, rs);
		
		return list;
	}

	public int selectOneMember(int member_num) {
		int result = 0;
		
		con = DBman.getConnection();
		
		String sql = "select * from member_list where member_num = ?";
		
		try {
			pstmt = con.prepareStatement(sql);
			
			pstmt.setInt(1, member_num);
			
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				result = 1;
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		DBman.close(con, pstmt, rs);
	
		return result;
	}

	public int selectOneBook(int book_num) {
		int result = 0;
		
		con = DBman.getConnection();
		
		String sql = "select * from book_list where book_num = ?";
		
		try {
			pstmt = con.prepareStatement(sql);
			
			pstmt.setInt(1, book_num);
			
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				result = 1;
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		DBman.close(con, pstmt, rs);
		
		return result;
	}

	public int rentInsert(RentDTO rentDTO) {
		
		int result = 0;
		
		con = DBman.getConnection();
		
		
		String sql = "insert into rent_list(b_num, m_num, discount) values(?,?,?)";
		
		try {
			pstmt = con.prepareStatement(sql);
			
			pstmt.setInt(1, rentDTO.getB_num());
			pstmt.setInt(2, rentDTO.getM_num());
			pstmt.setInt(3, rentDTO.getDiscount());
			
			result = pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		DBman.close(con, pstmt, rs);
	
		return result;
	}

	public RentDTO rentGetRent(int rent_num) {
		RentDTO rentDTO = new RentDTO();
		
		con = DBman.getConnection();
		
		String sql = "select * from rentDetail where rent_num = ?";
		
		try {
			pstmt = con.prepareStatement(sql);
			
			pstmt.setInt(1, rent_num);
			
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				rentDTO.setRent_num(rs.getInt("rent_num"));
				rentDTO.setRent_date(rs.getString("rent_date"));
				rentDTO.setB_num(rs.getInt("b_num"));
				rentDTO.setSubject(rs.getString("subject"));
				rentDTO.setM_num(rs.getInt("m_num"));
				rentDTO.setName(rs.getString("name"));
				rentDTO.setDiscount(rs.getInt("discount"));
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		DBman.close(con, pstmt, rs);
		
		return rentDTO;
	}

	public int rentUpdate(RentDTO rentDTO) {
		int result = 0;
		
		con = DBman.getConnection();
		
		String sql = "update rent_list set rent_date = str_to_date(concat('',?,''), '%Y-%m-%d'), b_num = ?, m_num = ?, discount = ? where rent_num = ?";
		
		try {
			pstmt = con.prepareStatement(sql);
			
			pstmt.setString(1, rentDTO.getRent_date());
			pstmt.setInt(2, rentDTO.getB_num());
			pstmt.setInt(3, rentDTO.getM_num());
			pstmt.setInt(4, rentDTO.getDiscount());
			pstmt.setInt(5, rentDTO.getRent_num());
			
			result = pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		DBman.close(con, pstmt, rs);
		
		
		return result;
	}
	
	
	

}
