package castingPractice;

class Bike {
	String name;
	int wheel = 2; // 정수형 wheel 변수의 초깃값을 2로 설정
	
	public Bike(String name) {
		this.name = name;
	}
	
	public void bikeMethod() {
		System.out.println(this.name  + "의 자전거는 " + this.wheel + "발 자전거 입니다.");
	}
}

class WheelFourBike extends Bike { //Bike 클래스를 상속
	
	public WheelFourBike(String name) {
		super(name); // super()는 상속받은 부모 클래스, 즉 Bike 클래스의 생성자를 호출 
	}

	@Override
	public void bikeMethod() {
		super.bikeMethod(); //이것도 마찬가지로 super.메소드명이기 때문에 Bike 클래스의 bikeMethod를 호출
	}
	
	public void wheelFourMethod() { // WheelFourBike 클래스만의 유일 메소드 생성
		if(wheel == 2) {
			wheel = 4;
			System.out.println(name + "명의를 가진 자전거에 보조 바퀴 2개를 추가적으로 부착하였습니다.");
		}else {
			System.out.println(name + "의 자전거에는 이미 추가적으로 2개의 보조 바퀴가 부착되어 있습니다.");
		}
	}
}

public class CastingPractice {

	public static void main(String[] args) {
		Bike bike = new WheelFourBike("DMK"); //업캐스팅(자식클래스에서 부모클래스로)
		bike.bikeMethod();
		
		System.out.println();
		
		WheelFourBike wfb = (WheelFourBike) bike; //부모클래스에서 자식클래스로 강제 형변환 즉, 다운캐스팅
		wfb.wheelFourMethod();
		wfb.bikeMethod();
		

	}

}
