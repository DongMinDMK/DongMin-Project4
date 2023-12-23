package stackPractice;

public class StackPractice {

	public static void main(String[] args) {
		char[] stackArray = new char[4];
		int top = 0;
		
		System.out.println("=== 간단한 스택 관련 연습코드 작성 ===");
		System.out.println();
		
		
		stackArray[top] = 'A'; //stackArray 문자형 배열에 0번지에 문자 'A'를 삽입
		System.out.printf("%c 가 문자형스택배열에 들어갔습니다...\n", stackArray[top]);
		top++; //문자형 배열에 데이터가 하나 들어갔으니 top을 하나 증가시킨다.
		
		stackArray[top] = 'B';
		System.out.printf("%c 가 문자형스택배열에 들어갔습니다...\n", stackArray[top]);
		top++;
		
		stackArray[top] = 'C';
		System.out.printf("%c 가 문자형스택배열에 들어갔습니다...\n", stackArray[top]);
		top++;
		
		System.out.println();
		
		//이제 빼내는 작업을 진행함.
		//이때 스택은 입구가 하나이기 때문에 제일 마지막에 들어간 데이터가 먼저 빠져나가는 LIFO 방식이다.
		
		top--;
		System.out.printf("%c 가 문자형스택배열에서 빠져나갔습니다...\n", stackArray[top]);
		stackArray[top] = ' '; //빈 공간임을 표현해주기 위해 공백으로 설정
		
		top--;
		System.out.printf("%c 가 문자형스택배열에서 빠져나갔습니다...\n", stackArray[top]);
		stackArray[top] = ' '; 
		
		top--;
		System.out.printf("%c 가 문자형스택배열에서 빠져나갔습니다...\n", stackArray[top]);
		stackArray[top] = ' '; 

	}

}
