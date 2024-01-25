package repeatSumPractice;
import java.util.Scanner;

public class RepeatSumPractice {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int sum = 0;
		
		System.out.print("시작 값 : ");
		int start = scanner.nextInt();
		
		
		System.out.print("끝 값 : ");
		int end = scanner.nextInt();
		
		
		System.out.print("배수 : ");
		int besu = scanner.nextInt();
		
		int i = start;
		
		while(i <= end) {
			if(i % besu == 0) //나머지가 없는 0이면
				sum = sum + i;
			
			i++;
		}
		
		System.out.println(start + "부터 " + end + "까지의 " + besu + "배수 합계는 " + sum);
		

	}

}
