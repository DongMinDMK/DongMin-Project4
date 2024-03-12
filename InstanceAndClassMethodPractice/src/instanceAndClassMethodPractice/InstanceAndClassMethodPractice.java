package instanceAndClassMethodPractice;

class Baby{
	String name;
	String gender;
	static private int ageCount = 0; // 정적변수 ageCount 생성
	
	public Baby() { 
		ageCount++;
	}
	
	public Baby(String name, String gender) {
		this.name = name;
		this.gender = gender;
	}
	
	static int getAgeCount() { //정적 메소드 생성
		return ageCount;
	}
	
	public void babyMethod() {
		System.out.println("방금 태어난 아기의 이름은 " + this.name + "이고, 성별은 " + this.gender + "이며 나이는 " + this.getAgeCount() + "살 입니다.");
	}
}

public class InstanceAndClassMethodPractice {

	public static void main(String[] args) {
		
		System.out.println("현재 태어나기 전 아기의 나이 : " + Baby.getAgeCount() + "살"); // 정적 메소드를 선언했기 때문에 바로 클래스이름.메소드명으로 호출을 가능할 수 있게 함.
		
		Baby baby = new Baby();
		System.out.println("태어난 후 아기의 나이 : " + baby.getAgeCount() + "살"); //일반 클래스로 객체를 생성하여 호출함.
		
		Baby baby2 = new Baby("DMK", "남성");
		
		//반드시 정적(static) 메소드를 선언할려면 정적(static) 변수가 존재해야 사용할 수 있음.
		
		baby2.babyMethod(); //정적 변수이므로 이미 1이 count로 증가되어 들어가 있기 때문에 또 다시 getAgeCount 정적 메소드를 호출하면 1이 호출이 되는 것을 확인.

	}

}
