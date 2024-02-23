package threadSleepPractice;

class SleepThread extends Thread{

	@Override
	public void run() { // 스레드라는 부모 클래스에서 run() 메소드를 오버라이딩 받아 SleepThread 에 재정의하는 코드를 작성한다.
		for(int i=0; i<30; i++) {
			System.out.println("스레드를 출력합니다....(" + (i+1) + ")"); // 1~30까지 스레드를 반복한다. 1초 간격으로
			
			try {
				Thread.sleep(1000); //1000으로 스레드를 sleep로 지정하면 1초마다 스레드가 정지함.
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				System.out.println("스레드 sleep 에러입니다.");
			}
			
		}
	}
	
}

public class ThreadSleepPractice {

	public static void main(String[] args) {
		SleepThread st = new SleepThread();
		st.start();

	}

}
