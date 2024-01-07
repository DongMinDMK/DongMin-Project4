package returnValuePractice;

public class ReturnValuePractice {
	
	public static void function1() {
		System.out.println("리턴값이 존재하지 않는 void 형 정적 메소드는 반환값으로 돌려줄 게 없다.");
	}
	
	public static int function2() {
		return 50;
	}
	
	public static void function3(int a) { //반환형은 void이고 정적 메소드, 그리고 매개변수가 존재하는 function3 메소드
		a = a * 2;
		System.out.println("입력받은 a의 매개변수에 곱하기 2를 한 결과값 : " + a);
	}

	public static void main(String[] args) {
		
		
		function1();
		
		int returnValue = function2();
		System.out.println("반환형이 int 인 정적 메소드를 거쳐 나온 반환값은 ==> " + function2());
		
		int tossValue = 10;
		function3(tossValue);
		
		System.out.println("function3()을 호출하고 나서 돌아와 다시 tossValue를 호출하면 결과는 ? " + tossValue); //function3() 을 호출하고 돌아와 원래의 tossValue 값 호출하여 원래의 값이 출력.

	}

}
