package sumArrayPractice;
import java.util.Scanner;

public class SumArrayPractice {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] array = new int[5];
		
		System.out.print("더할 첫번째 숫자를 입력 : ");
		array[0] = scanner.nextInt();
		
		System.out.print("더할 두번째 숫자를 입력 : ");
		array[1] = scanner.nextInt();
		
		System.out.print("더할 세번째 숫자를 입력 : ");
		array[2] = scanner.nextInt();
		
		System.out.print("더할 네번째 숫자를 입력 : ");
		array[3] = scanner.nextInt();
		
		System.out.print("더할 다섯번째 숫자를 입력 : ");
		array[4] = scanner.nextInt();
		
		int sum = array[0] + array[1] + array[2] + array[3] + array[4];
		
		System.out.println("총 합계는 " + sum);

	}

}
