package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PersonDAO {
	
	Connection con = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	
	private PersonDAO() {
		
	}
	
	public static PersonDAO personDAO = new PersonDAO();
	
	public static PersonDAO getInstance() {
		return personDAO;
	}

	public List<PersonDTO> allSelectPersonList() {
		List<PersonDTO> list = new ArrayList<PersonDTO>();
		
		con = DBman.getConnection();
		
		String sql = "select * from person_list";
		
		try {
			pstmt = con.prepareStatement(sql);
			
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				PersonDTO personDTO = new PersonDTO();
				personDTO.setPerson_num(rs.getInt("person_num"));
				personDTO.setName(rs.getString("name"));
				personDTO.setAge(rs.getInt("age"));
				personDTO.setGender(rs.getString("gender"));
				personDTO.setEmail(rs.getString("email"));
				personDTO.setAddress(rs.getString("address"));
				
				list.add(personDTO);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		DBman.close(con, pstmt, rs);
		
		return list;
	}
	
	

}
