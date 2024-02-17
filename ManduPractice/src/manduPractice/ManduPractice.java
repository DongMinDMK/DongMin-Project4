package manduPractice;
import java.util.Scanner;

public class ManduPractice {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int cost = 0;
		
		System.out.println("안녕하세요 DMK 만두집입니다.");
		System.out.print("주문하시겠습니까?(네/아니오) : ");
		String order = scanner.next();
		
		if(order.equals("네")) {
			while(true) {
				System.out.print("1. 물만두 2. 군만두 3. 왕만두 4. 비용계산 중 원하시는 만두의 종류를 골라 번호를 눌러주세요 : ");
				int manduOrder = scanner.nextInt();
				
				if(manduOrder == 1) {
					System.out.println("물만두를 선택하셨습니다.");
					System.out.print("물만두 중 1. 고기만두 2. 김치만두 중 어느 것을 드시겠습니까? 번호로 눌러주세요 : ");
					int meatOrKimchiSelect = scanner.nextInt();
					
					if(meatOrKimchiSelect == 1) {
						System.out.println("고기만두를 선택하셨습니다. 고기만두 1개의 가격은 1000원입니다.");
						
						System.out.print("몇개를 드시겠습니까?(최대 1번 주문시 5개까지 주문 가능) : ");
						int amount = scanner.nextInt();
						
						if(amount == 1) {
							System.out.println("고기만두 1개의 가격은 1000원입니다.");
							cost += 1000;
						}else if(amount == 2) {
							System.out.println("고기만두 2개의 가격은 2000원입니다.");
							cost += 2000;
						}else if(amount == 3) {
							System.out.println("고기만두 3개의 가격은 3000원입니다.");
							cost += 3000;
						}else if(amount == 4) {
							System.out.println("고기만두 4개의 가격은 4000원입니다.");
							cost += 4000;
						}else if(amount == 5) {
							System.out.println("고기만두 5개의 가격은 5000원입니다.");
							cost += 5000;
						}
					}else if(meatOrKimchiSelect == 2) {
						System.out.println("김치만두를 선택하셨습니다. 김치만두 1개의 가격은 1000원입니다.");
						
						System.out.print("몇개를 드시겠습니까?(최대 1번 주문시 5개까지 주문 가능) : ");
						int amount = scanner.nextInt();
						
						if(amount == 1) {
							System.out.println("김치만두 1개의 가격은 1000원입니다.");
							cost += 1000;
						}else if(amount == 2) {
							System.out.println("김치만두 2개의 가격은 2000원입니다.");
							cost += 2000;
						}else if(amount == 3) {
							System.out.println("김치만두 3개의 가격은 3000원입니다.");
							cost += 3000;
						}else if(amount == 4) {
							System.out.println("김치만두 4개의 가격은 4000원입니다.");
							cost += 4000;
						}else if(amount == 5) {
							System.out.println("김치만두 5개의 가격은 5000원입니다.");
							cost += 5000;
						}
					}
				}else if(manduOrder == 2) {
					System.out.println("군만두를 선택하셨습니다.");
					System.out.println("군만두는 1개당 1500원입니다.");
					System.out.print("몇 개의 군만두를 구매하시겠습니까?(1번 주문시 최대 5개까지 주문 가능) : ");
					int gunManduAmount = scanner.nextInt();
					
					if(gunManduAmount == 1) {
						System.out.println("군만두 1개의 가격은 1500원입니다.");
						cost += 1500;
					}else if(gunManduAmount == 2) {
						System.out.println("군만두 2개의 가격은 3000원입니다.");
						cost += 3000;
					}else if(gunManduAmount == 3) {
						System.out.println("군만두 3개의 가격은 4500원입니다.");
						cost += 4500;
					}else if(gunManduAmount == 4) {
						System.out.println("군만두 2개의 가격은 6000원입니다.");
						cost += 6000;
					}else if(gunManduAmount == 5) {
						System.out.println("군만두 2개의 가격은 7500원입니다.");
						cost += 7500;
					}
				}else if(manduOrder == 3) {
					System.out.println("왕만두를 선택하셨습니다.");
					System.out.print("왕만두 중 1. 고기만두 2. 김치만두 중 어느 것을 드시겠습니까? 번호로 눌러주세요 : ");
					int meatOrKimchiSelect = scanner.nextInt();
					
					if(meatOrKimchiSelect == 1) {
						System.out.println("고기만두를 선택하셨습니다. 고기만두 1개의 가격은 1000원입니다.");
						
						System.out.print("몇개를 드시겠습니까?(최대 1번 주문시 5개까지 주문 가능) : ");
						int amount = scanner.nextInt();
						
						if(amount == 1) {
							System.out.println("고기만두 1개의 가격은 1000원입니다.");
							cost += 1000;
						}else if(amount == 2) {
							System.out.println("고기만두 2개의 가격은 2000원입니다.");
							cost += 2000;
						}else if(amount == 3) {
							System.out.println("고기만두 3개의 가격은 3000원입니다.");
							cost += 3000;
						}else if(amount == 4) {
							System.out.println("고기만두 4개의 가격은 4000원입니다.");
							cost += 4000;
						}else if(amount == 5) {
							System.out.println("고기만두 5개의 가격은 5000원입니다.");
							cost += 5000;
						}
				}else if(meatOrKimchiSelect == 2) {
					System.out.println("김치만두를 선택하셨습니다. 김치만두 1개의 가격은 1000원입니다.");
					
					System.out.print("몇개를 드시겠습니까?(최대 1번 주문시 5개까지 주문 가능) : ");
					int amount = scanner.nextInt();
					
					if(amount == 1) {
						System.out.println("김치만두 1개의 가격은 1000원입니다.");
						cost += 1000;
					}else if(amount == 2) {
						System.out.println("김치만두 2개의 가격은 2000원입니다.");
						cost += 2000;
					}else if(amount == 3) {
						System.out.println("김치만두 3개의 가격은 3000원입니다.");
						cost += 3000;
					}else if(amount == 4) {
						System.out.println("김치만두 4개의 가격은 4000원입니다.");
						cost += 4000;
					}else if(amount == 5) {
						System.out.println("김치만두 5개의 가격은 5000원입니다.");
						cost += 5000;
					}
				}
			}else if(manduOrder == 4) {
				System.out.println("총 리스트 장바구니에 담긴 만두의 비용은 " + cost + "원입니다.");
				System.out.print("얼마를 지불하시겠습니까? ");
				int userCost = scanner.nextInt();
				
				if(userCost > cost) {
					System.out.println("결제가 완료되었습니다.");
					System.out.println("거스름돈 " + (userCost - cost) + "원이 반환되었습니다.");
					break;
				}else if(userCost == cost) {
					System.out.println("결제가 완료되었습니다.");
					break;
				}else if(userCost < cost) {
					System.out.println("잔액이 부족하여 결제를 진행하실 수 없습니다.");
					continue;
				}
			}
		  }
		}else if(order.equals("아니오")) {
			System.out.println("주문하실 때 매장 점원을 불러주세요");
		}
		
		System.out.println("이용해주셔서 감사합니다.");
	}

}
