package calculatorPractice;

public class CalculatorPractice {
	
	public static int sum(int value1, int value2) {
		int result = 0;
		result = value1 + value2;
		return result;
	}
	
	public static int minus(int value1, int value2) {
		int result = 0;
		result = value1 - value2;
		return result;
	}
	
	public static int mul(int value1, int value2) {
		int result = 0;
		result = value1 * value2;
		return result;
	}
	
	public static int div(int value1, int value2) {
		int result = 0;
		result = value1 / value2;
		return result;
	}

	public static void main(String[] args) {
		
		int sumResult = sum(10,20);
		
		System.out.println("10과 20을 매개변수로 넘겼을 때 합한 결과는 " + sumResult);
		
		int minusResult = minus(50,30);
		
		System.out.println("50과 30을 매개변수로 넘겼을 때 뺀 결과는 " + minusResult);
		
		int mulResult = mul(10, 10);
		System.out.println("10과 10을 매개변수로 넘겼을 떄 곱한 결과는 " + mulResult);
		
		int divResult = div(40, 8);
		System.out.println("40과 8을 매개변수로 넘겼을 때 40에서 8을 나눈 몫은 " + divResult);
		
		

	}

}
