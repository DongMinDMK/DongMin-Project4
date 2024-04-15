package jdbc01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class JDBC_Update {

	public static void main(String[] args) {
		// 1. JDBC 를 통한 데이터베이스 연결 클래스의 객체 : Connection 생성
		Connection con = null;
		PreparedStatement pstmt = null;
		Scanner scanner = new Scanner(System.in);
				
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
			
			System.out.print("수정할 번호 입력 : ");
			int num = scanner.nextInt();
			
			System.out.print("수정할 이름 입력 : ");
			String updateName = scanner.next();
			
			System.out.print("수정할 이메일 입력 : ");
			String updateEmail = scanner.next();
			
			System.out.print("수정할 전화번호 입력 : ");
			String updateTel = scanner.next();
			
			String sql = "update customer set name = ?, email = ?, tel = ? where num = ?";
			
			pstmt = con.prepareStatement(sql);
			
			pstmt.setString(1, updateName);
			pstmt.setString(2, updateEmail);
			pstmt.setString(3, updateTel);
			pstmt.setInt(4, num);
			
			int result = pstmt.executeUpdate();
			
			if(result == 1) {
				System.out.println("고객 수정이 성공적으로 완료되었습니다.");
			}else {
				System.out.println("고객 수정이 잘못되었습니다. ㅠㅠ");
			}
			
					
		} catch (ClassNotFoundException e) {
					e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} 
		try {
			if(con != null) con.close();
			if(pstmt != null) pstmt.close();
		} catch (SQLException e) {
				e.printStackTrace();
		}
	}

}
