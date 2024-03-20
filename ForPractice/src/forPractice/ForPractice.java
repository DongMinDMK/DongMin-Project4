package forPractice;

public class ForPractice {

	public static void main(String[] args) {
		//간단한 반복문
		int sum = 0;
		int sum2 = 0;
		
		for(int i=1; i<10; i++)
			sum += i; //1부터 10까지의 합
		
		System.out.println("1부터 10까지의 합은 " + sum);
		
		
		for(int j=1; j<100; j++)
			sum2 += j;
		
		System.out.println("1부터 100까지의 합은 " + sum2);
			
	}

}
