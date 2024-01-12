package evenArrayPractice;

public class EvenArrayPractice {

	public static void main(String[] args) {
		
		int[] intArray = new int[10];
		
		for(int i=0; i<intArray.length; i++) {
			intArray[i] = (int)(Math.random()*20) + 1; //Math.random 함수를 이용하여 1~20까지 정수 중 랜덤으로 10개 도출
		}
		
		int sum = 0;
		for(int i=0; i<intArray.length; i++) {
			if(intArray[i] % 2 == 0) { // 랜덤으로 뽑은 정수형 배열 10개 중 2로 나누어 떨어지는 즉, 2로 나누었을 때 나머지가 0인 짝수이면
				sum += intArray[i]; // 그 짝수를 sum에 누적하여 더함.
			}
		}
		
		for(int i=0; i<intArray.length; i++) {
			System.out.print(intArray[i] + " "); //위에 랜덤으로 10개 뽑은 정수를 intArray[] 배열에 집어넣었는데, 그 정수들을 10개 출력
		}
		
		System.out.println(); 
		System.out.println("정수 배열의 랜덤으로 뽑은 짝수의 합 : " + sum);

	}

}
