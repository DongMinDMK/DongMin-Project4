package scannerPractice;
import java.util.Scanner;

public class ScannerPractice {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("간단한 인적사항을 체크합니다.");
		
		System.out.print("이름을 입력해주세요 : ");
		String name = scanner.next();
		
		System.out.print("나이를 입력하세요 : ");
		int age = scanner.nextInt();
		
		System.out.print("성별을 입력하세요 : ");
		String gender = scanner.next();
		
		scanner.nextLine();
		
		System.out.print("주소를 입력하세요 : ");
		String address = scanner.nextLine();
		
		System.out.println("총 합산한 결과 " + name  + "님의 나이는 " + age + "이고, 성별은 " + gender + "이시며, 주소는 " + address + " 입니다.");
	}

}
