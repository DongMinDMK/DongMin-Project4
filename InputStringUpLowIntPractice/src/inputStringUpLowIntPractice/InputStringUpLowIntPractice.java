package inputStringUpLowIntPractice;
import java.util.Scanner;

public class InputStringUpLowIntPractice {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int upperCount = 0 , lowerCount = 0, intCount = 0;
		
		int i=0;
		
		System.out.print("문자열을 입력하세요 : ");
		String str = scanner.nextLine();
		
		do {
			char ch = str.charAt(i);
			
			if(ch >= 'A' && ch <= 'Z')  //만약 입력받은 문자열 중 하나를 뽑아서 그것이 대문자 A~Z 사이에 있다면
				upperCount++; //upperCount를 하나 증가
			
			if(ch >= 'a' && ch <= 'z') //만약 입력받은 문자열 중 하나를 뽑아서 그것이 소문자 a~z 사이에 있다면
				lowerCount++; //lowerCount를 하나 증가
			
			if(ch >= '0' && ch <= '9') //만약 입력받은 문자열 중 하나를 뽑아서 그것이 숫자 0~9 사이에 있다면
				intCount++; //intCount를 하나 증가
			
			i++;
		}while(i < str.length()); //만약 증가하는 i 보다 입력한 문자열의 길이가 더 크면 비로소 do~while문을 빠져나온다.
		
		System.out.println("총 대문자 수는 " + upperCount + "개, 소문자 수는 " + lowerCount + "개, 숫자는 " + intCount + "개 입니다.");

	}

}
