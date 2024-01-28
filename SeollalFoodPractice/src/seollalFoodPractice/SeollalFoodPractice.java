package seollalFoodPractice;

class SeollalFood {
	String name;
	int foodPrice;
	
	public SeollalFood(String name, int foodPrice) {
		this.name = name;
		this.foodPrice = foodPrice;
	}
	
	public void foodNameMethod() {
		System.out.println("설날에 대표적인 음식은 " + this.name + "등이 있습니다.");
	}
	
	public int foodPriceMethod() {
		
		return foodPrice;
	}
}

class Seollal extends SeollalFood{
	
	String date;
	String date2;
	String intro;
	
	public Seollal(String name, int foodPrice, String date, String date2, String intro) {
		super(name, foodPrice);
		this.date = date;
		this.date2 = date2;
		this.intro = intro;
	}
	
	public void dateMethod() {
		System.out.println("한국은 설날의 신정 날짜는 " + this.date + "이고, 구정 날짜는 " + this.date2 + "안에 포함되있습니다.");
	}
	
	public void introduce() {
		System.out.println(this.intro);
	}
	
}

public class SeollalFoodPractice {

	public static void main(String[] args) {
		Seollal s = new Seollal("떡국, 떡만둣국", 10000, "1월 1일", "1월말 ~ 2월말", "신정에는 설날 신정 인사만 하고 구정에 친척 식구들 다 같이 모여 설날 인사를 합니다.");
		
		s.foodNameMethod(); // SeollalFood 클래스의 메소드를 상속받음.
		
		int foodPrice = s.foodPriceMethod(); // SeollalFood 클래스의 메소드를 상속받음.
		System.out.println("떡국과 떡만둣국은 설날때 먹는 대표적인 음식이며 평균 가격은 " + foodPrice + "원 정도 입니다.");
		
		s.dateMethod();
		s.introduce();
		

		
		

	}

}
