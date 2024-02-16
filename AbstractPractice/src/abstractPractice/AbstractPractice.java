package abstractPractice;

abstract class Human{
	String gender;
	int age;
	
	public Human() {
		
	}
	
	public void upAge(int age) {
		this.age += age;
	}
	
	abstract void humanAbMethod(); // 추상 메소드로 지정.
	// 추상 메소드로 지정하기 위해서는 반드시 추상 클래스를 정의해야 한다.
}

class DMK extends Human{

	@Override
	void humanAbMethod() {
		System.out.println("DMK 라는 사람의 나이는 " + this.age + "살이며, 성별은 남성이다.");
	}
	
}



public class AbstractPractice {

	public static void main(String[] args) {
		
		DMK dmk = new DMK();
		dmk.upAge(26);
		
		dmk.humanAbMethod();
		
		System.out.println("------ 1년 후 ------");
		
		dmk.upAge(1);
		
		dmk.humanAbMethod();

	}

}
