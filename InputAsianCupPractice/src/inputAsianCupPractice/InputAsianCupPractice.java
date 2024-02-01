package inputAsianCupPractice;
import java.util.Scanner;

public class InputAsianCupPractice {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("대한민국 카타르 아시안컵 우승 기원합니다!!");
		System.out.print("한국 경기 스토리를 보고 싶다면 1. 예정 2. 결과 3. 한마디 중 번호를 눌러주세요 : ");
		int koreaStory = scanner.nextInt();
		
		if(koreaStory == 1) {
			System.out.println("현재 한국은 8강에 진출한 상태입니다.");
			System.out.println("한국의 8강 상대는 호주입니다.");
			
			System.out.print("각 나라 세계랭킹을 확인해보시겠습니까?(네/아니오) : ");
			String yesorno = scanner.next();
			
			if(yesorno.equals("네")) {
				System.out.println("대한민국 세계랭킹은 23위이고, 호주의 세계랭킹은 25위 입니다.");
			}else if(yesorno.equals("아니오")) {
				System.out.println("그 나라의 축구 실력을 볼 때 세계랭킹이 중요합니다. 궁금하시면 확인해보세요!!");
			}
			
			System.out.print("나라별 주요 선수를 확인해보시겠습니까?(네/아니오) : ");
			String hotPlayer = scanner.next();
			
			if(hotPlayer.equals("네")) {
				System.out.println("한국의 주요 선수는 7번을 달고 있는 캡틴 SON과 19번을 달고 있는 LEE, 그리고 4번을 달고 있는 KIM입니다.");
				System.out.println("호주의 주요 선수는 캡틴이자 골키퍼인 Mett 선수입니다.");
			}else if(hotPlayer.equals("아니오")) {
				System.out.println("주요 선수를 확인해주시는게 경기 보실 때 더 몰입이 되지 않을까요?");
			}

		}else if(koreaStory == 2) {
			System.out.println("한국은 조별리그에서 1승 2무로 조 2위로 16강에 진출하는데 성공했습니다.");
			System.out.println("한국의 16강 상대는 중동의 강자 사우디였습니다.");
			
			System.out.println("정규시간 경기 결과는 1대1 무승부로 끝이 났습니다.");
			System.out.print("한국 선수 누가 득점했는지 확인해볼까요?(네/아니오) : ");
			String scorer = scanner.next();
			
			if(scorer.equals("네")) {
				System.out.println("후반 추가시간 10분 중에 9분에 우리나라 9번 JO 선수가 헤딩골을 기록하였습니다.");
			}else if(scorer.equals("아니오")){
				System.out.println("사우디전 결과와 누가 골을 넣었는지 궁금하지 않으시나요? ");
			}
			
			System.out.println("연장전까지 무승부로 끝이 났습니다.");
			System.out.println("승부차기에서 저희 한국의 골키퍼 JO 선수가 2번의 세이브를 해내면서 8강 진출에 성공했습니다.");
		}else if(koreaStory == 3) {
			System.out.println("저희 한국은 1960년 이후로 약 64년동안 우승을 한 적이 없습니다.");
			System.out.println("이번에 저희 한국 멤버가 역대급 최정예 멤버이므로 우승을 목표를 갖고");
			System.out.println("대한민국이 8강 호주를 잡고 4강, 결승까지 올라가서 꼭 우승을 했으면 좋겠습니다.");
		}

	}

}

