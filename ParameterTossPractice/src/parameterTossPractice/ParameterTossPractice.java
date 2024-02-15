package parameterTossPractice;
class CharClass {
	char x,y;
}

public class ParameterTossPractice {
	
	public static void function1(char x, char y) { //파라미터로 2개를 문자형 변수로 받고(파라미터가 값)
		char z; //z 문자형 변수를 선언
		
		z = x; 
		x = y;
		y = z;
		
		// 그래서 두 문자를 교환
	}
	
	public static void function2(CharClass c) { // 파라미터로 클래스, 즉 주소를 전달받음(파라미터가 주소)
		char z;
		
		z = c.x;
		c.x = c.y;
		c.y = z;
		
		// 두 문자를 교환
	}

	public static void main(String[] args) {
		char x = 'A', y = 'E';
		
		System.out.println("원래의 값 : x = " + x + ", y = " + y);
		
		function1(x,y);
		
		System.out.println("function1() 메소드 호출 후(값을 전달한 후) : x = " + x + ", y = " + y);
		
		// 값에 의한 전달로 인해 단순히 값을 복사해서 넘겨주는 것이므로 main() 메소드에 영향을 주지 않는다.
		
		CharClass c = new CharClass();
		c.x = 'A';
		c.y = 'E';
		
		System.out.println("원래의 값 : x = " + c.x + ", y = " + c.y);
		
		function2(c);
		
		System.out.println("function2() 메소드 호출 후(주소를 전달한 후) : x = " + c.x + ", y = " + c.y);
		
		// 주소에 의한 전달로 클래스 객체를 매개변수로 주었기 때문에 function2()메소드를 호출하면 main() 메소드에 영향을 준다.
		
		

	}

}
