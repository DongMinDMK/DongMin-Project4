package multiThreadPractice;

public class MultiThreadPractice {

	public static void main(String[] args) {
		
		Runnable swim = () -> {
			while(true) {
				System.out.println("수영!!");
			}
		};
		
		Runnable soccer = () -> {
			while(true) {
				System.out.println("축구!!");
			}
		};
		
		Runnable basketball = () -> {
			while(true) {
				System.out.println("농구!!");
			}
		};
		
		Runnable baseball = () -> {
			while(true) {
				System.out.println("야구!!");
			}
		};
		
		Runnable tableTennis = () -> {
			while(true) {
				System.out.println("탁구!!");
			}
		};
		
		Thread swimThread = new Thread(swim);
		Thread soccerThread = new Thread(soccer);
		Thread basketballThread = new Thread(basketball);
		Thread baseballThread = new Thread(baseball);
		Thread tableTennisThread = new Thread(tableTennis);
		
		swimThread.start();
		soccerThread.start();
		basketballThread.start();
		baseballThread.start();
		tableTennisThread.start();
		
		

	}

}
