package jdbc;

import java.util.Scanner;

public class RentList_Insert {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		RentDAO rentDAO = RentDAO.getInstance();
		
		int member_num = 0;
		
		while(true) {
			System.out.print("대여할 회원님의 회원번호를 입력해주세요 : ");
			member_num = Integer.parseInt(scanner.nextLine());
			
			int result = rentDAO.selectOneMember(member_num);
			
			if(result == 0) {
				System.out.println("입력하신 회원번호가 존재하지 않습니다. 다시 시도해주세요.");
				continue;
			}else {
				break;
			}
		}
		
		System.out.println("입력하신 회원번호 : " + member_num);
		
		int book_num = 0;
		
		while(true) {
			System.out.print("대여할 도서의 도서번호를 입력해주세요 : ");
			book_num = Integer.parseInt(scanner.nextLine());
			
			int result = rentDAO.selectOneBook(book_num);
			
			if(result == 0) {
				System.out.println("입력하신 도서번호가 존재하지 않습니다. 다시 시도해주세요.");
				continue;
			}else {
				break;
			}
		}
		
		System.out.println("입력하신 도서번호 : " + book_num);
		
		System.out.print("할인가격을 입력하세요 : ");
		int discount1 = Integer.parseInt(scanner.nextLine());
		
		RentDTO rentDTO = new RentDTO();
		
		rentDTO.setB_num(book_num);
		rentDTO.setM_num(member_num);
		rentDTO.setDiscount(discount1);
		
		int result = rentDAO.rentInsert(rentDTO);
		
		if(result == 1) {
			System.out.println("데이터 삽입 성공");
		}else {
			System.out.println("데이터 삽입 실패");
		}
		

	}

}
