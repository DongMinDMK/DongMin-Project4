package inputTwoArrayPractice;
import java.util.Scanner;

public class InputTwoArrayPractice {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("행 개수 입력 : ");
		int row = scanner.nextInt();
		
		System.out.print("열 개수 입력 : ");
		int col = scanner.nextInt();
		
		System.out.println("이제 " + row + " x " + col + " 짜리 2차원 배열이 만들어집니다.");
		
		int [][] arr = new int [row][col];
		
		int cnt = 1;
		
		for(int i=0; i<row; i++) {
			for(int j=0; j<col; j++) {
				arr[i][j] = cnt;
				cnt++;
			}
		}
		
		System.out.println("arr[0][0] 부터 arr[" + row + "][" + col + "] 까지 출력됩니다.");
		
		for(int i=0; i<row; i++) {
			for(int j=0; j<col; j++) {
				System.out.printf("%5d", arr[i][j]);
			}
			
			System.out.println();
		}
		
	}

}
