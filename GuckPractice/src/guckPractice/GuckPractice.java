package guckPractice;
import java.util.Scanner;

public class GuckPractice {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int cost = 0;
		
		while(true) {
			
			System.out.println("안녕하세요 DMK 국집입니다.");
			System.out.print("주문하시겠습니까?(네/아니오) : ");
			
			String select = scanner.next();
			
			if(select.equals("네")) {
				System.out.println("드실 국의 번호를 눌러주세요.");
				System.out.print("1. 소고기뭇국 2. 김치찌개 3. 된장찌개 4. 콩나물국 5. 미역국 6. 주문종료 : ");
				int guckSelect = scanner.nextInt();
				
				if(guckSelect == 1) {
					System.out.println("소고기뭇국을 선택하셨습니다.");
					System.out.println("소고기뭇국의 가격은 6000원입니다.");
					cost += 6000;
				}else if(guckSelect == 2) {
					System.out.println("김치찌개 선택하셨습니다.");
					System.out.println("김치찌개의 가격은 8000원입니다.");
					cost += 8000;
				}else if(guckSelect == 3) {
					System.out.println("된장찌개 선택하셨습니다.");
					System.out.println("된장찌개의 가격은 8000원입니다.");
					cost += 8000;
				}else if(guckSelect == 4) {
					System.out.println("콩나물국 선택하셨습니다.");
					System.out.println("콩나물국의 가격은 9000원입니다.");
					cost += 9000;
				}else if(guckSelect == 5) {
					System.out.println("미역국 선택하셨습니다.");
					System.out.println("미역국의 가격은 7000원입니다.");
					cost += 7000;
				}else if(guckSelect == 6) {
					break;
				}
			}else if(select.equals("아니오")) {
				System.out.println("주문하실때 앞의 키오스크를 이용해주세요.");
				continue;
			}
		}
		
		System.out.print("밥을 몇 개를 드시겠습니까?(최대 5개) : ");
		int riceSelect = scanner.nextInt();
		
		if(riceSelect == 1) {
			System.out.println("공기밥 1개는 1000원입니다.");
			cost += 1000;
		}else if(riceSelect == 2) {
			System.out.println("공기밥 2개는 2000원입니다.");
			cost += 2000;
		}else if(riceSelect == 3) {
			System.out.println("공기밥 3개는 3000원입니다.");
			cost += 3000;
		}else if(riceSelect == 4) {
			System.out.println("공기밥 4개는 4000원입니다.");
			cost += 4000;
		}else if(riceSelect == 5) {
			System.out.println("공기밥 5개는 5000원입니다.");
			cost += 5000;
		}
		
		System.out.println("총 주문하신 국과 밥의 가격은 " + cost + "원입니다.");
		System.out.println("결제하시고 잠시 기다리시면 주문한 음식의 나올 것입니다.");
		System.out.println("이용해주셔서 감사합니다.");

	}

}
