package startEndPractice;
import java.util.Scanner;

public class StartEndPractice {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("문장 입력 : ");
		String str = scanner.nextLine();
		
		System.out.print("출력 문자열 --> ");
		if(!str.startsWith("[")) //만약 입력받은 str 문자열 변수가 "[" 로 시작하지 않는다면
			System.out.print("[");
		
		for(int i=0; i<str.length(); i++) {
			char a = str.charAt(i);
			System.out.print(a);
		}
		
		if(!str.endsWith("]")) //만약 입력받은 str 문자열 변수가 "]" 로 시작하지 않는다면
			System.out.println("]");
		
		System.out.print("두번째 문장 입력 : ");
		String str2 = scanner.nextLine();
		
		System.out.print("출력 문자열 --> ");
		if(!str2.startsWith("(")) //만약 입력받은 str2 문자열 변수가 "(" 로 시작하지 않는다면
			System.out.print("(");
		
		for(int i=0; i<str2.length(); i++) {
			char a = str2.charAt(i);
			System.out.print(a);
		}
		
		if(!str2.endsWith(")")) //만약 입력받은 str2 문자열 변수가 ")" 로 시작하지 않는다면
			System.out.println(")");
		
		

	}

}
