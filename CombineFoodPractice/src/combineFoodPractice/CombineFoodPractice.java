package combineFoodPractice;

class ChinaCombineFood{
	String foodName;
	String averPrice;
	
	public ChinaCombineFood(String foodName, String averPrice) {
		this.foodName = foodName;
		this.averPrice = averPrice;
	}
	
	public void nameMethod() {
		System.out.println("중국 음식 중 한가지 메뉴로만 먹기 아쉬울 때 혼합해서 먹는 음식들이 존재한다.");
		System.out.println("예를 들어 중국 음식 중 혼합음식으로는 " + this.foodName + "등이 있다.");
	}
	
	public String averPriceMethod() { //String 타입으로 반환하는 메소드
		return averPrice;
	}
	public void otherFoodPriceMethod() {
		System.out.println("탕짜면과 탕짬면의 혼합음식의 대표적인 가격은 7000~13000원 사이라고 한다.");
	}
}

public class CombineFoodPractice {

	public static void main(String[] args) {
		ChinaCombineFood ccf = new ChinaCombineFood("짬짜면, 탕짜면, 탕짬면", "6000~9000원");
		ccf.nameMethod();
		
		String jjamJjaFoodPrice = ccf.averPriceMethod(); 
		
		System.out.println("대표적으로 짬짜면의 가격은 " + jjamJjaFoodPrice + "이다.");
		
		ccf.otherFoodPriceMethod();
		

	}

}
