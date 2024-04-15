package jdbc01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class JDBC_Insert {
	public static void main(String[] args) {
		// 1. JDBC 를 통한 데이터베이스 연결 클래스의 객체 : Connection 생성
		Connection con = null;
		PreparedStatement pstmt = null;
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
		
		Scanner scanner = new Scanner(System.in);
					
		System.out.print("고객 번호를 입력해주세요 : ");
		int num = scanner.nextInt();
		
		System.out.print("고객 이름을 입력해주세요 : ");
		String name = scanner.next();
		
		System.out.print("고객 이메일을 입력해주세요 : ");
		String email = scanner.next();
		
		System.out.print("고객 전화번호를 입력해주세요 : ");
		String tel = scanner.next();
		
		String sql = "insert into customer(num, name, email, tel) values(?, ?, ?, ?)";
		
		pstmt = con.prepareStatement(sql);
		
		pstmt.setInt(1, num);
		pstmt.setString(2, name);
		pstmt.setString(3, email);
		pstmt.setString(4, tel);
		
		int result = pstmt.executeUpdate();
		
		if(result == 1) {
			System.out.println("데이터 삽입 성공!!");
		}else {
			System.out.println("데이터 삽입 실패 ㅠㅠ");
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
