package requiredConstructorPractice;

class Animal{
	String animalName;
	
	public Animal() {
		System.out.println("파라미터가 없는 Animal 클래스의 생성자");
	}
	
	public Animal(String animalName) {
		System.out.println("파라미터가 1개인 Animal 클래스의 생성자");
	}
}

class Lion extends Animal{
	
	public Lion() {
		System.out.println("파라미터가 없는 자식 Lion 클래스");
	}
	
	public Lion(String animalName) {
		System.out.println("파라미터가 1개인 Lion 클래스의 생성자이며 자식 클래스 : " + animalName);
	}
}

class Tiger extends Animal{
	
	public Tiger() {
		System.out.println("파라미터가 없는 자식 Tiger 클래스");
	}
	
	public Tiger(String animalName) {
		System.out.println("파라미터가 1개인 Tiger 클래스의 생성자이며 자식 클래스 : " + animalName);
	}
}

public class RequiredConstructorPractice {

	public static void main(String[] args) {
		
		// 부모 클래스가 Animal 클래스 이므로 자식 클래스 Lion, Tiger 에서 Animal 클래스를 호출하지 않아도 기본 생성자는 자동으로 호출이 됨.
		
		Animal animal = new Animal();
		Animal animal2 = new Animal("동물");
		
		Lion lion = new Lion();
		Lion lion2 = new Lion("사자");
		
		Tiger tiger = new Tiger();
		Tiger tiger2 = new Tiger("호랑이");
		

	}

}
