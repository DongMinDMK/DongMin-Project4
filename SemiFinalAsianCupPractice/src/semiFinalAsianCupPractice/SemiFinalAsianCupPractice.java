package semiFinalAsianCupPractice;
import java.util.Scanner;

public class SemiFinalAsianCupPractice {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("현재 아시안컵 8강의 모든 일정이 끝이 났습니다.");
		System.out.print("예정되어 있는 4강 경기가 궁금하시다면 1번을, 8강 경기 결과가 궁금하시다면 2번을 눌러주세요 : ");
		int select = scanner.nextInt();
		
		if(select == 1) {
			System.out.println("4강 첫번째 경기는 대한민국 vs 요르단 입니다.");
			System.out.print("각 나라별 세계랭킹을 확인해보시겠습니까?(네/아니오) : ");
			String rankLook = scanner.next();
			
			if(rankLook.equals("네")) {
				System.out.println("대한민국의 세계랭킹은 23위이고, 요르단의 세계랭킹은 87위입니다.");
				System.out.println("양 국가는 조별리그에서 한번 맞붙은 적이 있습니다. 그때 조별리그는 2대2 무승부를 기록하였습니다.");
			}else if(rankLook.equals("아니오")) {
				System.out.println("4강 경기를 보시기 전에 피파 세계랭킹을 확인해보시는 것이 어떨까요?");
			}
			
			System.out.println("4강 두번쨰 경기는 이란 vs 카타르 입니다.");
			System.out.print("각 나라별 세계랭킹을 확인해보시겠습니까?(네/아니오) : ");
			String rankLook2 = scanner.next();
			
			if(rankLook2.equals("네")) {
				System.out.println("이란 세계랭킹은 21위이고, 카타르의 세계랭킹은 58위입니다.");
			}else if(rankLook2.equals("아니오")) {
				System.out.println("4강 경기를 보시기 전에 피파 세계랭킹을 확인해보시는 것이 어떨까요?");
			}
		}else if(select == 2) {
			System.out.println("8강 첫번째 경기는 타지키스탄 vs 요르단 이였습니다.");
			System.out.println("이 경기는 요르단이 1대0으로 승리하여 4강에 진출했습니다.");
			System.out.println("8강 두번째 경기는 대한민국 vs 호주 였습니다.");
			System.out.println("이 경기는 대한민국이 2대1로 연장전 끝에 4강에 진출했습니다.");
			
			System.out.println();
			
			System.out.println("8강 세번째 경기는 일본 vs 이란 이였습니다.");
			System.out.println("이 경기는 이란이 일본을 2대1로 승리하여 4강에 진출했습니다.");
			System.out.println("8강 네번째 경기는 카타르 vs 우주베키스탄이였습니다.");
			System.out.println("이 경기는 개최국 카타르가 우주베키스탄을 승부차기 끝에 승리하여 4강에 진출했습니다.");
		}
		
		System.out.println("개인적으로 대한민국이 요르단을 꺾고 결승전에 올라가 우승을 차지했으면 좋겠습니다.");

	}

}
