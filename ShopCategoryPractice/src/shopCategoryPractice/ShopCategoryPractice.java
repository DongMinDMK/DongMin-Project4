package shopCategoryPractice;
import java.util.Scanner;

public class ShopCategoryPractice {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int cost = 0;
		
		while(true) {
			System.out.println("환영합니다. DMK 백화점입니다.");
			System.out.println("쇼핑하시기 전 원하시는 제품의 카테고리를 골라주세요.");
			System.out.print("1. 옷 2. 모자 3. 계산 중 원하시는 카테고리의 번호를 눌러주세요 : ");
			int categorySelect = scanner.nextInt();
			
			if(categorySelect == 1) { //옷
				System.out.println("저희 백화점에는 다양한 옷들이 준비되어 있습니다.");
				System.out.print("1. 맨투맨 2. 후드티 3. 니트 4. 패딩 중 원하시는 옷의 종류의 번호를 눌러주세요 : ");
				int clothSelect = scanner.nextInt();
				
				if(clothSelect == 1) { //맨투맨
					System.out.print("맨투맨 사이즈는 S/M/L/XL 가 준비되어 있습니다. 원하시는 사이즈를 입력해주세요 : ");
					String manToSize = scanner.next();
					
					if(manToSize.equals("S") || manToSize.equals("s")) {
						System.out.println("맨투맨 S 사이즈를 선택하셨습니다.");
						System.out.println("가격은 20000원입니다.");
						cost += 20000;
					}else if(manToSize.equals("M") || manToSize.equals("m")) {
						System.out.println("맨투맨 M 사이즈를 선택하셨습니다.");
						System.out.println("가격은 20000원입니다.");
						cost += 20000;
					}else if(manToSize.equals("L") || manToSize.equals("l")) {
						System.out.println("맨투맨 L 사이즈를 선택하셨습니다.");
						System.out.println("가격은 20000원입니다.");
						cost += 20000;
					}else if(manToSize.equals("XL") || manToSize.equals("xl")) {
						System.out.println("맨투맨 XL 사이즈를 선택하셨습니다.");
						System.out.println("가격은 20000원입니다.");
						cost += 20000;
					}
				}else if(clothSelect == 2) { //후드티
					System.out.print("후드티 사이즈는 S/M/L/XL 가 준비되어 있습니다. 원하시는 사이즈를 입력해주세요 : ");
					String hoodToSize = scanner.next();
					
					if(hoodToSize.equals("S") || hoodToSize.equals("s")) {
						System.out.println("후드티 S 사이즈를 선택하셨습니다.");
						System.out.println("가격은 30000원입니다.");
						cost += 30000;
					}else if(hoodToSize.equals("M") || hoodToSize.equals("m")) {
						System.out.println("후드티 M 사이즈를 선택하셨습니다.");
						System.out.println("가격은 30000원입니다.");
						cost += 30000;
					}else if(hoodToSize.equals("L") || hoodToSize.equals("l")) {
						System.out.println("후드티 L 사이즈를 선택하셨습니다.");
						System.out.println("가격은 30000원입니다.");
						cost += 30000;
					}else if(hoodToSize.equals("XL") || hoodToSize.equals("xl")) {
						System.out.println("후드티 XL 사이즈를 선택하셨습니다.");
						System.out.println("가격은 30000원입니다.");
						cost += 30000;
					}
				}else if(clothSelect == 3) { //니트
					System.out.print("니트 사이즈는 S/M/L/XL 가 준비되어 있습니다. 원하시는 사이즈를 입력해주세요 : ");
					String neetToSize = scanner.next();
					
					if(neetToSize.equals("S") || neetToSize.equals("s")) {
						System.out.println("니트 S 사이즈의 가격은 40000원입니다.");
						cost += 40000;
					}else if(neetToSize.equals("M") || neetToSize.equals("m")) {
						System.out.println("니트 M 사이즈의 가격은 40000원입니다.");
						cost += 40000;
					}else if(neetToSize.equals("L") || neetToSize.equals("l")) {
						System.out.println("니트 L 사이즈의 가격은 40000원입니다.");
						cost += 40000;
					}else if(neetToSize.equals("XL") || neetToSize.equals("xl")) {
						System.out.println("니트 XL 사이즈의 가격은 40000원입니다.");
						cost += 40000;
					}
				}else if(clothSelect == 4) { //니트
					System.out.print("패딩 사이즈는 S/M/L/XL 가 준비되어 있습니다. 원하시는 사이즈를 입력해주세요 : ");
					String peedingToSize = scanner.next();
					
					if(peedingToSize.equals("S") || peedingToSize.equals("s")) {
						System.out.println("패딩 S 사이즈의 가격은 70000원입니다.");
						cost += 70000;
					}else if(peedingToSize.equals("M") || peedingToSize.equals("m")) {
						System.out.println("패딩 M 사이즈의 가격은 70000원입니다.");
						cost += 70000;
					}else if(peedingToSize.equals("L") || peedingToSize.equals("l")) {
						System.out.println("패딩 L 사이즈의 가격은 70000원입니다.");
						cost += 70000;
					}else if(peedingToSize.equals("XL") || peedingToSize.equals("xl")) {
						System.out.println("패딩 XL 사이즈의 가격은 70000원입니다.");
						cost += 70000;
					}
				}
			}else if(categorySelect == 2) { //모자
				System.out.println("저희 모자는 사시기만 하시면 손님 머리 둘레에 맞춰서 착용하시면 됩니다.");
				System.out.println("단, 모자는 성별에 따라 달라집니다.");
				System.out.print("착용하실 분의 성별을 입력해주세요 (남/여): ");
				String genderSelect = scanner.next();
				
				if(genderSelect.equals("남")) {
					System.out.println("남성분이 모자를 쓰시는 군요!! ");
					System.out.println("남자 모자의 가격은 50000원입니다.");
					cost += 50000;
				}else if(genderSelect.equals("여")) {
					System.out.println("여성분이 모자를 쓰시는 군요!! ");
					System.out.println("여자 모자의 가격은 50000원입니다.");
					cost += 50000;
				}
			}else if(categorySelect == 3) {
				System.out.println("정말 다양하게 구입하셨군요!!");
				System.out.println("총 " + cost + "원 나오셨습니다.");
				System.out.print("지불하실 금액을 입력해주세요 : ");
				int userCost = scanner.nextInt();
				
				if(userCost > cost) {
					System.out.println("결제가 정상적으로 완료되었습니다.");
					System.out.println("거스름돈 " + (userCost - cost) + "원을 반환해드리겠습니다.");
					System.out.println("이용해주셔서 감사합니다.");
					break;
				}else if(userCost == cost) {
					System.out.println("결제가 정상적으로 완료되었습니다.");
					System.out.println("이용해주셔서 감사합니다.");
					break;
				}else if(userCost < cost) {
					System.out.println("잔액이 " + (cost - userCost) + "원 부족합니다.");
					System.out.println("결제를 진행하실 수 없습니다.");
					continue;
				}
			}
		}
	}

}
