package swingComponentPractice;
import java.awt.*;
import javax.swing.*;


public class SwingComponentPractice extends JFrame {
	
	public SwingComponentPractice() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("JComponent 클릭하여 효과 적용하기");
		
		Container c = this.getContentPane(); //JFrame 컨테이너의 색깔을 넣기 위하여 pane을 getContentPane()으로 구함.
		c.setBackground(Color.DARK_GRAY);
		
		this.setLayout(new FlowLayout());
		
		JButton btn1 = new JButton("버튼1");
		btn1.setBackground(Color.BLUE); //버튼의 배경색을 파랑색으로 설정
		btn1.setForeground(Color.WHITE); //버튼의 글씨체를 흰색으로 설정
		this.add(btn1);
		
		JButton btn2 = new JButton("버튼2");
		btn2.setFont(new Font("맑은고딕", Font.ITALIC, 40)); // 맑은 고딕체, 이텔릭으로, 사이즈 40짜리로 폰트를 지정한다.
		btn2.setCursor(new Cursor(Cursor.MOVE_CURSOR)); 
		btn2.setToolTipText("글씨가 크게 보입니다."); //툴팁텍스트를 설정
		
		this.add(btn2);
		
		JButton btn3 = new JButton("버튼3");
		btn3.setEnabled(false); //버튼을 비활성화 시킴.
		this.add(btn3);
		
		setSize(300, 300);
		setVisible(true);
		
		
	}

	public static void main(String[] args) {
		new SwingComponentPractice();

	}

}
