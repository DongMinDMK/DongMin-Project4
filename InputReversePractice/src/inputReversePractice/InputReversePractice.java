package inputReversePractice;
import java.util.Scanner;

class Character{
	char ch;
}

public class InputReversePractice {
	
	public static void swapping(Character x, Character y) {
		char ch2;
		
		//입력받은 문자를 앞 뒤로 바꾼다.
		// 앞 뒤로 바뀔 때 식은 밑에 참고!
		
		ch2 = x.ch;
		x.ch = y.ch;
		y.ch = ch2; 
		
	}

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		Character ch1 = new Character();
		Character ch2 = new Character();
		
		System.out.print("문자 1개 입력 : ");
		ch1.ch = (scanner.nextLine()).charAt(0); //한 줄을 입력받고 그 한줄에서 제일 첫번째로 나오는 문자를 ch1.ch 변수에 대입
		
		System.out.print("문자 1개를 추가로 입력 : ");
		ch2.ch = (scanner.nextLine()).charAt(0); // 위와 같은 방법으로 ch2.ch 변수에 대입
		
		swapping(ch1, ch2); //입력받은 2개의 문자를 swapping 정적메소드로 파라미터 매개변수로 던져서 호출
		
		System.out.println("문자가 바뀌었습니다.");
		System.out.println("바뀐 문자는 --> " + ch1.ch + "\t" + ch2.ch);
		
		
		

	}

}
