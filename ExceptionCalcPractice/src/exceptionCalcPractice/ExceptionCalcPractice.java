package exceptionCalcPractice;
import java.util.Scanner;

public class ExceptionCalcPractice {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int res = 0;
		
		System.out.print("연산할 첫번째 수를 입력하세요 : ");
		int a = scanner.nextInt();
		
		System.out.print("연산에 필요할 연산자를 하나 입력하세요 : (+,-,*,/) ");
		char ch = scanner.next().charAt(0);
		
		System.out.print("연산할 두번째 수를 입력하세요 : ");
		int b = scanner.nextInt();
		
		try {
			switch(ch) {
			case '+':
				res = a + b;
				break;
			case '-':
				res = a - b;
				break;
			case '*':
				if(a == 0 || b == 0) //a나 b 둘 중 하나라도 0이면
					throw new Exception("0을 곱하면 어차피 정답은 0입니다.");
					res = a * b;
					break;
			case '/':
				if(b == 0)
					throw new Exception("0으로 나누면 안됩니다.");
				res = a / b;
				break;
			}
			
			if(res < 0)
				throw new Exception("결과가 음수입니다.");
			
			System.out.println("결과 값 : " + res);
		} catch (Exception e) { // 위에 적었던 오류 설명을 던져서 catch를 통해 잡아 e.getMessage() 를 통하여 설명
			System.out.print("발생 오류 원인 : ");
			System.out.println(e.getMessage());
		}
		
	}

}
