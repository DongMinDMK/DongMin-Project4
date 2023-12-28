package getSetMethodPractice;

class Person{
	private String name;
	private String gender;
	private int height;
	
	public Person() {
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
	
	public void nameMethod() {
		System.out.println("이름이 " + this.name + "인 사람이 있습니다.");
	}
	
	public void genderMethod() {
		System.out.println(this.name + " 이름을 가진 사람의 성별은 " + this.gender + "입니다.");
	}
}

public class GetSetMethodPractice {

	public static void main(String[] args) {
		Person person1 = new Person();
		person1.setName("DMK");
		person1.setGender("남성");
		person1.setHeight(174);
		
		Person person2 = new Person();
		person2.setName("홍길동");
		person2.setGender("남성");
		person2.setHeight(180);
		
		Person person3 = new Person();
		person3.setName("김이쁜");
		person3.setGender("여성");
		person3.setHeight(162);
		
		person1.nameMethod();
		person2.nameMethod();
		person3.nameMethod();
		
		person1.genderMethod();
		person2.genderMethod();
		person3.genderMethod();
		
		System.out.println(person1.getName() + " 이름을 가진 성별이 " + person1.getGender() + "인 사람은 키가 " + person1.getHeight() + "cm 입니다.");
		System.out.println(person2.getName() + " 이름을 가진 성별이 " + person2.getGender() + "인 사람은 키가 " + person2.getHeight() + "cm 입니다.");
		System.out.println(person3.getName() + " 이름을 가진 성별이 " + person3.getGender() + "인 사람은 키가 " + person3.getHeight() + "cm 입니다.");
		
		
		

	}

}
