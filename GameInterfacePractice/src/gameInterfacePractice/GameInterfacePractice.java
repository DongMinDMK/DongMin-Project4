package gameInterfacePractice;

interface MapleStoryInter{
	public void jobMethod();
	public void jobNameMethod();
}

class MapleStory implements MapleStoryInter {
	String job;
	String jobName;
	
	public MapleStory(String job, String jobName) {
		this.job = job;
		this.jobName = jobName;
	}

	@Override
	public void jobMethod() {
		System.out.println("메이플스토리라는 게임은 자기만의 캐릭을 만들어서 육성하는 RPG 게임이다.");
		System.out.println("메이플스토리는 대표적으로 " + this.job + " 등으로 총 5가지의 직업으로 나눠져 있다.");
	}

	@Override
	public void jobNameMethod() {
		System.out.println("대표적으로 각 직업마다 이름을 하나씩 뽑으면 다음과 같다.");
		System.out.println(this.jobName + " 등이 대표적인 예이다. ");
	}
	
	public void otherJobNameMethod() {
		System.out.println("이외에도 정말 각 직업별로 수많은 직업이름이 존재한다.");
	}
	
	public void levelMethod() {
		System.out.println("각 직업마다 레벨이 오르면 오를수록 본인의 캐릭이 더 쎄지면서 좋은 스킬을 얻게되며 육성을 하는 게임이다.");
		System.out.println("메이플스토리는 현재 1차~6차까지 전직을 진행할 수 있다.");
	}
	
	
	
}

public class GameInterfacePractice {

	public static void main(String[] args) {
		
		//자식에서 부모로 -> 업캐스팅
		MapleStoryInter msi = new MapleStory("전사, 궁수, 도적, 마법사, 해적", "전사는 소울마스터, 궁수는 패스파인더, 도적은 나이트워커, 마법사는 플레임위자드, 해적은 스트라이커");
		
		msi.jobMethod();
		msi.jobNameMethod();
		
		System.out.println();
		
		//부모에서 자식으로 -> 다운캐스팅
		
		MapleStory ms = (MapleStory) msi;
		ms.otherJobNameMethod();
		ms.levelMethod();
	}

}
