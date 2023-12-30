package seasonPractice;

interface Season{
	public abstract void seasonNameMethod();
	public abstract void seasonFruitMethod();
}

class SpringClass implements Season {
	String name;
	String springFruit;
	
	public SpringClass(String name, String springFruit) {
		this.name = name;
		this.springFruit = springFruit;
	}

	@Override
	public void seasonNameMethod() {
		System.out.println("한국은 4계절로 계절이 이루어집니다.");
		System.out.println("그 중 " + this.name + "이 있습니다.");
	}

	@Override
	public void seasonFruitMethod() {
		System.out.println(this.name + "에 대표적인 과일 종류에는 " + this.springFruit + "등이 있습니다.");
		
	}
}

class SummerClass implements Season {
	String name;
	String summerFruit;
	
	public SummerClass(String name, String summerFruit) {
		this.name = name;
		this.summerFruit = summerFruit;
	}

	@Override
	public void seasonNameMethod() {
		System.out.println("한국은 4계절로 계절이 이루어집니다.");
		System.out.println("그 중 " + this.name + "이 있습니다.");
	}

	@Override
	public void seasonFruitMethod() {
		System.out.println(this.name + "에 대표적인 과일 종류에는 " + this.summerFruit + "등이 있습니다.");
		
	}
}

class AutumnClass implements Season {
	String name;
	String autumnFruit;
	
	public AutumnClass(String name, String autumnFruit) {
		this.name = name;
		this.autumnFruit = autumnFruit;
	}

	@Override
	public void seasonNameMethod() {
		System.out.println("한국은 4계절로 계절이 이루어집니다.");
		System.out.println("그 중 " + this.name + "이 있습니다.");
	}

	@Override
	public void seasonFruitMethod() {
		System.out.println(this.name + "에 대표적인 과일 종류에는 " + this.autumnFruit + "등이 있습니다.");
		
	}
}

class WinterClass implements Season {
	String name;
	String winterFruit;
	
	public WinterClass(String name, String winterFruit) {
		this.name = name;
		this.winterFruit = winterFruit;
	}

	@Override
	public void seasonNameMethod() {
		System.out.println("한국은 4계절로 계절이 이루어집니다.");
		System.out.println("그 중 " + this.name + "이 있습니다.");
	}

	@Override
	public void seasonFruitMethod() {
		System.out.println(this.name + "에 대표적인 과일 종류에는 " + this.winterFruit + "등이 있습니다.");
		
	}
}
public class SeasonPractice {

	public static void main(String[] args) {
		Season springSeason = new SpringClass("봄", "감귤, 딸기, 매실");
		springSeason.seasonNameMethod();
		springSeason.seasonFruitMethod();
		
		System.out.println();
		
		Season summerSeason = new SummerClass("여름", "수박, 포도, 참외, 복숭아");
		summerSeason.seasonNameMethod();
		summerSeason.seasonFruitMethod();
		
		System.out.println();
		
		Season autumnSeason = new AutumnClass("가을", "사과, 배, 감");
		autumnSeason.seasonNameMethod();
		autumnSeason.seasonFruitMethod();
		
		System.out.println();
		
		Season winterSeason = new WinterClass("겨울", "귤, 자몽, 석류");
		winterSeason.seasonNameMethod();
		winterSeason.seasonFruitMethod();

	}

}
