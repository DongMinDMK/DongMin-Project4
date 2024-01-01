package doWhilePractice;
import java.util.Scanner;

public class DoWhilePractice {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int coffeeMenu;
		
		do {
			System.out.print("1. 아메리카노 2. 카페라떼 3. 카랴멜마끼야또 4. 카페모카 5. 그만 중 원하시는 커피의 번호를 눌러주세요 : ");
			coffeeMenu = scanner.nextInt();
			
			switch(coffeeMenu) {
			case 1:
				System.out.println("아메리카노를 주문하셨습니다.");
				break;
			case 2:
				System.out.println("카페라떼를 주문하셨습니다.");
				break;
			case 3:
				System.out.println("카랴멜마끼야또를 주문하셨습니다.");
				break;
			case 4:
				System.out.println("카페모카를 주문하셨습니다.");
				break;
			case 5:
				System.out.println("주문하신 커피들을 준비하도록 하겠습니다.");
				break;
			default: //default는 switch-case문에서 정상적으로 조건이 실행이 되지 않을 때 실행되는 구문이다.
				System.out.println("잘못 주문하셨습니다. 1번~5번 사이의 번호를 눌러주세요.");
			}
		}while(coffeeMenu != 5); // 사용자가 5번을 입력하지 않는 이상 계속해서 주문을 받는다.

	}

}
