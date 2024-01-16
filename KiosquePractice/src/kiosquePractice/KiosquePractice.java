package kiosquePractice;
import java.util.Scanner;

public class KiosquePractice {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int cost = 0;
		
		System.out.print("안녕하세요 DMK 도시락입니다. 주문하시겠습니까? (네/아니오) : ");
		
		String yesorno = scanner.next();
		
		if(yesorno.equals("네")) {
			while(true) {
				System.out.print("1. 치킨도시락 2. 돈가스도시락 3. 제육도시락 4. 참치도시락 5. 계산 중 원하시는 도시락의 번호를 눌러주세요 : ");
				int selectFood = scanner.nextInt();
				
				if(selectFood == 1) {
					System.out.println("치킨도시락을 선택하셨습니다.");
					System.out.print("곱빼기를 추가하실 수 있습니다. 추가하시겠습니까? (네/아니오) : ");
					String size = scanner.next();
					if(size.equals("네")) {
						System.out.println("치킨도시락 곱빼기의 가격은 7000원입니다.");
						cost += 7000;
					}else if(size.equals("아니오")) {
						System.out.println("치킨도시락 일반 가격은 6000원입니다.");
						cost += 6000;
					}
				}else if(selectFood == 2) {
					System.out.println("돈가스도시락을 선택하셨습니다.");
					System.out.print("곱빼기를 추가하실 수 있습니다. 추가하시겠습니까? (네/아니오) : ");
					String size = scanner.next();
					if(size.equals("네")) {
						System.out.println("돈가스도시락 곱빼기의 가격은 9000원입니다.");
						cost += 9000;
					}else if(size.equals("아니오")) {
						System.out.println("돈가스도시락 일반 가격은 8000원입니다.");
						cost += 8000;
					}
				}else if(selectFood == 3) {
					System.out.println("제육도시락을 선택하셨습니다.");
					System.out.print("곱빼기를 추가하실 수 있습니다. 추가하시겠습니까? (네/아니오) : ");
					String size = scanner.next();
					if(size.equals("네")) {
						System.out.println("제육도시락 곱빼기의 가격은 8000원입니다.");
						cost += 8000;
					}else if(size.equals("아니오")) {
						System.out.println("제육도시락 일반 가격은 7000원입니다.");
						cost += 7000;
					}
				}else if(selectFood == 4) {
					System.out.println("참치도시락을 선택하셨습니다.");
					System.out.print("곱빼기를 추가하실 수 있습니다. 추가하시겠습니까? (네/아니오) : ");
					String size = scanner.next();
					if(size.equals("네")) {
						System.out.println("참치도시락 곱빼기의 가격은 10000원입니다.");
						cost += 10000;
					}else if(size.equals("아니오")) {
						System.out.println("참치도시락 일반 가격은 9000원입니다.");
						cost += 9000;
					}
				}else if(selectFood == 5) {
					System.out.println("총 현재 주문하신 도시락의 가격은 " + cost + "원입니다.");
					System.out.print("얼마를 지불하시겠습니까? ");
					int userCost = scanner.nextInt();
					
					if(userCost >= cost) {
						System.out.println("결제가 완료되었습니다.");
						
						if(userCost > cost) {
							System.out.println((userCost - cost) + "원의 거스름든이 반환되었습니다.");
						}
						
						System.out.println("즐거운 시간 되세요!!");
					
						break;
					}else {
						System.out.println("잔액이 부족하여 결제를 진행하실 수 없습니다.");
						continue;
					}
				}
			}
			
		}else if(yesorno.equals("아니오")) {
			System.out.println("주문하실 때 앞의 키오스크를 이용해주세요!!");
		}

	}

}
