package jdbc01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class JDBC_Delete {

	public static void main(String[] args) {
		Connection con = null;
		PreparedStatement pstmt = null;
		
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String id = "scott";
		String pw = "tiger";
		
		try {
			Class.forName(driver);
			
			con = DriverManager.getConnection(url, id, pw);
			
			Scanner scanner = new Scanner(System.in);
			
			System.out.print("삭제할 고객 번호를 입력하세요 : ");
			int num = scanner.nextInt();
			
			String sql = "delete from customer where num = ?";
			
			pstmt = con.prepareStatement(sql);
			
			pstmt.setInt(1, num);
			
			int result = pstmt.executeUpdate();
			
			if(result == 1) {
				System.out.println("정상적으로 삭제가 완료되었습니다.");
			}else {
				System.out.println("삭제가 되지 않았습니다.");
			}
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
