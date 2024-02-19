package guiJListAndJComboBoxPractice;
import java.awt.*;
import javax.swing.*;

public class GuiJListAndJComboBoxPractice extends JFrame{
	
	public GuiJListAndJComboBoxPractice() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("JList와 JComboBox를 이용한 간단한 GUI 만들기");
		
		this.setLayout(new FlowLayout());
		
		String[] sports = {"축구", "농구", "야구", "탁구", "배구"};
		
		JList list = new JList(sports);
		this.add(list);
		
		JComboBox jb = new JComboBox(sports);
		this.add(jb);
		
		setSize(300, 300);
		setVisible(true);
	}

	public static void main(String[] args) {
		new GuiJListAndJComboBoxPractice();

	}

}
