package worldCountryPractice;

interface WorldCountry {
	public abstract void countryNameMethod();
	public abstract void countryCapitalMethod();
}

class Asia implements WorldCountry{
	String countryName;
	String countryCapital;
	String futureWantCountry;
	
	public Asia(String countryName, String countryCapital, String futureWantCountry) {
		this.countryName = countryName;
		this.countryCapital = countryCapital;
		this.futureWantCountry = futureWantCountry;
	}

	@Override
	public void countryNameMethod() {
		System.out.println("전세계 대륙 중에 아시아 라는 대륙이 존재합니다.");
		System.out.println("아시아에서 대표적인 나라 세 나라를 뽑자면 " + this.countryName + "등이 있습니다.");
	}

	@Override
	public void countryCapitalMethod() {
		System.out.println(this.countryName + " 나라들의 각각 수도는 " + this.countryCapital + "입니다.");
	}
	
	public void asiaMethod() {
		System.out.println("나중에 기회가 된다면 " + this.futureWantCountry + " 등의 나라들을 가서 여행을 하고 싶은 마음 뿐입니다.");
	}
}

class Europe implements WorldCountry{
	String countryName;
	String countryCapital;
	String futureWantCountry;
	
	public Europe(String countryName, String countryCapital, String futureWantCountry) {
		this.countryName = countryName;
		this.countryCapital = countryCapital;
		this.futureWantCountry = futureWantCountry;
	}

	@Override
	public void countryNameMethod() {
		System.out.println("유럽에도 정말 다양하고 좋은 나라들이 많이 존재하고 있습니다.");
		System.out.println("대표적인 유럽에서의 나라들 중 세 나라만 뽑자면 " + this.countryName + " 등이 있습니다.");
	}

	@Override
	public void countryCapitalMethod() {
		System.out.println("위에서 소개한 유럽의 나라 " + this.countryName + "들의 각각의 수도는 " + this.countryCapital + "입니다.");
	}
	
	public void europeMethod() {
		System.out.println("나중에 기회가 된다면 저는 " + this.futureWantCountry + "나라들을 한번 여행하고 싶습니다.");
	}
}

class SouthAmerica implements WorldCountry {
	String countryName;
	String countryCapital;
	String futureWantCountry;
	
	public SouthAmerica(String countryName, String countryCapital, String futureWantCountry) {
		this.countryName = countryName;
		this.countryCapital = countryCapital;
		this.futureWantCountry = futureWantCountry;
	}

	@Override
	public void countryNameMethod() {
		System.out.println("남미 대륙에도 정말 다양한 국가들이 많이 존재합니다.");
		System.out.println("남미하면 생각나는 대표적인 나라 세 나라를 뽑자면 " + this.countryName + "등이 있습니다.");
	}

	@Override
	public void countryCapitalMethod() {
		System.out.println("남미 " + this.countryName + "들의 각각의 수도는 " + this.countryCapital + "입니다.");
	}
	
	
	public void southAmericaMethod() {
		System.out.println("남미와 유럽은 제가 살고 있는 한국에서의 위치가 멀어 가기 번거롭지만 기회가 된다면 " + this.futureWantCountry + "나라 등을 가서 대표하는 문화나 음식등을 보고 맛보고 싶습니다.");
	}
	
}

public class WorldCountryPractice {

	public static void main(String[] args) {
		
		WorldCountry wc = new Asia("대한민국, 일본, 베트남", "서울, 도쿄, 하노이", "베트남, 대만, 태국, 일본");
		wc.countryNameMethod();
		wc.countryCapitalMethod();
		
		Asia asia = (Asia) wc;
		asia.asiaMethod();
		
		System.out.println();
		
		wc = new Europe("독일, 스페인, 영국, 프랑스", "베를린, 마드리드, 런던, 파리", "독일, 스페인, 영국, 프랑스, 네덜란드, 덴마크");
		wc.countryNameMethod();
		wc.countryCapitalMethod();
		
		Europe europe = (Europe) wc;
		europe.europeMethod();
		
		System.out.println();
		
		wc = new SouthAmerica("브라질, 칠레, 우루과이, 아르헨티나", "브라질리아, 산티아고, 몬테비데오, 부에노스아이레스", "브라질, 아르헨티나, 칠레");
		wc.countryNameMethod();
		wc.countryCapitalMethod();
		
		SouthAmerica sa = (SouthAmerica) wc;
		sa.southAmericaMethod();

	}

}
