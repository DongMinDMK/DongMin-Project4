package gimbabOrderPractice;
import java.util.Scanner;

public class GimbabOrderPractice {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("안녕하세요 DMK 김밥전문점입니다.");
		System.out.print("주문하시겠습니까?(네/아니오) : ");
		String order = scanner.next();
		
		if(order.equals("네")) {
				System.out.print("1. 일반김밥 2. 참치김밥 3. 치즈김밥 4. 돈가스김밥 5. 현재 주문 수 중 원하시는 김밥의 번호를 눌러주세요 : ");
				int gimbabSelect = scanner.nextInt();
				
				switch(gimbabSelect) {
				case 1:
					System.out.println("일반김밥을 선택하셨습니다.");
					System.out.println("일반김밥의 가격은 1500원입니다.");
					break;
					
				case 2:
					System.out.println("참치김밥을 선택하셨습니다.");
					System.out.println("참치김밥의 가격은 2500원입니다.");
					break;
					
				case 3:
					System.out.println("치즈김밥을 선택하셨습니다.");
					System.out.println("치즈김밥의 가격은 2500원입니다.");
					// break; 일부러 switch-case문에서 break문을 사용하지 않았을 때 어떻게 동작하는지 보여주기 위해 주석을 치고 break문을 적지 않았음. 실행하고 3번을 입력하여 결과 확인할 것!
					// break문을 switch-case문에 적지 않으면 다음 case문의 결과값까지 실행이 됨.
				case 4:
					System.out.println("돈가스김밥을 선택하셨습니다.");
					System.out.println("돈가스김밥의 가격은 4000원입니다.");
					 break; 
				}
			
			
		}else if(order.equals("아니오")) {
			System.out.println("주문하실 때 직원을 호출해주세요.");
		}
		
		System.out.println("수저와 밑반찬 그리고 물은 셀프입니다.");

	}

}
