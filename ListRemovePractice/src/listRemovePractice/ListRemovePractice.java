package listRemovePractice;

import java.util.ArrayList;
import java.util.List;

public class ListRemovePractice {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		
		for(int i=1; i<=5; i++) {
			int tempInt = 2*i; //반복문을 이용하여 2단의 1부터 5까지의 결과를 tempInt 정수형 변수에 하나씩 대입
			list.add(tempInt); // 그 대입한 수를 하나씩 list에 추가
		}
		
		System.out.println("현재 리스트의 값 : " + list);
		
		list.remove(2); //인덱스 2번의 값 즉 6을 지움. 이것을 호출하면 현재 예상 리스트 결과값은 [2, 4, 8, 10] 
		list.remove(3); //인덱스 3번의 값 즉 10을 지움. 이 상태에서 호출하면 예상 리스트 결과 값은 [2, 4, 8]
		
		System.out.println("지우고 나서 리스트 값 : " + list);
		
		list.add(12);
		list.add(14);
		
		System.out.println("리스트에 값을 추가한 후 현재 리스트 값 : " + list);
		
		System.out.println("현재 리스트 사이즈 : " + list.size());
		

	}

}
