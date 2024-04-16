package jdbc01;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class BookDAO {
	
	Connection con = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	
	DatabaseManager dm = new DatabaseManager();

	public ArrayList<BookDTO> bookSelect() {
		
		ArrayList<BookDTO> list = new ArrayList<BookDTO>();
		
		con = dm.getConnection();
		
		String sql = "select * from book_list";
		
		try {
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				BookDTO bookDTO = new BookDTO();
				
				bookDTO.setBookNum(rs.getInt("book_num"));
				bookDTO.setSubject(rs.getString("subject"));
				bookDTO.setMakeYear(rs.getInt("make_year"));
				bookDTO.setInPrice(rs.getInt("in_price"));
				bookDTO.setRentPrice(rs.getInt("rent_price"));
				bookDTO.setGrade(rs.getString("grade"));
				
				list.add(bookDTO);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		dm.close(con, pstmt, rs);
		
		return list;
	}

	public int bookInsert(BookDTO bookDTO) {
		int result = 0;
		
		con = dm.getConnection();
		
		String sql = "insert into book_list(book_num, subject, make_year, in_price, rent_price, grade) values(book_seq.nextVal,?,?,?,?,?)";
		
		try {
			pstmt = con.prepareStatement(sql);
			
			pstmt.setString(1, bookDTO.getSubject());
			pstmt.setInt(2, bookDTO.getMakeYear());
			pstmt.setInt(3, bookDTO.getInPrice());
			pstmt.setInt(4, bookDTO.getRentPrice());
			pstmt.setString(5, bookDTO.getGrade());
			
			result = pstmt.executeUpdate();
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	
		dm.close(con, pstmt, rs);
		return result;
	}

	public BookDTO bookOneSelect(int num) {
		
		BookDTO bookDTO = null;
		
		con = dm.getConnection();
		
		String sql = "select * from book_list where book_num = ?";
		
		try {
			pstmt = con.prepareStatement(sql);
			
			pstmt.setInt(1, num);
			
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				bookDTO = new BookDTO();
				bookDTO.setBookNum(rs.getInt("book_num"));
				bookDTO.setSubject(rs.getString("subject"));
				bookDTO.setMakeYear(rs.getInt("make_year"));
				bookDTO.setInPrice(rs.getInt("in_price"));
				bookDTO.setRentPrice(rs.getInt("rent_price"));
				bookDTO.setGrade(rs.getString("grade"));
			}
	
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		dm.close(con, pstmt, rs);
		return bookDTO;
	}

	public int bookUpdate(BookDTO bookDTO) {
		int result = 0;
		
		con = dm.getConnection();
		
		String sql = "update book_list set subject = ?, make_year = ?, in_price = ?, rent_price = ?, grade = ? where book_num = ?";
		
		try {
			pstmt = con.prepareStatement(sql);
			
			pstmt.setString(1, bookDTO.getSubject());
			pstmt.setInt(2, bookDTO.getMakeYear());
			pstmt.setInt(3, bookDTO.getInPrice());
			pstmt.setInt(4, bookDTO.getRentPrice());
			pstmt.setString(5, bookDTO.getGrade());
			pstmt.setInt(6, bookDTO.getBookNum());
			
			result = pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		dm.close(con, pstmt, rs);
		return result;
	}

	public int bookDelete(int bookNum) {
		
		int result = 0;
		
		con = dm.getConnection();
		
		String sql = "delete from book_list where book_num = ?";
		
		try {
			pstmt = con.prepareStatement(sql);
			
			pstmt.setInt(1, bookNum);
			
			result = pstmt.executeUpdate();
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		dm.close(con, pstmt, rs);
		return result;
	}

}
