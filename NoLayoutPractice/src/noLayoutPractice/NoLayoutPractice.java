package noLayoutPractice;
import javax.swing.*;

public class NoLayoutPractice extends JFrame {
	
	public NoLayoutPractice() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("레이아웃이 존재하지 않는 GUI");
		
		this.setLayout(null);
		
		JButton btn1 = new JButton("버튼1");
		btn1.setBounds(40, 40, 70, 60); //x,y좌표 (40,40)에 가로 70, 세로가 60인 버튼 1개 생성
		this.add(btn1);
		
		JButton btn2 = new JButton("버튼2");
		btn2.setBounds(70, 70, 70, 60); //x,y좌표 (70,70)에 가로 70, 세로가 60인 버튼 1개 생성
		this.add(btn2);
		
		JButton btn3 = new JButton("버튼3");
		btn3.setBounds(100, 100, 70, 60); //x,y좌표 (100,100)에 가로 70, 세로가 60인 버튼 1개 생성
		this.add(btn3);
		
		setSize(230, 230);
		setVisible(true);
	}

	public static void main(String[] args) {
		new NoLayoutPractice();

	}

}
