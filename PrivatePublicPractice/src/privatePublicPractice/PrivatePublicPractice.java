package privatePublicPractice;

class Car {
	private int spe = 0;
	
	public void upSpeed(int val) { //속도를 올리는 메소드로 최대 200km까지만 올릴 수 있도록 제한 설정
		if(spe + val > 200) 
			spe = 200;      
		else
			spe += val;
		
		System.out.println("현재 속도는 : " + getSpeed());
	}
	
	public void downSpeed(int val) { //속도를 내리는 메소드로 제일 낮은 km로 0로 제한 설정 
		if(spe - val < 0)
			spe = 0;
		else
			spe -= val;
		
		System.out.println("현재 속도는 " + getSpeed());
	}
	
	public int getSpeed() {
		return spe;
	}
}

public class PrivatePublicPractice {

	public static void main(String[] args) {
		Car car = new Car();
		
		car.upSpeed(150);
		car.upSpeed(100);
		
		car.downSpeed(100);
		car.downSpeed(200);

	}

}
