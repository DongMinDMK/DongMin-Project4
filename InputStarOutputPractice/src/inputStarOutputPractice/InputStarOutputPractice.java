package inputStarOutputPractice;
import java.util.Scanner;

public class InputStarOutputPractice {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int i = 0;
		
		System.out.print("숫자를 여러 개 입력하세요 : ");
		String str = scanner.nextLine(); // 한 줄에 여러 개의 입력을 받을 때는 nextLine()을 이용
		
		char ch = str.charAt(i); //입력받은 문자열에서 한 글자, 즉 첫번째 글자를 뽑아서 ch 문자변수에 저장한다.
		
		while(true) {
			int star = (int) ch - 48; // 문자를 숫자로 강제형변환을 통해 변환한다. 이때 문자 4는 아스키코드 값이 52이므로 숫자 4로 만들려면 48을 뺀다.
			
			
			for(int j=0; j < star; j++)  // 강제형변환으로 나온 숫자를 star 변수에 넣었으면 그만큼 도는 반복문을 만든다.
				System.out.print("*"); // 그만큼 *을 출력한다.
			System.out.println();
				
			if(++i > str.length() - 1) //만약 i를 1 선증가 시킨 것이 전체 문자열 길이의 -1을 한 값보다 더 크면 while문을 종료하고 빠져나간다.
				break;
			
			ch = str.charAt(i); // 그 다음번의 문자 하나를 추출한다. 그리고 다시 반복문을 돈다.
			}
		}

}
