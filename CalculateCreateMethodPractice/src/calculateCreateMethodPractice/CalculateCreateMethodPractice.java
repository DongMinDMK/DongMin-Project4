package calculateCreateMethodPractice;

public class CalculateCreateMethodPractice {
	
	public static int plusMethod(int a, int b) { // +
		int result = 0;
		
		result = a + b;
		return result;
	}
	
	public static int minusMethod(int a, int b) { // -
		int result = 0;
		
		result = a - b;
		return result;
	}
	
	public static int mulMethod(int a, int b) { // *
		int result = 1; // 0으로 초깃값을 설정하면 곱셈은 무조건 결과가 0이기 때문에 1로 설정
		
		result = a * b;
		return result;
	}
	
	public static int divMethod(int a, int b) {
		int result = 0;
		
		result = a / b;
		return result;
		
	}

	public static void main(String[] args) {
		int sum = 0;
		int minus = 0;
		int mul = 0;
		int div = 0;
		
		sum = plusMethod(10, 20);
		System.out.println("변수 a(10)와 b(20)의 합은 " + sum);
		
		minus = minusMethod(50, 20);
		System.out.println("50에서 20을 뺀 결과 값은 " + minus);
		
		mul = mulMethod(200, 200);
		System.out.println("200 * 200의 결과값은 " + mul);
		
		div = divMethod(100, 20);
		System.out.println("100 / 20으로 나눈 값의 몫은 " + div);
	}

}
