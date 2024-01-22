package asiaCupKoreaPractice;

interface GroupEIf {
	public abstract void worldRankMethod();
	public abstract void recordMethod();
	public abstract void thirdMatchMethod();
}

class GroupE implements GroupEIf{
	String countryName;
	String countryRank;
	
	public GroupE(String countryName, String countryRank) {
		this.countryName = countryName;
		this.countryRank = countryRank;
	}
	
	public void groupEMethod() {
		System.out.println("2024 카타르 아시안컵 그룹 E조에는 " + this.countryName + "이 속해 있습니다.");
	}

	@Override
	public void worldRankMethod() {
		System.out.println("현재 " + this.countryName + "의 각가의 세계랭킬을 살펴보면 " + this.countryRank + "입니다.");
	}

	@Override
	public void recordMethod() {
		System.out.println("현재(01/22)일 기준 2차전까지 경기가 완료되었습니다.");
		System.out.println("현재 순위(전적을 살펴보면) 1위는 요르단(1승1무), 2위는 대한민국(1승1무)");
		System.out.println("3위는 바레인(1승1패) 4위는 말레이시아(2패)에 위치해 있습니다.");
	}

	@Override
	public void thirdMatchMethod() {
		System.out.println("그룹 E조는 3차전을 각각 앞두고 있습니다.");
		System.out.println("3차전 매치업 상대는 대한민국 VS 말레이시아, ");
		System.out.println("요르단 VS 바레인 경기가 예정이 되어 있습니다.");
	}
}
public class AsiaCupKoreaPractice {

	public static void main(String[] args) {
		GroupE ge = new GroupE("대한민국, 요르단, 바레인, 말레이시아", "22위, 87위, 86위, 130위");
		ge.groupEMethod();
		
		System.out.println();
		
		GroupEIf gei = new GroupE("대한민국, 요르단, 바레인, 말레이시아", "22위, 87위, 86위, 130위"); //자식클래스에서 부모인터페이스로 업캐스팅
		gei.worldRankMethod();
		gei.recordMethod();
		gei.thirdMatchMethod();
		
		

	}

}
