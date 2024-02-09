package guiBackgroundPractice;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class GuiBackgroundPractice extends JFrame {
	
	public GuiBackgroundPractice() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("버튼을 클릭하면 버튼 색깔이 변하는 GUI");
		
		this.setLayout(new FlowLayout());
		
		JButton btn1 = new JButton("버튼1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn1.setBackground(Color.BLUE); //사용자가 버튼을 눌렀을 때 버튼 백그라운드 색을 파랑색으로 변경 
			}
		});
		
		this.add(btn1);
		setSize(500, 500);
		setVisible(true);
	}

	public static void main(String[] args) {
		new GuiBackgroundPractice();

	}

}
