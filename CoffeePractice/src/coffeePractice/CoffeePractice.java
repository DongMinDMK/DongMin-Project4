package coffeePractice;
import java.util.Scanner;

public class CoffeePractice {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int cost = 0;
		
		while(true) {
			System.out.println("안녕하세요 DMK 카페입니다.");
			System.out.print("주문하시겠습니까?(네/아니오/계산) : ");
			String yesorno = scanner.next();
			
			if(yesorno.equals("네")) {
				System.out.print("1. 아메리카노 2. 카페라떼 3. 카라멜마끼야또 4. 카페모카 중 원하시는 커피의 번호를 눌러주세요 : ");
				int coffeeSelect = scanner.nextInt();
				
				if(coffeeSelect == 1) { //아메리카노
					System.out.println("아메리카노를 선택하셨습니다.");
					System.out.print("아메리카노는 아이스와 핫으로 구분되어 있습니다. 어떤 것을 드시겠습니까?(아이스/핫) : ");
					String iceOrHot = scanner.next();
					
					if(iceOrHot.equals("아이스")) {
						System.out.println("아이스 아메리카노의 가격은 2000원입니다.");
						cost += 2000;
					}else if(iceOrHot.equals("핫")) {
						System.out.println("따뜻한 아메리카노의 가격은 1500원입니다.");
						cost += 1500;
					}
				}else if(coffeeSelect == 2) { //카페라떼
					System.out.println("카페라떼를 선택하셨습니다.");
					System.out.print("카페라떼는 아이스와 핫으로 구분되어 있습니다. 어떤 것을 드시겠습니까?(아이스/핫) : ");
					String iceOrHot = scanner.next();
					
					if(iceOrHot.equals("아이스")) {
						System.out.println("아이스 카페라떼의 가격은 3000원입니다.");
						cost += 3000;
					}else if(iceOrHot.equals("핫")) {
						System.out.println("따뜻한 카페라떼의 가격은 2500원입니다.");
						cost += 2500;
					}
				}else if(coffeeSelect == 3) { // 카라멜마끼야또
					System.out.println("카라멜마끼야또를 선택하셨습니다.");
					System.out.print("카라멜마끼야또는 아이스와 핫으로 구분되어 있습니다. 어떤 것을 드시겠습니까?(아이스/핫) : ");
					String iceOrHot = scanner.next();
					
					if(iceOrHot.equals("아이스")) {
						System.out.println("아이스 카라멜마끼야또의 가격은 4500원입니다.");
						cost += 4500;
					}else if(iceOrHot.equals("핫")) {
						System.out.println("따뜻한 카라멜마끼야또의 가격은 3500원입니다.");
						cost += 3500;
					}
				}else if(coffeeSelect == 4) { //카페모카
					System.out.println("카페모카를 선택하셨습니다.");
					System.out.print("카페모카는 아이스와 핫으로 구분되어 있습니다. 어떤 것을 드시겠습니까?(아이스/핫) : ");
					String iceOrHot = scanner.next();
					
					if(iceOrHot.equals("아이스")) {
						System.out.println("아이스 카페모카의 가격은 3500원입니다.");
						cost += 3500;
					}else if(iceOrHot.equals("핫")) {
						System.out.println("따뜻한 카페모카의 가격은 3000원입니다.");
						cost += 3000;
					}
				}
				
			}else if(yesorno.equals("아니오")) {
				System.out.println("주문 결정을 완료하시면 앞에 키오스크나 알바새을 호출해주세요.");
			}else if(yesorno.equals("계산")) {
				System.out.println("총 " + cost + "원이 나오셨습니다.");
				System.out.println("결제를 진행하시면 커피 제조를 시작해드립니다.");
				System.out.print("지불하실 금액을 넣어주세요 : ");
				int personCost = scanner.nextInt();
				
				if(personCost > cost) {
					System.out.println("결제가 완료되었습니다.");
					System.out.println("거스름돈 " + (personCost - cost) + "원이 반환되었습니다.");
					System.out.println("이용해주셔서 감사합니다.");
					break;
				}else if(cost == personCost) {
					System.out.println("결제가 완료되었습니다.");
					System.out.println("이용해주셔서 감사합니다.");
					break;
				}else {
					System.out.println("잔액이 부족하여 결제를 진행하실 수 없습니다.");
					continue;
				}
			}
		}

	}

}
