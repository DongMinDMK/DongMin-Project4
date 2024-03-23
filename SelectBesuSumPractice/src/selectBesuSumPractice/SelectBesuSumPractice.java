package selectBesuSumPractice;
import java.util.Scanner;

public class SelectBesuSumPractice {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int sum = 0;
		
		System.out.print("합하기 전 시작 값 : ");
		int start = scanner.nextInt();
		
		System.out.print("합하기 전 끝 값 : ");
		int end = scanner.nextInt();
		
		System.out.print("합할 때 필요한 배수 : ");
		int basu = scanner.nextInt();
		
		int i = start;
		while(i <= end) {
			if(i % basu == 0)
				sum += i;
			
			i++;
		}
		
		System.out.println(start + "부터 " + end + "까지의 " + basu + "의 배수의 합은 ? " + sum);
	}

}
