package charAsciiCodePractice;

public class CharAsciiCodePractice {

	public static void main(String[] args) {
		
		
		char a = 'A';
		System.out.printf(" %c\t", a); //문자형 변수 a를 문자로 출력
		System.out.printf(" %d\n", (int)a); // 문자형 변수 a를 정수로 강제 캐스팅하여 출력(대문자 A는 10진수로 65)
		
		char b = 'a';
		
		char c = (char)(b + 1); // 문자형 변수 c는 문자형 변수 b인 소문자 'a'에 1을 더하여 문자형으로 강제 형변환하여 출력(즉 a의 다음인 소문자 'b'출력)
		
		System.out.printf(" %c\t", b);
		
		System.out.printf(" %c\n", c);
		
		char d = 90;
		System.out.printf(" %c\n", d); // 숫자 90으로 선언된 변수 d를 문자형으로 출력한다. (숫자 90은 문자로 대문자 'Z')
		
	}

}
