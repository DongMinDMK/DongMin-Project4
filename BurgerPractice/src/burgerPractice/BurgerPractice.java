package burgerPractice;
import java.util.Scanner;

public class BurgerPractice {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int allCost = 0;
		
		System.out.println("안녕하세요. DMK 버거집입니다.");
		
		while(true) {
			System.out.print("주문하시겠습니까?(네/아니오/계산) : ");
			String order = scanner.next();
			
			if(order.equals("네")) {
				System.out.print("1. 데리버거 2. 상하이버거 3. 싸이버거 4. 새우버거 5. DMK버거 중 원하시는 버거의 번호를 눌러주세요 : ");
				int burgerSelect = scanner.nextInt();
				
				if(burgerSelect == 1) {
					System.out.println("데리버거를 선택하셨습니다.");
					System.out.println("데리버거는 버거만 시키시는 단품과 세트로 구성되어 있습니다.");
					System.out.println("세트에는 버거+감자튀김+음료까지 제공됩니다.");
					System.out.print("데리버거 단품과 세트 중 어떤 것을 드시겠습니까?(단품/버거) : ");
					String userSelect = scanner.next();
					
					if(userSelect.equals("단품")) {
						System.out.println("데리버거 단품을 선택하셨습니다.");
						System.out.println("데리버거 단품의 가격은 5000원입니다.");
						allCost += 5000;
					}else if(userSelect.equals("세트")) {
						System.out.println("데리버거 세트를 선택하셨습니다.");
						System.out.println("데리버거 세트의 가격은 6500원입니다.");
						allCost += 6500;
					}
				}else if(burgerSelect == 2) {
					System.out.println("상하이버거를 선택하셨습니다.");
					System.out.println("상하이버거는 버거만 시키시는 단품과 세트로 구성되어 있습니다.");
					System.out.println("세트에는 버거+감자튀김+음료까지 제공됩니다.");
					System.out.print("상하이버거 단품과 세트 중 어떤 것을 드시겠습니까?(단품/버거) : ");
					String userSelect = scanner.next();
					
					if(userSelect.equals("단품")) {
						System.out.println("상하이버거 단품을 선택하셨습니다.");
						System.out.println("상하이버거 단품의 가격은 6000원입니다.");
						allCost += 6000;
					}else if(userSelect.equals("세트")) {
						System.out.println("상하이버거 세트를 선택하셨습니다.");
						System.out.println("상하이버거 세트의 가격은 7500원입니다.");
						allCost += 7500;
					}
				}else if(burgerSelect == 3) {
					System.out.println("싸이버거를 선택하셨습니다.");
					System.out.println("싸이버거는 버거만 시키시는 단품과 세트로 구성되어 있습니다.");
					System.out.println("세트에는 버거+감자튀김+음료까지 제공됩니다.");
					System.out.print("싸이버거 단품과 세트 중 어떤 것을 드시겠습니까?(단품/버거) : ");
					String userSelect = scanner.next();
					
					if(userSelect.equals("단품")) {
						System.out.println("싸이버거 단품을 선택하셨습니다.");
						System.out.println("싸이버거 단품의 가격은 6500원입니다.");
						allCost += 6500;
					}else if(userSelect.equals("세트")) {
						System.out.println("싸이버거 세트를 선택하셨습니다.");
						System.out.println("싸이버거 세트의 가격은 8000원입니다.");
						allCost += 8000;
					}
				}else if(burgerSelect == 4) {
					System.out.println("새우버거를 선택하셨습니다.");
					System.out.println("새우버거는 버거만 시키시는 단품과 세트로 구성되어 있습니다.");
					System.out.println("세트에는 버거+감자튀김+음료까지 제공됩니다.");
					System.out.print("새우버거 단품과 세트 중 어떤 것을 드시겠습니까?(단품/버거) : ");
					String userSelect = scanner.next();
					
					if(userSelect.equals("단품")) {
						System.out.println("새우버거 단품을 선택하셨습니다.");
						System.out.println("새우버거 단품의 가격은 9000원입니다.");
						allCost += 9000;
					}else if(userSelect.equals("세트")) {
						System.out.println("새우버거 세트를 선택하셨습니다.");
						System.out.println("새우버거 세트의 가격은 10000원입니다.");
						allCost += 10000;
					}
				}else if(burgerSelect == 5) {
					System.out.println("DMK버거를 선택하셨습니다.");
					System.out.println("DMK버거는 버거만 시키시는 단품과 세트로 구성되어 있습니다.");
					System.out.println("세트에는 버거+감자튀김+음료까지 제공됩니다.");
					System.out.print("DMK버거 단품과 세트 중 어떤 것을 드시겠습니까?(단품/버거) : ");
					String userSelect = scanner.next();
					
					if(userSelect.equals("단품")) {
						System.out.println("DMK버거 단품을 선택하셨습니다.");
						System.out.println("DMK버거 단품의 가격은 4000원입니다.");
						allCost += 4000;
					}else if(userSelect.equals("세트")) {
						System.out.println("DMK버거 세트를 선택하셨습니다.");
						System.out.println("DMK버거 세트의 가격은 5500원입니다.");
						allCost += 5500;
					}
				}
				
			}else if(order.equals("아니오")) {
				System.out.println("주문하실 때 매장 알바생을 호출해주시거나 데스크 앞에 벨을 눌러주세요!");
			}else if(order.equals("계산")) {
				System.out.println("총 현재 장바구니 리스트에 포함된 버거의 금액은 " + allCost + "원 입니다.");
				System.out.print("얼마를 지불하시겠습니까? ");
				int userCost = scanner.nextInt();
				
				if(userCost > allCost) {
					System.out.println("결제가 완료되었습니다.");
					System.out.println((userCost - allCost) + "원의 거스름돈이 반환되었습니다.");
					System.out.println("이용해주셔서 감사합니다. 즐거운 시간 되세요!");
					break;
				}else if(userCost == allCost) {
					System.out.println("결제가 완료되었습니다.");
					System.out.println("이용해주셔서 감사합니다. 즐거운 시간 되세요!");
					break;
				}else if(userCost < allCost) {
					System.out.println("잔액이 부족합니다.");
					System.out.println("총 나온 금액 " + allCost + "원에 맞게 돈을 넣어주시기 바랍니다.");
					continue;
				}
			}
		}

	}

}
