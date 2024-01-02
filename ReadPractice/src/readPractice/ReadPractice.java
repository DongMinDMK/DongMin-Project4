package readPractice;

import java.io.IOException;

public class ReadPractice {

	public static void main(String[] args) {
		String uName = "DMK";
		String uName2 = "dmk";
		String input = "";
		int key;
		
		
		//System.in.read() 는 영어로만 입력 가능, 한글로는 Scanner로 입력해야 합니다.
		try {
			System.out.print("이름을 입력하세요 : ");
			while((key = System.in.read()) != 13) { //입력한 키가 아스키 코드 값으로 13이 아니면 무한 반복루트를 탄다.
				input += Character.toString((char)key); //정수형인 key를 문자형으로 강제타입변환하고, 문자형으로 변환된 키를 다시 문자열형인 input에 누적하기 위해 Character.toString을 사용하여 input에 
				// 사용자가 입력한 문자 대입
			}
			
			if(uName.equals(input) || uName2.equals(input))
				System.out.println(input + "님 로그인 되셨습니다. 환영합니다!!");
			else 
				System.out.println(input + "님은 데이터베이스에 등록이 되어 있지 않습니다. ㅠㅠ");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
