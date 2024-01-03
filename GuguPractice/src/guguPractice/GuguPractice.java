package guguPractice;
import java.util.Scanner;

public class GuguPractice {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		// 입력받은 단을 구구단 정방향으로 출력하기
		int inputDan = 0;
		
		System.out.print("몇 단을 보여줄까요? ");
		inputDan = scanner.nextInt();
		
		for(int i=1; i<9; i++) {
			System.out.println(inputDan + " X " + i + " = " + (inputDan * i));
		}
		
		// 입력받은 단을 구구단 역방향으로 출력하기
		
		/*
		int inputDan = 0;
		
		System.out.print("몇 단을 보여줄까요? ");
		inputDan = scanner.nextInt();
		
		for(int i=9; i >= 1; i--) {
			System.out.println(inputDan + " X " + i + " = " + (inputDan * i));
		}
		*/

		//주석을 치지 않은 것을 실행시키면 구구단 정방향으로 계산처리가 되어 실행됨.
		//구구단의 입력받은 단을 역방향으로 출력하고 싶으면 정방향 구구단 코드를 주석처리하고 실행시키면 됨.
	}

}
