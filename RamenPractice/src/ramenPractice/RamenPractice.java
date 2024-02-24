package ramenPractice;

class Ramen{
	String country;
	String spicyGap;
	String ramenName;
	
	public Ramen(String country, String spicyGap, String ramenName) {
		this.country = country;
		this.spicyGap = spicyGap;
		this.ramenName = ramenName;
	}
	
	public String ramenSpicyGapMethod(String ramenCountryName) {
		return spicyGap;
	}
	
	public void countryRamenMethod() {
		System.out.println("라면은 주로 " + this.country + "에서 주로 먹는 음식 중 하나입니다.");
		System.out.println("라면은 회사 브랜드마다 각각의 맛이 조금씩 다르며 맵기도 모두 다릅니다.");
	}
	
	public void ramenNameMethod() {
		System.out.println("대한민국의 대표적인 유명한 라면 브랜드는 " + this.ramenName + "이 있습니다.");
	}
}

public class RamenPractice {

	public static void main(String[] args) {
		Ramen ramen = new Ramen("대한민국, 일본", "매움", "신라면");
		
		String ramenSpicyGap1 = ramen.ramenSpicyGapMethod("신라면");
		
		System.out.println("대한민국 라면 중에 신라면의 맛은 " + ramenSpicyGap1 + " 입니다.");
		
		Ramen ramen2 = new Ramen("대한민국, 일본", "보통", "진라면");
		
		String ramenSpicyGap2 = ramen2.ramenSpicyGapMethod("진라면");
		
		System.out.println("대한민국 라면 중에 진라면의 맛은 " + ramenSpicyGap2 + " 입니다.");
		
		Ramen ramen3 = new Ramen("대한민국, 일본", "순한맛", "삼양라면");
		
		String ramenSpicyGap3 = ramen3.ramenSpicyGapMethod("삼양라면");
		
		System.out.println("대한민국 라면 중에 삼양라면의 맛은 " + ramenSpicyGap3 + " 입니다.");
		
		Ramen ramen4 = new Ramen("대한민국, 일본", "매움, 보통, 순한맛 등 ", "신라면, 진라면 삼양라면 등");
		ramen4.countryRamenMethod();
		ramen4.ramenNameMethod();
		
		
		
		

	}

}
