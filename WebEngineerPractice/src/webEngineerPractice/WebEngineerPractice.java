package webEngineerPractice;

interface WebEngineer{
	public abstract void introMethod();
}

class FrontEndEngineer implements WebEngineer{
	String techStack;
	String feature;
	
	public FrontEndEngineer(String techStack, String feature) {
		this.techStack = techStack;
		this.feature = feature;
	}

	@Override
	public void introMethod() {
		System.out.println("웹 개발 엔지니어에는 프론트 엔지니어가 존재한다.");
	}
	
	public void frontMethod() {
		System.out.println("프론트 엔지니어는 " + this.techStack + " 등을 사용하여 " + this.feature + " 담당한다.");
		System.out.println("그리고 백엔드 엔지니어와 소통이 원활해야 더 질 좋은 웹사이트를 개발할 수 있다.");
	}
}

class BackEndEngineer implements WebEngineer{
	String techStack;
	String feature;
	
	public BackEndEngineer(String techStack, String feature) {
		this.techStack = techStack;
		this.feature = feature;
	}

	@Override
	public void introMethod() {
		System.out.println("웹 개발 엔지니어에는 또한 백엔드 엔지니어가 존재한다.");
	}
	
	public void backMethod() {
		System.out.println("백엔드 엔지니어는 " + this.techStack + " 등을 사용하고, " + this.feature + " 업무를 주로 한다.");
		System.out.println("백엔드 엔지니어도 프론트 엔지니어와 마찬가지로 양쪽 간에 소통이 원활해야 더 좋은 프로젝트를 개발 할 수 있다.");
	}
}

public class WebEngineerPractice {

	public static void main(String[] args) {
		WebEngineer we = new FrontEndEngineer("HTML/CSS, jQuery, javascript", "웹 사이트에 보여지는 디자인, 움직임을"); //업캐스팅
		we.introMethod();
		
		FrontEndEngineer fe = (FrontEndEngineer) we; // 다운캐스팅
		fe.frontMethod();
		
		System.out.println();
		
		we = new BackEndEngineer("JAVA, Spring Framework, Spring Boot", "웹 사이트 뒤쪽에서 서버를 관리하는"); //업캐스팅
		we.introMethod();
		
		BackEndEngineer be = (BackEndEngineer) we; // 다운캐스팅
		be.backMethod();
		

	}

}
