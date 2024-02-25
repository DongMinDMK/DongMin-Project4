package fileReadMethodPractice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class FileReadMethodPractice {

	public static void main(String[] args) {
		int read = 0; // 파일을 읽어올 변수를 선언
		
		InputStream in = null;
		
		try {
			in = new FileInputStream("my_file.txt"); // FileInputStream을 통해 my_file.txt에 있는 파일을 읽어 in 변수에 저장한다.
			while(true) {
				read = in.read(); // in 변수의 read() 메소드를 통해 파일을 정확히 읽고 read라는 정수 변수에 저장한다.
				 
				if(read == -1) { //정수로 저장된 read 변수에서 즉 텍스트 파일에 이제 읽을 데이터가 없다면 -1을 반환해주기 때문에 -1을 넣으면 이 반복문을 빠져나갈 수 있게 설정
					break;
				}
				
				System.out.print((char) read); // 문자열로 강제형변환 하여 read에 저장된 문자들을 하나씩 출력한다.
			}
		} catch (IOException e) {
			System.out.println("에러 발생 사유 : " + e.getMessage());
		} finally {
			try {
				if(in != null) { //마지막으로 다 처리하고 InputStream in 변수가 null이 아니면
					in.close(); // in을 닫는다.
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

}
