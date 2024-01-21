package hashMapPractice;

import java.util.HashMap;
import java.util.Map;

public class HashMapPractice {

	public static void main(String[] args) {
		
		System.out.println("2024년 카타르 아시안컵 대한민국 주요 선수를 HashMap으로 소개하기");
		
		Map<Integer, String> map = new HashMap<Integer, String>();
		
		//put을 이용한 삽입
		//HashMap은 키와 값으로 이루어지지만 여기서 키는 정수로 대표적인 선수 등번호로 설정
		
		map.put(4, "김민재");
		map.put(7, "손흥민");
		map.put(10, "이재성");
		map.put(11, "황희찬");
		map.put(18, "이강인");
		
		//remove를 이용한 삭제
		map.remove(10); //즉 10번 키를 가진 value 삭제
		
		//get을 이용한 키를 호출하여 값을 출력
		
		System.out.print("2024 카타르 아시안컵에 출전하는 대한민국 대표적인 선수 : " + map.get(4) + ", " + map.get(7) + ", " + map.get(11) + ", " + map.get(18));
		
		System.out.println();

		Map<Integer, String> map1 = new HashMap<Integer, String>();
		
		map1.put(4, "월클 수비수");
		map1.put(7, "아시아에서 가장 유명한 월클 공격수");
		map1.put(11, "EPL에서 현재 최고의 활약을 펼치고 있는 선수");
		map1.put(18, "한국의 메시");
		
		System.out.println("각각 선수별 별명은 4번은 " + map1.get(4) + ", 7번은 " + map1.get(7) + ", 11번은 " + map1.get(11) + ", 18번은 " + map1.get(18));
	}

}
