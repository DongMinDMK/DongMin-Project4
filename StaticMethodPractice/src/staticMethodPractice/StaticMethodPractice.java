package staticMethodPractice;
import java.util.Scanner;

public class StaticMethodPractice {
	
	public static int coffee_machine_method(int button) {
		System.out.println("#1. 뜨거운 물을 준비한다.");
		System.out.println("#2. 종이컵을 준비한다.");
		
		switch(button) {
		case 1:
			System.out.println("#3. 일반커피를 탄다.");
			break;
		case 2:
			System.out.println("#3. 믹스커피를 탄다.");
			break;
		case 3:
			System.out.println("#3. 블랙커피를 탄다.");
			break;
		default: //사용자가 4번을 입력할 때
			System.out.println("#3. 일반,믹스,블랙 커피 중 아무 커피나 골라서 탄다.");
			break;
		}
		
		System.out.println("#4. 종이컵에 물을 붓는다.");
		System.out.println("#5. 스푼으로 저어서 녹인다음 기계에서 나온 커피를 맛있게 먹는다.");
		 
		return 0; //자료형 int로 인해 리턴을 시켜야 하지만 딱히 리턴으로 받을 만 한게 없기 때문에 디폴트 값인 0을 리턴
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int coffee = 0;
		int returnValue = 0;
		
		System.out.print("손님. (1. 일반 2. 믹스 3. 블랙 4. 랜덤) 중 어느 커피를 드시겠나요? 드실 커피의 번호를 입력해주세요 : ");
		coffee = scanner.nextInt();
		
		returnValue = coffee_machine_method(coffee);
		
		System.out.println("맛있게 드셨나요? 온라인에서 후기를 남겨주세요!!");
		System.out.println("후기를 남기시면 이벤트 추첨을 통해 상당한 경품을 드립니다!");

	}

}
