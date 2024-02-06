package guiEventPractice;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class GuiEventPractice extends JFrame {
	
	public GuiEventPractice() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("마우스를 클릭하면 클릭된 위치의 좌표를 보여주기");
		this.setLayout(new FlowLayout());
		
		JTextField txt1 = new JTextField(10); //텍스트필드 컴포넌트 1개 생성
		JTextField txt2 = new JTextField(10); //텍스트필드 컴포넌트 1개 생성
		
		this.add(txt1);
		this.add(txt2);
		
		this.addMouseListener(new MouseListener(){ //Listener로 선언하면 이렇게 안쓰는 메소드도 다같이 선언해야 하는 단점이 있음.
			// MouseAdapter를 이용하면 이용할 메소드만 적어도 됨. 일단 MouseListener를 사용하여 코드를 작성하고 싶어서 작성.
			public void mouseClicked(MouseEvent e) {
				txt1.setText(Integer.toString(e.getX()));
				txt2.setText(Integer.toString(e.getY()));
			} //mouseClicked 메소드 즉 마우스가 클릭하는 시점에 getX() 메소드를 통해 x 좌표를 반환하고, getY() 메소드를 통해 y 좌표를 반환한다.
			// 이것을 텍스트 필드에 넣는데 정수가 아닌 문자열로 바꿔서 저장한다.
			
			public void mouseEntered(MouseEvent e) {
				
			}
			
			public void mouseExited(MouseEvent e) {
				
			}
			
			public void mousePressed(MouseEvent e) {
				
			}
			
			public void mouseReleased(MouseEvent e) {
				
			}
		});
		
		setSize(400, 300);
		setVisible(true);
	}

	public static void main(String[] args) {
		new GuiEventPractice();

	}

}
