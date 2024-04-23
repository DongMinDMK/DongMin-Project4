package jdbc;

import java.util.Scanner;

public class RentList_Update {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		RentDAO rentDAO = RentDAO.getInstance();
		
		System.out.print("테이블에 입력하신 번호의 데이터가 존재하는지 확인합니다. 번호를 입력해주세요 : ");
		int rent_num = Integer.parseInt(scanner.nextLine());
		
		RentDTO rentDTO = rentDAO.rentGetRent(rent_num);
		
		if(rentDTO == null) {
			System.out.println("입력하신 번호의 데이터가 존재하지 않습니다. 프로그램이 종료됩니다.");
			return;
		}
		
		System.out.println();
		
		System.out.println("현재 대여날짜 : " + rentDTO.getRent_date());
		System.out.print("수정할 대여날짜(yyyy-mm-dd) 입력하시고 수정하지 않으시려면 엔터를 눌러주세요 : ");
		String rent_date = scanner.nextLine();
		
		if(!rent_date.equals(""))
			rentDTO.setRent_date(rent_date);
		
		System.out.println();
		
		System.out.println("현재 도서번호 : " + rentDTO.getB_num());
		System.out.print("수정할 도서번호를 입력하세요. 수정하지 않으시려면 엔터를 눌러주세요 : ");
		String updateBnum = scanner.nextLine();
		
		
		if(!updateBnum.equals(""))
			rentDTO.setB_num(Integer.parseInt(updateBnum));
		
		System.out.println();
		
		System.out.println("현재 회원번호 : " + rentDTO.getM_num());
		System.out.print("수정할 회원번호를 입력하세요. 수정하지 않으시려면 엔터를 눌러주세요 : ");
		String updateMnum = scanner.nextLine();
		
		if(!updateMnum.equals(""))
			rentDTO.setM_num(Integer.parseInt(updateMnum));
		
		System.out.println();
		
		System.out.println("현재 할인금액 : " + rentDTO.getDiscount());
		System.out.print("수정할 할인금액을 입력하세요 : ");
		int updateDiscount = scanner.nextInt();
		
		rentDTO.setDiscount(updateDiscount);
		
		int result = rentDAO.rentUpdate(rentDTO);
		
		if(result == 1) {
			System.out.println("수정 완료!!");
		}else {
			System.out.println("수정 실패 ㅠㅠ");
		}
		
		
		
		
		
		

	}

}
