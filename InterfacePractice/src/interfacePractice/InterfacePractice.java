package interfacePractice;

interface Apple{
	public void appleMethod();
}

interface Grape{
	public void grapeMethod();
}

class Fruit implements Apple, Grape{

	@Override
	public void grapeMethod() {
		System.out.println("수많은 과일이 존재합니다.");
		System.out.println("대표적인 과일 중 사과도 속합니다.");
	}

	@Override
	public void appleMethod() {
		System.out.println("수많은 과일이 존재합니다.");
		System.out.println("대표적인 과일 중 포도도 마찬가지로 속합니다.");
	}
	
	public void fruitMethod() {
		System.out.println("이 외에도 배, 복숭아, 멜론, 수박 등 몸에 좋은 다양한 과일들이 존재합니다.");
	}
    
}

public class InterfacePractice {

	public static void main(String[] args) {
		Fruit fruit = new Fruit();
		
		//인터페이스안의 추상메소드를 설정하여 틀을 만들어놓고 구현은 인터페이스 다중 상속을 받는 클래스(Fruit)이 오버라이딩을 통해 구현.
		fruit.appleMethod();
		fruit.grapeMethod();
		
		//fruit 클래스만의 고유한 메소드
		fruit.fruitMethod();

	}

}
