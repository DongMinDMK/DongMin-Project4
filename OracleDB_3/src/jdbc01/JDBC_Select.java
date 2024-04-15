package jdbc01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBC_Select {

	public static void main(String[] args) {
		// 1. JDBC 를 통한 데이터베이스 연결 클래스의 객체 : Connection 생성
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
				
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String id = "scott";
		String pw = "tiger";
				
		try {
			// 연결된 데이터베이스 드라이버 파일 지정하는 명령
			Class.forName(driver);
					
			// DriverManager 라는 클래스의 스태틱 메서드인 getConnection 을 이용해서
			// 실제로 데이터베이스를 연결하고 연결 결과를 con 에 저장합니다.
			con = DriverManager.getConnection(url, id, pw);
			
			String sql = "select * from customer";
			
			pstmt = con.prepareStatement(sql);
			
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				int num = rs.getInt("num");
				String name = rs.getString("name");
				String email = rs.getString("email");
				String tel = rs.getString("tel");
				
				System.out.printf("%d\t%s\t\t%s\t%s\n", num, name, email, tel);
			}
					
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} 
		try {
			if(con != null) con.close();
			if(pstmt != null) pstmt.close();
			if(rs != null) rs.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
