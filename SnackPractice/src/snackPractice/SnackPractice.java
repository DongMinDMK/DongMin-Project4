package snackPractice;
import java.util.Scanner;

public class SnackPractice {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int cost = 0;
		int count = 0;
		
		while(true) {
			System.out.println("안녕하세요 과자를 파는 DMK 과자 전문점입니다.");
			System.out.println("아래 과자의 번호를 보시고 원하시는 과자의 번호를 눌러주시면 됩니다.");
			System.out.print("1. 스윙칩 2. 포카칩 3. 조청유과 4. 썬칩 5. 오감자 6. 새우깡 7. 매운새우깡 8. 다고름 중 원하시는 과자의 번호를 눌러주세요 : ");
			int snackSelect = scanner.nextInt();
			
			if(snackSelect == 1) {
				System.out.println("스윙칩을 선택하셨습니다.");
				System.out.print("과자는 S/M/L 사이즈가 준비되어 있습니다. 사이즈를 선택해주세요(S/M/L) : ");
				String sizeSelect = scanner.next();
				
				if(sizeSelect.equals("S") || sizeSelect.equals("s")) {
					System.out.println("스윙칩 S 사이즈의 가격은 1300원입니다.");
					cost += 1300;
					count++;
				}else if(sizeSelect.equals("M") || sizeSelect.equals("m")) {
					System.out.println("스윙칩 M 사이즈의 가격은 2000원입니다.");
					cost += 2000;
					count++;
				}else if(sizeSelect.equals("L") || sizeSelect.equals("l")) {
					System.out.println("스윙칩 L 사이즈의 가격은 3000원입니다.");
					cost += 3000;
					count++;
				}
			}else if(snackSelect == 2) {
				System.out.println("포카칩을 선택하셨습니다.");
				System.out.print("과자는 S/M/L 사이즈가 준비되어 있습니다. 사이즈를 선택해주세요(S/M/L) : ");
				String sizeSelect = scanner.next();
				
				if(sizeSelect.equals("S") || sizeSelect.equals("s")) {
					System.out.println("포카칩 S 사이즈의 가격은 1300원입니다.");
					cost += 1300;
					count++;
				}else if(sizeSelect.equals("M") || sizeSelect.equals("m")) {
					System.out.println("포카칩 M 사이즈의 가격은 2000원입니다.");
					cost += 2000;
					count++;
				}else if(sizeSelect.equals("L") || sizeSelect.equals("l")) {
					System.out.println("포카칩 L 사이즈의 가격은 3000원입니다.");
					cost += 3000;
					count++;
				}
			}else if(snackSelect == 3) {
				System.out.println("조청유과를 선택하셨습니다.");
				System.out.print("과자는 S/M/L 사이즈가 준비되어 있습니다. 사이즈를 선택해주세요(S/M/L) : ");
				String sizeSelect = scanner.next();
				
				if(sizeSelect.equals("S") || sizeSelect.equals("s")) {
					System.out.println("조청유과 S 사이즈의 가격은 1500원입니다.");
					cost += 1500;
					count++;
				}else if(sizeSelect.equals("M") || sizeSelect.equals("m")) {
					System.out.println("조청유과 M 사이즈의 가격은 2200원입니다.");
					cost += 2200;
					count++;
				}else if(sizeSelect.equals("L") || sizeSelect.equals("l")) {
					System.out.println("조청유과 L 사이즈의 가격은 3200원입니다.");
					cost += 3200;
					count++;
				}
			}else if(snackSelect == 4) {
				System.out.println("썬칩을 선택하셨습니다.");
				System.out.print("과자는 S/M/L 사이즈가 준비되어 있습니다. 사이즈를 선택해주세요(S/M/L) : ");
				String sizeSelect = scanner.next();
				
				if(sizeSelect.equals("S") || sizeSelect.equals("s")) {
					System.out.println("썬칩 S 사이즈의 가격은 1300원입니다.");
					cost += 1300;
					count++;
				}else if(sizeSelect.equals("M") || sizeSelect.equals("m")) {
					System.out.println("썬칩 M 사이즈의 가격은 2000원입니다.");
					cost += 2000;
					count++;
				}else if(sizeSelect.equals("L") || sizeSelect.equals("l")) {
					System.out.println("썬칩 L 사이즈의 가격은 3000원입니다.");
					cost += 3000;
					count++;
				}
			}else if(snackSelect == 5) {
				System.out.println("오감자를 선택하셨습니다.");
				System.out.print("과자는 S/M/L 사이즈가 준비되어 있습니다. 사이즈를 선택해주세요(S/M/L) : ");
				String sizeSelect = scanner.next();
				
				if(sizeSelect.equals("S") || sizeSelect.equals("s")) {
					System.out.println("오감자 S 사이즈의 가격은 1600원입니다.");
					cost += 1600;
					count++;
				}else if(sizeSelect.equals("M") || sizeSelect.equals("m")) {
					System.out.println("오감자 M 사이즈의 가격은 2400원입니다.");
					cost += 2400;
					count++;
				}else if(sizeSelect.equals("L") || sizeSelect.equals("l")) {
					System.out.println("오감자 L 사이즈의 가격은 3500원입니다.");
					cost += 3500;
					count++;
				}
			}else if(snackSelect == 6) {
				System.out.println("새우깡을 선택하셨습니다.");
				System.out.print("과자는 S/M/L 사이즈가 준비되어 있습니다. 사이즈를 선택해주세요(S/M/L) : ");
				String sizeSelect = scanner.next();
				
				if(sizeSelect.equals("S") || sizeSelect.equals("s")) {
					System.out.println("새우깡 S 사이즈의 가격은 1800원입니다.");
					cost += 1800;
					count++;
				}else if(sizeSelect.equals("M") || sizeSelect.equals("m")) {
					System.out.println("새우깡 M 사이즈의 가격은 2200원입니다.");
					cost += 2200;
					count++;
				}else if(sizeSelect.equals("L") || sizeSelect.equals("l")) {
					System.out.println("새우깡 L 사이즈의 가격은 3200원입니다.");
					cost += 3200;
					count++;
				}
			}else if(snackSelect == 7) {
				System.out.println("매운 새우깡을 선택하셨습니다.");
				System.out.print("과자는 S/M/L 사이즈가 준비되어 있습니다. 사이즈를 선택해주세요(S/M/L) : ");
				String sizeSelect = scanner.next();
				
				if(sizeSelect.equals("S") || sizeSelect.equals("s")) {
					System.out.println("매운 새우깡 S 사이즈의 가격은 1800원입니다.");
					cost += 1800;
					count++;
				}else if(sizeSelect.equals("M") || sizeSelect.equals("m")) {
					System.out.println("매운 새우깡 M 사이즈의 가격은 2200원입니다.");
					cost += 2200;
					count++;
				}else if(sizeSelect.equals("L") || sizeSelect.equals("l")) {
					System.out.println("매운 새우깡 L 사이즈의 가격은 3200원입니다.");
					cost += 3200;
					count++;
				}
			}else if(snackSelect == 8) {
				break;
			}
		}
		
		System.out.println("총 과자는 " + count + "개를 고르셨고, 총 가격은 " + cost + "원입니다.");
		System.out.println("이용해주셔서 감사합니다.");
	}

}
