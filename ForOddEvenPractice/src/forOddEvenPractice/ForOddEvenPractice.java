package forOddEvenPractice;

public class ForOddEvenPractice {

	public static void main(String[] args) {
		int oddSum = 0;
		int evenSum = 0;
		int oddSum2 = 0;
		int evenSum2 = 0;
		
		for(int i=1; i<100; i++) {
			if(i % 2 == 1) { // 정수를 2로 나누었을 때 나머지가 1, 즉 홀수이면
				oddSum += i;
			}
		}
		
		System.out.println("홀수의 합 : " + oddSum);
		
		for(int j=1; j<100; j++) {
			if(j % 2 == 0) { // 정수를 2로 나누었을 때 나머지가 0, 즉 짝수이면
				evenSum += j;
			}
		}
		
		System.out.println("짝수의 합 : " + evenSum);
		
		System.out.println("홀수의 합과 짝수의 합을 더한 합 : " + (oddSum + evenSum));
		
		
		for(int i=1; i<10; i++) {
			if(i%2 == 1) {
				oddSum2 += i;
			}
		}
		
		System.out.println("1부터 10까지 중 홀수만을 더한 값 : " + oddSum2);
		
		for(int j=1; j<10; j++) {
			if(j%2 == 0) {
				evenSum2 += j;
			}
		}
		
		System.out.println("1부터 10까지 중 짝수만을 더한 값 : " + evenSum2);
		
	}

}
