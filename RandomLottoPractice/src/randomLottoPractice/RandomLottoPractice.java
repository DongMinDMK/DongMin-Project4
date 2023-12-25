package randomLottoPractice;

public class RandomLottoPractice {
	
	static short getNumberMethod() {
		return (short)(Math.random() * 30 + 1); //1~30까지 중 랜덤으로 숫자를 뽑아 반환시켜주는 getNumberMethod 정적 메소드
	}

	public static void main(String[] args) {
		short[] randomArray = {0, 0, 0, 0, 0};
		char numberCheck = 'N'; //랜덤으로 뽑은 숫자가 이미 뽑은 숫자인지를 확인하기 위한 numberCheck 문자 변수 생성(기본 디폴트 값 'N'으로 설정)
		
		System.out.println("*** 로또 랜덤추첨을 시작하도록 하겠습니다 ***");
		
		for(short i=0; i<5;) {
			short number = getNumberMethod(); //랜덤으로 1~30까지 숫자 중 하나를 뽑아 int형 number에 넣는다.
			
			for(short k=0; k<5; k++) 
				if(randomArray[k] == number)
					numberCheck = 'Y'; //랜덤으로 뽑은 숫자가 randomArray 배열의 있는 기존 숫자와 동일하면 numberCheck을 Y로 설정
				
				if(numberCheck == 'N')
					randomArray[i++] = number;
				else
					numberCheck = 'N'; // 뽑은 숫자가 처음에 뽑은 숫자라면 randomArray 배열에 넣고 i를 증가시킨다. 이게 아니면 numberCheck에 'N'을 대입한다.
		
		}
		
		System.out.print("랜덤으로 추첨된 5개의 번호 : ");
		for(short i=0; i<5; i++) {
			System.out.print(randomArray[i] + " ");
		}

	}

}
