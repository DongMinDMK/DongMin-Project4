package pizzaOrderPractice;
import java.util.Scanner;

public class PizzaOrderPractice {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int cost = 0;
		
		System.out.println("안녕하세요 DMK피자점입니다.");
		while(true) {
			System.out.print("주문하시겠습니까?(네/아니오) : ");
			String yesorno = scanner.next();
			
			if(yesorno.equals("네")) {
				System.out.print("1. 고구마피자 2. 포테이토피자 3. 치즈피자 4. 총가격 중 원하시는 피자의 번호를 눌러주세요 : ");
				int pizzaSelect = scanner.nextInt();
				
				if(pizzaSelect == 1) {
					System.out.println("고구마피자를 선택하셨습니다.");
					System.out.print("고구마피자에는 치즈크러스트를 추가하실 수 있습니다. 추가하시겠습니까? (네/아니오) : ");
					String select = scanner.next();
					
					if(select.equals("네")) {
						System.out.println("고구마피자에 치즈크러스트를 추가한 가격은 11000원입니다.");
						cost += 11000;
					}else if(select.equals("아니오")) {
						System.out.println("고구마피자에 치즈크러스트를 추가하지 않은 가격은 8000원입니다.");
						cost += 8000;
					}
				}else if(pizzaSelect == 2) {
					System.out.println("포테이토피자를 선택하셨습니다.");
					System.out.print("포테이토피자에는 치즈크러스트를 추가하실 수 있습니다. 추가하시겠습니까? (네/아니오) : ");
					String select = scanner.next();
					
					if(select.equals("네")) {
						System.out.println("포테이토피자에 치즈크러스트를 추가한 가격은 13000원입니다.");
						cost += 13000;
					}else if(select.equals("아니오")) {
						System.out.println("포테이토피자에 치즈크러스트를 추가하지 않은 가격은 10000원입니다.");
						cost += 10000;
					}
				}else if(pizzaSelect == 3) {
					System.out.println("치즈피자를 선택하셨습니다.");
					System.out.print("치즈피자에는 치즈크러스트를 추가하실 수 있습니다. 추가하시겠습니까? (네/아니오) : ");
					String select = scanner.next();
					
					if(select.equals("네")) {
						System.out.println("치즈피자에 치즈크러스트를 추가한 가격은 10000원입니다.");
						cost += 10000;
					}else if(select.equals("아니오")) {
						System.out.println("치즈피자에 치즈크러스트를 추가하지 않은 가격은 7000원입니다.");
						cost += 7000;
					}
				}else if(pizzaSelect == 4) {
					System.out.println("총 가격은 현재 " + cost + "원이 나오셨습니다.");
					break;
				}
			}else if(yesorno.equals("아니오")) {
				System.out.println("주문하실 때 앞에 키오스크나 매장 내 점원을 호출해주세요.");
				continue;
			}
		}
		
		System.out.println("저희 매장은 선불제라 결제를 진행하시면 피자를 만들어서 갖다드리겠습니다.");
		System.out.println("이용해주셔서 감사합니다.");

	}

}
