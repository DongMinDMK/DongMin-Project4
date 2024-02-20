package mathOrderByPractice;

public class MathOrderByPractice {

	public static void main(String[] args) {
		Integer arr[] = {3, 5, 1, 6, 9};
		Integer max, min;
		
		System.out.print("정렬 하기 전 : ");
		for(int i=0; i<5; i++) 
			System.out.print(arr[i] + " ");
		
		for(int i=0; i<4; i++)
			for(int j=i; j<5; j++) { // 모든 값을 2개씩 비교하여 작은 값을 앞으로 이동.
				max = Math.max(arr[i], arr[j]);
				min = Math.min(arr[i], arr[j]);
				arr[i] = min;
				arr[j] = max;
			}
		
		System.out.println();
		
		System.out.print("정렬 한 후 : ");
		for(int i=0; i<5; i++)
			System.out.print(arr[i] + " ");
			
		

	}

}
