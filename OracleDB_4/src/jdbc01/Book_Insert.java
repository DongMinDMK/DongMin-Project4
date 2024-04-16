package jdbc01;

import java.util.Scanner;

public class Book_Insert {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		BookDAO bookDAO = new BookDAO();
		BookDTO bookDTO = new BookDTO();
		
		System.out.print("삽입할 도서 제목을 입력하세요 : ");
		bookDTO.setSubject(scanner.nextLine());
		
		System.out.print("삽입할 도서 출판연도를 입력해주세요 : ");
		bookDTO.setMakeYear(scanner.nextInt());
		
		System.out.print("삽입할 도서 입고가격을 입력해주세요 : ");
		bookDTO.setInPrice(scanner.nextInt());
		
		System.out.print("삽입할 도서 대여가격을 입력해주세요 : ");
		bookDTO.setRentPrice(scanner.nextInt());
		
		System.out.print("삽입할 도서의 등급을 입력해주세요 : ");
		bookDTO.setGrade(scanner.next());
		
		int result = bookDAO.bookInsert(bookDTO);
		
		if(result == 1) {
			System.out.println("데이터 삽입 성공!!");
		}else {
			System.out.println("데이터 삽입 실패 ㅠㅠ ");
		}
		
	}

}
