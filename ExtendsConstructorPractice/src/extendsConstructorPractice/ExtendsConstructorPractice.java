package extendsConstructorPractice;

class People {
	String name;
	int age;
	String gender;
	
	public People(String name, int age, String gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
}

class Member extends People {
	int memberId;
	
	public Member(String name, int age, String gender, int memberId) {
		super(name, age, gender);
		
		this.memberId = memberId;
	}
	
	public void enterMethod() {
		System.out.println("DMK 사이트에 회원번호가 " + this.memberId + "(" + name + ", " + age + "세) 님이 접속하셨습니다.");
	}
	
	public void outMethod() {
		System.out.println("회원번호 " + this.memberId + "인 (" + name + ", " + age + "세) 님이 DMK 사이트를 나가셨습니다.");
	}
}

public class ExtendsConstructorPractice {

	public static void main(String[] args) {
		Member member = new Member("DMK", 27, "남성", 10000);
		member.enterMethod();
		
		Member member1 = new Member("홍길동", 30, "남성", 10001);
		member1.enterMethod();
		
		Member member2 = new Member("홍박사", 40, "여성", 10002);
		member2.enterMethod();
		
		Member member3 = new Member("김이쁜", 25, "여성", 10003);
		member3.enterMethod();
		
		
		member1.outMethod();
		member2.outMethod();
		
		

	}

}
