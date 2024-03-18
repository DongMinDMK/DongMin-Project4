package studyComputerClassPractice;
import java.util.Scanner;

public class StudyComputerClassPractice {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("안녕하세요 DMK 컴퓨터학원입니다.");
		System.out.println("저희 과정은 1. 웹 개발자 과정 2. 컴퓨터 자격증 과정이 준비되어 있습니다.");
		System.out.print("원하시는 과정의 번호를 눌러주세요(1/2) : ");
		int select = scanner.nextInt();
		
		if(select == 1) {
			System.out.print("웹 개발자 과정은 1. 프론트엔드 2. 백엔드 3. 풀스택 과정이 준비되어 있습니다. 원하시는 과정의 번호를 눌러주세요 : ");
			int developSelect = scanner.nextInt();
			
			if(developSelect == 1) {
				System.out.println("프론트엔드 과정을 선택하셨습니다.");
				System.out.println("프론트엔드는 웹 사이트 화면에 보여지는 이미지를 디자인, 꾸미는 것을 담당합니다.");
				System.out.println("프론트엔드의 기술 스택은 HTML/CSS, JQuery 등을 배웁니다.");
			}else if(developSelect == 2) {
				System.out.println("백엔드 과정을 선택하셨습니다.");
				System.out.println("백엔드는 화면에 보여지면서 디자인을 하는 프론트엔드와는 달리 화면이 안보이는 뒤쪽 서버에서 개발을 하는 것을 담당합니다.");
				System.out.println("백엔드의 기술 스택은 JAVA, Spring Boot를 뽑을 수 있습니다.");
			}
		}else if(select == 2) {
			System.out.println("컴퓨터 자격증은 1. 정보처리기사 자격증반 2. 컴퓨터활용능력 1급 자격증반으로 구분됩니다.");
			System.out.print("원하시는 자격증반의 번호를 눌러주세요 : ");
			int certiSelect = scanner.nextInt();
			
			if(certiSelect == 1) {
				System.out.println("정보처리기사 자격증반을 선택하셨습니다.");
				System.out.println("정보처리기사 자격증반은 개발자로 취직을 원한다면 반드시 따야 되는 국가기술자격증입니다.");
				System.out.println("실제로 IT 기업에서 가산점을 주고 있는 자격증입니다.");
			}else if(certiSelect == 2) {
				System.out.println("컴퓨터활용능력 1급 자격증을 선택하셨습니다.");
				System.out.println("컴퓨터활용능력 1급 자격증반은 공기업이나 다른 기업에서 취직할 때 도움이 되는 국가기술자격증입니다.");
				System.out.println("요새 엑셀을 사용하지 않는 기업은 극히 드물기에 이 자격증도 추천을 권유드립니다.");
			}
		}
		System.out.println("교육과정을 선택해주셔서 감사합니다.");
		System.out.println("여러분들의 앞날을 기원합니다.");
	}

}
