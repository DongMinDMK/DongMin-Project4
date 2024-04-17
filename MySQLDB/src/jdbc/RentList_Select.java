package jdbc;

import java.util.List;

public class RentList_Select {

	public static void main(String[] args) {
		
		RentDAO rentDAO = RentDAO.getInstance(); //객체생성과 동일 동작
		
		List<RentDTO> list = rentDAO.rentAllSelect();
		
		System.out.println("대여번호\t대여일자\t\t도서번호\t\t도서제목\t회원번호\t회원성명\t할인가격");
		System.out.println("---------------------------------------------------------------");
		
		for(RentDTO rentDTO : list) {
			System.out.printf("%d\t%s\t%d\t%s\t%d\t%s\t%d\t\n", rentDTO.getRent_num(), rentDTO.getRent_date(), rentDTO.getB_num(), rentDTO.getSubject(), rentDTO.getM_num(), rentDTO.getName(), rentDTO.getDiscount());
		}
	}

}
