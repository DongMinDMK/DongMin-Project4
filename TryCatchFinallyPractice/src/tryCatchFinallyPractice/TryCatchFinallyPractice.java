package tryCatchFinallyPractice;
import java.util.*;

public class TryCatchFinallyPractice {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		try {
			
			System.out.print("점수를 입력하세요 : ");
			int score = scanner.nextInt();
			
			if(score >= 70) {
				
				System.out.println("축하합니다. 합격입니다.");
				
			}else {
				
				System.out.println("아쉽네요. 불합격입니다. 조금만 더 공부하시고 다시 도전하세요!");
			}
		} catch (InputMismatchException e) {
			System.out.println("키보드 입력이 올바르지 않습니다.");
		}finally { //try-catch문에 finally는 반드시 실행되는 문장이다.
			scanner.close();
			System.out.println("프로그램 종료합니다.");
		}

	}

}
