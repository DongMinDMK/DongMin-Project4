package layoutPractice1;
import java.awt.*;
import javax.swing.*;

public class LayoutPractice1 extends JFrame {
	
	//GUI 환경의 Layout 중에서 GridLayout 연습하기
	
	public LayoutPractice1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //GUI 즉, JFrame 컨테이너 를 열었을 때 오른쪽 위에 X를 누르면 자동으로 프로그램도 같이 종료될 수 있도록 설정
		setTitle("GridLayout 레이아웃");
		
		this.setLayout(new GridLayout(3,3, 20, 20)); //레이아웃을 GridLayout으로 설정한다. 
		// 여기서(3,3,20,20) 의 의미는 3행 3열짜리를 만들고 수평간격 20, 수직간격 또한 20으로 설정한다.
		
		JButton[] btn = new JButton[9]; //9개의 칸의 배열을 가지는 JFrame 컨테이너에 들어갈 수 있는 컴포넌트 중 하나인 JButton을 생성
		
		for(int i=0; i<9; i++) {
			btn[i] = new JButton("버튼 생성 " + (i+1)); // 반복문을 이용하여 총 9개의 버튼을 생성한다. 3x3 으로.
			this.add(btn[i]); //각각 버튼을 하나씩 생성하고 JFrame 컨테이너에 붙이기 즉, 추가하기 위하여 이 코드를 작성.
		}
		
		setSize(400, 400); //JFrame 컨테이너의 사이즈 설정
		setVisible(true); //이것을 true로 설정해야 JFrame 컨테이너가 보임.
	}
	

	public static void main(String[] args) {
		new LayoutPractice1();

	}

}
