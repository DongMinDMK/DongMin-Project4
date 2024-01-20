package stringBuilderPractice;

public class StringBuilderPractice {

	public static void main(String[] args) {
		
		//StringBuilder를 사용하는 이유는 그냥 String으로 가능하지만 String으로 사용할시 메모리 사용이 늘어나 메모리 낭비가 발생합니다.
		//따라서 StringBuilder 나 StringBuffer 클래스를 이용하여 가변으로 메모리를 조절할 수 있도록 설정하여 메모리 낭비를 줄입니다.
		
		StringBuilder sb = new StringBuilder("Hi, My name is ");
		
		sb.append("DMK!!"); // append는 문자열을 붙어주는 메소드
		System.out.println(sb);
		
		System.out.println("현재 문자열의 총 길이 : " + sb.length());
		
		sb.delete(0, 4); //0번지부터 3번지까지 즉 Hi, 를 삭제
		System.out.println(sb);
		
		System.out.println("현재 문자열의 총 길이 : " + sb.length());
		
		sb.insert(0, "Hello, "); //0번지에 Hello, 를 추가
		
		System.out.println(sb);
		
		System.out.println("현재 문자열의 총 길이 : " + sb.length());
		
		sb.reverse(); //현자 문자열을 거꾸로 출력하기 위해 reverse() 메소드를 사용
		
		System.out.println(sb);
		
		

	}

}
