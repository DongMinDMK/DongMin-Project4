package jdbc01;

import java.util.List;
import java.util.Scanner;

public class Book_Update {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("수정하기 전 데이터가 있는지 확인합니다.");
		System.out.print("번호를 입력해주세요 : ");
		int num = Integer.parseInt(scanner.nextLine());
		
		BookDAO bookDAO = new BookDAO();
		
		BookDTO bookDTO = bookDAO.bookOneSelect(num);
		
		if(bookDTO == null) {
			System.out.println("입력하신 번호의 데이터가 존재하지 않습니다. ");
			System.out.println("프로그램을 종료합니다.");
			return;
		}
		
		System.out.println();
		
		System.out.println("현재 DB의 책 제목 : " + bookDTO.getSubject());
		System.out.print("수정할 책 제목 입력 :(수정 안할 시 그냥 엔터 입력) : ");
		String updateSubject = scanner.nextLine();
		
		if(!updateSubject.equals("")) bookDTO.setSubject(updateSubject);
		
		System.out.println();
		
		System.out.println("현재 DB의 책 출판연도 : " + bookDTO.getMakeYear());
		System.out.print("수정할 책 출판연도 입력 :(수정 안할 시 그냥 엔터 입력) : ");
		String updateMakeYear = scanner.nextLine();
		
		if(!updateMakeYear.equals("")) bookDTO.setMakeYear(Integer.parseInt(updateMakeYear));
		
		System.out.println();
		
		System.out.println("현재 DB의 책 입고가격 : " + bookDTO.getInPrice());
		System.out.print("수정할 책 입고가격 입력 :(수정 안할 시 그냥 엔터 입력) : ");
		String updateInPrice = scanner.nextLine();
		
		if(!updateInPrice.equals("")) bookDTO.setInPrice(Integer.parseInt(updateInPrice));
		
		System.out.println();
		
		System.out.println("현재 DB의 책 대여가격 : " + bookDTO.getRentPrice());
		System.out.print("수정할 책 대여가격 입력 :(수정 안할 시 그냥 엔터 입력) : ");
		String updateRentPrice = scanner.nextLine();
		
		if(!updateRentPrice.equals("")) bookDTO.setRentPrice(Integer.parseInt(updateRentPrice));
		
		System.out.println();
		
		System.out.println("현재 DB의 책 등급 : " + bookDTO.getGrade());
		System.out.print("수정할 책 등급 입력 :(수정 안할 시 그냥 엔터 입력) : ");
		String updateGrade = scanner.nextLine();
		
		if(!updateGrade.equals("")) bookDTO.setGrade(updateGrade);
		
		System.out.println();
		
		int result = bookDAO.bookUpdate(bookDTO);
		
		if(result == 1) {
			System.out.println("수정 성공!!");
		}else {
			System.out.println("수정 실패 ㅠㅠ");
		}
		
	}

}
