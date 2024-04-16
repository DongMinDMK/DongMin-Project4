package jdbc01;

import java.util.Scanner;

public class Book_Delete {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("삭제할 도서의 번호를 입력하세요 : ");
		int bookNum = scanner.nextInt();
		
		BookDAO bookDAO = new BookDAO();
		BookDTO bookDTO = new BookDTO();
		
		bookDTO = bookDAO.bookOneSelect(bookNum);
		
		if(bookDTO == null) {
			System.out.println("입력하신 번호의 데이터가 존재하지 않아 삭제를 할 수 없습니다.");
			System.out.println("프로그램을 종료합니다.");
			return;
		}
		
		
		int result = bookDAO.bookDelete(bookNum);
		
		if(result == 1) {
			System.out.println("데이터 삭제가 성공적으로 완료되었습니다.");
		}else {
			System.out.println("삭제를 실패하였습니다 ㅠㅠ");
		}
	}

}
