package layoutPractice2;
import java.awt.BorderLayout;

import javax.swing.*;

public class LayoutPractice2 extends JFrame{
	
	public LayoutPractice2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Layout연습 2");
		
		this.setLayout(new BorderLayout(10, 10)); //GUI에서 레이아웃 중 BorderLayout으로 레이아웃을 설정한다.
		
		JButton btn1 = new JButton("버튼1"); 
		this.add(btn1, BorderLayout.NORTH); //버튼1을 북쪽에 하나 배치
		
		JButton btn2 = new JButton("버튼2");
		this.add(btn2, BorderLayout.WEST); //버튼2를 서쪽에 하나 배치
		
		JButton btn3 = new JButton("버튼3");
		this.add(btn3, BorderLayout.CENTER); //버튼3을 가운데에 하나 배치
		
		JButton btn4 = new JButton("버튼4");
		this.add(btn4, BorderLayout.EAST); //버튼4을 동쪽에 하나 배치
		
		JButton btn5 = new JButton("버튼5");
		this.add(btn5, BorderLayout.SOUTH); //버튼5을 남쪽에 하나 배치
		
		setVisible(true);
		setSize(300, 300);
		
		
	}

	public static void main(String[] args) {
		new LayoutPractice2();
		
		
	}

}
