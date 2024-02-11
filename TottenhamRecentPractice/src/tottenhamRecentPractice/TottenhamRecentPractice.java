package tottenhamRecentPractice;
import java.util.Scanner;

public class TottenhamRecentPractice {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("토트넘의 기록(24.02.11 기준)을 보시겠습니까?(네/아니오) : ");
		String yesorno = scanner.next();
		
		if(yesorno.equals("네")) {
			System.out.print("1. 최근경기 2. 예정경기 3. 토트넘 2023/24시즌 전적 4. 주장/부주장 중 원하시는 번호를 눌러주세요 : ");
			int totSelect = scanner.nextInt();
			
			if(totSelect == 1) {
				System.out.println("가장 최근 경기는 24년 2월 11일에 펼쳐쳤던 토트넘 vs 브라이튼 경기였습니다.");
				System.out.println("이 경기의 승자는 토트넘이였고 경기 스코어는 2대1이였습니다.");
				System.out.println("이때 손흥민 선수가 거의 40일만에 돌아와서 환상적인 어시스트를 했습니다.");
			}else if(totSelect == 2) {
				System.out.println("이제 다가올 예정되어 있는 매치는 24년 2월 18일에 펼쳐질 토트넘 vs 울버햄튼 경기입니다.");
				System.out.println("이 경기는 우리나라의 두 선수가 각각 토트넘과 울버햄튼에서 뛰고 있어 코리안더비 매치가 될 수도 있습니다.");
				System.out.println("이 경기가 저는 많이 기다려집니다.");
			}else if(totSelect == 3) {
				System.out.println("현재 토트넘은 24년 2월 11일 기준 전적은 14승 5무 5패로 승점 47점으로 현재 잉글랜드 프리미어리그 4위에 위치해 있는 강팀입니다.");
			}else if(totSelect == 4) {
				System.out.println("현재 토트넘은 주장은 손흥민 선수입니다.");
				System.out.println("그리고 부주장은 2명인데 수비수인 크리스티안 로메로 선수와 미드필더인 제임스 매디슨 선수입니다.");
			}
		}else if(yesorno.equals("아니오")) {
			System.out.println("토트넘의 기록을 보시겠다면 네를 눌러주세요!");
		}
		
		System.out.println("토트넘이 2023/24시즌 좋은 결과를 낼 수 있길 기원합니다.");

	}

}
