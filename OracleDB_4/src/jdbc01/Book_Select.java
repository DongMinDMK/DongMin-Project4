package jdbc01;

import java.util.ArrayList;

public class Book_Select {

	public static void main(String[] args) {
		
		BookDAO bookDAO = new BookDAO();
		
		ArrayList<BookDTO> list = bookDAO.bookSelect();
		
		System.out.println("도서번호\t\t출판연도\t\t입고가격\t\t대여가격\t\t등급\t\t제목");
		System.out.println("----------------------------------------------------------------------------------------");
		
		for(BookDTO bookDTO : list) {
			System.out.printf("%8d\t%d\t\t%d\t%d\t\t%s\t%s\n", bookDTO.getBookNum(), bookDTO.getMakeYear(), bookDTO.getInPrice(), bookDTO.getRentPrice(), bookDTO.getGrade(), bookDTO.getSubject());
		}
	}

}
