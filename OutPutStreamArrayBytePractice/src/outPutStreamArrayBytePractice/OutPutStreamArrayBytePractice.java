package outPutStreamArrayBytePractice;
import java.io.*;

public class OutPutStreamArrayBytePractice {

	public static void main(String[] args) {
		OutputStream op = null;
		
		try {
			op = new FileOutputStream("write_text_array.txt", false); // true로 설정하면 기존 파일에 이어서 내용을 추가, false면 디폴트값으로써 기존 내용 무시하고 새로 쓰게 됨.
			String str = "Hi!! My name is DMK! nice to meet you!!";
			
			byte[] arr = str.getBytes(); //문장을 바이트 배열로 변환
			op.write(arr);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(op != null) {
					op.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
				
		}
		

	}

}
