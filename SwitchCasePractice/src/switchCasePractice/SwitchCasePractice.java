package switchCasePractice;
import java.util.Scanner;

public class SwitchCasePractice {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("당신은 스포츠 중에서 어떤 종목의 스포츠를 좋아하십니까? 아래 보기 중에 골라주세요.");
		System.out.print("1. 축구 2. 야구 3. 배구 4. 농구 중 좋아하는 스포츠의 번호를 입력해주세요 : ");
		int sportsSelect = scanner.nextInt();
		
		switch(sportsSelect){
		case 1 :
			System.out.println("축구를 좋아하시는군요!!");
			System.out.println("저도 제일 좋아하는 스포츠가 축구입니다.");
			// break; 
			// 원래 switch-case문을 실행할 때 break문은 필수로 적어야 합니다. 안적으면 다음 케이스문까지 연달아 출력이 됩니다.
			// 이 코드는 일부러(고의적으로) break문을 적지 않고 주석처리 한 것이며, break문을 적지 않았을 때 어떻게 실행이 되는지 출력해보기 위해 작성한 코드입니다.
			// 정상적인 break 문을 포함하여 실행을 하고 싶다면 break문의 주석을 해제하시고 실행시키면 됩니다.
		case 2:
			System.out.println("야구를 좋아하시는군요!!");
			System.out.println("야구는 저는 서울과 대구에 있는 팀을 좋아합니다.");
			// break;
		case 3:
			System.out.println("배구를 좋아하시는군요!!");
			System.out.println("저도 배구를 즐겨보는 편이며, 배구는 5판 3선승제로 진행됩니다.");
			// break;
		case 4:
			System.out.println("농구를 좋아하시는군요!!");
			System.out.println("농구는 정말 눈이 즐거운 스포츠 중에 하나입니다. 3점슛이 들어가면 몰입감이 더더욱 올라갑니다.");
			// break;
		default:
			System.out.println("스포츠를 많이 좋아하는 한 사람으로써 기분이 좋습니다.");
		}
	}

}
