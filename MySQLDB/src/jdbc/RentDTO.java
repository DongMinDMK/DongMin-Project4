package jdbc;

public class RentDTO {
	private int rent_num;
	private String rent_date;
	private int b_num;
	private String subject; //book_list 테이블의 과목
	private int m_num;
	private String name; // member_list 테이블의 성명
	private int discount;
	public int getRent_num() {
		return rent_num;
	}
	public void setRent_num(int rent_num) {
		this.rent_num = rent_num;
	}
	public String getRent_date() {
		return rent_date;
	}
	public void setRent_date(String rent_date) {
		this.rent_date = rent_date;
	}
	public int getB_num() {
		return b_num;
	}
	public void setB_num(int b_num) {
		this.b_num = b_num;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public int getM_num() {
		return m_num;
	}
	public void setM_num(int m_num) {
		this.m_num = m_num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getDiscount() {
		return discount;
	}
	public void setDiscount(int discount) {
		this.discount = discount;
	}
	
	
}
