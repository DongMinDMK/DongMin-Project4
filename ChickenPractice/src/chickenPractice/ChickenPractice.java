package chickenPractice;
import java.util.Scanner;

public class ChickenPractice {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int cost = 0;
		
		System.out.println("안녕하세요 DMK 닭강정입니다.");
		
		while(true) {
			System.out.print("주문하시겠습니까?(네/아니오/종료) : ");
			String orderSelect = scanner.next();
			
			if(orderSelect.equals("네")) {
				System.out.print("1. 후라이드 2. 양념 3. 간장 4. 달콤 중 원하시는 닭강정의 맛을 골라주세요 : ");
				int tasteSelect = scanner.nextInt();
				
				if(tasteSelect == 1) {
					System.out.println("후라이드를 선택하셨습니다. ");
					System.out.print("1. 1인분 2. 2인분 3. 3인분 4. 4인분 중 몇인분을 선택하실 지 번호로 골라주세요 : ");
					int sizeSelect = scanner.nextInt();
					
					if(sizeSelect == 1) {
						System.out.println("후라이드 1인분을 선택하셨습니다.");
						System.out.println("가격은 10000원입니다.");
						cost += 10000;
					}else if(sizeSelect == 2) {
						System.out.println("후라이드 2인분을 선택하셨습니다.");
						System.out.println("가격은 20000원입니다.");
						cost += 20000;
					}else if(sizeSelect == 3) {
						System.out.println("후라이드 3인분을 선택하셨습니다.");
						System.out.println("가격은 30000원입니다.");
						cost += 30000;
					}else if(sizeSelect == 4) {
						System.out.println("후라이드 4인분을 선택하셨습니다.");
						System.out.println("가격은 40000원입니다.");
						cost += 40000;
					}
				}else if(tasteSelect == 2) {
					System.out.println("양념맛을 선택하셨습니다. ");
					System.out.print("1. 1인분 2. 2인분 3. 3인분 4. 4인분 중 몇인분을 선택하실 지 번호로 골라주세요 : ");
					int sizeSelect = scanner.nextInt();
					
					if(sizeSelect == 1) {
						System.out.println("양념 1인분을 선택하셨습니다.");
						System.out.println("가격은 12000원입니다.");
						cost += 12000;
					}else if(sizeSelect == 2) {
						System.out.println("양념 2인분을 선택하셨습니다.");
						System.out.println("가격은 22000원입니다.");
						cost += 22000;
					}else if(sizeSelect == 3) {
						System.out.println("양념 3인분을 선택하셨습니다.");
						System.out.println("가격은 32000원입니다.");
						cost += 32000;
					}else if(sizeSelect == 4) {
						System.out.println("양념 4인분을 선택하셨습니다.");
						System.out.println("가격은 42000원입니다.");
						cost += 42000;
					}
				}else if(tasteSelect == 3) {
					System.out.println("간장맛을 선택하셨습니다. ");
					System.out.print("1. 1인분 2. 2인분 3. 3인분 4. 4인분 중 몇인분을 선택하실 지 번호로 골라주세요 : ");
					int sizeSelect = scanner.nextInt();
					
					if(sizeSelect == 1) {
						System.out.println("간장맛 1인분을 선택하셨습니다.");
						System.out.println("가격은 11000원입니다.");
						cost += 11000;
					}else if(sizeSelect == 2) {
						System.out.println("간장 2인분을 선택하셨습니다.");
						System.out.println("가격은 21000원입니다.");
						cost += 21000;
					}else if(sizeSelect == 3) {
						System.out.println("간장 3인분을 선택하셨습니다.");
						System.out.println("가격은 31000원입니다.");
						cost += 31000;
					}else if(sizeSelect == 4) {
						System.out.println("간장 4인분을 선택하셨습니다.");
						System.out.println("가격은 41000원입니다.");
						cost += 41000;
					}
				}else if(tasteSelect == 4) {
					System.out.println("달콤한 맛 선택하셨습니다. ");
					System.out.print("1. 1인분 2. 2인분 3. 3인분 4. 4인분 중 몇인분을 선택하실 지 번호로 골라주세요 : ");
					int sizeSelect = scanner.nextInt();
					
					if(sizeSelect == 1) {
						System.out.println("달콤한 맛 1인분을 선택하셨습니다.");
						System.out.println("가격은 10000원입니다.");
						cost += 10000;
					}else if(sizeSelect == 2) {
						System.out.println("달콤한 맛 2인분을 선택하셨습니다.");
						System.out.println("가격은 20000원입니다.");
						cost += 20000;
					}else if(sizeSelect == 3) {
						System.out.println("달콤한 맛 3인분을 선택하셨습니다.");
						System.out.println("가격은 30000원입니다.");
						cost += 30000;
					}else if(sizeSelect == 4) {
						System.out.println("달콤한 맛 4인분을 선택하셨습니다.");
						System.out.println("가격은 40000원입니다.");
						cost += 40000;
					}
				}
			}else if(orderSelect.equals("아니오")) {
				System.out.println("주문하실 때 호출해주세요 !! ");
				continue;
			}else if(orderSelect.equals("종료")) {
				System.out.println("총 주문하신 가격은 " + cost + "원입니다.");
				System.out.println("주문해주셔서 감사합니다. 즐거운 시간 되세요!!");
				break;
			}
			
		}

	}

}
