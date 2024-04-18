package jdbc;

public class PersonDTO {
	private int person_num;
	private String name;
	private int age;
	private String gender;
	private String email;
	private String address;
	public int getPerson_num() {
		return person_num;
	}
	public void setPerson_num(int person_num) {
		this.person_num = person_num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
}
