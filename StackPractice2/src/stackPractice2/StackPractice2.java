package stackPractice2;
import java.util.Scanner;

public class StackPractice2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		char[] arr = new char[4];
		int index = 0;
		
		char personName = 'A';
		int select = 0;
		
		while(select != 3) { //선택이 3이 아니면
			System.out.print("(1)사람 들어감, (2)사람 나옴, (3)끝 : ");
			select = scanner.nextInt();
			
			switch(select){
				case 1:
					if(index >= 4) {
						System.out.println("DMK 상영관에 사람이 꽉 차 매진입니다.");
					}else {
						arr[index] = personName++;
						System.out.println(arr[index] + "가 상영관에 들어갑니다.");
						index++;
					}
					break;
				case 2:
					if(index <= 0) {
						System.out.println("아직 1명도 상영관에 관람객이 입장하지 않았습니다.");
					}else {
						index--;
						System.out.println(arr[index] + "사람이 상영관을 빠져나갑니다.");
						arr[index] = ' ';
					}
					break;
				case 3:
					System.out.println("현재 상영관에 관람객은 " + index + "명이 있습니다.");
					break;
				default:
					System.out.println("1,2,3 번중에 입력해주세요.");
					
			}
			
		}
		

	}

}
