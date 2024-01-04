package foodPractice;
import java.util.Scanner;

public class FoodPractice {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int cost = 0;
		
		System.out.println("환영합니다. DMK 음식점입니다.");
		System.out.println("저희 매장은 손님들을 위하여 저렴한 가격의 음식들로 준비했습니다.");
		
		while(true) {
			System.out.print("주문하시겠습니까?(네/아니오) : ");
			String yesorno = scanner.next();
			
			if(yesorno.equals("네")) {
				System.out.print("1. 잔치(멸치)국수 2. 비빔국수 3. 탕수육 4. 군만두 5. 떡볶이 6. 계산 중 원하시는 음식의 번호를 눌러주세요 : ");
				int foodSelect = scanner.nextInt();
				
				if(foodSelect == 1) {
					System.out.println("잔치(멸치)국수의 가격은 2000원입니다.");
					cost += 2000;
				}else if(foodSelect == 2) {
					System.out.println("비빔국수의 가격은 2000원입니다.");
					cost += 2000;
				}else if(foodSelect == 3) {
					System.out.println("탕수육의 가격은 2500원입니다.");
					cost += 2500;
				}else if(foodSelect == 4) {
					System.out.println("군만두의 가격은 1500원입니다.");
					cost += 1500;
				}else if(foodSelect == 5) {
					System.out.println("떡볶이의 가격은 2000원입니다.");
					cost += 2000;
				}else if(foodSelect == 6) {
					System.out.println("현재 " + cost + "원이 나오셨습니다.");
					System.out.print("얼마를 지불하시겠습니까? ");
					int userCost = scanner.nextInt();
					
					if(userCost > cost) {
						System.out.println((userCost - cost) + "원의 거스름돈을 반환해드리겠습니다.");
						System.out.println("이용해주셔서 감사합니다.");
						break;
					}else if(userCost == cost) {
						System.out.println("결제가 완료되었습니다.");
						System.out.println("이용해주셔서 감사합니다.");
						break;
					}else if(userCost < cost) {
						System.out.println("잔액이 부족하여 결제를 진행하실 수 없습니다.");
						continue;
					}
				}
			}else if(yesorno.equals("아니오")) {
				System.out.println("주문하실 때 앞의 키오스크를 이용 부탁드립니다.");
			}
		}
		
		System.out.println("감사합니다. DMK 음식점이였습니다!");
		System.out.println("즐거운 시간 되세요!");
		

	}

}
