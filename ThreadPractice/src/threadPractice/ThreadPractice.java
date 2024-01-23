package threadPractice;

class Bank {
	int money;
	
	public int getMoney() {
		return money;
	}
	
	public synchronized void addMoney(int money) { 
		this.money += money;
	}
	
	//synchronized 동기화를 하는 이유는 임계구역을 설정하는 것입니다.
	// 따라서 synchronized 메소드를 할 수 있는 스레드가 진입하게 되면 락을 걸어 다른 스레드가 들어와서 수행하지 못하도록 막는 것입니다.
	// 먼저 진입한 스레드가 완료 후 종료되면 그 때 락을 풀고 다른 스레드가 하나 진입할 수 있게 만들어줍니다.
	// 동기화를 설정을 해야 다른 스레드로부터 작업을 처리하는 데 방해를 입지 않으므로 원하는 결과를 얻을 수 있습니다.
}

class AddThread implements Runnable{
	Bank bank;
	String name;
	
	public AddThread(Bank bank, String name) {
		this.bank = bank;
		this.name = name;
	}

	@Override
	public void run() { //Runnable 인터페이스에 존재하는 run() 메소드 오버라이딩
		try {
			for(int i=0; i<5; i++) {
				Thread.sleep(1000); // 1000으로 설정하면 1초라 생각하면됨.
				bank.addMoney(1000); //1초마다 뱅크라는 클래스에 1000원씩 누적합산.
				System.out.println(this.name + "님의 현재 통장 누적 잔고는 " + bank.getMoney() + "원입니다.");
				//2명을 합산하여 먼저 10000원에 진입한 사람이 승리.
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

public class ThreadPractice {

	public static void main(String[] args) {
		Bank bank = new Bank();
		
		Thread thread1 = new Thread(new AddThread(bank, "DMK"));
		Thread thread2 = new Thread(new AddThread(bank, "홍길동"));
		
		thread1.start();
		thread2.start();
		
		

	}

}
