package coldNoodlePractice;
import java.util.Scanner;

public class ColdNoodlePractice {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int cost = 0;
		
		System.out.println("안녕하세요 DMK 냉면집입니다.");
		
		while(true) {
			System.out.print("1. 냉면 2. 열무냉면 3. 가격확인 중 원하시는 냉면의 번호를 눌러주세요 : ");
			int coldNoodleSelect = scanner.nextInt();
			
			if(coldNoodleSelect == 1) {
				System.out.print("1. 물(하얀)냉면 2. 중간맛냉면 3. 매운냉면 중 원하시는 냉면의 맛의 번호를 선택해주세요 : ");
				int spicySelect = scanner.nextInt();
				
				if(spicySelect == 1) {
					System.out.print("물(하얀)냉면은 곱빼기와 일반이 있습니다. (곱빼기/일반) 중 원하시는 양을 선택해주세요 : ");
					String sizeSelect = scanner.next();
					
					if(sizeSelect.equals("곱빼기")) {
						System.out.println("물(하얀)냉면의 곱빼기는 5000원입니다.");
						cost += 5000;
					}else if(sizeSelect.equals("일반")) {
						System.out.println("물(하얀)냉면의 일반의 가격은 4000원입니다.");
						cost += 4000;
					}
				}else if(spicySelect == 2) {
					System.out.print("중간맛 냉면은 곱빼기와 일반이 있습니다. (곱빼기/일반) 중 원하시는 양을 선택해주세요 : ");
					String sizeSelect = scanner.next();
					
					if(sizeSelect.equals("곱빼기")) {
						System.out.println("중간맛 냉면의 곱빼기는 5000원입니다.");
						cost += 5000;
					}else if(sizeSelect.equals("일반")) {
						System.out.println("중간맛 냉면의 일반의 가격은 4000원입니다.");
						cost += 4000;
					}
				}else if(spicySelect == 3) {
					System.out.print("매운맛 냉면은 곱빼기와 일반이 있습니다. (곱빼기/일반) 중 원하시는 양을 선택해주세요 : ");
					String sizeSelect = scanner.next();
					
					if(sizeSelect.equals("곱빼기")) {
						System.out.println("매운맛 냉면의 곱빼기는 5000원입니다.");
						cost += 5000;
					}else if(sizeSelect.equals("일반")) {
						System.out.println("매운맛 냉면의 일반의 가격은 4000원입니다.");
						cost += 4000;
					}
				}
				
			}else if(coldNoodleSelect == 2) {
				System.out.print("열무냉면은 일반 사이즈와 곱빼기 사이즈가 존재합니다. (일반/곱빼기) 중 원하시는 사이즈를 골라주세요 : ");
				String size2Select = scanner.next();
				
				if(size2Select.equals("일반")) {
					System.out.println("열무냉면의 일반 사이즈는 7000원입니다.");
					cost += 7000;
				}else if(size2Select.equals("곱빼기")) {
					System.out.println("열무냉면의 곱빼기 사이즈는 8000원입니다.");
					cost += 8000;
				}
			}else if(coldNoodleSelect == 3) {
				System.out.println("현재 나오신 가격은 " + cost + "원입니다.");
				System.out.print("결제하실 금액을 넣어주세요 : ");
				int userCost = scanner.nextInt();
				
				if(userCost > cost) {
					System.out.println("결제가 완료되셨고, 거스름돈 " + (userCost - cost) + "원이 반환되었습니다.");
					System.out.println("이용해주셔서 감사합니다.");
					break;
				}else if(userCost == cost) {
					System.out.println("결제가 완료되셨습니다.");
					System.out.println("이용해주셔서 감사합니다.");
					break;
				}else if(userCost < cost) {
					System.out.println("잔액이 부족합니다.");
					System.out.println((cost - userCost) + "원을 더 넣어주시고 결제 부탁드립니다.");
					continue;
				}
			}
			
		}

	}

}
