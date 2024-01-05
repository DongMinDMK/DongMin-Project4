package foodTwoPractice;
import java.util.Scanner;

public class FoodTwoPractice {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int cost = 0;
		
		System.out.println("안녕하세요 DMK 음식점2 입니다.");
		
		while(true) {
			System.out.print("주문하시겠습니까?(네/아니오) : ");
			String order = scanner.next();
			
			if(order.equals("네")) {
				System.out.print("1. 김밥 2. 국수 3. 냉면 4. 수제비 5. 총금액조회 중 원하시는 음식의 번호를 눌러주세요 : ");
				int foodSelect = scanner.nextInt();
				
				if(foodSelect == 1) {
					System.out.print("김밥에는 1. 일반김밥 2. 참치김밥 3. 치즈김밥 중 원하시는 김밥의 번호를 눌러주세요 : ");
					int gimbapSelect = scanner.nextInt();
					
					if(gimbapSelect == 1) {
						System.out.println("일반김밥의 가격은 1500원입니다.");
						cost += 1500;
					}else if(gimbapSelect == 2) {
						System.out.println("참치김밥의 가격은 2500원입니다.");
						cost += 2500;
					}else if(gimbapSelect == 3) {
						System.out.println("치즈김밥의 가격은 2500원입니다.");
						cost += 2500;
					}
				}else if(foodSelect == 2) {
					System.out.print("국수에는 1. 잔치국수 2. 비빔국수 중 원하시는 국수의 번호를 눌러주세요 : ");
					int noodleSelect = scanner.nextInt();
					
					if(noodleSelect == 1) {
						System.out.println("잔치국수의 가격은 3500원입니다.");
						cost += 3500;
					}else if(noodleSelect == 2) {
						System.out.println("비빔국수의 가격은 4000원입니다.");
						cost += 4000;
					}
				}else if(foodSelect == 3) {
					System.out.print("냉면에는 1. 물냉면 2. 비빔냉면 중 원하시는 냉면의 번호를 눌러주세요 : ");
					int coldMeonSelect = scanner.nextInt();
					
					if(coldMeonSelect == 1) {
						System.out.print("물냉면 맛 난이도를 선택해주세요(하얀(안매운)냉면/중간맛냉면/매운냉면) : ");
						String spicySelect = scanner.next();
						
						if(spicySelect.equals("하얀냉면") || spicySelect.equals("안매운냉면")) {
							System.out.println("하얀(안매운)냉면의 가격은 4000원입니다.");
							cost += 4000;
						}else if(spicySelect.equals("중간맛냉면")) {
							System.out.println("중간맛냉면의 가격은 4000원입니다.");
							cost += 4000;
						}else if(spicySelect.equals("매운냉면")) {
							System.out.println("매운냉면의 가격은 4000원입니다.");
							cost += 4000;
						}
					}
				}else if(foodSelect == 4) {
					System.out.print("수제비에는 1. 일반수제비 2. 들깨수제비 중 원하시는 수제비의 번호를 눌러주세요 : ");
					int sugebiSelect = scanner.nextInt();
					
					if(sugebiSelect == 1) {
						System.out.println("일반수제비의 가격은 4000원입니다.");
						cost += 4000;
					}else if(sugebiSelect == 2) {
						System.out.println("들깨수제비의 가격은 4500원입니다.");
						cost += 4500;
					}
				}else if(foodSelect == 5) {
					System.out.println("지금까지 주문하신 음식들의 총 가격은 " + cost + "원입니다.");
					System.out.println("앞에 데스크에서 계산하시고 즐거운 식사 되세요!");
					break;
				}
			}
		}

	}

}
