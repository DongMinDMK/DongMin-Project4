package tryCatchPractice;
import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatchPractice {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		try {
			int[] cardArray = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
			System.out.print("1~20까지의 짝수 배열 리스트가 있습니다. 0~9번까지 중에 몇 번째 카드를 뽑으시겠습니까? ");
			int input = scanner.nextInt();
			
			// System.out.println("입력하신 수의 인덱스 배열의 값은 존재하는군요!!");
			System.out.println("뽑은 카드 " + cardArray[input] + "입니다.");
		}catch(InputMismatchException e) {
			System.out.println("입력하신 것은 숫자가 아닙니다. 0~9번 까지의 숫자 중에 입력해주세요.");
			
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("입력하신 숫자의 카드는 배열 리스트에 존재하지 않습니다.");
		}
		
		System.out.println("프로그램을 종료합니다.");

	}

}
