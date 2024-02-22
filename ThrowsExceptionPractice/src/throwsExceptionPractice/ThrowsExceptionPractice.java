package throwsExceptionPractice;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ThrowsExceptionPractice {
	
	public static void mbtiMethod(Scanner scanner) throws InputMismatchException{ // 예외가 발생하면 throws를 던져 main 메소드 안에 있는 catch문에서 처리할 수 있도록 설정
		System.out.println("당신은 어떤 사람입니까?");
		System.out.println("1. 혼자 보내시는 시간을 좋아함 2. 혼자 보단 친구들과 밖에서 보내는 것을 좋아함.");
		System.out.print("원하시는 성향에 맞는 번호를 눌러주세요 : ");
		int select = scanner.nextInt();
		
		if(select == 1) {
			System.out.println("당신은 MBTI 중 I 와 비슷한 사람입니다.");
		}else {
			System.out.println("당신은 MBTI 중 E 와 비슷한 사람입니다.");
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		try {
			System.out.println("---- 성격 유형 테스트 ----");
			
			ThrowsExceptionPractice.mbtiMethod(scanner);
			
		} catch (InputMismatchException e) {
			
			System.out.println("숫자 1,2 중에 입력해주세요..");
			System.out.println("당신은 숫자가 1,2가 아니거나 문자열이나 문자를 입력하고 계십니다.");
			
		}finally {
			if(scanner != null) { // 입력 받은 것이 null 이 아니라면
				scanner.close();
			}
		}

	}

}
