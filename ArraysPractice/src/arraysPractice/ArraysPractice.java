package arraysPractice;
import java.util.*;

public class ArraysPractice {

	public static void main(String[] args) {
		int[] arr = {1, 5, 8, 11, 7, 20, 8};
		int[] eqalArr = {1, 3, 5, 7, 9, 11, 13};
		
		int[] newArr = Arrays.copyOf(arr, arr.length); // 정수 arr 배열의 모든 길이 만큼 arr 배열을 복사한다.
		
		System.out.println("arr의 배열 : " + Arrays.toString(arr));
		
		arr[3] = 30; // 정수형 arr 배열의 인덱스 3번지에 있는 값 11을 30으로 바꿈.
		
		System.out.println("arr의 배열 : " + Arrays.toString(arr)); //인덱스 3번지가 바뀌고 난 값 출력
		System.out.println("newArr의 배열 : " + Arrays.toString(newArr)); // 바뀌기 전 정수형 arr 배열을 복사했으므로, 이전의 배열 값 출력
		
		Arrays.sort(arr); //정렬
		
		
		System.out.println("정수형 arr 배열을 정렬하고 나서 출력 : " + Arrays.toString(arr));
		
		boolean a = Arrays.equals(arr, eqalArr); // 정수형 arr과 eqalArr를 비교하여 같으면 true, 다르면 false 리턴
		
		System.out.println(a);
		
		
		
		
		
		
		

	}

}
