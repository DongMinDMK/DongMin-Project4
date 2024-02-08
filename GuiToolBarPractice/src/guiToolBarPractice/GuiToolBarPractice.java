package guiToolBarPractice;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class GuiToolBarPractice extends JFrame{
	
	public GuiToolBarPractice() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("GUI에서 메뉴바 만드는 연습하기");
		
		this.setLayout(new FlowLayout());
		
		JLabel label = new JLabel("글자가 바뀝니다.");
		this.add(label);
		
		JMenuBar mb = new JMenuBar();
		
		JMenu fileMenu = new JMenu("파일");
		JMenu saveMenu = new JMenu("저장");
		
		JMenuItem newItem = new JMenuItem("새 문서");
		JMenuItem openItem = new JMenuItem("열기");
		JMenuItem closeItem = new JMenuItem("닫기");
		JMenuItem savesItem = new JMenuItem("저장아템");
		
		setJMenuBar(mb);
		
		mb.add(fileMenu);
		mb.add(saveMenu);
		
		fileMenu.add(newItem);
		fileMenu.add(openItem);
		fileMenu.addSeparator(); //JMenuItem에서 분리할 수 있는 분리선 추가
		fileMenu.add(closeItem);
		saveMenu.add(savesItem);
		
		newItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				label.setText("[새 문서]를 선택했습니다. 글자가 바꼈죠?");
			}
		});
		
		openItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				label.setText("[열기]를 선택했습니다. 글자가 바꼈죠?");
			}
		});
		
		closeItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
		savesItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				label.setText("[저장]을 선택했습니다. 글자가 바꼈죠?");
			}
		});
		
		setSize(300, 300);
		setVisible(true);
		
		
	}

	public static void main(String[] args) {
		new GuiToolBarPractice();
	}

}
