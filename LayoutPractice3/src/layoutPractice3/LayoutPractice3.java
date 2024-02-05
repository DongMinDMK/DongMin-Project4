package layoutPractice3;
import java.awt.*;
import javax.swing.*;

public class LayoutPractice3 extends JFrame {
	
	public LayoutPractice3() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Layout 중 FlowLayout 해보기");
		
		this.setLayout(new FlowLayout()); //layout 중 FlowLayout으로 설정
		// FlowLayout은 JComponent를 설정하면 왼쪽부터 오른쪽으로 하나씩 세팅된다.
		
		JButton btn1 = new JButton("버튼1");
		this.add(btn1);
		
		JButton btn2 = new JButton("버튼2");
		this.add(btn2);
		
		JButton btn3 = new JButton("버튼3");
		this.add(btn3);
		
		JButton btn4 = new JButton("버튼4");
		this.add(btn4);
		
		JButton btn5 = new JButton("버튼5");
		this.add(btn5);
		
		JButton btn6 = new JButton("버튼6");
		this.add(btn6);
		
		JButton btn7 = new JButton("버튼7");
		this.add(btn7);
		
		JButton btn8 = new JButton("버튼8");
		this.add(btn8);
		
		JButton btn9 = new JButton("버튼9");
		this.add(btn9);
		
		JButton btn10 = new JButton("버튼10");
		this.add(btn10);
		
		JButton btn11 = new JButton("버튼11");
		this.add(btn11);
		
		
		setSize(400, 400);
		setVisible(true);
	}

	public static void main(String[] args) {
		new LayoutPractice3();

	}

}
