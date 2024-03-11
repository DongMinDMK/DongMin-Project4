package listPractice;
import java.util.*;

public class ListPractice {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		
		list.add("축구");
		list.add("야구");
		list.add("농구");
		list.add("수영");
		
		System.out.println("스포츠 종목들 : " + list);
		
		list.add(3, "배구"); //농구와 수영 사이에 3번째 인덱스에 배구 추가삽입
		
		System.out.println("스포츠 종목들(배구 추가) : " + list);
		
		list.set(1, "야구(타자(공격), 투수(수비))"); //1번 인덱스인 야구의 값을 변경(치환)
		
		System.out.println("치환 후 스포츠 종목들 : " + list);
		
		list.remove(2); //인덱스 2번인 농구의 리스트를 지움.
		
		System.out.println("종목 1개 삭제 후 스포츠 종목들 : " + list);
		
		System.out.println();
		
		for(int i=0; i<list.size(); i++) {
			String sport = list.get(i);
			
			System.out.println(sport);
		}
		

	}

}
